import java.util.Scanner;
import java.io.*;

public class metodosordenacionarray
{
	public static void seleccion(int[] array)
	{
		int i, j, minimo, aux;
		for (i = 0; i < array.length; i++)
		{
			minimo = i;
			for (j = i+1; j < array.length; j++)
			{
				if (array[j] < array[minimo])
				minimo = j;
			}
			aux = array[i];
			array[i] = array[minimo];
			array[minimo] = aux;
		}
	}
	
	/*
	public static void insercion(int[] array)
	{
		int i, j, aux;
		for (i = 1; i < array.length; i++)
		{
			for (j = i; array[j-1] > array[j]; j--)
			{
				aux = array[j];
				array[j] = array[j-1];
				array[j-1] = aux;
			}
		}
	}
	*/
	
	public static void burbuja(int[] array)
	{
		int i, j, aux;
		for (i = 0; i < (array.length - 1); i++)
		{
			for (j = (array.length - 1); j > i; j--)
			{
				if (array[j] < array[j-1])
				{
					aux = array[j];
					array[j] = array[j-1];
					array[j-1] = aux;
				}
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int[] array = {7, 8, 3, 6, 1, 9, 2, 0, 1, 1, 2, 5};
		for(int prueba:array)
		{
			System.out.print(prueba+", ");
		}
		
		burbuja(array);
		System.out.println("\n\nORDENADO:");
		for(int prueba:array)
		{
			System.out.print(prueba+", ");
		}
	}
	
	
	//StringBuilder y StringBuffer
	StringBuilder cadena = new StringBuilder();
	cadena.append();
	cadena.reverse();
	cadena.toString();
	cadena.insert(int indice, String cadena);
	
	
	//ENUM
	
	public enum NombreDelEnum
	{
		ALGO1, ALGO2, ALGO3;
	}
	
	NombreDelEnum nombrealgo = NombreDelEnum.ALGO2; //Instancia
	nombrealgo.name() //Devuelve un string con el nombre de la constante
	nombrealgo.ordinal() //Devuelve un entero con la posición del enum
	nombrealgo.compareTo(/*otra constante*/) //Compara el enum con el parámetro según el orden declaradas
	NombreDelEnum.values()
	distrito = TipoDistrito.valueOf(stringDistrito);
	
	//Envolturas
	Envoltura nombre = new Envoltura(parametro);
	
	
}
		
		
		
		
		
		
		
		
		
