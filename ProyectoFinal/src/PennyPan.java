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
                        Hacer pedido
                    Caso '2':
                        Consultar pedido
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
                        Quitar pedido
            Mientras (opcionMA != '0')
        Fin

    Pseudoc�digo espec�fico (Hacer pedido):
        Inicio
            Poner a true la variable primerPedido
            MostrarClientes * y leer y validar n� de cliente (usando ValidarIDCliente *)
            CrearNuevoPedido *

            //Pedir panes
            Repetir
                Leer y validar si quiere pedir pan
                Si (opcionPedidoNuevo == 'Y')
                    A�adirPanPedido *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')

            //Pedir complementos
            Repetir
                Leer y validar si quiere pedir complementos
                Si (opcionPedidoNuevo == 'Y')
                    A�adirCompPedido *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')

            //Pedir bocatas
            Repetir
                Leer y validar si quiere pedir bocata
                Si (opcionPedidoNuevo == 'Y')
                    A�adirBocataPedido *
                Si no, si (primerPedido)
                    Incrementar en 1 el contadorPedido
                Fin Si
            Mientras (opcionPedidoNuevo == 'Y')

            //Si no ha pedido nada
            Si (contadorPedido == 3)
                BorrarNuevoPedido *
            Fin Si
        Fin

    Pseudoc�digo espec�fico (Modificar pedido):
        Inicio
            MostrarPedidos *
            Leer y validar n�mero de pedido
            Mientras (pedido != 0)
                MostrarMenuModificarPedido *
                Leer y validar opci�n modificar
                Seg�n (opcionMod)
                    Caso '1':
                        A�adirPanPedido *
                    Caso '2':
                        A�adirCompPedido *
                    Caso '3':
                        A�adirBocataPedido *
                    Caso '4':
                        QuitarPanPedido *
                    Caso '5':
                        QuitarCompPedido *
                    Caso '6':
                        QuitarBocataPedido *
            Fin Mientras
        Fin

    Pseudoc�digo espec�fico (Consultar pedido):
        Inicio
            MostrarPedidos *
            Leer y validar n�mero de pedido
            MostrarTicketPedido *
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
        int contadorPedido = 0;
        int nCliente;
        int crujenticidad;

        double precio;

        boolean primerPedido;

        char opcionMU;
        char opcionMA;
        char opcionPedidoNuevo;
        char integral;
        char ultimaValidacion;

        String nombreAnadir;

        Scanner teclado = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        Console cons = System.console();
        GestionGeneral g = new GestionGeneral();
        GestionPedidos gp = new GestionPedidos();
        GestionClientes gc = new GestionClientes();
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
                    opcionLI = ga.ValidarContrasena(cons.readPassword("Escribe la contrase�a para administradores: "));

                    if (opcionLI == 2)
                        //Mostrar mensaje de bienvenida de admin
                        System.out.println("�Bienvenido, panadero!");
                    else
                        //Mostrar mensaje de fallo de log-in
                        System.out.println("Error de log-in. Fuera, gentusa");
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
                            if(opcionMU < '0' || opcionMU > '3')
                                System.out.println("�Solo del 1 al 3, o 0 para salir!");
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

                                //MostrarClientes * y leer y validar n� de cliente
                                do
                                {
                                    gc.mostrarClientes();
                                    System.out.println("Elije un cliente: ");
                                    nCliente = teclado.nextInt();
                                    if(!gc.validarIDCliente(nCliente))
                                        System.out.println("�N�mero de cliente inv�lido!");
                                }while(!gc.validarIDCliente(nCliente));

                                //Pedir panes
                                do
                                {
                                    //Leer y validar si quiere pedir pan
                                    do
                                    {
                                        System.out.println("�Quieres pedir pan? (Y/N)");
                                        opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                                        if(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                                            System.out.println("�Solo Y o N!");
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
                                        System.out.println("�Quieres pedir complemento? (Y/N)");
                                        opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                                        if(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                                            System.out.println("�Solo Y o N!");
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
                                        System.out.println("�Quieres pedir complemento? (Y/N)");
                                        opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                                        if(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                                            System.out.println("�Solo Y o N!");
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
                                System.out.println("Modificar pedido. En construcci�n");
                                break;

                            case '3':
                                System.out.println("Consultar pedido. En construcci�n");
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
                                System.out.println("Quitar pedido. En construcci�n");
                                break;
                        }
                    }while(opcionMA != '0'); //FIN MEN� USUARIO
                    break;

                case 0:
                    System.out.println("�Adi�s, vuelva pronto a PennyPan!");
                    break;
            }

        }while(opcionLI != 0); //FIN PROGRAMA
    }
}
