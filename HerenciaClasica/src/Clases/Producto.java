/*  Estudio de interfaz (clase):
        Definición:
            Clase con las propiedades más comunes que se le pueden atribuir a un producto
            Pensada mayormente para que sea heredada en otras subclases.

        Atributos:
            - Nombre: String, consultable, modificable
            - Precio: Double, consultable, modificable

        Métodos:
            String getNombre()
            void setNombre(String nombre)

            double getPrecio()
            void setPrecio(double precio)

            void aumentarPrecio(int porcentaje)


*/

package Clases;

/**
 * Clase producto, con las propiedades más comunes que se le pueden atribuir a un producto
 */
public class Producto {
    String nombre;
    double precio;

    //Getters y setters
    /**
     * Devuelve el nombre
     *
     * @return El nombre
     */
    public String getNombre() { return(this.nombre); }

    /**
     * Reemplaza el nombre existente y lo cambia al introducido
     * @param nombre La nueva edad de la persona (¿viajero en el tiempo?)
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
     * @param porcentaje Porcentaje en el que se aumentará el precio
     */
    public void aumentarPrecio(int porcentaje)
    {
        double porcentajeMultiplicar = porcentaje/100.0 + 1;
        this.precio = this.precio * porcentajeMultiplicar;
    }
}
