package Gestion;

import java.sql.*;
import java.util.Scanner;

/**
 * Clase que contiene las funciones/procedimientos que sólo los loggeados como admins pueden acceder
 */
public class GestionAdmin {

    /**
     * Función que, dada una contraseña, comprobará si corresponde con la contraseña que, por simplicidad,
     * está definida dentro de la misma función.
     *
     * @param password La contraseña a comprobar
     * @return Devuelve un 2 si es correcta, un -1 si no lo es
     */
    public int validarContrasena(char[] password)
    {
        int ret = 2;
        char[] contrasena = "elmejorpanadero".toCharArray();

        if(contrasena.length != password.length)
            ret = -1;
        else
        {
            for(int i = 1; i < contrasena.length && ret != -1; i++)
            {
                if(contrasena[i] == password[i])
                    ret = 2;
                else
                    ret = -1;
            }
        }

        return(ret);
    }

    /**
     * Procedimiento que pregunta al usuario por todos los datos necesarios para crear un nuevo pan en la base de datos
     * Cuando termina de preguntar, llama a anadirPan para crearlo. Esta función solo pregunta por los datos, no lo crea
     *
     * Este procedimiento se encarga de validar todas las entradas:
     * - La longitud del nombre debe ser menor a 20 caracteres
     * - Si es integral o no se decide con Y o N (Yes/No) (pa algo soy bilingüe)
     * - La crujenticidad es un valor entre 0 y 5
     * - El precio debe ser mayor de 0
     * - La validación es Y o N
     */
    public void anadirPanDatos()
    {
        String nombreAnadir;
        char integral;
        int crujenticidad;
        double precio;
        char ultimaValidacion;

        Scanner teclado = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);

        //Leer nombre
        do
        {
            System.out.println("\nEscribe el nombre del pan");
            nombreAnadir = tecladoS.nextLine();
            if(nombreAnadir.length() > 20)
                System.out.println("¡Demasiado largo, menos de 20 caracteres!");
        }while(nombreAnadir.length() > 20);

        //Leer y validar integral
        do
        {
            System.out.println("\n¿El pan es integral? (Y/N)");
            integral = Character.toUpperCase(teclado.next().charAt(0));
            if(integral != 'Y' && integral != 'N')
                System.out.println("¡Solo Y o N!");
        }while(integral != 'Y' && integral != 'N');

        //Leer y validar crujenticidad
        do
        {
            System.out.println("\nEscribe la crujenticidad del pan (0-5) (0: no crujiente; 5: mucho)");
            crujenticidad = teclado.nextInt();
            if(crujenticidad < 0 || crujenticidad > 5)
                System.out.println("¡Solo del 0 al 5!");
        }while(crujenticidad < 0 || crujenticidad > 5);

        //Leer y validar precio
        do {
            System.out.println("\nIntroduce el precio del nuevo pan");
            precio = teclado.nextDouble();
            if(precio <= 0)
                System.out.println("¡El precio no puede ser menor o igual a 0!");
        }while(precio <= 0);

        //Leer y validar última validación
        do
        {
            System.out.println("\n¿Estás seguro que quieres añadir un nuevo pan con estos datos? (Y/N)");
            ultimaValidacion = Character.toUpperCase(teclado.next().charAt(0));
            if(ultimaValidacion != 'Y' && ultimaValidacion != 'N')
                System.out.println("¡Solo Y o N!");
        }while(ultimaValidacion != 'Y' && ultimaValidacion != 'N');

