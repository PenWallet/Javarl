/* Estudio interfaz (clase):
 * 
 * - Definición: 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * - Indicar las propiedades derivadas (fórmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * - Definir operaciones o funcionalidades del objeto:
 * 
*/

import java.io.*;
import java.util.Random;

public class FuncionesArray
{
	public static void CargarArrayAlea(int[] Array)
	{
		Random r = new Random();
		int i;
		
		for(i = 0; i < Array.length; i++)
		{
			Array[i] = r.nextInt(50);
		}
	}
		
	/*Dado un array cargado aleatoriamente, generar a partir de él otro array 
	que contenga los elementos pares que se encuentran en el primero.*/
	public static int[] ObtenerArrayPar(int[] Array)
	{
		int[] Copia = new int[Array.length];
		int i;
		
		for(i = 0; i < Array.length; i+= 2)
		{
			Copia[i] = Array[i];
		}
		
		return(Copia);
	}
}
		
		
		
		
		
		
		
		
		
		
		
