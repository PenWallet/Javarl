/*
    Nombre del programa:
        PennyPan

    An�lisis:
        Programa de gesti�n de la famosa panader�a PennyPan.
        Se podr�: A�adir nuevos panes, complementos e ingredientes;
        a�adir pedidos nuevos y borrarlos;
        a�adir clientes.

    Entradas:
        - Por teclado, opciones de men�
        - Por teclado, contrase�a
        - Por teclado, datos sobre panes/comp/ingredientes
        - Por teclado, datos sobre clientes nuevos

    Salidas:
        - Por pantalla, toda la interfaz de usuario

    Restricciones:
        - La fecha de nacimiento debe ser anterior a la fecha actual
        - La direcci�n y el tel�fono puede no darse
        - Los precios debe ser mayor de 0
        - Las opciones de men� deben estar entre 0 (salir), y el n�mero m�ximo de opci�n
        - Al elegir un pedido, debe estar entre el m�nimo y el m�ximo n� de pedidos
        - La longitud de los nombres debe ser menor o igual a 2 caracteres
        - La longitud del apellido debe ser menor o igual a 30 caracteres
        - La longitud de la ciudad debe ser menor o igual a 20 caracteres
        - La longitud de la direcci�n debe ser menor o igual a 40 caracteres
        - La longitud del tel�fono debe ser de 9 caracteres

    Pseudoc�digo (nivel 0):
        Inicio
            Repetir
                Log-in
                Seg�n (log-in)
                    Caso (log-in como usuario normal):
                        Men� usuario
                    Caso (log-in como admin):
                        Men� admin
                    Caso (salir):
                        Mensaje despedida
                Fin seg�n
            Mientras (no quiera salir)
        Fin

    Pseudoc�digo espec�fico (Log-in):
        Inicio
            Repetir
                MostrarMenuLogIn * y leer y validar opci�n (men� log-in)
                Si (opcionLI == 2)
                    //Leer y validar contrase�a de admin
                    Leer contrase�a y ValidarContrase�a *
                    Si (es correcta)
                        Mostrar mensaje de bienvenida
                    Si no
                        Mostrar mensaje de fallo de log-in
                    Fin Si
                Fin Si
            Mientras (opci�n != 0)
        Fin

    Pseudoc�digo espec�fico (Men� usuario):
        Inicio
            Repetir
                MostrarMenuUsuario * y leer y validar opci�n (men� usuario)
                Seg�n (opcionMU)
                    Caso '1':
                        HacerPedidoDatos *
                    Caso '2':
                        ConsultarPedidoDatos *
            Mientras (opcionMU != '0')
        Fin

    Pseudoc�digo espec�fico (Men� admin):
        Inicio
            Repetir
                MostrarMenuAdmin * y leer y validar opci�n (men� admin)
                Seg�n (opcionMU)
                    Caso '1':
                        A�adirPanDatos *
                    Caso '2':
                        A�adirCompDatos *
                    Caso '3':
                        A�adirIngrDatos *
                    Caso '4':
                        A�adirClienteDatos *
                    Caso '5':
                        BorrarPedidoDatos *
            Mientras (opcionMA != '0')
        Fin

    Pseudoc�digo espec�fico (hacerPedidoDatos *):
        Inicio
            Poner a true la variable primerPedido
            Poner a false la variable
            MostrarClientes * y leer y validar n� de cliente (usando ValidarIDCliente *)

            //Pedir panes
            Repetir
                Leer y validar si quiere pedir pan
                Si (opcionPedidoNuevo == 'Y')
                    Si (primerPedido)
                        CrearNuevoPedido *
                    Fin Si
                    A�adirPanPedidoDatos *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')

            //Pedir complementos
            Repetir
                Leer y validar si quiere pedir complementos
                Si (opcionPedidoNuevo == 'Y')
                    Si (primerPedido)
                        CrearNuevoPedido *
                    Fin Si
                    A�adirCompPedidoDatos *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')

            //Pedir bocatas
            Repetir
                Leer y validar si quiere pedir bocata
                Si (opcionPedidoNuevo == 'Y')
                    Si (primerPedido)
                        CrearNuevoPedido *
                    Fin Si
                    A�adirBocataPedidoDatos *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')
        Fin

    Pseudoc�digo espec�fico (ConsultarPedidoDatos *):
        Inicio
            MostrarPedidos *
            Leer y validar n�mero de pedido
            MostrarPedidoFully *
        Fin

    Pseudoc�digo espec�fico (A�adirPanDatos *):
        Inicio
            Leer y validar nombre
            Leer y validar integral //(si es integral o no)
            Leer y validar crujenticidad
            Leer y validar precio
            Leer y validar ultima validaci�n
            Si (ultimaValidacion)
                A�adirPan *
            Fin si
        Fin

    Pseudoc�digo espec�fico (A�adirCompDatos *):
        Inicio
            Leer y validar nombre
            Leer y validar precio
            Leer y validar ultima validaci�n
            Si (ultimaValidacion)
                A�adirComp *
            Fin si
        Fin

    Pseudoc�digo espec�fico (A�adirIngrDatos *):
        Inicio
            Leer y validar nombre
            Leer y validar precio
            Leer y validar ultima validaci�n
            Si (ultimaValidacion)
                A�adirIngr *
            Fin si
        Fin

    Pseudoc�digo espec�fico (A�adirClienteDatos *):
        Inicio
            Leer y validar nombre
            Leer y validar apellidos
            Leer y validar fecha de nacimiento
            Leer y validar ciudad
            Leer y validar direcci�n
            Leer y validar tel�fono
            Leer y validar ultima validaci�n
            Si (ultimaValidacion)
                A�adirCliente *
            Fin si
        Fin

 */

