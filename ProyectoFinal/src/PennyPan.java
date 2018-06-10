/*
    Nombre del programa:
        PennyPan

    Análisis:
        Programa de gestión de la famosa panadería PennyPan.
        Se podrá: Añadir nuevos panes, complementos e ingredientes;
        añadir pedidos nuevos, modificarlos y borrarlos;
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
                        Hacer pedido
                    Caso '2':
                        Modificar pedido
                    Caso '3':
                        Consultar pedido
            Mientras (opcionMU != '0')
        Fin

    Pseudocódigo específico (Menú admin):
        Inicio
            Repetir
                MostrarMenuAdmin * y leer y validar opción (menú admin)
                Según (opcionMU)
                    Caso '1':
                        Añadir pan
                    Caso '2':
                        Añadir complemento
                    Caso '3':
                        Añadir ingrediente
                    Caso '4':
                        Añadir cliente
                    Caso '5':
                        Quitar pedido
            Mientras (opcionMA != '0')
        Fin

    Pseudocódigo específico (Hacer pedido):
        Inicio
            Poner a true la variable primerPedido
            MostrarClientes * y leer y validar nº de cliente (usando ValidarIDCliente *)
            CrearNuevoPedido *

            //Pedir panes
            Repetir
                Leer y validar si quiere pedir pan
                Si (opcionPedidoNuevo == 'Y')
                    AñadirPanPedido *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')

            //Pedir complementos
            Repetir
                Leer y validar si quiere pedir complementos
                Si (opcionPedidoNuevo == 'Y')
                    AñadirCompPedido *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')

            //Pedir bocatas
            Repetir
                Leer y validar si quiere pedir bocata
                Si (opcionPedidoNuevo == 'Y')
                    AñadirBocataPedido *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')

            //Si no ha pedido nada
            Si (contadorPedido == 3)
                BorrarNuevoPedido *
            Fin Si
        Fin

    Pseudocódigo específico (Modificar pedido):
        Inicio
            MostrarPedidos *
            Leer y validar número de pedido
            Mientras (pedido != 0)
                MostrarMenuModificarPedido *
                Leer y validar opción modificar
                Según (opcionMod)
                    Caso '1':
                        AñadirPanPedido *
                    Caso '2':
                        AñadirCompPedido *
                    Caso '3':
                        AñadirBocataPedido *
                    Caso '4':
                        QuitarPanPedido *
                    Caso '5':
                        QuitarCompPedido *
                    Caso '6':
                        QuitarBocataPedido *
            Fin Mientras
        Fin

    Pseudocódigo específico (Consultar pedido):
        Inicio
            MostrarPedidos *
            Leer y validar número de pedido
            MostrarTicketPedido *
        Fin

    Pseudocódigo específico (Añadir pan):
        Inicio
            Leer nombre
            Leer y validar integral //(si es integral o no)
            Leer y validar crujenticidad
            Leer y validar precio
            AñadirPan *
        Fin

    Pseudocódigo específico (Añadir complemento):
        Inicio
            Leer nombre
            Leer y validar precio
            AñadirComp *
        Fin

    Pseudocódigo específico (Añadir ingrediente):
        Inicio
            Leer nombre
            Leer y validar precio
            AñadirIngr *
        Fin

    Pseudocódigo específico (Añadir cliente):
        Inicio
            Leer nombre
            Leer apellidos
            Leer y validar fecha de nacimiento
            Leer ciudad
            Leer dirección
            Leer teléfono
            AñadirCliente *
        Fin

 */

import Gestion.GestionClientes;
import Gestion.GestionMenus;
import Gestion.GestionPedidos;

import java.io.Console;
import java.util.Scanner;

