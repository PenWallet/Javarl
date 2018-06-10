package Gestion;

/**
 * Clase que contiene las funciones/procedimientos útiles para realizar pedidos a la panadería
 */
public class GestionPedidos {

    /**
     * Función que crea un nuevo pedido y lo asocia a un cliente
     *
     * @param IDCliente El ID del cliente al que se va a asociar el pedido
     */
    public void crearNuevoPedido(int IDCliente)
    {
        System.out.println("En resguardo");
    }

    /**
     * Función de uso especial, y que solo se usará en el main, para borrar el pedido en caso
     * de que no se haya pedido nada durante el proceso de "Hacer pedido"
     * Es decir, que se haya saltado Pedir pan, Pedir complemento, y Pedir bocata
     *
     * @param IDCliente El ID del cliente que no ha pedido nada (vaya agarrao)
     */
    public void borrarNuevoPedido(int IDCliente)
    {
        System.out.println("En resguardo");
    }

    /**
     * Función que se encarga de añadir panes a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el pan
     */
    public void anadirPanPedido(int IDPedido)
    {
        System.out.println("En resguardo");
    }

    /**
     * Función que se encarga de añadir complementos a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el complemento
     */
    public void anadirCompPedido(int IDPedido)
    {
        System.out.println("En resguardo");
    }

    /**
     * Función que se encarga de añadir bocatas a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el bocata
     */
    public void anadirBocataPedido(int IDPedido)
    {
        System.out.println("En resguardo");
    }
}
