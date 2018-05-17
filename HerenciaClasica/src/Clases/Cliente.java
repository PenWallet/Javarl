package Clases;

/*  Estudio de interfaz (clase):
        Definición:
            Clase cliente, con las propiedades más comunes que se le pueden atribuir a un cliente.
            Además, extiende de Persona, por lo que contiene las propiedades más comunes de una persona por igual
        Atributos:
            - Dinero: Double, consultable, modificable
            - ID: Entero, consultable
        Atributos compartidos:
            - IDCont: Entero
        Métodos:
            double getDinero()
            void setDinero(double dinero)

            int getID()

            void reducirDinero(double cantidad)


*/

/**
 * Clase Cliente, para usar en un programa de gestión de alquiler de películas
 */
public class Cliente extends Persona {

    /**
     * El dinero que el cliente dispone
     */
    private double dinero;

    /**
     * El ID del cliente
     */
    private int ID;

    /**
     * Contador de IDs para poder asignarle una ID única a cada uno
     */
    private static int IDCont = 0;

    //CONSTRCUTORES

    /**
     * Constructor por defecto de Cliente
     */
    public Cliente()
    {
        super();
        this.dinero = 0;
        this.ID = IDCont++;
    }

    /**
     * Constructor con parámetros de Cliente
     */
    public Cliente(String nombre, int edad, String DNI, char genero, double dinero)
    {
        super(nombre, edad, DNI, genero);
        this.dinero = dinero;
        this.ID = IDCont++;
    }

    /**
     * Constructor de copia de Cliente
     */
    public Cliente(Cliente c)
    {
        this.nombre = c.nombre;
        this.edad = c.edad;
        this.DNI = c.DNI;
        this.genero = c.genero;
        this.dinero = c.dinero;
        this.ID = c.ID;
    }

    //GETTERS Y SETTERS

    /**
     * Devuelve el dinero
     *
     * @return El dinero
     */
    public double getDinero() { return(this.dinero); }

    /**
     * Reemplaza el dinero existente y le coloca un valor nuevo
     *
     * @param dinero La nueva cantidad de dinero disponible
     */
    public void setDinero(double dinero) { this.dinero = dinero; }

    /**
     * Devuelve la ID
     *
     * @return La ID
     */
    public int getID() { return(this.ID); }

    //FUNCIONES AÑADIDAS

    /**
     * Función que reducirá el dinero según una cantidad dada
     *
     * @param cantidad La cantidad de dinero a deducir
     */
    public void reducirDinero(double cantidad) { this.dinero -= cantidad; }

    /**
     * toString
     */
    @Override
    public String toString()
    {
        return(super.toString()+","+ID+","+dinero);
    }

}
