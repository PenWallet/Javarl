package Testos;

import Clases.Cliente;
import Clases.Producto;
import Clases.Pelicula;

public class TestCliente {

    public static void main(String[] args)
    {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
