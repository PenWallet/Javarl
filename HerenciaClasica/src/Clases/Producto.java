/*  Estudio de interfaz (clase):
        Definici�n:
            Clase con las propiedades m�s comunes que se le pueden atribuir a un producto
            Pensada mayormente para que sea heredada en otras subclases.

        Atributos:
            - Nombre: String, consultable, modificable
            - Precio: Double, consultable, modificable

        M�todos:
            String getNombre()
            void setNombre(String nombre)

            double getPrecio()
            void setPrecio(double precio)

            void aumentarPrecio(int porcentaje)


*/

package Clases;

/**
 * Clase producto, con las propiedades m�s comunes que se le pueden atribuir a un producto
 */
public class Producto {

    /**
     * El nombre del producto
     */
    protected String nombre;

    /**
     * El precio del producto
     */
    protected double precio;

    //CONSTRUCTORES

    /**
     * El constructor por defecto
     */
    public Producto()
    {
        this.nombre = "";
        this.precio = 0;
    }

    /**
     * El constructor por par�metros
     */
    public Producto(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * El constructor de copia
     */
    public Producto (Producto p)
    {
        this.nombre = p.nombre;
        this.precio = p.precio;
    }


    //GETTERS Y SETTERS
    /**
     * Devuelve el nombre
     *
     * @return El nombre
     */
    public String getNombre() { return(this.nombre); }

    /**
     * Reemplaza el nombre existente y lo cambia al introducido
     * @param nombre La nueva edad de la persona (�viajero en el tiempo?)
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Devuelve el precio
     *
     * @return El precio
     */
    public double getPrecio() { return(this.precio); }

    /**
     * Reemplaza el precio existente y lo cambia al introducido
     * @param precio El nuevo precio del producto
     */
    public void setPrecio(double precio) { this.precio = precio; }

    /**
     * Aumenta el precio dado un porcentaje a aumentar
     *
     * @param porcentaje Porcentaje en el que se aumentar� el precio
     */
    public void aumentarPrecio(int porcentaje)
    {
        double porcentajeMultiplicar = porcentaje/100.0 + 1;
        this.precio = this.precio * porcentajeMultiplicar;
    }
}
