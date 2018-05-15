package Clases;

/*  Estudio de interfaz (clase):
        Definici�n:
            Clase cliente, con las propiedades m�s comunes que se le pueden atribuir a un cliente.
            Adem�s, extiende de Persona, por lo que contiene las propiedades m�s comunes de una persona por igual
        Atributos:
            - Dinero: Double, consultable, modificable
            - ID: Entero, consultable
        Atributos compartidos:
            - IDCont: Entero
        M�todos:
            double getDinero()
            void setDinero(double dinero)

            int getID()�


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