        if(ultimaValidacion == 'Y')
        {
            anadirPan(nombreAnadir, integral, crujenticidad, precio);
            System.out.println("\n¡Pan añadido!");
        }
        else
            System.out.println("\nNo se ha añadido nada");
    }

    /**
     * Función que añade un nuevo pan a la base de datos
     *
     * @param nombre El nombre del nuevo pan
     * @param integral Si es integral o no (Y si es integral, N si no lo es)
     * @param crujenticidad Del 0 al 5, cómo de crujiente es el pan (0: no lo es; 5: mucho)
     * @param precio El precio del nuevo pan. No puede ser menor o igual que 0
     */
    public void anadirPan(String nombre, char integral, int crujenticidad, double precio)
    {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        Connection conexionDB = null;
        CallableStatement sentencia = null;

        try
        {

            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL,usuario,password);
            String miOrden = "EXECUTE InsertarPan "+"'"+nombre+"', "+(integral=='Y'?1:0)+", "+crujenticidad+", "+precio;
            sentencia = conexionDB.prepareCall(miOrden);
            sentencia.execute();

        }catch(SQLException e) { System.out.println("¡Error al conectar!: " + e); }
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

    /**
     * Procedimiento que pregunta al usuario por todos los datos necesarios para crear un nuevo complemento en la base de datos
     * Cuando termina de preguntar, llama a anadirComp para crearlo. Esta función solo pregunta por los datos, no lo crea
     *
     * Este procedimiento se encarga de validar todas las entradas:
     * - La longitud del nombre debe ser menor a 20 caracteres
     * - El precio debe ser mayor de 0
     * - La validación es Y o N
     */
    public void anadirCompDatos()
    {
        String nombreAnadir;
        double precio;
        char ultimaValidacion;

        Scanner teclado = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);

        //Leer nombre
        do
        {
            System.out.println("\nEscribe el nombre del complemento");
            nombreAnadir = tecladoS.nextLine();
            if(nombreAnadir.length() > 20)
                System.out.println("¡Demasiado largo, menos de 20 caracteres!");
        }while(nombreAnadir.length() > 20);

        //Leer y validar precio
        do
        {
            System.out.println("\nIntroduce el precio del nuevo complemento");
            precio = teclado.nextDouble();
            if(precio <= 0)
                System.out.println("¡El precio no puede ser menor o igual a 0!");
        }while(precio <= 0);

        //Leer y validar última validación
        do
        {
            System.out.println("\n¿Estás seguro que quieres añadir un nuevo complemento con estos datos? (Y/N)");
            ultimaValidacion = Character.toUpperCase(teclado.next().charAt(0));
            if(ultimaValidacion != 'Y' && ultimaValidacion != 'N')
                System.out.println("¡Solo Y o N!");
        }while(ultimaValidacion != 'Y' && ultimaValidacion != 'N');

        if(ultimaValidacion == 'Y')
        {
            anadirComp(nombreAnadir, precio);
            System.out.println("\n¡Complemento añadido!");
        }
        else
            System.out.println("\nNo se ha añadido nada");
    }

    /**
     * Función que añade un nuevo complemento a la base de datos
     *
     * @param nombre El nombre del nuevo complemento
     * @param precio El precio del nuevo complemento
     */
    public void anadirComp(String nombre, double precio)
    {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        Connection conexionDB = null;
        CallableStatement sentencia = null;

        try
        {

            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL,usuario,password);
            String miOrden = "EXECUTE InsertarComplemento "+"'"+nombre+"', "+precio;
            sentencia = conexionDB.prepareCall(miOrden);
            sentencia.execute();

        }catch(SQLException e) { System.out.println("¡Error al conectar!: " + e); }
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

    /**
     * Procedimiento que pregunta al usuario por todos los datos necesarios para crear un nuevo ingrediente para bocatas en la base de datos
     * Cuando termina de preguntar, llama a anadirIngr para crearlo. Esta función solo pregunta por los datos, no lo crea
     *
     * Este procedimiento se encarga de validar todas las entradas:
     * - La longitud del nombre debe ser menor a 20 caracteres
     * - El precio debe ser mayor de 0
     * - La validación es Y o N
     */
    public void anadirIngrDatos()
    {
        String nombreAnadir;
        double precio;
        char ultimaValidacion;

        Scanner teclado = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);

        //Leer nombre
        do
        {
            System.out.println("\nEscribe el nombre del ingrediente");
            nombreAnadir = tecladoS.nextLine();
            if(nombreAnadir.length() > 20)
                System.out.println("¡Demasiado largo, menos de 20 caracteres!");
        }while(nombreAnadir.length() > 20);

        //Leer y validar precio
        do
        {
            System.out.println("\nIntroduce el precio del nuevo ingrediente");
            precio = teclado.nextDouble();
            if(precio <= 0)
                System.out.println("¡El precio no puede ser menor o igual a 0!");
        }while(precio <= 0);

        //Leer y validar última validación
        do
        {
            System.out.println("\n¿Estás seguro que quieres añadir un nuevo ingrediente con estos datos? (Y/N)");
            ultimaValidacion = Character.toUpperCase(teclado.next().charAt(0));
            if(ultimaValidacion != 'Y' && ultimaValidacion != 'N')
                System.out.println("¡Solo Y o N!");
        }while(ultimaValidacion != 'Y' && ultimaValidacion != 'N');

        if(ultimaValidacion == 'Y')
        {
            anadirIngr(nombreAnadir, precio);
            System.out.println("\n¡Ingrediente añadido!");
        }
        else
            System.out.println("\nNo se ha añadido nada");

    }

    /**
     * Función que añade un nuevo ingrediente para bocatas a la base de datos
     *
     * @param nombre El nombre del nuevo ingrediente
     * @param precio El precio del nuevo ingrediente
     */
    public void anadirIngr(String nombre, double precio)
    {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        Connection conexionDB = null;
        CallableStatement sentencia = null;

        try
        {

            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL,usuario,password);
            String miOrden = "EXECUTE InsertarIngrediente "+"'"+nombre+"', "+precio;
            sentencia = conexionDB.prepareCall(miOrden);
            sentencia.execute();

        }catch(SQLException e) { System.out.println("¡Error al conectar!: " + e); }
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

    /**
     * Procedimiento que pregunta al usuario por todos los datos necesarios para crear un nuevo cliente en la base de datos
     * Cuando termina de preguntar, llama a anadirIngr para crearlo. Esta función solo pregunta por los datos, no lo crea.
     *
     * Este procedimiento se encarga de validar todas las entradas:
     * - La longitud del nombre debe ser menor o igual a 20 caracteres
     * - La longitud de los apellidos debe ser menor o igual a 30 caracteres
     * - Por falta de tiempo y para acortar, pls introduce bien la fecha de nacimiento (dd-mm-aaaa)
     * - La longitud de la ciudad debe ser menor o igual a 20 caracteres
     * - La longitud de la dirección debe ser menor o igual a 40 caracteres
     * - la longitud del teléfono de contacto debe ser de 9 caracteres
     */
    public void anadirClienteDatos()
    {
        String nombre, apellidos, fechaNac, ciudad, direccion, telefono;
        char ultimaValidacion;
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);

        //Leer y validar nombre
        do
        {
            System.out.println("\nEscribe el nombre del cliente");
            nombre = tecladoS.nextLine();
            if(nombre.length() > 20)
                System.out.println("¡Demasiado largo, menos de 20 caracteres!");
        }while(nombre.length() > 20);

        //Leer y validar apellidos
        do
        {
            System.out.println("\nEscribe los apellidos del cliente");
            apellidos = tecladoS.nextLine();
            if(apellidos.length() > 30)
                System.out.println("¡Demasiado largo, menos de 30 caracteres!");
        }while(apellidos.length() > 30);

        //Leer y validar fecha
        do
        {
            System.out.println("\nEscribe la fecha de nacimiento del cliente (dd-mm-aaaa)");
            fechaNac = tecladoS.nextLine();
            if(!fechaNac.matches("[0-3][0-9]-[01][0-9]-[12][0-9][0-9][0-9]"))
                System.out.println("¡Fecha no válida!");
        }while(!fechaNac.matches("[0-3][0-9]-[01][0-9]-[12][0-9][0-9][0-9]"));


        //Leer y validar ciudad
        do
        {
            System.out.println("\nEscribe la ciudad del cliente");
            ciudad = tecladoS.nextLine();
            if(ciudad.length() > 20)
                System.out.println("¡Demasiado largo, menos de 20 caracteres!");
        }while(ciudad.length() > 20);

        //Leer y validar direccion
        do
        {
            System.out.println("\nEscribe la dirección del cliente");
            direccion = tecladoS.nextLine();
            if(direccion.length() > 40)
                System.out.println("¡Demasiado largo, menos de 40 caracteres!");
        }while(direccion.length() > 40);

        //Leer y validar teléfono
        do
        {
            System.out.println("\nEscribe el teléfono de contacto del cliente");
            telefono = tecladoS.nextLine();
            if(telefono.length() != 9)
                System.out.println("¡El teléfono debe tener 9 caracteres!");
        }while(telefono.length() != 9);

        //Leer y validar última validación
        do
        {
            System.out.println("\n¿Estás seguro que quieres añadir un nuevo cliente con estos datos? (Y/N)");
            ultimaValidacion = Character.toUpperCase(teclado.next().charAt(0));
            if(ultimaValidacion != 'Y' && ultimaValidacion != 'N')
                System.out.println("¡Solo Y o N!");
        }while(ultimaValidacion != 'Y' && ultimaValidacion != 'N');

        if(ultimaValidacion == 'Y')
        {
            anadirCliente(nombre, apellidos, fechaNac, ciudad, direccion, telefono);
            System.out.println("\n¡Cliente añadido!");
        }
        else
            System.out.println("\nNo se ha añadido nada");

    }

    /**
     * Función que añade un nuevo cliente a la base de datos
     *
     * @param nombre Nombre del nuevo cliente
     * @param apellidos Apellidos del nuevo cliente
     * @param fechaNac Fecha de nacimiento del nuevo cliente
     * @param ciudad Ciudad del nuevo cliente
     * @param direccion Dirección del nuevo cliente
     * @param telefono Teléfono de contacto del nuevo cliente
     */
    public void anadirCliente(String nombre, String apellidos, String fechaNac, String ciudad, String direccion, String telefono)
    {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        Connection conexionDB = null;
        CallableStatement sentencia = null;

        try
        {

            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL,usuario,password);
            String miOrden = "EXECUTE InsertarCliente "+"'"+nombre+"', '"+apellidos+"', '"+fechaNac+"', '"+ciudad+"', '"+direccion+"', '"+telefono+"'";
            sentencia = conexionDB.prepareCall(miOrden);
            sentencia.execute();

        }catch(SQLException e) { System.out.println("¡Error al conectar!: " + e); }
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

    /**
     * Procedimiento que pregunta al usuario por todos los datos necesarios para eliminar un pedido de la base de datos
     * Cuando termina de preguntar, llama a borrarPedido para eliminarlo
     */
    public void borrarPedidoDatos()
    {
        GestionPedidos gp = new GestionPedidos();
        Scanner teclado = new Scanner(System.in);

        int IDPedido;
        boolean valido;

        do
        {
            gp.mostrarPedidos();
            System.out.println("\nElige la ID del pedido que quieres borrar (o 0 para salir): ");
            IDPedido = teclado.nextInt();
            if(IDPedido != 0)
            {
                valido = gp.validarIDPedido(IDPedido);
                if(!valido)
                    System.out.println("¡La ID introducida no es válida!");
            }
            else
                valido = false;
        }while(IDPedido != 0 && !valido);

        if(IDPedido != 0)
        {
            borrarPedido(IDPedido);
            System.out.println("\n¡Pedido borrado!");
        }
    }

    /**
     * Función que borra de una base de dato un pedido entero, así como las columnas en las tablas PedidosPanes,
     * PedidosComplementos, Bocatas, y BocatasIngredientes
     *
     * @param IDPedido El ID del cliente
     */
    public void borrarPedido(int IDPedido)
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
            String miOrden = "DELETE FROM Pedidos WHERE ID = "+IDPedido;
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
