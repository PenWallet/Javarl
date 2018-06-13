SET DATEFORMAT dmy
CREATE DATABASE PennyPan
GO
USE PennyPan
GO

/*
	*********************************************************************************************
	*************************************** T A B L A S *****************************************
	*********************************************************************************************
*/

CREATE TABLE Clientes(
	ID int IDENTITY(1,1) NOT NULL,
	Nombre varchar(20) NOT NULL,
	Apellidos varchar(30) NOT NULL,
	FechaNac date NOT NULL,
	Ciudad varchar(20) NOT NULL,
	Direccion varchar(40) NULL,
	Telefono char(9) NULL,
	CONSTRAINT PKClientes PRIMARY KEY (ID),
	CONSTRAINT CHK_Clientes_Edad CHECK (FechaNac < CURRENT_TIMESTAMP)
)

CREATE TABLE Complementos(
	ID int IDENTITY(1,1) NOT NULL,
	Nombre char(20) NOT NULL,
	Precio smallmoney NOT NULL,
	CONSTRAINT PKComplementos PRIMARY KEY (ID),
	CONSTRAINT CHK_Complementos_Precio CHECK (Precio > 0)
)

CREATE TABLE Panes(
	ID int IDENTITY(1,1) NOT NULL,
	Nombre char(20) NOT NULL,
	Crujenticidad int NULL,
	Integral bit NOT NULL DEFAULT 0,
	Precio smallmoney NOT NULL,
	CONSTRAINT PKPanes PRIMARY KEY (ID),
	CONSTRAINT CHK_Panes_Precio CHECK (Precio > 0),
	CONSTRAINT CHK_Panes_Crujenticidad CHECK (Crujenticidad BETWEEN 0 AND 5)
)

CREATE TABLE Ingredientes(
	ID int IDENTITY(1,1) NOT NULL,
	Nombre char(20) NOT NULL,
	Precio smallmoney NOT NULL,
	CONSTRAINT PKIngredientes PRIMARY KEY (ID),
	CONSTRAINT CHK_Ingredientes_Precio CHECK (Precio > 0)
)

CREATE TABLE Pedidos(
	ID int IDENTITY(1,1) NOT NULL,
	IDCliente int NOT NULL,
	FechaCompra date NOT NULL,
	ImporteTotal smallmoney NOT NULL DEFAULT 0,
	CONSTRAINT PKPedidos PRIMARY KEY (ID),
	CONSTRAINT FKPedidosClientes FOREIGN KEY (IDCliente) REFERENCES Clientes(ID) ON DELETE NO ACTION ON UPDATE CASCADE
)

CREATE TABLE PedidosComplementos(
	IDPedido int NOT NULL,
	IDComplemento int NOT NULL,
	Cantidad int NOT NULL,
	CONSTRAINT FKPCPedidos FOREIGN KEY (IDPedido) REFERENCES Pedidos(ID) ON DELETE NO ACTION ON UPDATE CASCADE,
	CONSTRAINT FKPCComplementos FOREIGN KEY (IDComplemento) REFERENCES Complementos(ID) ON DELETE NO ACTION ON UPDATE CASCADE,
	CONSTRAINT PKPC PRIMARY KEY (IDPedido, IDComplemento),
	CONSTRAINT CHK_PC_Cantidad CHECK (Cantidad > 0)
)

CREATE TABLE PedidosPanes(
	IDPedido int NOT NULL,
	IDPan int NOT NULL,
	Cantidad int NOT NULL,
	CONSTRAINT FKPPPedidos FOREIGN KEY (IDPedido) REFERENCES Pedidos(ID) ON DELETE NO ACTION ON UPDATE CASCADE,
	CONSTRAINT FKPPPanes FOREIGN KEY (IDPan) REFERENCES Panes(ID) ON DELETE NO ACTION ON UPDATE CASCADE,
	CONSTRAINT PKPedidosPanes PRIMARY KEY (IDPedido, IDPan),
	CONSTRAINT CHK_PP_Cantidad CHECK (Cantidad > 0)
)

CREATE TABLE Bocatas(
	ID int IDENTITY(1,1) NOT NULL,
	IDPedido int NOT NULL,
	IDPan int NOT NULL,
	CONSTRAINT PKBocatas PRIMARY KEY (ID),
	CONSTRAINT FKBocatasPedidos FOREIGN KEY (IDPedido) REFERENCES Pedidos(ID),
	CONSTRAINT FKBocatasPanes FOREIGN KEY (IDPan) REFERENCES Panes(ID)
)

