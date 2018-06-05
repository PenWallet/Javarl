SET DATEFORMAT dmy
CREATE DATABASE PennyPan
GO
USE PennyPan
GO

-- Creación de las tablas
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
	Integral bit NULL,
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
	FechaCompra smalldatetime NOT NULL,
	ImporteTotal smallmoney NULL,
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

-- Rellenar con datos

INSERT INTO Complementos (Nombre, Precio) VALUES
('Doritos',1.35),('Patatas fritas',1),('Agua',0.5),('Coca-Cola',0.8),('Coca-Cola Zero',0.8),('Nachos',1.2),
('Palmera chocolate',1.2),('Polvorón',0.5),('Condón de fresa',1),('Nestea',1),('Bollicao',1),('Conchitas',1)
,('El Popper',500),('Bits',0.35)

INSERT INTO Ingredientes (Nombre, Precio) VALUES
('Queso en loncha',0.3),('Bacon',0.5),('Lechuga',0.1),('Chorizo',0.4),('Pavo',0.3),('Pollo empanado',0.8),
('Tortilla',0.6),('Mayonesa',0.2),('Ketchup',0.2),('Ali-oli',0.2),('Jamón serrano',0.5),('Atún',0.4),('Mortadela',0.3),
('Jamón York',0.4),('Nacho',1),('Yeray',2),('Caña de lomo',0.4)

INSERT INTO Clientes (Nombre, Apellidos, FechaNac, Ciudad, Direccion, Telefono) VALUES
('Yeray','Campanario','04-11-1997','Sevilla','Plaza Camilo José Cela, 1B','678333412'),
('Daniel','Gordillo','03-12-1999','Sevilla','Juan Ramón Jiménez, 20','622041614'),
('Ignacio','Van Loy','04-06-2018','IES Nervion','Claudio Guerin','654321987'),
('Tomás','Núñez','20-04-1998','Utrera','Almerìa, 35','628119707'),
('Raquel','González','25-05-1995','Sevilla','Almadraberos, 10','667037370'),
('David','Galván','12-06-1999','Sevilla','Av Parque Amate','674658099'),
('Oscar','Funes','12-08-1999','Sevilla','Reina del Cielo 3 2B','667879970')

INSERT INTO Panes (Nombre, Crujenticidad, Integral, Precio) VALUES
('Andaluza',2,0,0.2),('Baguette',4,0,0.5),('Bollo',5,0,0.25),('Pan de molde',0,0,1),('Pan de molde',0,1,1.2),
('Chapata',3,0,0.4),('Chapata',3,1,0.5),('Flauta',2,0,0.5),('Artesano',5,0,1),('Artesano',5,1,1.2)