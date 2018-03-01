/* Nombre del programa: Buscaminas
 * Análisis:
 *  Comentario:
 *  Juego del buscaminas, donde se usará un array cargado de objetos de la clase Casilla, que tendrá
 *  la información necesaria de cada casilla del grid
 *  
 *  Entradas:
 *  - Número entero de fila
 *  - Número entero de columna
 *  
 *  Salidas:
 *  - Grid del juego, con información actualizada
 *  
 *  Restricciones:
 *  - El número de la fila y de la columna debe ser mayor que 0 y menor que sus límites
 * 
*/

/* Pseudocódigo Generalizado:
 * 	Inicio
 * 		Cargar Array
 * 		Repetir
 * 			MostrarGrid *
 * 			Leer y validar opcion
 * 			Según
 * 				Caso 1: Select a box
 * 				Caso 2: Flag a box
 * 			Fin Según
 * 		Mientras (no todas las bombas están Flagged y no haya explotado ninguna)
 * 
 * 
*/

import java.util.Scanner;
import java.io.*;

public class Buscaminas
{
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);
		Casilla[][] Grid = new Casilla[10][10];
		int fila;
		int columna;
		int opcion;
		
		//Cargar Array
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				Grid[i][j] = new Casilla();
			}
		}
		
		do
		{
			
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