CREATE TABLE BocatasIngredientes(
	IDBocata int NOT NULL,
	IDIngrediente int NOT NULL,
	Cantidad int NOT NULL,
	CONSTRAINT FKBIBocatas FOREIGN KEY (IDBocata) REFERENCES Bocatas(ID),
	CONSTRAINT FKBIIngredientes FOREIGN KEY (IDIngrediente) REFERENCES Ingredientes(ID),
	CONSTRAINT PKBocatasIngredientes PRIMARY KEY (IDBocata, IDIngrediente),
	CONSTRAINT CHK_BI_Cantidad CHECK (Cantidad > 0)
)

/*
	*********************************************************************************************
	******************** F U N C I O N E S  Y  P R O C E D I M I E N T O S **********************
	*********************************************************************************************
*/
/*
	Funci�n que devuelve el valor total de los complementos de un pedido
	Entradas: ID del pedido
	Salida: smallmoney con el total
*/
GO
CREATE FUNCTION ImporteTotalComplementos (@IDPedido int) RETURNS smallmoney
AS
	BEGIN
		RETURN (SELECT ISNULL(SUM(C.Precio * PC.Cantidad),0)
							FROM PedidosComplementos AS PC
								INNER JOIN Complementos AS C
									ON PC.IDComplemento = C.ID
								WHERE PC.IDPedido = @IDPedido )
	END
GO

/*
	Funci�n que devuelve el valor total de los panes de un pedido
	Entradas: ID del pedido
	Salida: smallmoney con el total
*/
GO
CREATE FUNCTION ImporteTotalPanes (@IDPedido int) RETURNS smallmoney
AS
	BEGIN
		RETURN (SELECT ISNULL(SUM(P.Precio * PP.Cantidad),0)
							FROM PedidosPanes AS PP
								INNER JOIN Panes AS P
									ON PP.IDPan = P.ID
								WHERE PP.IDPedido = @IDPedido )
	END
GO

/*
	Funci�n que devuelve el valor total de los bocatas de un pedido
	Entradas: ID del pedido
	Salida: smallmoney con el total
*/
GO
CREATE FUNCTION ImporteTotalBocatas (@IDPedido int) RETURNS smallmoney
AS
	BEGIN
		RETURN (SELECT ISNULL((MAX(P.Precio) + SUM(I.Precio * BI.Cantidad)),0)
							FROM Bocatas AS B
								INNER JOIN Panes AS P
									ON B.IDPan = P.ID
								INNER JOIN BocatasIngredientes AS BI
									ON B.ID = BI.IDBocata
								INNER JOIN Ingredientes AS I
									ON BI.IDIngrediente = I.ID
							WHERE B.IDPedido = @IDPedido )
	END
GO

/*
	Procedimiento almacenado que obtiene el importe total de un pedido y actualiza la tabla ImporteTotal de dicho pedido.
	Usa las funciones escalares creadas anteriormente
	Entradas: ID del pedido
	Salidas: Ninguna
*/
GO
CREATE PROCEDURE CargarImportesTotales (@IDPedido int) AS
	BEGIN
		BEGIN TRANSACTION
			UPDATE Pedidos
				SET ImporteTotal = (SELECT	dbo.ImporteTotalBocatas(ID)+
											dbo.ImporteTotalComplementos(ID)+
											dbo.ImporteTotalPanes(ID) )
		COMMIT
	END
GO

/*
	Funci�n que valida si una ID de un cliente existe.
	Devuelve un bit con valor 0 si no existe, o un 1 si existe.
	Entradas: ID del cliente
	Salida: Bit
*/
GO
CREATE FUNCTION ValidarIDCliente (@IDCliente int) RETURNS bit
AS
	BEGIN
		DECLARE @ret bit
		IF(EXISTS(SELECT ID FROM Clientes WHERE ID = @IDCliente))
			BEGIN
				SET @ret = 1
			END
		ELSE
			BEGIN
				SET @ret = 0
			END

		RETURN @ret
	END
GO

/*
	Funci�n que valida si una ID de un pedido existe.
	Devuelve un bit con valor 0 si no existe, o un 1 si existe.
	Entradas: ID del pedido
	Salida: Bit
*/
GO
CREATE FUNCTION ValidarIDPedido (@IDPedido int) RETURNS bit
AS
	BEGIN
		DECLARE @ret bit
		IF(EXISTS(SELECT ID FROM Pedidos WHERE ID = @IDPedido))
			BEGIN
				SET @ret = 1
			END
		ELSE
			BEGIN
				SET @ret = 0
			END

		RETURN @ret
	END