public class PennyPan
{
    public static void main(String[] args)
    {
        int opcionLI;
        int contadorPedido = 0;
        int nCliente;

        boolean primerPedido;

        char opcionMU;
        char opcionMA;
        char opcionPedidoNuevo;

        Scanner teclado = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        Console cons = System.console();
        Gestion.Gestion g = new Gestion.Gestion();
        GestionPedidos gp = new GestionPedidos();
        GestionClientes gc = new GestionClientes();

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
                    opcionLI = g.ValidarContrasena(cons.readPassword("Escribe la contraseña para administradores: "));

                    if (opcionLI == 2)
                        //Mostrar mensaje de bienvenida de admin
                        System.out.println("¡Bienvenido, panadero!");
                    else
                        //Mostrar mensaje de fallo de log-in
                        System.out.println("Error de log-in. Fuera, gentusa");
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
                            if(opcionMU < '0' || opcionMU > '3')
                                System.out.println("¡Solo del 1 al 3, o 0 para salir!");
                        }while(opcionMU < '0' || opcionMU > '3');

                        switch(opcionMU)
                        {
                            case '1':
                                /*
                                     **************************************
                                     ******* H A C E R  P E D I D O *******
                                     **************************************
                                 */

                                //Poner a true la variable primerPedido
                                primerPedido = true;

                                //MostrarClientes * y leer y validar nº de cliente
                                do
                                {
                                    gc.mostrarClientes();
                                    System.out.println("Elije un cliente: ");
                                    nCliente = teclado.nextInt();
                                    if(!gc.validarIDCliente(nCliente))
                                        System.out.println("¡Número de cliente inválido!");
                                }while(!gc.validarIDCliente(nCliente));

                                //Pedir panes
                                do
                                {
                                    //Leer y validar si quiere pedir pan
                                    do
                                    {
                                        System.out.println("¿Quieres pedir pan? (Y/N)");
                                        opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                                        if(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                                            System.out.println("¡Solo Y o N!");
                                    }while(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y');

                                    if(opcionPedidoNuevo == 'Y')
                                    {
                                        gp.anadirPanPedido(1);
                                        primerPedido = false;
                                    }
                                    else if(primerPedido)
                                        contadorPedido++;

                                }while(opcionPedidoNuevo == 'Y');

                                //Pedir complementos
                                do
                                {
                                    //Leer y validar si quiere pedir complementos
                                    do
                                    {
                                        System.out.println("¿Quieres pedir complemento? (Y/N)");
                                        opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                                        if(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                                            System.out.println("¡Solo Y o N!");
                                    }while(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y');

                                    if(opcionPedidoNuevo == 'Y')
                                    {
                                        gp.anadirCompPedido(1);
                                        primerPedido = false;
                                    }
                                    else if(primerPedido)
                                        contadorPedido++;

                                }while(opcionPedidoNuevo == 'Y');

                                //Pedir bocatas
                                do
                                {
                                    //Leer y validar si quiere pedir bocatas
                                    do
                                    {
                                        System.out.println("¿Quieres pedir complemento? (Y/N)");
                                        opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                                        if(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                                            System.out.println("¡Solo Y o N!");
                                    }while(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y');

                                    if(opcionPedidoNuevo == 'Y')
                                    {
                                        gp.anadirBocataPedido(1);
                                        primerPedido = false;
                                    }
                                    else if(primerPedido)
                                        contadorPedido++;
                                }while(opcionPedidoNuevo == 'Y');

                                //Si no ha pedido nada
                                if(contadorPedido == 3)
                                    gp.borrarNuevoPedido(nCliente);

                                break;

                            case '2':
                                System.out.println("Modificar pedido. En construcción");
                                break;

                            case '3':
                                System.out.println("Consultar pedido. En construcción");
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
                            case '1':
                                System.out.println("Añadir pan. En construcción");
                                break;

                            case '2':
                                System.out.println("Añadir complemento. En construcción");
                                break;

                            case '3':
                                System.out.println("Añadir ingrediente. En construcción");
                                break;

                            case '4':
                                System.out.println("Añadir cliente. En construcción");
                                break;

                            case '5':
                                System.out.println("Quitar pedido. En construcción");
                                break;
                        }
                    }while(opcionMA != '0'); //FIN MENÚ USUARIO
                    break;

                case 0:
                    System.out.println("¡Adiós, vuelva pronto a PennyPan!");
                    break;
            }

        }while(opcionLI != 0); //FIN PROGRAMA
    }
}
