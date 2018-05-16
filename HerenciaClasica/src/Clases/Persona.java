/*  Estudio de interfaz (clase):
        Definición:
            Clase Persona, con las propiedades más comunes que se le pueden atribuir a una persona.
            Pensada mayormente para que sea heredada en otras subclases.

        Atributos:
            - Nombre: String, consultable, modificable
            - DNI: String, consultable
            - Edad: Entero, consultable, modificable
            - Género: Caracter, consultable, modificable

        Atributos derivados:
        Métodos:
            String getNombre()
            void setNombre (String nombre)

            String getDNI()

            int getEdad()
            void setEdad(int edad)

            char getGenero()
            void setGenero(char genero)

            void cumplirAnos()


*/

package Clases;

/**
 * Clase persona, con las propiedades más comunes que se le pueden atribuir a una persona real
 */
public class Persona {

    /**
     * Nombre - String
     */
    protected String nombre;

    /**
     * Edad - int
     */
    protected int edad;

    /**
     * DNI - String
     */
    protected String DNI;

    /**
     * Genero - char
     * Solo puede ser H (hombre) o M (mujer)
     */
    protected char genero;

    //Constructores

    /**
     * Constructor por defecto
     */
    public Persona()
    {
        this.nombre = "";
        this.edad = 0;
        this.DNI = "00000000A";
        this.genero = 'H';
    }

    /**
     * Constructor con parámetros de entrada
     *
     * @param nombre El nombre de la nueva persona
     * @param edad La edad de la nueva persona
     * @param DNI El DNI de la nueva persona
     * @param genero El genero de la nueva persona
     */
    public Persona(String nombre, int edad, String DNI, char genero)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.genero = genero;
    }

    /**
     * Constructor de copia de otro objeto de la clase Persona
     *
     * @param p Otra instancia de la clase Persona
     */
    public Persona(Persona p)
    {
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.DNI = p.DNI;
        this.genero = p.genero;
    }


    //Getters y setters

    /**
     * Devuelve el nombre
     *
     * @return El nombre
     */
    public String getNombre() { return(this.nombre); }

    /**
     * Reemplaza el nombre existente y lo cambia al introducido
     * @param nombre El nuevo nombre de la persona
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Devuelve el DNI
     *
     * @return El DNI
     */
    public String getDNI() { return(this.DNI); }

    /**
     * Devuelve la edad
     *
     * @return La edad
     */
    public int getEdad() { return(this.edad); }

    /**
     * Reemplaza la edad existente y la cambia al introducido
     * @param edad La nueva edad de la persona (¿viajero en el tiempo?)
     */
    public void setEdad(int edad) { this.edad = edad; }

    /**
     * Devuelve el genero
     *
     * @return El genero
     */
    public char getGenero() { return(this.genero); }

    /**
     * Reemplaza el genero existente y lo cambia al introducido
     * @param genero El género al que quieres cambiar a esta persona
     */
    public void setGenero(char genero) { this.genero = genero; }


    //Métodos añadidos

    /**
     * Incrementar la edad en 1, a modo de representar el cumplimiento de años de la persona
     */
    public void cumplirAnos() { this.edad++; }


}