GO

/*
	*********************************************************************************************
	************************************** T R I G G E R S **************************************
	*********************************************************************************************
*/

-- Trigger que actualiza la columna ImporteTotal de la tabla Pedidos despu�s de que se actualice PedidosComplementos
GO
CREATE TRIGGER ImporteTotalAfterIUComp ON PedidosComplementos AFTER INSERT,UPDATE 
AS
	BEGIN
		BEGIN TRANSACTION
			UPDATE Pedidos
				SET ImporteTotal +=	(I.Cantidad * C.Precio)
			
				FROM inserted AS I
					INNER JOIN Pedidos AS P
						ON I.IDPedido = P.ID
					INNER JOIN Complementos AS C
						ON I.IDComplemento = C.ID
				
				WHERE P.ID IN (SELECT IDPedido FROM inserted)
		COMMIT
	END
GO

-- Trigger que actualiza la columna ImporteTotal de la tabla Pedidos despu�s de que se actualice PedidosPanes
GO
CREATE TRIGGER ImporteTotalAfterIUPanes ON PedidosPanes AFTER INSERT,UPDATE 
AS
	BEGIN
		BEGIN TRANSACTION
			UPDATE Pedidos
				SET ImporteTotal += (I.Cantidad * Pa.Precio)
				
				FROM inserted AS I
					INNER JOIN Pedidos AS P
						ON I.IDPedido = P.ID
					INNER JOIN Panes AS Pa
						ON I.IDPan = Pa.ID

				WHERE P.ID IN (SELECT IDPedido FROM inserted)
		COMMIT
	END 
GO

-- Trigger que actualiza la columna ImporteTotal de la tabla Pedidos despu�s de que se actualice Bocatas
GO
CREATE TRIGGER ImporteTotalAfterIUBocatas ON Bocatas AFTER INSERT,UPDATE 
AS
	BEGIN
		BEGIN TRANSACTION
			UPDATE Pedidos
				SET ImporteTotal += Pa.Precio
				
				FROM inserted AS I
					INNER JOIN Pedidos AS P
						ON I.IDPedido = P.ID
					INNER JOIN Panes AS Pa
						ON I.IDPan = Pa.ID
				
				WHERE P.ID IN (SELECT IDPedido FROM inserted)
		COMMIT
	END 
GO

-- Trigger que actualiza la columna ImporteTotal de la tabla Pedidos despu�s de que se actualice BocatasIngredientes
GO
CREATE TRIGGER ImporteTotalAfterIUBocIngr ON BocatasIngredientes AFTER INSERT,UPDATE 
AS
	BEGIN
		BEGIN TRANSACTION
			UPDATE Pedidos
				SET ImporteTotal += (I.Cantidad * Ing.Precio)

				FROM Pedidos AS P
					INNER JOIN Bocatas AS B
						ON P.ID = B.IDPedido
					INNER JOIN inserted AS I
						ON B.ID = I.IDBocata
					INNER JOIN Ingredientes AS Ing
						ON I.IDIngrediente = Ing.ID
				
				WHERE B.ID IN (SELECT IDBocata FROM inserted)
		COMMIT
	END 
GO

-- Trigger que actualiza la tabla ImporteTotal rest�ndole el precio despu�s de borrar un Pan de un pedido
GO
CREATE TRIGGER ImporteTotalAfterDPanes ON PedidosPanes AFTER DELETE
AS
	BEGIN
		BEGIN TRANSACTION
			UPDATE Pedidos
				SET ImporteTotal -= (D.Cantidad * Pa.Precio)
				
				FROM deleted AS D
					INNER JOIN Pedidos AS P
						ON D.IDPedido = P.ID
					INNER JOIN Panes AS Pa
						ON D.IDPan = Pa.ID

				WHERE P.ID IN (SELECT IDPedido FROM deleted)
		COMMIT
	END
GO

-- Trigger que actualiza la tabla ImporteTotal rest�ndole el precio despu�s de borrar un Complemento de un pedido
GO
CREATE TRIGGER ImporteTotalAfterDComp ON PedidosComplementos AFTER DELETE
AS
	BEGIN
		BEGIN TRANSACTION
			UPDATE Pedidos
				SET ImporteTotal -=	(D.Cantidad * C.Precio)
			
				FROM deleted AS D
					INNER JOIN Pedidos AS P
						ON D.IDPedido = P.ID
					INNER JOIN Complementos AS C
						ON D.IDComplemento = C.ID
				
				WHERE P.ID IN (SELECT IDPedido FROM deleted)
		COMMIT
	END
