/*
    Nombre del programa:
        PistaDeVideo

    Comentario:
        Main del programa que gestiona un videoclub

    Pseudocódigo:
        Inicio
            Repetir
                MostrarMenu *
                Leer y validar opcion
                Según (opcion)
                    Caso '1': Ver películas disponibles
                    Caso '2': Ver clientes
                    Caso '3': Alquilar película
                    Caso '4': Consultar películas alquiladas
                    Caso '5': Rellenar con datos //OPCIÓN ESCONDIDA
                Fin según
            Mientras (opcion != '0')
        Fin

 */

import Gestion.*;

import java.util.Scanner;

public class PistaDeVideo {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        char opcion;

        do
        {
            do
            {
                GestionMenus.mostrarMenu();
                opcion = teclado.next().charAt(0);
                if(opcion < '0' || opcion > '5')
                    System.out.println("¡Solo del 1 al 4, o 0 para salir!");
            }while(opcion < '0' || opcion > '5');

            switch(opcion)
            {
                case '1':
                    System.out.println("En construcción");

                case '2':
                    System.out.println("En construcción");

                case '3':
                    System.out.println("En construcción");

                case '4':
                    System.out.println("En construcción");

                case '5':
                    System.out.println("En construcción");
            }
        }while(opcion != '0');
    }
}
