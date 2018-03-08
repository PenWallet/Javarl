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
	
	
	
	
	
}
		
		
		
		
		
		
		
		
		
