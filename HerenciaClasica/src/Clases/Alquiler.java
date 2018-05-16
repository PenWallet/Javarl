/*  Estudio de interfaz (clase):
        Definición:
            Clase Alquiler, que se usará únicamente para relacionar la clase Cliente con Película
            Se usará para un programa de gestión de alquileres de películas
        Atributos:
            - Cliente: Cliente, consultable, modificable
            - Pelicula: Pelicula, consultable, modificable
            - Fecha: String, consultable, modificable
        Métodos:
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
 * Clase que relaciona Cliente con Película mediante una fecha de compra/alquiler de la película
 */
public class Alquiler {

    /**
     * El cliente que compró/alquiló la película
     */
    private Cliente cliente;

    /**
     * La película que compró/alquiló
     */
    private Pelicula pelicula;

    /**
     * La fecha en la que se hizo la compra
     * Formato: dd/mm/aaaa
     */
    private String fecha;

    //CONSTRUCTORES

    /**
     * El constructor por parámetros
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
     * Devuelve el cliente que compró/alquiló la película
     * @return El cliente
     */
    public Cliente getCliente() { return(this.cliente); }

    /**
     * Reemplaza el cliente existente y le coloca un valor nuevo
     * @param c
     */
    public void setCliente(Cliente c) { this.cliente = c; }

    /**
     * Obtiene la película que se alquiló/compró
     * @return La película
     */
    public Pelicula getPelicula() { return(this.pelicula); }

    /**
     * Reemplaza la película existente y le coloca un valor nuevo
     * @param p La película
     */
    public void setPelicula(Pelicula p) { this.pelicula = p; }

    /**
     * Devuelve la fecha en la que se compró/alquiló la película
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
     * Devuelve el día en el que se compró/alquiló la película
     * @return El día de la fecha
     */
    public int obtenerDia()
    {
        String[] array = this.fecha.split("/");
        return(Integer.parseInt(array[0]));
    }

    /**
     * Devuelve el mes en el que se compró/alquiló la película
     * @return El mes de la fecha
     */
    public int obtenerMes()
    {
        String[] array = this.fecha.split("/");
        return(Integer.parseInt(array[1]));
    }

    /**
     * Devuelve el año en el que se compró/alquiló la película
     * @return El año de la fecha
     */
    public int obtenerAno()
    {
        String[] array = this.fecha.split("/");
        return(Integer.parseInt(array[2]));
    }
}
