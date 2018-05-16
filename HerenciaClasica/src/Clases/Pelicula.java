/*  Estudio de interfaz (clase):
        Definici�n:
            Clase con las propiedades m�s comunes que se le pueden atribuir a una pel�cula
            Pensada para heredar de Producto y ser usada en un programa de gesti�n de alquileres de pel�culas

        Atributos:
            - Director: String, consultable, modificable
            - ActorPrincipal: String, consultable, modificable
            - Duracion: Entero, consultable, modificable

        M�todos:
            String getDirector()
            void setDirector(String director)

            String getActorPrincipal()
            void setActorPrincipal(String actorPrincipal)

            int getDuracion()
            void setDuracion(int duracion)


*/

package Clases;

/**
 * Clase Pel�cula, con lo m�s com�n que se le puede atribuir a una pel�cula.
 * Pensada para heredar de Producto, y para ser usada en un programa de gesti�n de alquileres de pel�culas
 */
public class Pelicula extends Producto {

    /**
     * El nombre del director de la pel�cula
     */
    private String director;

    /**
     * El nombre del actor principal de la pel�cula
     */
    private String actorPrincipal;

    /**
     * El tiempo que dura la pel�cula en minutos
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
     * El constructor con par�metros
     *
     * @param nombre El nombre de la pel�cula
     * @param precio El precio para comprar la pel�cula
     * @param director El director de la pel�cula
     * @param actorPrincipal El actor principal de la pel�cula
     * @param duracion La duraci�n en minutos de la pel�cula
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
     * @param p La pel�cula a copiar
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
     * Devuelve el director de la pel�cula
     * @return El director
     */
    public String getDirector() { return(this.director); }

    /**
     * Reemplaza el director existente y le coloca un valor nuevo
     * @param director El nuevo director
     */
    public void setDirector(String director) { this.director = director; }

    /**
     * Devuelve el actor principal de la pel�cula
     * @return El actor principal
     */
    public String getActorPrincipal() { return(this.actorPrincipal); }

    /**
     * Reemplaza el actor principal existente y le coloca un valor nuevo
     * @param actorPrincipal El actor principal
     */
    public void setActorPrincipal(String actorPrincipal) { this.actorPrincipal = actorPrincipal; }

    /**
     * Devuelve la duraci�n de la pel�cula
     * @return La duraci�n
     */
    public int getDuracion() { return(this.duracion); }

    /**
     * Reemplaza la duraci�n existente y le coloca un valor nuevo
     * @param duracion
     */
    public void setDuracion(int duracion) { this.duracion = duracion; }

}
