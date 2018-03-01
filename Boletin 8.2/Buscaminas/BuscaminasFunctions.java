import java.util.Scanner;
import java.io.*;

public class BuscaminasFunctions
{
	/* Interfaz:
	 * 
	 * Comentario: Mostrará el mapa completo del buscaminas
	 * Cabecera: void MostrarGrid(int[] array)
	 * Precondiciones:
	 * Entradas: Array 2D de enteros
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: El grid habrá sido pintado en pantalla
	 * 
	*/
	
	public static void(Casilla[][] array)
	{
		for(int i = 0; i < 10; i++)
		{
			if(i % 2 == 0)
				System.out.println("---------------------");
			else
			{
				for(int j = 0; i< 10; j++)
				{
					if(j % 2 == 0)
						System.out.println("|");
					else
					{
						
					}			
				}
			}
		}
		
	}
	
	
	/* Interfaz:
	 * 
	 * Comentario: Función que contará cuántas bombas hay alrededor de una casilla
	 * Cabecera: void contarBombas(int[][] array)
	 * Precondiciones: El array estará cargado
	 * Entradas: Array 2D de enteros, índices i y j
	 * Salidas: Número de bombas
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Las bombas habrán sido contadas y el número enviado asociado al nombre al programa que lo llama
	 * 
	*/
	
	public static int (Casilla[][] array)
	{
		private int contadorB = 0;
		
		if(i == 0 || i == 9 || j == 0 || j == 9)
		{
			if(i == 0)
			{
				if(j == 0)
					
			}
		}
		else
		{
			if(array[i-1][j-1].getBomb() == true)
				contadorB++;
			if(array[i-1][j].getBomb() == true)
				contadorB++;
			if(array[i-1][j+1].getBomb() == true)
				contadorB++;
			
			if(array[i][j-1].getBomb() == true)
				contadorB++;
			if(array[i][j+1].getBomb() == true)
				contadorB++;
			
			if(array[i+1][j-1].getBomb() == true)
				contadorB++;
			if(array[i+1][j].getBomb() == true)
				contadorB++;
			if(array[i+1][j+1].getBomb() == true)
				contadorB++;
		}
	}
	
	