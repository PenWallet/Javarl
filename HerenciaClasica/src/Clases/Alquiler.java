/*  Estudio de interfaz (clase):
        Definici�n:
            Clase Alquiler, que se usar� �nicamente para relacionar la clase Cliente con Pel�cula
            Se usar� para un programa de gesti�n de alquileres de pel�culas
        Atributos:
            - Cliente: Cliente, consultable, modificable
            - Pelicula: Pelicula, consultable, modificable
            - Fecha: String, consultable, modificable
        M�todos:
            Cliente getCliente()
            void setCliente(Cliente c)

            Pelicula getPelicula()
            void setPelicula(Pelicula p)

            String getFecha()
            void setFecha(String fecha)

            int obtenerDia()
            int obtenerMes()
            int obtenerAno()
*/

package Clases;

/**
 * Clase que relaciona Cliente con Pel�cula mediante una fecha de compra/alquiler de la pel�cula
 */
public class Alquiler {

    /**
     * El cliente que compr�/alquil� la pel�cula
     */
    private Cliente cliente;

    /**
     * La pel�cula que compr�/alquil�
     */
    private Pelicula pelicula;

    /**
     * La fecha en la que se hizo la compra
     * Formato: dd/mm/aaaa
     */
    private String fecha;

    //CONSTRUCTORES

    /**
     * El constructor por par�metros
     */
    public Alquiler(Cliente c, Pelicula p, String fecha)
    {
        this.cliente = c;
        this.pelicula = p;
        this.fecha = fecha;
    }

    /**
     * El constructor de copia
     */
    public Alquiler(Alquiler a)
    {
        this.cliente = a.cliente;
        this.pelicula = a.pelicula;
        this.fecha = a.fecha;
    }

    //GETTERS Y SETTERS

    /**
     * Devuelve el cliente que compr�/alquil� la pel�cula
     * @return El cliente
     */
    public Cliente getCliente() { return(this.cliente); }

    /**
     * Reemplaza el cliente existente y le coloca un valor nuevo
     * @param c
     */
    public void setCliente(Cliente c) { this.cliente = c; }

    /**
     * Obtiene la pel�cula que se alquil�/compr�
     * @return La pel�cula
     */
    public Pelicula getPelicula() { return(this.pelicula); }

    /**
     * Reemplaza la pel�cula existente y le coloca un valor nuevo
     * @param p La pel�cula
     */
    public void setPelicula(Pelicula p) { this.pelicula = p; }

    /**
     * Devuelve la fecha en la que se compr�/alquil� la pel�cula
     * @return La fecha
     */
    public String getFecha() { return(this.fecha); }

    /**
     * Reemplaza la fecha existente y le coloca un valor nuevo
     * @param fecha La fecha
     */
    public void setFecha(String fecha) { this.fecha = fecha; }

    //FUNCIONES

    /**
     * Devuelve el d�a en el que se compr�/alquil� la pel�cula
     * @return El d�a de la fecha
     */
    public int obtenerDia()
    {
        String[] array = this.fecha.split("/");
        return(Integer.parseInt(array[0]));
    }

    /**
     * Devuelve el mes en el que se compr�/alquil� la pel�cula
     * @return El mes de la fecha
     */
    public int obtenerMes()
    {
        String[] array = this.fecha.split("/");
        return(Integer.parseInt(array[1]));
    }

    /**
     * Devuelve el a�o en el que se compr�/alquil� la pel�cula
     * @return El a�o de la fecha
     */
    public int obtenerAno()
    {
        String[] array = this.fecha.split("/");
        return(Integer.parseInt(array[2]));
    }
}
