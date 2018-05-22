package Clases;

/*  Estudio de interfaz (clase):
        Definici�n:
            Clase que almacenar� los datos del jugador
            Nombre, dinero

        Atributos:
            Nombre: String, consultable, modificable
            Dinero: Double, consultable, modificable


        Atributos derivados:
            None

        M�todos:
            TODO M�todos
 */

public class Jugador {

    //Atributos
    private String nombre;
    private double dinero;
    private int i;
    private int j;
    private int nPartida;

    //Constructores
    public Jugador(String n, double d)
    {
        this.nombre = n;
        this.dinero = d;
    }

    //M�todos
    public String getNombre() { return(nombre); }
    public double getDinero() { return(dinero); }

    public void setNombre(String n) { this.nombre = n; }
    public void setDinero(double d) { this.dinero = d; }








}
