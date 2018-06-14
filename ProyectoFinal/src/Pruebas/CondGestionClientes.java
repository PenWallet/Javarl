package Pruebas;

import Gestion.GestionClientes;

public class CondGestionClientes {

    public static void main(String[] args)
    {
        GestionClientes gc = new GestionClientes();

        gc.mostrarClientes();

        System.out.println("\nValidarIDCliente");
        System.out.println(gc.validarIDCliente(-10)); //False
        System.out.println(gc.validarIDCliente(-1)); //False
        System.out.println(gc.validarIDCliente(0)); //False
        System.out.println(gc.validarIDCliente(1)); //True
        System.out.println(gc.validarIDCliente(2)); //True
        System.out.println(gc.validarIDCliente(3)); //True
        System.out.println(gc.validarIDCliente(4)); //True
        System.out.println(gc.validarIDCliente(5)); //True
        System.out.println(gc.validarIDCliente(6)); //True
        System.out.println(gc.validarIDCliente(7)); //True
        System.out.println(gc.validarIDCliente(8)); //False
        System.out.println(gc.validarIDCliente(9)); //False
        System.out.println(gc.validarIDCliente(10)); //False
        System.out.println(gc.validarIDCliente(32)); //False
        System.out.println(gc.validarIDCliente(100)); //False
    }
}
