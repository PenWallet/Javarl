package Gestion;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;
import java.util.Scanner;

/**
 * Clase que contiene las funciones/procedimientos útiles para realizar pedidos a la panadería
 */
public class GestionPedidos {

    /**
     * Función que determina si, dado una ID de un pedido, existe en la base de datos
     *
     * @param IDPedido El ID del pedido a mirar
     * @return true si existe en la base de datos, false en caso contrario
     */
    public boolean validarIDPedido(int IDPedido) {
        String sourceURL = "jdbc:sqlserver://localhost";
        String usuario = "invitado";
        String password = "guest";
        boolean ret = false;
        Connection conexionDB = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT dbo.ValidarIDPedido(" + IDPedido + ") AS ret";
            resultado = sentencia.executeQuery(miOrden);

            if (resultado.next()) {
                ret = resultado.getBoolean("ret");
            }

        } catch (SQLException e) {
            System.out.println("¡Error en validarIDPedido!");
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            } catch (NullPointerException e) {
                System.out.println("¡NPE, error al cerrar la conexion!: " + e);
            }
        }

        return ret;
    }

    /**
     * Procedimiento que devuelve una lista de todos los pedidos de la base de datos
     */
    public void mostrarPedidos() {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "invitado";
        String password = "guest";
        Connection conexionDB = null;
        ResultSet resultado = null;
        Statement sentencia = null;

        try {
            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT P.ID, C.Nombre, P.FechaCompra, P.ImporteTotal FROM Pedidos AS P INNER JOIN Clientes AS C ON P.IDCliente = C.ID";
            resultado = sentencia.executeQuery(miOrden);

            System.out.println("\n-----------------------------------------------------");
            System.out.println("| ID |       Nombre       |   Fecha   |   Importe   |");
            System.out.println("|----|--------------------|-----------|-------------|");
            while (resultado.next()) {
                System.out.printf("|" + "%-4d" + "|" + "%-20s" + "|" + "%-11s" + "|" + "%9.2f" + " EUR|\n", resultado.getInt("ID"), resultado.getString("Nombre"), resultado.getDate("FechaCompra").toString(), resultado.getBigDecimal("ImporteTotal").doubleValue());
            }
            System.out.println("-----------------------------------------------------");

        } catch (SQLException e) {
            System.out.println("Connect not possible" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found " + e);
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            }
        }
    }

    /**
     * Función que imprime en pantalla el recibo de un pedido entero, con los panes, complementos y bocatas que haya en el pedido
     *
     * @param IDPedido El ID del pedido que se quiere consultar
     */
    public void mostrarPedidoFully(int IDPedido)
    {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "invitado";
        String password = "guest";
        Connection conexionDB = null;
        ResultSet res = null;
        ResultSet resBocatas = null;
        Statement sentencia = null;
        Statement sentenciaBocatas = null;
        boolean panes = false, complementos = false;
        int contBocatas = 0;
        double totalPedido = 0;

        System.out.println("\n/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
        System.out.println("|           Panadería Penny Pan          |");
        System.out.println("|           Del horno a tu mesa          |");
        System.out.println("|----------------------------------------|");

        try
        {
            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL,usuario,password);
            sentencia = conexionDB.createStatement();
            sentenciaBocatas = conexionDB.createStatement();

            //Datos del cliente
            String miOrden = "SELECT C.Nombre, P.FechaCompra, P.ImporteTotal FROM Pedidos AS P INNER JOIN Clientes AS C ON P.IDCliente = C.ID WHERE P.ID = "+IDPedido;
            res = sentencia.executeQuery(miOrden);

            if(res.next())
            {
                totalPedido = res.getBigDecimal("ImporteTotal").doubleValue();
                System.out.printf("| Nombre: "+"%-20s"+"           |\n",res.getString("Nombre"));
                System.out.printf("| Fecha de compra: "+"%10s"+"            |\n",res.getDate("FechaCompra").toString());
            }
            System.out.println("|----------------------------------------|");
            System.out.println("|                Desglose                |");

            //Datos de los panes
            miOrden = "SELECT PP.Cantidad, P.Nombre, (PP.Cantidad * P.Precio) AS Precio FROM PedidosPanes AS PP INNER JOIN Panes AS P ON PP.IDPan = P.ID WHERE PP.IDPedido = "+IDPedido;
            res = sentencia.executeQuery(miOrden);
            if(res.next())
            {
                panes = true;
                System.out.println("| Panes:                                 |");
                System.out.printf("| "+"%-2d"+" x "+"%-20s"+"       "+"%-6.2f"+" |\n",res.getInt("Cantidad"),res.getString("Nombre"),res.getBigDecimal("Precio").doubleValue());
                while(res.next())
                {
                    System.out.printf("| "+"%-2d"+" x "+"%-20s"+"       "+"%-6.2f"+" |\n",res.getInt("Cantidad"),res.getString("Nombre"),res.getBigDecimal("Precio").doubleValue());
                }
            }

            //Datos de los complementos
            miOrden = "SELECT PC.Cantidad, C.Nombre, (PC.Cantidad * C.Precio) AS Precio FROM PedidosComplementos AS PC INNER JOIN Complementos AS C ON PC.IDComplemento = C.ID WHERE PC.IDPedido = "+IDPedido;
            res = sentencia.executeQuery(miOrden);
            if(res.next())
            {
                complementos = true;
                if(panes)
                    System.out.println("|                                        |");
                System.out.println("| Complementos:                          |");
                System.out.printf("| "+"%-2d"+" x "+"%-20s"+"       "+"%-6.2f"+" |\n",res.getInt("Cantidad"),res.getString("Nombre"),res.getBigDecimal("Precio").doubleValue());
                while(res.next())
                {
                    System.out.printf("| "+"%-2d"+" x "+"%-20s"+"       "+"%-6.2f"+" |\n",res.getInt("Cantidad"),res.getString("Nombre"),res.getBigDecimal("Precio").doubleValue());
                }
            }

            //Datos de los bocatas
            miOrden = "SELECT B.ID, P.Nombre, P.Precio FROM Bocatas AS B INNER JOIN Panes AS P ON B.IDPan = P.ID WHERE IDPedido = "+IDPedido;
            resBocatas = sentenciaBocatas.executeQuery(miOrden);
            while(resBocatas.next())
            {
                contBocatas++;
                if(contBocatas == 1)
                {
                    if(panes || complementos)
                        System.out.println("|                                        |");

                    System.out.println("| Bocatas:                               |");
                }

                System.out.printf("|  "+"%-20s"+"           "+"%-6.2f"+" |\n",resBocatas.getString("Nombre"),resBocatas.getBigDecimal("Precio").doubleValue());

                miOrden = "SELECT I.Nombre, BI.Cantidad, (BI.Cantidad * I.Precio) AS Precio FROM BocatasIngredientes AS BI INNER JOIN Ingredientes AS I ON BI.IDIngrediente = I.ID WHERE BI.IDBocata = "+resBocatas.getInt("ID");
                res = sentencia.executeQuery(miOrden);
                while(res.next())
                {
                    System.out.printf("|    "+"%-2d"+" x "+"%-20s"+"    "+"%-6.2f"+" |\n",res.getInt("Cantidad"),res.getString("Nombre"),res.getBigDecimal("Precio").doubleValue());
                }
            }

            System.out.println("|                                 _______|");
            System.out.printf("| Total pedido...................."+"%-6.2f"+" |\n",totalPedido);
            System.out.println("|----------------------------------------|");
            System.out.println("|           Gracias por venir            |");
            System.out.println("|             Vuelva pronto              |");
            System.out.println("|----------------------------------------|");
            System.out.println("\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");

        }catch(SQLException e) { System.out.println("Connect not possible" + e); e.printStackTrace();}
        catch (ClassNotFoundException e) { System.out.println("Driver not found " + e); }
        finally
        {
            try
            {
                res.close();
                sentencia.close();
                sentenciaBocatas.close();
                conexionDB.close();
            }catch(SQLException e) { System.out.println("¡Error al cerrar la conexion!: " + e); }
        }
    }

    /**
     * Procedimiento que pregunta al usuario por todos los datos necesarios para hacer una consulta sobre un
     * pedido en específico. Este procedimiento no hace la consulta, solo recoge los datos, para después llamar
     * a la función que realiza dicha tarea.
     */
    public void consultarPedidoDatos() {
        int IDPedido;
        boolean valido;
        Scanner teclado = new Scanner(System.in);

        do {
            mostrarPedidos();
            System.out.println("Elige la ID del pedido que quieres borrar (o 0 para salir): ");
            IDPedido = teclado.nextInt();
            if (IDPedido != 0) {
                valido = validarIDPedido(IDPedido);
                if (!valido)
                    System.out.println("¡La ID introducida no es válida!");
            } else
                valido = false;
        } while (IDPedido != 0 && !valido);

        if (IDPedido != 0)
            mostrarPedidoFully(IDPedido);
    }

    /**
     * Procedimiento que pregunta al usuario por todos los datos necesarios para añadir un nuevo pedido a la base de datos
     * Llama a todas las funciones necesarias, que se encuentran en esta misma clase de Gestión, para llevar a cabo su tarea
     */
    public void hacerPedidoDatos() {
        //Poner a true la variable primerPedido
        boolean primerPedido = true;
        char opcionPedidoNuevo;
        int nCliente, nPedido = 0;

        GestionClientes gc = new GestionClientes();
        GestionAdmin ga = new GestionAdmin();
        Scanner teclado = new Scanner(System.in);

        //MostrarClientes * y leer y validar nº de cliente
        do {
            gc.mostrarClientes();
            System.out.println("Elije un cliente: ");
            nCliente = teclado.nextInt();
            if (!gc.validarIDCliente(nCliente))
                System.out.println("¡Número de cliente inválido!");
        } while (!gc.validarIDCliente(nCliente));

        //Pedir panes
        do {
            //Leer y validar si quiere pedir pan
            do {
                System.out.println("\n¿Quieres pedir pan? (Y/N)");
                opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                if (opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                    System.out.println("¡Solo Y o N!");
            } while (opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y');

            if (opcionPedidoNuevo == 'Y') {
                if(primerPedido)
                {
                    nPedido = crearNuevoPedido(nCliente);
                    primerPedido = false;
                }
                anadirPanPedidoDatos(nPedido);
            }
        } while (opcionPedidoNuevo == 'Y');

        //Pedir complementos
        do {
            //Leer y validar si quiere pedir complementos
            do {
                System.out.println("\n¿Quieres pedir complemento? (Y/N)");
                opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                if (opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                    System.out.println("¡Solo Y o N!");
            } while (opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y');

            if (opcionPedidoNuevo == 'Y') {
                if(primerPedido)
                {
                    nPedido = crearNuevoPedido(nCliente);
                    primerPedido = false;
                }
                anadirCompPedidoDatos(nPedido);
            }
        } while (opcionPedidoNuevo == 'Y');

        //Pedir bocatas
        do {
            //Leer y validar si quiere pedir bocatas
            do {
                System.out.println("\n¿Quieres pedir un bocata? (Y/N)");
                opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                if (opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                    System.out.println("¡Solo Y o N!");
            } while (opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y');

            if (opcionPedidoNuevo == 'Y') {
                if(primerPedido)
                {
                    nPedido = crearNuevoPedido(nCliente);
                    primerPedido = false;
                }
                anadirBocataPedidoDatos(nPedido);
            }
        } while (opcionPedidoNuevo == 'Y');

        if(primerPedido)
            System.out.println("\n¡No se ha añadido ningún pedido");
        else
            System.out.println("\n¡Pedido añadido!");
    }

    /**
     * Función que crea un nuevo pedido y lo asocia a un cliente
     *
     * @param IDCliente El ID del cliente al que se va a asociar el pedido
     * @return El ID del nuevo pedido
     */
    public int crearNuevoPedido(int IDCliente) {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        Connection conexionDB = null;
        CallableStatement cstmt = null;
        int ret = 0;

        try {

            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            String miOrden = "EXECUTE CrearNuevoPedido ?, ?";
            cstmt = conexionDB.prepareCall(miOrden);
            cstmt.setInt(1, IDCliente);
            cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
            cstmt.execute();
            ret = cstmt.getInt(2);

        } catch (SQLException e) {
            System.out.println("¡Error al conectar!: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found " + e);
        } finally {
            try {
                cstmt.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            }
        }

        return ret;
    }

    /**
     * Procedimiento que muestra los panes disponibles para comprar/hacer bocatas
     */
    public void mostrarPanes() {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "invitado";
        String password = "guest";
        Connection conexionDB = null;
        ResultSet resultado = null;
        Statement sentencia = null;

        try {
            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT * FROM Panes";
            resultado = sentencia.executeQuery(miOrden);

            System.out.println("\n--------------------------------------------------------------------------");
            System.out.println("| ID |       Nombre       |  Crujenticidad  |   Integral   |    Precio   |");
            System.out.println("|----|--------------------|-----------------|----------------------------|");
            while (resultado.next()) {
                System.out.printf("|" + "%-4d" + "|" + "%-20s" + "|" + "        %d        " + "|" + "      " + (resultado.getBoolean("Integral") ? "Sí" : "No") + "      |" + "%9.2f" + " EUR|\n", resultado.getInt("ID"), resultado.getString("Nombre"), resultado.getInt("Crujenticidad"), resultado.getBigDecimal("Precio").doubleValue());
            }
            System.out.println("--------------------------------------------------------------------------");

        } catch (SQLException e) {
            System.out.println("Connect not possible" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found " + e);
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            }
        }
    }

    /**
     * Función que pregunta al usuario por todos los datos necesarios para añadir el pan deseado a un pedido
     * Cuando termina de preguntar, llama a añadirPanPedido. Esta función solo pregunta por los datos.
     * <p>
     * Este procedimiento se encarga de validar todas las entradas:
     * - La IDPan debe existir, y no debe haber pedido ya ese pan
     * - La cantidad debe ser mayor a 0
     *
     * @param IDPedido La ID del pedido al que se le va a añadir el pan
     */
    public void anadirPanPedidoDatos(int IDPedido)
    {
        int cantidad, IDPan;
        boolean panYaPedido = false, panDisponible;
        Scanner teclado = new Scanner(System.in);

        do
        {
            mostrarPanes();
            System.out.println("Elige un pan (escribe la ID): ");
            IDPan = teclado.nextInt();
            panDisponible = validarIDPan(IDPan);
            if(panDisponible)
            {
                panYaPedido = validarPanPedido(IDPedido, IDPan);
                if(panYaPedido)
                    System.out.println("¡Ya has pedido ese pan!");
            }
            else
                System.out.println("¡Ese pan no existe!");
        }while(!panDisponible || panYaPedido);

        do
        {
            System.out.println("\n¿Cuántos panes quieres?");
            cantidad = teclado.nextInt();
            if(cantidad < 1)
                System.out.println("¡Tienes que pedir uno o más!");
        }while(cantidad < 1);

        anadirPanPedido(IDPedido, IDPan, cantidad);
        System.out.println("\n¡Pan añadido a tu pedido!");
    }

    /**
     * Función que determina si, dado una ID de un pan, existe en la base de datos
     *
     * @param IDPan El ID del pan a mirar
     * @return true si existe en la base de datos, false en caso contrario
     */
    public boolean validarIDPan(int IDPan)
    {
        String sourceURL = "jdbc:sqlserver://localhost";
        String usuario = "invitado";
        String password = "guest";
        boolean ret = false;
        Connection conexionDB = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT dbo.ValidarIDPan("+IDPan+") AS ret";
            resultado = sentencia.executeQuery(miOrden);

            if (resultado.next()) {
                ret = resultado.getBoolean("ret");
            }

        } catch (SQLException e) {
            System.out.println("¡Error en validarIDPan!: "+ e);
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            } catch (NullPointerException e) {
                System.out.println("¡NPE, error al cerrar la conexion!: " + e);
            }
        }

        return ret;
    }

    /**
     * Función que valida si un Pan ya se ha pedido en un Pedido
     *
     * @param IDPedido La ID del pedido en el que se va a validar
     * @param IDPan    La ID del pan que se va a validar
     * @return True si ya se ha pedido ese pan, false en caso contrario
     */
    public boolean validarPanPedido(int IDPedido, int IDPan) {
        String sourceURL = "jdbc:sqlserver://localhost";
        String usuario = "invitado";
        String password = "guest";
        boolean ret = false;
        Connection conexionDB = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT dbo.ValidarPanPedido(" + IDPedido + ", " + IDPan + ") AS ret";
            resultado = sentencia.executeQuery(miOrden);

            if (resultado.next()) {
                ret = resultado.getBoolean("ret");
            }

        } catch (SQLException e) {
            System.out.println("¡Error en validarPanPedido!: " + e);
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            } catch (NullPointerException e) {
                System.out.println("¡NPE, error al cerrar la conexion!: " + e);
            }
        }

        return ret;
    }

    /**
     * Función que se encarga de añadir panes a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el pan
     * @param IDPan    El ID del pan que se va a agregar
     * @param cantidad La cantidad de panes que se van a agregar
     */
    public void anadirPanPedido(int IDPedido, int IDPan, int cantidad) {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        Connection conexionDB = null;
        Statement sentencia = null;
        int rows;

        try {

            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "INSERT INTO PedidosPanes (IDPedido, IDPan, Cantidad) VALUES (" + IDPedido + ", " + IDPan + ", " + cantidad + ")";
            sentencia.executeUpdate(miOrden);

        } catch (SQLException e) {
            System.out.println("Connect not possible: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found " + e);
        } finally {
            try {
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            }
        }
    }

    /**
     * Procedimiento que muestra los complementos disponibles para comprar
     */
    public void mostrarComplementos() {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "invitado";
        String password = "guest";
        Connection conexionDB = null;
        ResultSet resultado = null;
        Statement sentencia = null;

        try {
            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT * FROM Complementos";
            resultado = sentencia.executeQuery(miOrden);

            System.out.println("\n-----------------------------------------");
            System.out.println("| ID |       Nombre       |   Precio    |");
            System.out.println("|----|--------------------|-------------|");
            while (resultado.next()) {
                System.out.printf("|" + "%-4d" + "|" + "%-20s" + "|" + "%9.2f" + " EUR|\n", resultado.getInt("ID"), resultado.getString("Nombre"), resultado.getBigDecimal("Precio").doubleValue());
            }
            System.out.println("-----------------------------------------");

        } catch (SQLException e) {
            System.out.println("Connect not possible" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found " + e);
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            }
        }
    }

    /**
     * Función que pregunta al usuario por todos los datos necesarios para añadir el complemento deseado a un pedido
     * Cuando termina de preguntar, llama a añadirCompPedido. Esta función solo pregunta por los datos.
     * <p>
     * Este procedimiento se encarga de validar todas las entradas:
     * - La IDComp debe existir, y no debe haber pedido ya ese pan
     * - La cantidad debe ser mayor a 0
     *
     * @param IDPedido La ID del pedido al que se le va a añadir el complemento
     */
    public void anadirCompPedidoDatos(int IDPedido)
    {
        int cantidad, IDComp;
        boolean compYaPedido = false, compDisponible;
        Scanner teclado = new Scanner(System.in);

        do
        {
            mostrarComplementos();
            System.out.println("Elige un complemento (escribe la ID): ");
            IDComp = teclado.nextInt();
            compDisponible = validarIDComp(IDComp);
            if(compDisponible)
            {
                compYaPedido = validarCompPedido(IDPedido, IDComp);
                if(compYaPedido)
                    System.out.println("¡Ya has pedido ese complemento!");
            }
            else
                System.out.println("¡Ese complemento no existe!");
        }while(!compDisponible || compYaPedido);

        do
        {
            System.out.println("\n¿Cuántos complementos quieres?");
            cantidad = teclado.nextInt();
            if(cantidad < 1)
                System.out.println("¡Tienes que pedir uno o más!");
        }while(cantidad < 1);

        anadirCompPedido(IDPedido, IDComp, cantidad);
        System.out.println("\n¡Complemento añadido a tu pedido!");
    }

    /**
     * Función que determina si, dado una ID de un complemento, existe en la base de datos
     *
     * @param IDComp El ID del complemento a mirar
     * @return true si existe en la base de datos, false en caso contrario
     */
    public boolean validarIDComp(int IDComp)
    {
        String sourceURL = "jdbc:sqlserver://localhost";
        String usuario = "invitado";
        String password = "guest";
        boolean ret = false;
        Connection conexionDB = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT dbo.ValidarIDComplemento("+IDComp+") AS ret";
            resultado = sentencia.executeQuery(miOrden);

            if (resultado.next()) {
                ret = resultado.getBoolean("ret");
            }

        } catch (SQLException e) {
            System.out.println("¡Error en validarIDComp!: "+ e);
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            } catch (NullPointerException e) {
                System.out.println("¡NPE, error al cerrar la conexion!: " + e);
            }
        }

        return ret;
    }

    /**
     * Función que valida si un Complemento ya se ha pedido en un Pedido
     *
     * @param IDPedido La ID del pedido en el que se va a validar
     * @param IDComp   La ID del complemento que se va a validar
     * @return True si ya se ha pedido ese pan, false en caso contrario
     */
    public boolean validarCompPedido(int IDPedido, int IDComp) {
        String sourceURL = "jdbc:sqlserver://localhost";
        String usuario = "invitado";
        String password = "guest";
        boolean ret = false;
        Connection conexionDB = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT dbo.ValidarCompPedido(" + IDPedido + ", " + IDComp + ") AS ret";
            resultado = sentencia.executeQuery(miOrden);

            if (resultado.next()) {
                ret = resultado.getBoolean("ret");
            }

        } catch (SQLException e) {
            System.out.println("¡Error en validarPanPedido!: " + e);
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            } catch (NullPointerException e) {
                System.out.println("¡NPE, error al cerrar la conexion!: " + e);
            }
        }

        return ret;
    }

    /**
     * Función que se encarga de añadir complementos a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el complemento
     * @param IDComp   El ID del complemento que se va a agregar
     * @param cantidad La cantidad de ese complemento que se van a agregar
     */
    public void anadirCompPedido(int IDPedido, int IDComp, int cantidad) {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        Connection conexionDB = null;
        Statement sentencia = null;
        int rows;

        try {

            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "INSERT INTO PedidosComplementos (IDPedido, IDComplemento, Cantidad) VALUES (" + IDPedido + ", " + IDComp + ", " + cantidad + ")";
            sentencia.executeUpdate(miOrden);

        } catch (SQLException e) {
            System.out.println("Connect not possible: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found " + e);
        } finally {
            try {
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            }
        }
    }

    /**
     * Función que pregunta al usuario por todos los datos necesarios para añadir el bocata deseado a un pedido
     * Cuando termina de preguntar, llama a añadirBocataPedido. Esta función solo pregunta por los datos.
     * <p>
     * Este procedimiento se encarga de validar todas las entradas:
     * - La IDPan debe existir, y no debe haber pedido ya ese pan
     *
     * @param IDPedido La ID del pedido al que se le va a añadir el pan
     */
    public void anadirBocataPedidoDatos(int IDPedido)
    {
        int IDPan, IDBocata;
        boolean panDisponible;
        char anadirOtroIngr;
        Scanner teclado = new Scanner(System.in);

        do
        {
            mostrarPanes();
            System.out.println("Elige de qué pan quieres hecho el bocata (escribe la ID): ");
            IDPan = teclado.nextInt();
            panDisponible = validarIDPan(IDPan);
            if(!panDisponible)
                System.out.println("¡Ese pan no existe!");
        }while(!panDisponible);

        IDBocata = anadirBocataPedido(IDPedido, IDPan);

        do
        {
            anadirIngrBocataPedidoDatos(IDBocata);
            do
            {
                System.out.println("\n¿Quieres añadir otro ingrediente a tu bocata? (Y/N)");
                anadirOtroIngr = Character.toUpperCase(teclado.next().charAt(0));
                if(anadirOtroIngr != 'N' && anadirOtroIngr != 'Y')
                    System.out.println("¡Solo Y o N!");
            }while(anadirOtroIngr != 'N' && anadirOtroIngr != 'Y');
        }while(anadirOtroIngr == 'Y');
    }

    /**
     * Función que se encarga de añadir un bocata a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el bocata
     * @param IDPan El ID del pan con el que se va a hacer el bocata
     *
     * @return El ID del bocata que se ha creado
     */
    public int anadirBocataPedido(int IDPedido, int IDPan)
    {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        Connection conexionDB = null;
        CallableStatement cstmt = null;
        int ret = 0;

        try {

            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            String miOrden = "EXECUTE CrearNuevoBocata ?, ?, ?";
            cstmt = conexionDB.prepareCall(miOrden);
            cstmt.setInt(1, IDPedido);
            cstmt.setInt(2, IDPan);
            cstmt.registerOutParameter(3, java.sql.Types.INTEGER);
            cstmt.execute();
            ret = cstmt.getInt(3);

        } catch (SQLException e) {
            System.out.println("¡Error al conectar!: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found " + e);
        } finally {
            try {
                cstmt.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            }
        }

        return ret;
    }

    /**
     * Procedimiento que muestra los ingredientes que hay disponibles para añadir a un bocata
     */
    public void mostrarIngredientes()
    {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "invitado";
        String password = "guest";
        Connection conexionDB = null;
        ResultSet resultado = null;
        Statement sentencia = null;

        try {
            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT * FROM Ingredientes";
            resultado = sentencia.executeQuery(miOrden);

            System.out.println("\n-----------------------------------------");
            System.out.println("| ID |       Nombre       |   Precio    |");
            System.out.println("|----|--------------------|-------------|");
            while (resultado.next()) {
                System.out.printf("|" + "%-4d" + "|" + "%-20s" + "|" + "%9.2f" + " EUR|\n", resultado.getInt("ID"), resultado.getString("Nombre"), resultado.getBigDecimal("Precio").doubleValue());
            }
            System.out.println("-----------------------------------------");

        } catch (SQLException e) {
            System.out.println("Connect not possible" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found " + e);
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            }
        }
    }

    /**
     * Función que pregunta al usuario por todos los datos necesarios para añadir los ingredientes deseados a un bocata
     * Cuando termina de preguntar, llama a añadirIngrBocataPedido. Esta función solo pregunta por los datos.
     *
     * Este procedimiento se encarga de validar todas las entradas:
     * - La IDBocata debe existir
     * - La cantidad debe ser mayor a 0
     *
     * @param IDBocata La ID del bocata al que se le va a añadir el pan
     */
    public void anadirIngrBocataPedidoDatos(int IDBocata)
    {
        int IDIngr, cantidad;
        boolean ingrDisponible, ingrYaPedido = false;
        Scanner teclado = new Scanner(System.in);

        do
        {
            mostrarIngredientes();
            System.out.println("Elige un ingrediente que añadirle a tu bocata (escribe el ID): ");
            IDIngr = teclado.nextInt();
            ingrDisponible = validarIDIngr(IDIngr);
            if(ingrDisponible)
            {
                ingrYaPedido = validarIngrBocata(IDBocata, IDIngr);
                if(ingrYaPedido)
                    System.out.println("¡Ya has metido ese ingrediente en tu bocata!");
            }
            else
                System.out.println("¡Ese ingrediente no existe!");
        }while(!ingrDisponible || ingrYaPedido);

        do
        {
            System.out.println("\n¿Cuanta cantidad quieres?");
            cantidad = teclado.nextInt();
            if(cantidad < 1)
                System.out.println("¡Tienes que pedir uno o más!");
        }while(cantidad < 1);

        anadirIngrBocataPedido(IDBocata, IDIngr, cantidad);

    }

    /**
     * Función que determina si, dado una ID de un ingrediente, existe en la base de datos
     *
     * @param IDIngr El ID del ingrediente a mirar
     * @return true si existe en la base de datos, false en caso contrario
     */
    public boolean validarIDIngr(int IDIngr)
    {
        String sourceURL = "jdbc:sqlserver://localhost";
        String usuario = "invitado";
        String password = "guest";
        boolean ret = false;
        Connection conexionDB = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT dbo.ValidarIDIngrediente("+IDIngr+") AS ret";
            resultado = sentencia.executeQuery(miOrden);

            if (resultado.next()) {
                ret = resultado.getBoolean("ret");
            }

        } catch (SQLException e) {
            System.out.println("¡Error en validarIDIngr!: "+ e);
        } finally {
            try {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            } catch (SQLException e) {
                System.out.println("¡Error al cerrar la conexion!: " + e);
            } catch (NullPointerException e) {
                System.out.println("¡NPE, error al cerrar la conexion!: " + e);
            }
        }

        return ret;
    }

    /**
     * Función que valida si un Pan ya se ha pedido en un Pedido
     *
     * @param IDBocata La ID del bccata en el que se va a validar
     * @param IDIngr La ID del ingrediente que se va a validar
     *
     * @return True si ya se ha pedido ese ingrediente, false en caso contrario
     */
    public boolean validarIngrBocata(int IDBocata, int IDIngr)
    {
        String sourceURL = "jdbc:sqlserver://localhost";
        String usuario = "invitado";
        String password = "guest";
        boolean ret = false;
        Connection conexionDB = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try
        {
            conexionDB = DriverManager.getConnection(sourceURL,usuario,password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT dbo.ValidarIngrBocata("+IDBocata+", "+IDIngr+") AS ret";
            resultado = sentencia.executeQuery(miOrden);

            if(resultado.next())
            {
                ret = resultado.getBoolean("ret");
            }

        }catch(SQLException e) { System.out.println("¡Error en validarIngrBocata!: "+ e); }
        finally
        {
            try
            {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            }catch(SQLException e) { System.out.println("¡Error al cerrar la conexion!: " + e); }
            catch(NullPointerException e) { System.out.println("¡NPE, error al cerrar la conexion!: " + e); }
        }

        return ret;
    }

    /**
     * Función que se encarga de añadir un ingrediente a un bocata
     *
     * @param IDBocata El ID del bocata al que se le va a añadir el ingrediente
     * @param IDIngr El ID del ingrediente que se le va a añadir al bocata
     * @param cantidad Cantidad de ese ingrediente que se le va a añadir al bocata
     */
    public void anadirIngrBocataPedido(int IDBocata, int IDIngr, int cantidad)
    {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        Connection conexionDB = null;
        Statement sentencia = null;
        int rows;

        try
        {

            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL,usuario,password);
            sentencia = conexionDB.createStatement();
            String miOrden = "INSERT INTO BocatasIngredientes (IDBocata, IDIngrediente, Cantidad) VALUES ("+IDBocata+", "+IDIngr+", "+cantidad+")";
            sentencia.executeUpdate(miOrden);

        }catch(SQLException e) { System.out.println("Connect not possible: " + e); }
        catch (ClassNotFoundException e) { System.out.println("Driver not found " + e); }
        finally
        {
            try
            {
                sentencia.close();
                conexionDB.close();
            }catch(SQLException e) { System.out.println("¡Error al cerrar la conexion!: " + e); }
        }
    }
}
