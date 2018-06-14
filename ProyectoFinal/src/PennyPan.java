/*
    Nombre del programa:
        PennyPan

    Análisis:
        Programa de gestión de la famosa panadería PennyPan.
        Se podrá: Añadir nuevos panes, complementos e ingredientes;
        añadir pedidos nuevos y borrarlos;
        añadir clientes.

    Entradas:
        - Por teclado, opciones de menú
        - Por teclado, contraseña
        - Por teclado, datos sobre panes/comp/ingredientes
        - Por teclado, datos sobre clientes nuevos

    Salidas:
        - Por pantalla, toda la interfaz de usuario

    Restricciones:
        - La fecha de nacimiento debe ser anterior a la fecha actual
        - La dirección y el teléfono puede no darse
        - Los precios debe ser mayor de 0
        - Las opciones de menú deben estar entre 0 (salir), y el número máximo de opción
        - Al elegir un pedido, debe estar entre el mínimo y el máximo nº de pedidos
        - La longitud de los nombres debe ser menor o igual a 2 caracteres
        - La longitud del apellido debe ser menor o igual a 30 caracteres
        - La longitud de la ciudad debe ser menor o igual a 20 caracteres
        - La longitud de la dirección debe ser menor o igual a 40 caracteres
        - La longitud del teléfono debe ser de 9 caracteres

    Pseudocódigo (nivel 0):
        Inicio
            Repetir
                Log-in
                Según (log-in)
                    Caso (log-in como usuario normal):
                        Menú usuario
                    Caso (log-in como admin):
                        Menú admin
                    Caso (salir):
                        Mensaje despedida
                Fin según
            Mientras (no quiera salir)
        Fin

    Pseudocódigo específico (Log-in):
        Inicio
            Repetir
                MostrarMenuLogIn * y leer y validar opción (menú log-in)
                Si (opcionLI == 2)
                    //Leer y validar contraseña de admin
                    Leer contraseña y ValidarContraseña *
                    Si (es correcta)
                        Mostrar mensaje de bienvenida
                    Si no
                        Mostrar mensaje de fallo de log-in
                    Fin Si
                Fin Si
            Mientras (opción != 0)
        Fin

    Pseudocódigo específico (Menú usuario):
        Inicio
            Repetir
                MostrarMenuUsuario * y leer y validar opción (menú usuario)
                Según (opcionMU)
                    Caso '1':
                        HacerPedidoDatos *
                    Caso '2':
                        ConsultarPedidoDatos *
            Mientras (opcionMU != '0')
        Fin

    Pseudocódigo específico (Menú admin):
        Inicio
            Repetir
                MostrarMenuAdmin * y leer y validar opción (menú admin)
                Según (opcionMU)
                    Caso '1':
                        AñadirPanDatos *
                    Caso '2':
                        AñadirCompDatos *
                    Caso '3':
                        AñadirIngrDatos *
                    Caso '4':
                        AñadirClienteDatos *
                    Caso '5':
                        BorrarPedidoDatos *
            Mientras (opcionMA != '0')
        Fin

    Pseudocódigo específico (hacerPedidoDatos *):
        Inicio
            Poner a true la variable primerPedido
            Poner a false la variable
            MostrarClientes * y leer y validar nº de cliente (usando ValidarIDCliente *)

            //Pedir panes
            Repetir
                Leer y validar si quiere pedir pan
                Si (opcionPedidoNuevo == 'Y')
                    Si (primerPedido)
                        CrearNuevoPedido *
                    Fin Si
                    AñadirPanPedidoDatos *
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
                    AñadirCompPedidoDatos *
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
                    AñadirBocataPedidoDatos *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')
        Fin

    Pseudocódigo específico (ConsultarPedidoDatos *):
        Inicio
            MostrarPedidos *
            Leer y validar número de pedido
            MostrarPedidoFully *
        Fin

    Pseudocódigo específico (AñadirPanDatos *):
        Inicio
            Leer y validar nombre
            Leer y validar integral //(si es integral o no)
            Leer y validar crujenticidad
            Leer y validar precio
            Leer y validar ultima validación
            Si (ultimaValidacion)
                AñadirPan *
            Fin si
        Fin

    Pseudocódigo específico (AñadirCompDatos *):
        Inicio
            Leer y validar nombre
            Leer y validar precio
            Leer y validar ultima validación
            Si (ultimaValidacion)
                AñadirComp *
            Fin si
        Fin

    Pseudocódigo específico (AñadirIngrDatos *):
        Inicio
            Leer y validar nombre
            Leer y validar precio
            Leer y validar ultima validación
            Si (ultimaValidacion)
                AñadirIngr *
            Fin si
        Fin

    Pseudocódigo específico (AñadirClienteDatos *):
        Inicio
            Leer y validar nombre
            Leer y validar apellidos
            Leer y validar fecha de nacimiento
            Leer y validar ciudad
            Leer y validar dirección
            Leer y validar teléfono
            Leer y validar ultima validación
            Si (ultimaValidacion)
                AñadirCliente *
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

                //Leer y validar opción (menú log-in)
                do
                {
                    GestionMenus.MostrarMenuLogIn();
                    System.out.println("");
                    opcionLI = teclado.nextInt();
                    if (opcionLI < 0 || opcionLI > 2)
                        System.out.println("¡Solo 1, 2, o 0 para salir!");
                } while (opcionLI < 0 || opcionLI > 2);

                if (opcionLI == 2)
                {
                    //Leer contraseña y ValidarContraseña *
                    opcionLI = ga.validarContrasena(cons.readPassword("Escribe la contraseña para administradores: "));

                    if (opcionLI == 2)
                        //Mostrar mensaje de bienvenida de admin
                        System.out.println("¡Bienvenido, panadero!");
                    else
                        //Mostrar mensaje de fallo de log-in
                        System.out.println("¡Contraseña incorrecta! Fuera, gentusa");
                }
            }while(opcionLI < 0 || opcionLI > 2); //FIN LOG-IN

            /*
                 **************************************
                 ******** S E G Ú N (LOG-IN) **********
                 **************************************
             */
            switch(opcionLI)
            {
                case 1:
                    /*
                         **************************************
                         ******* M E N Ú  U S U A R I O *******
                         **************************************
                     */
                    do
                    {
                        //MostrarMenuUsuario * y leer y validar opción (menú usuario)
                        do
                        {
                            GestionMenus.MostrarMenuUsuario();
                            opcionMU = teclado.next().charAt(0);
                            if(opcionMU < '0' || opcionMU > '2')
                                System.out.println("¡Solo del 1 al 2, o 0 para salir!");
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
                    }while(opcionMU != '0'); //FIN MENÚ USUARIO
                    break;

                case 2:
                    /*
                         **************************************
                         ********* M E N Ú  A D M I N *********
                         **************************************
                     */
                    do
                    {
                        //MostrarMenuAdmin * y leer y validar opción (menú admin)
                        do
                        {
                            GestionMenus.MostrarMenuAdmin();
                            opcionMA = teclado.next().charAt(0);
                            if(opcionMA < '0' || opcionMA > '5')
                                System.out.println("¡Solo del 1 al 5, o 0 para salir!");
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
                    }while(opcionMA != '0'); //FIN MENÚ ADMIN
                    break;

                case 0:
                    System.out.println("¡Adiós, vuelva pronto a PennyPan!");
                    break;
            }

        }while(opcionLI != 0); //FIN PROGRAMA
    }
}
