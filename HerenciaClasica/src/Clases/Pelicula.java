/*  Estudio de interfaz (clase):
        Definición:
            Clase con las propiedades más comunes que se le pueden atribuir a una película
            Pensada para heredar de Producto y ser usada en un programa de gestión de alquileres de películas

        Atributos:
            - Director: String, consultable, modificable
            - ActorPrincipal: String, consultable, modificable
            - Duracion: Entero, consultable, modificable

        Métodos:
            String getDirector()
            void setDirector(String director)

            String getActorPrincipal()
            void setActorPrincipal(String actorPrincipal)

            int getDuracion()
            void setDuracion(int duracion)


*/

package Clases;

/**
 * Clase Película, con lo más común que se le puede atribuir a una película.
 * Pensada para heredar de Producto, y para ser usada en un programa de gestión de alquileres de películas
 */
public class Pelicula extends Producto {

    /**
     * El nombre del director de la película
     */
    private String director;

    /**
     * El nombre del actor principal de la película
     */
    private String actorPrincipal;

    /**
     * El tiempo que dura la película en minutos
     */
    private int duracion;

    //CONSTRUCTORES

    /**
     * El constructor por defecto
     */
    public Pelicula()
    {
        super();
        this.director = "";
        this.actorPrincipal = "";
        this.duracion = 0;
    }

    /**
     * El constructor con parámetros
     *
     * @param nombre El nombre de la película
     * @param precio El precio para comprar la película
     * @param director El director de la película
     * @param actorPrincipal El actor principal de la película
     * @param duracion La duración en minutos de la película
     */
    public Pelicula(String nombre, double precio, String director, String actorPrincipal, int duracion)
    {
        super(nombre, precio);
        this.director = director;
        this.actorPrincipal = actorPrincipal;
        this.duracion = duracion;
    }

    /**
     * El constructor de copia
     *
     * @param p La película a copiar
     */
    public Pelicula(Pelicula p)
    {
        this.nombre = p.nombre;
        this.precio = p.precio;
        this.director = p.director;
        this.actorPrincipal = p.actorPrincipal;
        this.duracion = p.duracion;
    }

    //GETTERS Y SETTERS

    /**
     * Devuelve el director de la película
     * @return El director
     */
    public String getDirector() { return(this.director); }

    /**
     * Reemplaza el director existente y le coloca un valor nuevo
     * @param director El nuevo director
     */
    public void setDirector(String director) { this.director = director; }

    /**
     * Devuelve el actor principal de la película
     * @return El actor principal
     */
    public String getActorPrincipal() { return(this.actorPrincipal); }

    /**
     * Reemplaza el actor principal existente y le coloca un valor nuevo
     * @param actorPrincipal El actor principal
     */
    public void setActorPrincipal(String actorPrincipal) { this.actorPrincipal = actorPrincipal; }

    /**
     * Devuelve la duración de la película
     * @return La duración
     */
    public int getDuracion() { return(this.duracion); }

    /**
     * Reemplaza la duración existente y le coloca un valor nuevo
     * @param duracion
     */
    public void setDuracion(int duracion) { this.duracion = duracion; }

}
