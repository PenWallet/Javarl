package Pruebas;

import Gestion.*;

public class CondGestionPedidos {

    public static void main(String[] args)
    {
        GestionPedidos gp = new GestionPedidos();

        System.out.println("CrearNuevoPedido");
        System.out.println(gp.crearNuevoPedido(2));
        System.out.println(gp.crearNuevoPedido(3));
        System.out.println(gp.crearNuevoPedido(4));
        System.out.println(gp.crearNuevoPedido(5));
        System.out.println(gp.crearNuevoPedido(6));
        System.out.println(gp.crearNuevoPedido(7));

        System.out.println("\nValidarIDPedido");
        System.out.println(gp.validarIDPedido(1)); //True
        System.out.println(gp.validarIDPedido(100)); //False
        System.out.println(gp.validarIDPedido(32)); //False
        System.out.println(gp.validarIDPedido(4)); //True
        System.out.println(gp.validarIDPedido(13)); //True
        System.out.println(gp.validarIDPedido(-1)); //False

        System.out.println("\nValidarIDPan");
        System.out.println(gp.validarIDPan(1)); //True
        System.out.println(gp.validarIDPan(2)); //True
        System.out.println(gp.validarIDPan(3)); //True
        System.out.println(gp.validarIDPan(4)); //True
        System.out.println(gp.validarIDPan(5)); //True
        System.out.println(gp.validarIDPan(6)); //True
        System.out.println(gp.validarIDPan(7)); //True
        System.out.println(gp.validarIDPan(8)); //True
        System.out.println(gp.validarIDPan(9)); //True
        System.out.println(gp.validarIDPan(10)); //True
        System.out.println(gp.validarIDPan(11)); //False
        System.out.println(gp.validarIDPan(12)); //False
        System.out.println(gp.validarIDPan(13)); //False

        System.out.println("\nValidarIDComp");
        System.out.println(gp.validarIDComp(1)); //True
        System.out.println(gp.validarIDComp(3)); //True
        System.out.println(gp.validarIDComp(5)); //True
        System.out.println(gp.validarIDComp(7)); //True
        System.out.println(gp.validarIDComp(9)); //True
        System.out.println(gp.validarIDComp(11)); //True
        System.out.println(gp.validarIDComp(13)); //True
        System.out.println(gp.validarIDComp(15)); //False
        System.out.println(gp.validarIDComp(17)); //False
        System.out.println(gp.validarIDComp(19)); //False

        System.out.println("\nValidarIDIngr");
        System.out.println(gp.validarIDIngr(1)); //True
        System.out.println(gp.validarIDIngr(3)); //True
        System.out.println(gp.validarIDIngr(5)); //True
        System.out.println(gp.validarIDIngr(7)); //True
        System.out.println(gp.validarIDIngr(9)); //True
        System.out.println(gp.validarIDIngr(11)); //True
        System.out.println(gp.validarIDIngr(13)); //True
        System.out.println(gp.validarIDIngr(15)); //True
        System.out.println(gp.validarIDIngr(17)); //True
        System.out.println(gp.validarIDIngr(19)); //False
        System.out.println(gp.validarIDIngr(21)); //False
        System.out.println(gp.validarIDIngr(23)); //False

        System.out.println("\nValidar Pan Pedido");
        System.out.println(gp.validarPanPedido(1,1)); //False
        System.out.println(gp.validarPanPedido(1,2)); //True
        System.out.println(gp.validarPanPedido(1,3)); //True
        System.out.println(gp.validarPanPedido(1,4)); //False
        System.out.println(gp.validarPanPedido(2,6)); //True
        System.out.println(gp.validarPanPedido(2,7));//False
        System.out.println(gp.validarPanPedido(2,10)); //False
        System.out.println(gp.validarPanPedido(10,9)); //True

        System.out.println("\nValidar Comp Pedido");
        System.out.println(gp.validarCompPedido(1,1)); //False
        System.out.println(gp.validarCompPedido(1,2)); //False
        System.out.println(gp.validarCompPedido(1,3)); //False
        System.out.println(gp.validarCompPedido(1,6)); //True
        System.out.println(gp.validarCompPedido(4,12)); //True
        System.out.println(gp.validarCompPedido(6,10));//False
        System.out.println(gp.validarCompPedido(13,1)); //True
        System.out.println(gp.validarCompPedido(14,5)); //True

        System.out.println("\nValidar Ingr Bocata");
        System.out.println(gp.validarIngrBocata(1,1)); //True
        System.out.println(gp.validarIngrBocata(1,2)); //True
        System.out.println(gp.validarIngrBocata(3,5)); //True
        System.out.println(gp.validarIngrBocata(6,8)); //False
        System.out.println(gp.validarIngrBocata(8,16)); //True
        System.out.println(gp.validarIngrBocata(9,6));//True
        System.out.println(gp.validarIngrBocata(13,1)); //False
        System.out.println(gp.validarIngrBocata(14,5)); //False

        System.out.println("\nAñadirBocataPedido");
        System.out.println(gp.anadirBocataPedido(2, 1));
        System.out.println(gp.anadirBocataPedido(2, 2));
        System.out.println(gp.anadirBocataPedido(2, 3));
        System.out.println(gp.anadirBocataPedido(2, 4));
        System.out.println(gp.anadirBocataPedido(2, 5));

        gp.mostrarPedidos();

        gp.mostrarPanes();

        gp.mostrarComplementos();

        gp.mostrarIngredientes();

        gp.mostrarPedidoFully(100);

    }
}
