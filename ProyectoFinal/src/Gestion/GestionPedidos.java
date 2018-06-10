package Gestion;

/**
 * Clase que contiene las funciones/procedimientos �tiles para realizar pedidos a la panader�a
 */
public class GestionPedidos {

    /**
     * Funci�n que crea un nuevo pedido y lo asocia a un cliente
     *
     * @param IDCliente El ID del cliente al que se va a asociar el pedido
     */
    public void crearNuevoPedido(int IDCliente)
    {
        System.out.println("En resguardo");
    }

    /**
     * Funci�n de uso especial, y que solo se usar� en el main, para borrar el pedido en caso
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
     * Funci�n que se encarga de a�adir panes a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el pan
     */
    public void anadirPanPedido(int IDPedido)
    {
        System.out.println("En resguardo");
    }

    /**
     * Funci�n que se encarga de a�adir complementos a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el complemento
     */
    public void anadirCompPedido(int IDPedido)
    {
        System.out.println("En resguardo");
    }

    /**
     * Funci�n que se encarga de a�adir bocatas a un pedido
     *
     * @param IDPedido El ID del pedido al que se va a agregar el bocata
     */
    public void anadirBocataPedido(int IDPedido)
    {
        System.out.println("En resguardo");
    }
}