GO

-- Trigger que actualiza la tabla ImporteTotal rest�ndole el precio despu�s de borrar un Ingrediente de un Bocata
GO
CREATE TRIGGER ImporteTotalAfterDBocIngr ON BocatasIngredientes AFTER DELETE
AS
	BEGIN
		BEGIN TRANSACTION
			UPDATE Pedidos
				SET ImporteTotal -= (D.Cantidad * Ing.Precio)

				FROM Pedidos AS P
					INNER JOIN Bocatas AS B
						ON P.ID = B.IDPedido
					INNER JOIN deleted AS D
						ON B.ID = D.IDBocata
					INNER JOIN Ingredientes AS Ing
						ON D.IDIngrediente = Ing.ID
				
				WHERE B.ID IN (SELECT IDBocata FROM deleted)
		COMMIT
	END 
GO

-- Trigger que actualiza la tabla ImporteTotal rest�ndole el precio despu�s de borrar un Bocata
GO
CREATE TRIGGER ImporteTotalAfterDBocatas ON Bocatas INSTEAD OF DELETE
AS
	BEGIN
		BEGIN TRANSACTION
			UPDATE Pedidos
				SET ImporteTotal -= Pa.Precio
				
				FROM deleted AS D
					INNER JOIN Pedidos AS P
						ON D.IDPedido = P.ID
					INNER JOIN Panes AS Pa
						ON D.IDPan = Pa.ID
				
				WHERE P.ID IN (SELECT IDPedido FROM deleted)

			UPDATE Pedidos
				SET ImporteTotal -= (SELECT ISNULL(SUM(BI.Cantidad * I.Precio),0)
										FROM deleted AS D
											INNER JOIN BocatasIngredientes AS BI
												ON D.ID = BI.IDBocata
											INNER JOIN Ingredientes AS I
												ON BI.IDIngrediente = I.ID 
										WHERE BI.IDBocata = D.ID )

				WHERE ID IN (SELECT IDPedido FROM deleted)

			-- Necesitamos deshabilitar temporalmente el trigger que se ejecuta sobre cada DELETE en la tabla BocatasIngredientes
			ALTER TABLE BocatasIngredientes DISABLE TRIGGER ImporteTotalAfterDBocIngr

			-- Borramos todos los ingredientes pertenecientes a ese bocata, y despu�s el bocata
			DELETE FROM BocatasIngredientes WHERE IDBocata IN (SELECT ID FROM deleted)
			DELETE FROM Bocatas WHERE ID IN (SELECT ID FROM deleted)

			-- Volvemos a habilitar el trigger
			ALTER TABLE BocatasIngredientes ENABLE TRIGGER ImporteTotalAfterDBocIngr
		COMMIT
	END 
GO


/*
	*********************************************************************************************
	************************************** P O B L A R ******************************************
	*********************************************************************************************
*/

INSERT INTO Clientes (Nombre, Apellidos, FechaNac, Ciudad, Direccion, Telefono) VALUES
('Yeray','Campanario','04-11-1997','Sevilla','Plaza Camilo Jos� Cela, 1B','678333412'),
('Daniel','Gordillo','03-12-1999','Sevilla','Juan Ram�n Jim�nez, 20','622041614'),
('Ignacio','Van Loy','04-06-2018','IES Nervion','Claudio Guerin','654321987'),
('Tom�s','N��ez','20-04-1998','Utrera','Almer�a, 35','628119707'),
('Raquel','Gonz�lez','25-05-1995','Sevilla','Almadraberos, 10','667037370'),
('David','Galv�n','12-06-1999','Sevilla','Av Parque Amate','674658099'),
('Oscar','Funes','12-08-1999','Sevilla','Reina del Cielo 3 2B','667879970')

INSERT INTO Pedidos (IDCliente, FechaCompra) VALUES
(1,'9-3-2017'),(1,'25-5-2017'),(2,'3-8-2017'),(2,'9-8-2017'),(4,'9-9-2017'),(7,'21-10-2017'),(6,'30-11-2017'),
(1,'2-1-2018'),(1,'4-1-2018'),(1,'4-2-2018'),(5,'10-2-2018'),(3,'16-2-2018'),(6,'28-2-2018'),(5,'16-3-2018'),
(1,'13-4-2018'),(1,'5-5-2018')

