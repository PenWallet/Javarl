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
	//1.a)
	public static void CargarArrayAlea(int[] Array)
	{
		Random r = new Random();
		int i;
		int j;
		
		for(i = 0; i < Array.length; i++)
		{
			Array[i] = r.nextInt(50);
		}
	}
	
	//1.b)
	public static int[] CargarArrayAleaDos()
	{
		Random r = new Random();
		int i;
		int k;
		int[] Array = new int[20];
		boolean isEqual = false;
		boolean outOfLoop = false;
		
		for(i = 0; i < 20; i++)
		{
			do
			{
				k = 0;
				outOfLoop = false;
				Array[i] = r.nextInt(20);
				while(k < i && !isEqual);
				{
					if(Array[i] == Array[k])
					{
						isEqual = true;
						outOfLoop = true;
					}
					else
						isEqual = false;
				}
			}while(isEqual);
		}
				
			/*for(k = 0; k < i; k++) //El bucle se sigue ejecutando aunque haya encontrado isEqual o no
			{
				if(Array[i] == Array[k])
				{
					isEqual = true;
					outOfLoop = true;
				}
				else
				{
					isEqual = false;
					outOfLoop = false;
				}
					
				}
			}while(isEqual);
		}*/
		
		return(Array);
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
		
		
		
		
		
		
		
		
		
		
		
