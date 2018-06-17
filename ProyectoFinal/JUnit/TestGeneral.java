import org.junit.Test;
import org.junit.Assert;
import Gestion.*;

import java.sql.*;

public class TestGeneral {
    @Test
    public void test()
    {
        GestionPedidos gp = new GestionPedidos();
        GestionClientes gc = new GestionClientes();
        boolean encontrado = false;

        String sourceURL = "jdbc:sqlserver://localhost";
        String usuario = "panadero";
        String password = "elmejorpanadero";
        boolean ret = false;
        Connection conexionDB = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        //Tests hechos con la base de datos recién creada, con los datos que ya hay cargados en ella por defecto

        /*
             ***********************************************
             ********** V A L I D A R  I D  P A N **********
             ***********************************************
         */
        //Por defecto, hay 10 panes en la base de datos, por lo que no debería saltar ningún error aquí
        Assert.assertTrue(gp.validarIDPan(1));
        Assert.assertTrue(gp.validarIDPan(2));
        Assert.assertTrue(gp.validarIDPan(3));
        Assert.assertTrue(gp.validarIDPan(4));
        Assert.assertTrue(gp.validarIDPan(5));
        Assert.assertTrue(gp.validarIDPan(6));
        Assert.assertTrue(gp.validarIDPan(7));
        Assert.assertTrue(gp.validarIDPan(8));
        Assert.assertTrue(gp.validarIDPan(9));
        Assert.assertTrue(gp.validarIDPan(10));

        //Todos los demás números deberían ser falso
        Assert.assertFalse(gp.validarIDPan(0));
        Assert.assertFalse(gp.validarIDPan(-4));
        Assert.assertFalse(gp.validarIDPan(-20));
        Assert.assertFalse(gp.validarIDPan(11));
        Assert.assertFalse(gp.validarIDPan(28));
        Assert.assertFalse(gp.validarIDPan(59));
        Assert.assertFalse(gp.validarIDPan(130));


        /*
         ***********************************************
         ********* V A L I D A R  I D  C O M P *********
         ***********************************************
         */
        //Por defecto, hay 14 complementos en la base de datos, por lo que no debería saltar ningún error aquí
        Assert.assertTrue(gp.validarIDComp(1));
        Assert.assertTrue(gp.validarIDComp(2));
        Assert.assertTrue(gp.validarIDComp(3));
        Assert.assertTrue(gp.validarIDComp(4));
        Assert.assertTrue(gp.validarIDComp(5));
        Assert.assertTrue(gp.validarIDComp(6));
        Assert.assertTrue(gp.validarIDComp(7));
        Assert.assertTrue(gp.validarIDComp(8));
        Assert.assertTrue(gp.validarIDComp(9));
        Assert.assertTrue(gp.validarIDComp(10));
        Assert.assertTrue(gp.validarIDComp(11));
        Assert.assertTrue(gp.validarIDComp(12));
        Assert.assertTrue(gp.validarIDComp(13));
        Assert.assertTrue(gp.validarIDComp(14));

        //Todos los demás números deberían dar erros
        Assert.assertFalse(gp.validarIDComp(0));
        Assert.assertFalse(gp.validarIDComp(-4));
        Assert.assertFalse(gp.validarIDComp(-20));
        Assert.assertFalse(gp.validarIDComp(15));
        Assert.assertFalse(gp.validarIDComp(28));
        Assert.assertFalse(gp.validarIDComp(59));
        Assert.assertFalse(gp.validarIDComp(130));


        /*
         ***********************************************
         ********* V A L I D A R  I D  I N G R *********
         ***********************************************
         */
        //Por defecto, hay 17 ingredientes en la base de datos, por lo que no debería saltar ningún error aquí
        Assert.assertTrue(gp.validarIDIngr(1));
        Assert.assertTrue(gp.validarIDIngr(2));
        Assert.assertTrue(gp.validarIDIngr(3));
        Assert.assertTrue(gp.validarIDIngr(4));
        Assert.assertTrue(gp.validarIDIngr(5));
        Assert.assertTrue(gp.validarIDIngr(6));
        Assert.assertTrue(gp.validarIDIngr(7));
        Assert.assertTrue(gp.validarIDIngr(8));
        Assert.assertTrue(gp.validarIDIngr(9));
        Assert.assertTrue(gp.validarIDIngr(10));
        Assert.assertTrue(gp.validarIDIngr(11));
        Assert.assertTrue(gp.validarIDIngr(12));
        Assert.assertTrue(gp.validarIDIngr(13));
        Assert.assertTrue(gp.validarIDIngr(14));
        Assert.assertTrue(gp.validarIDIngr(15));
        Assert.assertTrue(gp.validarIDIngr(16));
        Assert.assertTrue(gp.validarIDIngr(17));

        //Todos los demás números deberían dar erros
        Assert.assertFalse(gp.validarIDIngr(0));
        Assert.assertFalse(gp.validarIDIngr(-4));
        Assert.assertFalse(gp.validarIDIngr(-20));
        Assert.assertFalse(gp.validarIDIngr(18));
        Assert.assertFalse(gp.validarIDIngr(28));
        Assert.assertFalse(gp.validarIDIngr(59));
        Assert.assertFalse(gp.validarIDIngr(130));


        /*
         ***********************************************
         ****** V A L I D A R  I D  C L I E N T E ******
         ***********************************************
         */
        //Por defecto, hay 7 clientes en la base de datos, por lo que no debería saltar ningún error aquí
        Assert.assertTrue(gc.validarIDCliente(1));
        Assert.assertTrue(gc.validarIDCliente(2));
        Assert.assertTrue(gc.validarIDCliente(3));
        Assert.assertTrue(gc.validarIDCliente(4));
        Assert.assertTrue(gc.validarIDCliente(5));
        Assert.assertTrue(gc.validarIDCliente(6));
        Assert.assertTrue(gc.validarIDCliente(7));

        //Todos los demás números deberían dar erros
        Assert.assertFalse(gc.validarIDCliente(0));
        Assert.assertFalse(gc.validarIDCliente(-4));
        Assert.assertFalse(gc.validarIDCliente(-20));
        Assert.assertFalse(gc.validarIDCliente(8));
        Assert.assertFalse(gc.validarIDCliente(28));
        Assert.assertFalse(gc.validarIDCliente(59));
        Assert.assertFalse(gc.validarIDCliente(130));


        /*
         ***********************************************
         ******* V A L I D A R  I D  P E D I D O *******
         ***********************************************
         */
        //Por defecto, hay 16 pedidos en la base de datos, por lo que no debería saltar ningún error aquí
        Assert.assertTrue(gp.validarIDPedido(1));
        Assert.assertTrue(gp.validarIDPedido(2));
        Assert.assertTrue(gp.validarIDPedido(3));
        Assert.assertTrue(gp.validarIDPedido(4));
        Assert.assertTrue(gp.validarIDPedido(5));
        Assert.assertTrue(gp.validarIDPedido(6));
        Assert.assertTrue(gp.validarIDPedido(7));
        Assert.assertTrue(gp.validarIDPedido(8));
        Assert.assertTrue(gp.validarIDPedido(9));
        Assert.assertTrue(gp.validarIDPedido(10));
        Assert.assertTrue(gp.validarIDPedido(11));
        Assert.assertTrue(gp.validarIDPedido(12));
        Assert.assertTrue(gp.validarIDPedido(13));
        Assert.assertTrue(gp.validarIDPedido(14));
        Assert.assertTrue(gp.validarIDPedido(15));
        Assert.assertTrue(gp.validarIDPedido(16));

        //Todos los demás números deberían dar erros
        Assert.assertFalse(gp.validarIDPedido(0));
        Assert.assertFalse(gp.validarIDPedido(-4));
        Assert.assertFalse(gp.validarIDPedido(-20));
        Assert.assertFalse(gp.validarIDPedido(17));
        Assert.assertFalse(gp.validarIDPedido(28));
        Assert.assertFalse(gp.validarIDPedido(59));
        Assert.assertFalse(gp.validarIDPedido(130));


        /*
             ***********************************************
             ****** V A L I D A R  P A N  P E D I D O ******
             ***********************************************
         */
        //Estos son todos los pedidos que han pedido pan, y qué pan han pedido por defecto en la BD
        Assert.assertTrue(gp.validarPanPedido(1,2));
        Assert.assertTrue(gp.validarPanPedido(1,3));
        Assert.assertTrue(gp.validarPanPedido(2,6));
        Assert.assertTrue(gp.validarPanPedido(3,5));
        Assert.assertTrue(gp.validarPanPedido(3,6));
        Assert.assertTrue(gp.validarPanPedido(3,7));
        Assert.assertTrue(gp.validarPanPedido(5,2));
        Assert.assertTrue(gp.validarPanPedido(6,2));
        Assert.assertTrue(gp.validarPanPedido(9,8));
        Assert.assertTrue(gp.validarPanPedido(9,9));
        Assert.assertTrue(gp.validarPanPedido(10,9));
        Assert.assertTrue(gp.validarPanPedido(10,10));
        Assert.assertTrue(gp.validarPanPedido(11,1));
        Assert.assertTrue(gp.validarPanPedido(11,3));
        Assert.assertTrue(gp.validarPanPedido(12,5));
        Assert.assertTrue(gp.validarPanPedido(14,5));
        Assert.assertTrue(gp.validarPanPedido(16,9));

        //Todas las demás combinaciones deberían ser falsas
        Assert.assertFalse(gp.validarPanPedido(1,1));
        Assert.assertFalse(gp.validarPanPedido(1,4));
        Assert.assertFalse(gp.validarPanPedido(2,5));
        Assert.assertFalse(gp.validarPanPedido(2,7));
        Assert.assertFalse(gp.validarPanPedido(3,4));
        Assert.assertFalse(gp.validarPanPedido(3,8));
        Assert.assertFalse(gp.validarPanPedido(5,1));
        Assert.assertFalse(gp.validarPanPedido(5,3));
        Assert.assertFalse(gp.validarPanPedido(6,1));
        Assert.assertFalse(gp.validarPanPedido(6,3));
        Assert.assertFalse(gp.validarPanPedido(9,7));
        Assert.assertFalse(gp.validarPanPedido(9,10));
        Assert.assertFalse(gp.validarPanPedido(10,8));
        Assert.assertFalse(gp.validarPanPedido(10,11));
        Assert.assertFalse(gp.validarPanPedido(11,0));
        Assert.assertFalse(gp.validarPanPedido(11,2));
        Assert.assertFalse(gp.validarPanPedido(11,4));
        Assert.assertFalse(gp.validarPanPedido(12,4));
        Assert.assertFalse(gp.validarPanPedido(12,6));
        Assert.assertFalse(gp.validarPanPedido(14,4));
        Assert.assertFalse(gp.validarPanPedido(14,6));
        Assert.assertFalse(gp.validarPanPedido(16,8));
        Assert.assertFalse(gp.validarPanPedido(16,10));
        Assert.assertFalse(gp.validarPanPedido(4,1));
        Assert.assertFalse(gp.validarPanPedido(4,5));
        Assert.assertFalse(gp.validarPanPedido(19,10));
        Assert.assertFalse(gp.validarPanPedido(-4,8));
        Assert.assertFalse(gp.validarPanPedido(0,0));


        /*
             ***********************************************
             ****** H A C E R  N U E V O  P E D I D O ******
             ***********************************************
         */
        //Antes se ha comprobado que solo hay 16 pedidos, por lo que al crear uno nuevo, su ID debería ser 17
        //Si ejecutamos después de ya haber ejecutado 1 vez, dará error, ya que la siguiente ID generada sería 18, y así sucesivamente
        gp.crearNuevoPedido(1);

        try {
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT TOP 1 ID FROM Pedidos ORDER BY ID desc";
            resultado = sentencia.executeQuery(miOrden);

            if (resultado.next()) {
                Assert.assertEquals(17,resultado.getInt("ID"));
            }

        } catch (SQLException e) {
            System.out.println("¡Error!: " + e);
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

        /*
             ***********************************************
             ***** V A L I D A R  C O M P  P E D I D O *****
             ***********************************************
         */
        //Vamos a validar, de los que no han pedido varios complementos en sus pedidos, las ID de sus los complementos
        //que han pedido
        gp.crearNuevoPedido(1);

        try {
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT PP.IDPedido, IDComplemento FROM PedidosComplementos AS PP INNER JOIN (SELECT IDPedido FROM PedidosComplementos GROUP BY IDPedido HAVING COUNT(*) = 1 ) AS PP2 ON PP.IDPedido = PP2.IDPedido";
            resultado = sentencia.executeQuery(miOrden);

            //Pedido 1, Comp 6
            resultado.next();
            Assert.assertEquals(1, resultado.getInt("IDPedido"));
            Assert.assertEquals(6, resultado.getInt("IDComplemento"));

            //Pedido 4, Comp 12
            resultado.next();
            Assert.assertEquals(4, resultado.getInt("IDPedido"));
            Assert.assertEquals(12, resultado.getInt("IDComplemento"));

            //Pedido 5, Comp 3
            resultado.next();
            Assert.assertEquals(5, resultado.getInt("IDPedido"));
            Assert.assertEquals(3, resultado.getInt("IDComplemento"));

            //Pedido 8, Comp 5
            resultado.next();
            Assert.assertEquals(8, resultado.getInt("IDPedido"));
            Assert.assertEquals(5, resultado.getInt("IDComplemento"));

            //Pedido 11, Comp 1
            resultado.next();
            Assert.assertEquals(11, resultado.getInt("IDPedido"));
            Assert.assertEquals(1, resultado.getInt("IDComplemento"));

            //Pedido 13, Comp 1
            resultado.next();
            Assert.assertEquals(13, resultado.getInt("IDPedido"));
            Assert.assertEquals(1, resultado.getInt("IDComplemento"));

            //Pedido 14, Comp 5
            resultado.next();
            Assert.assertEquals(14, resultado.getInt("IDPedido"));
            Assert.assertEquals(5, resultado.getInt("IDComplemento"));

        } catch (SQLException e) {
            System.out.println("¡Error!: " + e);
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


        /*
             ***********************************************
             **** A Ñ A D I R  B O C A T A  P E D I D O ****
             ***********************************************
         */
        //Antes se ha comprobado que solo hay 9 pedidos, por lo que al crear uno nuevo, su ID debería ser 10
        //Si ejecutamos después de ya haber ejecutado 1 vez, dará error, ya que la siguiente ID generada sería 11, y así sucesivamente
        gp.anadirBocataPedido(1, 1);

        try {
            conexionDB = DriverManager.getConnection(sourceURL, usuario, password);
            sentencia = conexionDB.createStatement();
            String miOrden = "SELECT TOP 1 ID FROM Bocatas ORDER BY ID desc";
            resultado = sentencia.executeQuery(miOrden);

            if (resultado.next()) {
                Assert.assertEquals(10,resultado.getInt("ID"));
            }

        } catch (SQLException e) {
            System.out.println("¡Error!: " + e);
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
    }
}
