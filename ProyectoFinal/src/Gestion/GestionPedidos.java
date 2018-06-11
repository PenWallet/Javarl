package Gestion;

import java.util.Scanner;

/**
 * Clase que contiene las funciones/procedimientos �tiles para realizar pedidos a la panader�a
 */
public class GestionPedidos {

    /**
     * Funci�n que determina si, dado una ID de un pedido, existe en la base de datos
     *
     * @param IDPedido El ID del pedido a mirar
     * @return true si existe en la base de datos, false en caso contrario
     */
    public boolean validarIDPedido(int IDPedido)
    {
        System.out.println("ValidarIDPedido. En resguardo");
        return(true);
    }

    /**
     * Procedimiento que devuelve una lista de todos los pedidos de la base de datos
     */
    public void mostrarPedidos()
    {
        System.out.println("Mostrar pedidos. En resguardo");
    }

    /**
     * Funci�n que imprime en pantalla el recibo de un pedido entero, con los panes, complementos y bocatas que haya en el pedido
     *
     * @param IDPedido El ID del pedido que se quiere consultar
     */
    public void mostrarPedidoFully(int IDPedido)
    {
        System.out.println("Mostrar pedido Fully. En resguardo");
    }

    /**
     * Procedimiento que pregunta al usuario por todos los datos necesarios para hacer una consulta sobre un
     * pedido en espec�fico. Este procedimiento no hace la consulta, solo recoge los datos, para despu�s llamar
     * a la funci�n que realiza dicha tarea.
     */
    public void consultarPedidoDatos()
    {
        int IDPedido;
        boolean valido;
        Scanner teclado = new Scanner(System.in);

        do
        {
            mostrarPedidos();
            System.out.println("Elige la ID del pedido que quieres borrar (o 0 para salir): ");
            IDPedido = teclado.nextInt();
            if(IDPedido != 0)
            {
                valido = validarIDPedido(IDPedido);
                if(!valido)
                    System.out.println("�La ID introducida no es v�lida!");
            }
            else
                valido = false;
        }while(IDPedido != 0 && !valido);

        if(IDPedido != 0)
            mostrarPedidoFully(IDPedido);
    }

    /**
     * Procedimiento que pregunta al usuario por todos los datos necesarios para a�adir un nuevo pedido a la base de datos
     * Llama a todas las funciones necesarias, que se encuentran en esta misma clase de Gesti�n, para llevar a cabo su tarea
     */
    public void hacerPedidoDatos()
    {
        //Poner a true la variable primerPedido
        boolean primerPedido = true;
        char opcionPedidoNuevo;
        int contadorPedido = 0, nCliente, nPedido;

        GestionClientes gc = new GestionClientes();
        GestionAdmin ga = new GestionAdmin();
        Scanner teclado = new Scanner(System.in);

        //MostrarClientes * y leer y validar n� de cliente
        do
        {
            gc.mostrarClientes();
            System.out.println("Elije un cliente: ");
            nCliente = teclado.nextInt();
            if(!gc.validarIDCliente(nCliente))
                System.out.println("�N�mero de cliente inv�lido!");
        }while(!gc.validarIDCliente(nCliente));

        nPedido = crearNuevoPedido(nCliente);

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
                anadirPanPedido(nPedido);
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
                anadirCompPedido(nPedido);
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
                System.out.println("�Quieres pedir un bocata? (Y/N)");
                opcionPedidoNuevo = Character.toUpperCase(teclado.next().charAt(0));
                if(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y')
                    System.out.println("�Solo Y o N!");
            }while(opcionPedidoNuevo != 'N' && opcionPedidoNuevo != 'Y');

            if(opcionPedidoNuevo == 'Y')
            {
                anadirBocataPedido(nPedido);
                primerPedido = false;
            }
            else if(primerPedido)
                contadorPedido++;
        }while(opcionPedidoNuevo == 'Y');

        //Si no ha pedido nada
        if(contadorPedido == 3)
            ga.borrarPedido(nPedido);
    }

    /**
     * Funci�n que crea un nuevo pedido y lo asocia a un cliente
     *
     * @param IDCliente El ID del cliente al que se va a asociar el pedido
     * @return El ID del nuevo pedido
     */
    public int crearNuevoPedido(int IDCliente)
    {
        System.out.println("Crear nuevo pedido. En resguardo");
        return(1);
    }

    /**
     * Funci�n que se encarga de a�adir panes a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el pan
     */
    public void anadirPanPedido(int IDPedido)
    {
        System.out.println("A�adir pan a pedido. En resguardo");
    }

    /**
     * Funci�n que se encarga de a�adir complementos a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el complemento
     */
    public void anadirCompPedido(int IDPedido)
    {
        System.out.println("A�adir complemento a pedido. En resguardo");
    }

    /**
     * Funci�n que se encarga de a�adir bocatas a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el bocata
     */
    public void anadirBocataPedido(int IDPedido)
    {
        System.out.println("A�adir bocata a pedido. En resguardo");
    }
}
