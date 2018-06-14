package Pruebas;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args)
    {
        String fechaNac;
        Scanner tecladoS = new Scanner(System.in);

        do
        {
            System.out.println("\nEscribe la fecha de nacimiento del cliente (sin validar, pls usa dd-mm-aaaa)");
            fechaNac = tecladoS.nextLine();
            if(!fechaNac.matches("[0-3][0-9]-[01][0-9]-[12][0-9][0-9][0-9]"))
                System.out.println("¡Fecha no válida!");
        }while(!fechaNac.matches("[0-3][0-9]-[01][0-9]-[12][0-9][0-9][0-9]"));

        /*String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=PennyPan;integratedSecurity=false;";
        String usuario = "invitado";
        String password = "guest";

        try
        {
            Class.forName("java.sql.Driver");
            Connection conexionBD = DriverManager.getConnection(sourceURL,usuario,password);
            Statement sentencia = conexionBD.createStatement();
            String miOrden = "SELECT ImporteTotal FROM Pedidos WHERE ID = 1";
            ResultSet resultado = sentencia.executeQuery(miOrden);

            if(resultado.next())
            {
                System.out.println(resultado.getBigDecimal("ImporteTotal"));
            }

        }catch(SQLException e) { System.out.println("Connect not possible" + e); }
        catch (ClassNotFoundException e) { System.out.println("Driver not found " + e); }*/

    }
}