import Gestion.*;

import java.io.Console;
import java.util.Scanner;

public class PennyPan
{
    public static void main(String[] args)
    {
        int opcionLI;
        char opcionMU;
        char opcionMA;

        Scanner teclado = new Scanner(System.in);
        Console cons = System.console();
        GestionPedidos gp = new GestionPedidos();
        GestionAdmin ga = new GestionAdmin();

        do
        {
            do
            {
                /*
                     **************************************
                     ************ L O G - I N *************
                     **************************************
                 */

                //Leer y validar opci�n (men� log-in)
                do
                {
                    GestionMenus.MostrarMenuLogIn();
                    System.out.println("");
                    opcionLI = teclado.nextInt();
                    if (opcionLI < 0 || opcionLI > 2)
                        System.out.println("�Solo 1, 2, o 0 para salir!");
                } while (opcionLI < 0 || opcionLI > 2);

                if (opcionLI == 2)
                {
                    //Leer contrase�a y ValidarContrase�a *
                    opcionLI = ga.validarContrasena(cons.readPassword("Escribe la contrase�a para administradores: "));

                    if (opcionLI == 2)
                        //Mostrar mensaje de bienvenida de admin
                        System.out.println("�Bienvenido, panadero!");
                    else
                        //Mostrar mensaje de fallo de log-in
                        System.out.println("�Contrase�a incorrecta! Fuera, gentusa");
                }
            }while(opcionLI < 0 || opcionLI > 2); //FIN LOG-IN

            /*
                 **************************************
                 ******** S E G � N (LOG-IN) **********
                 **************************************
             */
            switch(opcionLI)
            {
                case 1:
                    /*
                         **************************************
                         ******* M E N �  U S U A R I O *******
                         **************************************
                     */
                    do
                    {
                        //MostrarMenuUsuario * y leer y validar opci�n (men� usuario)
                        do
                        {
                            GestionMenus.MostrarMenuUsuario();
                            opcionMU = teclado.next().charAt(0);
                            if(opcionMU < '0' || opcionMU > '2')
                                System.out.println("�Solo del 1 al 2, o 0 para salir!");
                        }while(opcionMU < '0' || opcionMU > '2');

                        switch(opcionMU)
                        {
                            case '1':
                                gp.hacerPedidoDatos();
                                break;

                            case '2':
                                gp.consultarPedidoDatos();
                                break;
                        }
                    }while(opcionMU != '0'); //FIN MEN� USUARIO
                    break;

                case 2:
                    /*
                         **************************************
                         ********* M E N �  A D M I N *********
                         **************************************
                     */
                    do
                    {
                        //MostrarMenuAdmin * y leer y validar opci�n (men� admin)
                        do
                        {
                            GestionMenus.MostrarMenuAdmin();
                            opcionMA = teclado.next().charAt(0);
                            if(opcionMA < '0' || opcionMA > '5')
                                System.out.println("�Solo del 1 al 5, o 0 para salir!");
                        }while(opcionMA < '0' || opcionMA > '5');

                        switch(opcionMA)
                        {
                            case'1':
                                ga.anadirPanDatos();
                                break;

                            case '2':
                                ga.anadirCompDatos();
                                break;

                            case '3':
                                ga.anadirIngrDatos();
                                break;

                            case '4':
                                ga.anadirClienteDatos();
                                break;

                            case '5':
                                ga.borrarPedidoDatos();
                                break;
                        }
                    }while(opcionMA != '0'); //FIN MEN� ADMIN
                    break;

                case 0:
                    System.out.println("�Adi�s, vuelva pronto a PennyPan!");
                    break;
            }

        }while(opcionLI != 0); //FIN PROGRAMA
    }
}
