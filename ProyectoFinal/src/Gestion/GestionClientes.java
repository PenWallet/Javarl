package Gestion;

import java.sql.*;

/**
 * Clase que contiene las funciones/procedimientos relacionadas con los clientes
 */
public class GestionClientes {

    /**
     * Procedimiento que muestra todos los clientes.
     */
    public void mostrarClientes()
    {
        String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "invitado";
        String password = "guest";
        Connection conexionDB = null;
        ResultSet resultado = null;
        Statement sentencia = null;

        try
        {
            Class.forName("java.sql.Driver");
            conexionDB = DriverManager.getConnection(sourceURL,usuario,password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT ID, Nombre, Apellidos FROM Clientes";
            resultado = sentencia.executeQuery(miOrden);

            System.out.println("\n----------------------------------------------------------");
            System.out.println("| ID |       Nombre       |           Apellidos          |");
            System.out.println("|----|--------------------|------------------------------|");
            while(resultado.next())
            {
                System.out.printf("|"+"%-4d"+"|"+"%-20s"+"|"+"%-30s"+"|\n",resultado.getInt("ID"),resultado.getString("Nombre"),resultado.getString("Apellidos"));
            }
            System.out.println("----------------------------------------------------------");

        }catch(SQLException e) { System.out.println("Connect not possible" + e); }
        catch (ClassNotFoundException e) { System.out.println("Driver not found " + e); }
        finally
        {
            try
            {
                resultado.close();
                sentencia.close();
                conexionDB.close();
            }catch(SQLException e) { System.out.println("¡Error al cerrar la conexion!: " + e); }
        }
    }

    /**
     * Función que, dado un número de un cliente, te dice si existe en la BD o no
     *
     * @param IDCliente El ID del cliente a validar
     * @return true si existe en la BD, false en caso contrario
     */
    public boolean validarIDCliente(int IDCliente)
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
            String miOrden = "SELECT dbo.ValidarIDCliente(" + IDCliente + ") AS ret";
            resultado = sentencia.executeQuery(miOrden);

            if (resultado.next()) {
                ret = resultado.getBoolean("ret");
            }

        } catch (SQLException e) {
            System.out.println("¡Error en validarIDCliente!");
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
}
