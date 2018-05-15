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

            int getID()ç


*/
public class Cliente extends Persona {

    private double dinero;
    private final int ID;
    private static int IDCont;


    public Cliente()
    {
        super();
        this.dinero = 0;
        this.ID =

    }
}
