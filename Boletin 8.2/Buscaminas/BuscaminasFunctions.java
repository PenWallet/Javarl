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
	
	public static void MostrarGrid(Casilla[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("---------------------\n");
			for(int j = 0; j < array[0].length; j++)
			{
				if(array[i][j].getDiscovered() == true)
				{
					 if(j == (array[0].length - 1))
					 {
						if(array[i][j].getBomb() == true)
							System.out.print("|*|\n");
						else if(array[i][j].getFlagged() == true)
							System.out.print("|<|\n");
						else
							System.out.print("|"+array[i][j].getNumberOfBombs()+"|\n");
					 }
					 else
					 {
						if(array[i][j].getBomb() == true)
							System.out.print("|*");
						else if(array[i][j].getFlagged() == true)
							System.out.print("|<");
						else
							System.out.print("|"+array[i][j].getNumberOfBombs());
					 }
				}
				else
				{
					if(j == (array[0].length - 1))
					 {
						System.out.print("| |\n");
					 }
					 else
					 {
						System.out.print("| ");
					 }
				}
				
				if(i == array.length)
					System.out.print("---------------------\n");
				
				/*
				if(array[i][j].getDiscovered() == true)
				{
					if(array[i][j].getBomb() == true)
						System.out.print("*");
					else if(array[i][j].getFlagged() == true)
						System.out.print("<");
				}
				else
				{
					System.out.print(" ");
				}
				*/
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
	
	public static int contarBombas(Casilla[][] array, int i, int j)
	{
		int contadorB = 0;
		
		if(i == 0 && j == 0)
		{
			if(array[i+1][j+1].getBomb() == true)
				contadorB++;
			if(array[i][j+1].getBomb() == true)
				contadorB++;
			if(array[i+1][j].getBomb() == true)
				contadorB++;
		}
		else if(i== 0 && j == (array[0].length - 1))
		{
			if(array[i][j-1].getBomb() == true)
				contadorB++;
			if(array[i+1][j-1].getBomb() == true)
				contadorB++;
			if(array[i+1][j].getBomb() == true)
				contadorB++;
		}
		else if(j == 0 && i == (array.length - 1))
		{
			if(array[i-1][j].getBomb() == true)
				contadorB++;
			if(array[i][j+1].getBomb() == true)
				contadorB++;
			if(array[i-1][j+1].getBomb() == true)
				contadorB++;
		}
		else if(i == (array.length - 1) && j == (array[0].length - 1))
		{
			if(array[i-1][j].getBomb() == true)
				contadorB++;
			if(array[i][j-1].getBomb() == true)
				contadorB++;
			if(array[i-1][j-1].getBomb() == true)
				contadorB++;
		}
		else if(i == 0)
		{
			if(array[i][j-1].getBomb() == true)
				contadorB++;
			if(array[i][j+1].getBomb() == true)
				contadorB++;
			if(array[i+1][j-1].getBomb() == true)
				contadorB++;
			if(array[i+1][j].getBomb() == true)
				contadorB++;
			if(array[i+1][j-1].getBomb() == true)
				contadorB++;
		}
		else if(j == 0)
		{
			if(array[i+1][j].getBomb() == true)
				contadorB++;
			if(array[i-1][j].getBomb() == true)
				contadorB++;
			if(array[i][j+1].getBomb() == true)
				contadorB++;
			if(array[i+1][j+1].getBomb() == true)
				contadorB++;
			if(array[i-1][j+1].getBomb() == true)
				contadorB++;
		}
		else if(i == (array.length - 1))
		{
			if(array[i][j-1].getBomb() == true)
				contadorB++;
			if(array[i][j+1].getBomb() == true)
				contadorB++;
			if(array[i-1][j-1].getBomb() == true)
				contadorB++;
			if(array[i-1][j].getBomb() == true)
				contadorB++;
			if(array[i-1][j+1].getBomb() == true)
				contadorB++;
		}
		else if(j == (array[0].length - 1))
		{
			if(array[i-1][j].getBomb() == true)
				contadorB++;
			if(array[i+1][j].getBomb() == true)
				contadorB++;
			if(array[i-1][j-1].getBomb() == true)
				contadorB++;
			if(array[i][j-1].getBomb() == true)
				contadorB++;
			if(array[i+1][j-1].getBomb() == true)
				contadorB++;
		}
		else
		{
			if(array[i-1][j-1].getBomb() == true)
				contadorB++;
			if(array[i][j-1].getBomb() == true)
				contadorB++;
			if(array[i+1][j-1].getBomb() == true)
				contadorB++;
			
			if(array[i-1][j].getBomb() == true)
				contadorB++;
			if(array[i+1][j].getBomb() == true)
				contadorB++;
			
			if(array[i-1][j+1].getBomb() == true)
				contadorB++;
			if(array[i][j+1].getBomb() == true)
				contadorB++;
			if(array[i+1][j+1].getBomb() == true)
				contadorB++;
		}
		
		return(contadorB);
	}
	
	/* Interfaz:
	 * 
	 * Comentario: Función que se encargará de descubrir la casilla seleccionadas y las adyacented que tenga un nº de bombas == 0
	 * Cabecera: void descubrirCasilla(Casilla[][] array, int columna, int fila)
	 * Precondiciones: El int de columna y fila serán mayores de 0
	 * Entradas: Array 2D de enteros, un int de la columna y otro de la fila para seleccionar la casilla
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Los estados que correspondan se habrán cambiado
	 * 
	
	
	public static void descubrirCasilla(Casilla[][] array, int columna, int fila)
	{
		array[i][j].changeToDiscovered();
		if
	*/
		
		
		
		
}
	
	