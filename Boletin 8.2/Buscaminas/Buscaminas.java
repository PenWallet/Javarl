/* Nombre del programa: Buscaminas
 * An�lisis:
 *  Comentario:
 *  Juego del buscaminas, donde se usar� un array cargado de objetos de la clase Casilla, que tendr�
 *  la informaci�n necesaria de cada casilla del grid
 *  
 *  Entradas:
 *  - N�mero entero de fila
 *  - N�mero entero de columna
 *  
 *  Salidas:
 *  - Grid del juego, con informaci�n actualizada
 *  
 *  Restricciones:
 *  - El n�mero de la fila y de la columna debe ser mayor que 0 y menor que sus l�mites
 * 
*/

/* Pseudoc�digo Generalizado:
 * 	Inicio
 * 		Cargar Array
 * 		Repetir
 * 			MostrarGrid *
 * 			Leer y validar opcion
 * 			Seg�n
 * 				Caso 1: Select a box
 * 				Caso 2: Flag a box
 * 			Fin Seg�n
 * 		Mientras (no todas las bombas est�n Flagged y no haya explotado ninguna)
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
		
		
		
		
		
		
		
		
		
		
		
