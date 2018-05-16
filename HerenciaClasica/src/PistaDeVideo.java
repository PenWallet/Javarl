/*
    Nombre del programa:
        PistaDeVideo

    Comentario:
        Main del programa que gestiona un videoclub

    Pseudoc�digo:
        Inicio
            Repetir
                MostrarMenu *
                Leer y validar opcion
                Seg�n (opcion)
                    Caso '1': Ver pel�culas disponibles
                    Caso '2': Ver clientes
                    Caso '3': Alquilar pel�cula
                    Caso '4': Consultar pel�culas alquiladas
                    Caso '5': Rellenar con datos //OPCI�N ESCONDIDA
                Fin seg�n
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
                    System.out.println("�Solo del 1 al 4, o 0 para salir!");
            }while(opcion < '0' || opcion > '5');

            switch(opcion)
            {
                case '1':
                    System.out.println("En construcci�n");

                case '2':
                    System.out.println("En construcci�n");

                case '3':
                    System.out.println("En construcci�n");

                case '4':
                    System.out.println("En construcci�n");

                case '5':
                    System.out.println("En construcci�n");
            }
        }while(opcion != '0');
    }
}
