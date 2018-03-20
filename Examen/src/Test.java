/* Estudio interfaz (clase):
 * 
 * - Definición:
 *      Con esta clase podremos crear objetos del tipo "Test", que se usarán para poder manejar la información
 *      necesaria en el programa principal, "examen_20180315".
 *
 *      Esta contendrá el nombre del aspirante, el número de aspirante, un array de 10 booleanos representando
 *      si ha acertado o no cada una de las preguntas, un número compartido, que irá aumentando, y que servirá de guía
 *      para asignar los números
 *
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 *      · Nombre: String, modificable, consultable
 *      · Numero: Entero, consultable
 *      · Calificaciones: Array de enteros, consultable, modificable //Modificable para, en caso de revisión, poder corregir
 *
 * - Indicar las propiedades derivadas (fórmula si necesario):
 *      · nCalificacionesAcertadas123: Entero, consultable
 *      · nCalificacionesAcertadas4567: Entero, consultable
 *      · nCalificacionesAcertadas8910: Entero, consultable
 *
 *      · puntuacion: Entero, consultable
 *
 * - Indicar si cada propiedad es compartida por los objetos:
 *      NumeroSecuencial: Entero
 *
 * - Definir operaciones o funcionalidades del objeto:
 *         String getNombre()
 *         void setNombre(String nombre)
 *
 *         int getNumero()
 *
 *         int[] getCalificaciones()
 *         void setCalificaciones(int[] array]
 *
 *         int getNCalificacionesAcertadas123()
 *         int getNCalificacionesAcertadas4567()
 *         int getNCalificacionesAcertadas8910()
 *
 *         int getPuntuacion()
 *
 *         boolean estaAprobado()
*/

public class Test
{
	private String nombre;
	private final int numero;
	private boolean[] calificaciones;

	private static int numeroSecuencial = 1000;

    //CONSTRUCTORES
	public Test()
    {
        nombre = " ";
        numero = numeroSecuencial++;
        calificaciones = new boolean[10];
    }

    public Test(String nombre, boolean[] array)
    {
	    this.nombre = nombre;
	    numero = numeroSecuencial++;
	    calificaciones = array;
    }

    public Test(Test t)
    {
        this.nombre = t.nombre;
        this.numero = t.numero;
        this.calificaciones = t.calificaciones;
    }

    //GETTERS Y SETTERS
    public String getNombre() { return(nombre); }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNumero() { return(numero); }

    public boolean[] getCalificaciones() { return(calificaciones); }
    public void setCalificaciones(boolean[] array) { this.calificaciones = array; }

    public int getNCalificacionesAcertadas123()
    {
        int acertadas = 0;
        for(int i = 0; i < 3; i++)
        {
            if(calificaciones[i])
                acertadas++;
        }
        return(acertadas);
    }

    public int getNCalificacionesAcertadas4567()
    {
        int acertadas = 0;
        for(int i = 3; i < 7; i++)
        {
            if(calificaciones[i])
                acertadas++;
        }
        return(acertadas);
    }

    public int getNCalificacionesAcertadas8910()
    {
        int acertadas = 0;
        for(int i = 7; i < 10; i++)
        {
            if(calificaciones[i])
                acertadas++;
        }
        return(acertadas);
    }

    public int getPuntuacion()
    {
        int puntuacion = 0;
        for(int i = 0; i < 10; i++)
        {
            if(calificaciones[i])
                puntuacion++;
        }

        return(puntuacion);
    }

    /* Interfaz:
	 	Comentario: Calculará si una persona está aprobada dados los requisitos necesarios para ello:
	 	            Tener las 3 primeras correctamente
	 	            Tener al menos 2 de las 4 siguientes correctamente
	 	            Tener al menos 1 de las 3 últimas correctamente

	  	Cabecera: boolean estaAprobado()
	  	Precondiciones: El array debe estar cargado
	  	Entradas: Ninguna
	  	Salidas: Boolean indicando si está aprobado o no
	  	Entradas/Salidas: Ninguna
	  	Postcondiciones: El boolean habrá sido devuelto asociado al nombre al programa que lo llame
	*/
    public boolean estaAprobado()
    {
        boolean esAprobado;
        if(getNCalificacionesAcertadas123() == 3 && getNCalificacionesAcertadas4567() >= 2 && getNCalificacionesAcertadas8910() >= 1)
            esAprobado = true;
        else
            esAprobado = false;

        return(esAprobado);
    }



    @Override
    public String toString()
    {
        String s = ("Nombre: "+nombre+", Numero: "+numero+", R.Aprobadas123: "+getNCalificacionesAcertadas123()+", R.Aprobadas4567: "+getNCalificacionesAcertadas4567()+", R.Aprobadas8910: "+getNCalificacionesAcertadas8910()+", Puntuacion: "+getPuntuacion()+", estaAprobado: "+estaAprobado());
        return(s);
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean ret = false;

        if (this == obj)
            ret = true;
        else if (obj != null && obj instanceof Test)
        {
            Test other = (Test)obj;

            if (this.numero == other.numero &&
                this.nombre.equals(other.nombre) &&
                this.calificaciones == other.calificaciones)
            {
                ret = true;
            }
        }

        return (ret);
    }

    @Override
    public int hashCode() //El hashcode será el número de participante, ya que es único
    {
        int hash = numero;
        return(hash);
    }


    //Devuelve -1 si el numero es menor, 0 si es igual, 1 si es mayor
    public int compararPorNumero(Test other)
    {
        int ret = -1;

        if(this == other || this.numero == other.numero)
            ret = 0;
        else if(this.numero > other.numero)
            ret = 1;

        return ret;
    }

    //Devuelve -1 si la puntuacion es menor, 0 si es igual, 1 si es mayor
    public int compararPorPuntuacion(Test other)
    {
        int ret = -1;

        if(this == other || this.getPuntuacion() == other.getPuntuacion())
            ret = 0;
        else if(this.getPuntuacion() > other.getPuntuacion())
            ret = 1;

        return ret;
    }
}
		
		
		
		
		
		
		
		
		
		