INSERT INTO Panes (Nombre, Crujenticidad, Integral, Precio) VALUES
('Andaluza',2,0,0.2),('Baguette',4,0,0.5),('Bollo',5,0,0.25),('Pan de molde',0,0,1),('Pan de molde',0,1,1.2),
('Chapata',3,0,0.4),('Chapata',3,1,0.5),('Flauta',2,0,0.5),('Artesano',5,0,1),('Artesano',5,1,1.2)

INSERT INTO Complementos (Nombre, Precio) VALUES
('Doritos',1.35),('Patatas fritas',1),('Agua',0.5),('Coca-Cola',0.8),('Coca-Cola Zero',0.8),('Nachos',1.2),
('Palmera chocolate',1.2),('Polvor�n',0.5),('Cond�n de fresa',1),('Nestea',1),('Bollicao',1),('Conchitas',1)
,('El Popper',500),('Bits',0.35)

INSERT INTO Ingredientes (Nombre, Precio) VALUES
('Queso en loncha',0.3),('Bacon',0.5),('Lechuga',0.1),('Chorizo',0.4),('Pavo',0.3),('Pollo empanado',0.8),
('Tortilla',0.6),('Mayonesa',0.2),('Ketchup',0.2),('Ali-oli',0.2),('Jam�n serrano',0.5),('At�n',0.4),('Mortadela',0.3),
('Jam�n York',0.4),('Nacho',1),('Yeray',2),('Ca�a de lomo',0.4)

INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (1,2,3)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (1,3,1)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (2,6,3)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (3,6,1)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (3,5,2)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (3,7,1)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (5,2,1)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (6,2,1)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (9,9,2)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (9,8,1)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (10,10,1)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (10,9,9)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (11,1,6)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (11,3,4)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (12,5,1)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (14,5,1)
INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (16,9,2)

INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (1,6,1)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (3,8,1)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (3,9,10)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (4,12,1)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (5,3,2)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (7,11,2)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (7,7,1)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (7,10,1)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (8,5,1)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (11,1,1)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (13,1,3)
INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (14,5,2)

INSERT INTO Bocatas (IDPedido, IDPan) VALUES (1,1)
INSERT INTO Bocatas (IDPedido, IDPan) VALUES (6,2)
INSERT INTO Bocatas (IDPedido, IDPan) VALUES (6,3)
INSERT INTO Bocatas (IDPedido, IDPan) VALUES (8,7)
INSERT INTO Bocatas (IDPedido, IDPan) VALUES (8,9)
INSERT INTO Bocatas (IDPedido, IDPan) VALUES (10,2)
INSERT INTO Bocatas (IDPedido, IDPan) VALUES (14,2)
INSERT INTO Bocatas (IDPedido, IDPan) VALUES (15,2)
INSERT INTO Bocatas (IDPedido, IDPan) VALUES (16,8)

INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (1,1,2)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (1,2,2)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (2,4,2)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (2,13,1)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (3,5,2)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (4,11,3)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (5,6,1)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (5,8,1)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (5,9,1)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (6,12,2)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (7,14,1)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (8,16,3)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (9,6,1)
INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES (9,10,1)

/*
	*********************************************************************************************
	************************************ U S U A R I O S ****************************************
	*********************************************************************************************
*/

CREATE LOGIN panadero WITH PASSWORD = 'elmejorpanadero', DEFAULT_DATABASE = PennyPan
CREATE LOGIN invitado WITH PASSWORD = 'guest', DEFAULT_DATABASE = PennyPan
CREATE USER panadero FOR LOGIN panadero; GRANT INSERT, DELETE TO pennyBread
CREATE USER invitado FOR LOGIN invitado; GRANT SELECT TO guestBread





-- BEGIN TRANSACTION
-- ROLLBACK
-- COMMIT
-- UPDATE Pedidos SET ImporteTotal = 0
-- DELETE FROM PedidosComplementos
-- DELETE FROM PedidosPanes
-- DELETE FROM BocatasIngredientes
-- DELETE FROM Bocatas
-- SELECT * FROM Pedidos
-- SELECT * FROM Complementos
-- SELECT * FROM Ingredientes
-- SELECT * FROM Panes
-- SELECT ImporteTotal FROM Pedidos WHERE ID = 1