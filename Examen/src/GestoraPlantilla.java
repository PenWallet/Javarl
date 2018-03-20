import java.io.*;
import java.util.*;

public class GestoraPlantilla
{
	public static void MostrarMenu()
	{
		System.out.println("--------------------------------------------");
		System.out.println("|                   Men�                   |");
		System.out.println("|------------------------------------------|");
		System.out.println("|      1. Listado ordenado por n�mero      |");
		System.out.println("|   2. Listado ordenado por puntuaciones   |");
		System.out.println("|       3. Listado de datos generales      |");
        System.out.println("|------------------------------------------|");
        System.out.println("|                 0. Salir                 |");
        System.out.println("--------------------------------------------");
	}

	/* Interfaz:
	 	Comentario: Simple funci�n que se encargar� de generar un n�mero al azar entre 10 y 50, inclusive

	  	Cabecera: int generarNumeroCandidatos()
	  	Precondiciones: Ninguna
	  	Entradas: Ninguna
	  	Salidas: N�mero entero, representando la cantidad de candidatos que hicieron el test
	  	Entradas/Salidas: Ninguna
	  	Postcondiciones: El n�mero habr� sido devuelto asociado al nombre al programa que lo llam�
	*/
	public static int generarNumeroCandidatos()
	{
		int numero;
		Random random = new Random();
		numero = random.nextInt(41)+10;
		return(numero);
	}

	/* Interfaz:
	 	Comentario: Esta funci�n tendr� la tarea de generar un array de 10 booleans al azar, que servir� como
	 				el array de las puntuaciones de cada candidato.
	 				Si es la pregunta 1, 2 o 3, habr� 80% de aprobarla y 20% no
	 				Si es la pregunta 4, 5, 6 o 7, 60% s�, 40% no
	 				Si es la pregutna 8, 9 o 10, 40% s�, 60% no

	  	Cabecera: boolean[] generarArrayPuntuaciones()
	  	Precondiciones: Ninguna
	  	Entradas: Ninguna
	  	Salidas: Array de booleans
	  	Entradas/Salidas: Ninguna
	  	Postcondiciones: El array de 10 booleans habr� sido devuelto asociado al nombre al program que lo llam�
	*/
	public static boolean[] generarArrayPuntuaciones()
	{
		Random random = new Random();
		int numeroRandom;
		boolean[] array = new boolean[10];
		int numero;

		for(int i = 0; i < 10; i++)
		{
			if(i < 3)
			{
				numero = random.nextInt(10);
				if (numero < 8)
					array[i] = true;
				else
					array[i] = false;
			}
			else if(i < 7)
			{
				numero = random.nextInt(10);
				if (numero < 6)
					array[i] = true;
				else
					array[i] = false;
			}
			else
			{
				numero = random.nextInt(10);
				if (numero < 4)
					array[i] = true;
				else
					array[i] = false;
			}
		}

		return(array);
	}


	/* Interfaz:
	 	Comentario: Esta funcionalidad llevar� a cabo la tarea de pedir los nombres de todos nuestros candidatos

	  	Cabecera: Test[] generarCandidatos(int numeroCandidatos)
	  	Precondiciones: El n�mero de candidatos estar� entre 10 y 50 // No tendr�a sentido que fuera un n�mero muy bajo,
	  					todo el mundo quiere un trabajo hoy en d�a
	  	Entradas: Entero, representado el n�mero de candidatos
	  	Salidas: Array de Tests
	  	Entradas/Salidas: Ninguna
	  	Postcondiciones: El array de tipo Test ser� devuelto asociado al nombre al programa que lo llame
	*/

	public static Test[] generarCandidatos(int numeroCandidatos)
	{
		Test[] array = new Test[numeroCandidatos];
		String nombre;
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < numeroCandidatos; i++)
		{
			System.out.println("Introduce el nombre del candidato, "+(i+1)+"/"+numeroCandidatos);
			nombre = teclado.nextLine();
			array[i] = new Test(nombre, generarArrayPuntuaciones());
		}

		return(array);
	}

    public static void ordenarNumero(Test[] array)
    {
        int i, j;
        Test aux;
        for (i = 0; i < (array.length - 1); i++)
        {
            for (j = (array.length - 1); j > i; j--)
            {
                if (array[j].getNumero() < array[j-1].getNumero())
                {
                    aux = array[j];
                    array[j] = array[j-1];
                    array[j-1] = aux;
                }
            }
        }
    }

    public static void ordenarPuntuacion(Test[] array)
    {
        int i, j;
        Test aux;
        for (i = 0; i < (array.length - 1); i++)
        {
            for (j = (array.length - 1); j > i; j--)
            {
                if (array[j].getPuntuacion() < array[j-1].getPuntuacion())
                {
                    aux = array[j];
                    array[j] = array[j-1];
                    array[j-1] = aux;
                }
            }
        }
    }

}
		
		
		
		
		
		
		
		
		
