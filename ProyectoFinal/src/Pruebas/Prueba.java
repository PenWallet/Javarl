package Pruebas;

import java.math.BigDecimal;
import java.sql.*;

public class Prueba {

    public static void main(String[] args)
    {
        String sourceURL = "jdbc:sqlserver://localhost";
        String usuario = "guestBread";
        String password = "guest";

        try
        {
            Connection conexionBD = DriverManager.getConnection(sourceURL,usuario,password);
            Statement sentencia = conexionBD.createStatement();
            String miOrden = "SELECT ImporteTotal FROM Pedidos WHERE ID = 1";
            ResultSet resultado = sentencia.executeQuery(miOrden);

            if(resultado.next())
            {
                System.out.println(resultado.getBigDecimal("ImporteTotal"));
            }

        }catch(SQLException e) { System.out.println("Errorrrrrrr"); }

    }
}