/* Análisis:
 * Simularemos el juego de trilero, donde el jugador tendrá que elegir
 * en qué vaso se encuentra la bolita
 * 
 * Entrada:
 * - Caracter Y o N dependiendo de si desea jugar o no
 * - Respuesta en forma de 1, 2 o 3, que corresponderá con cada vaso
 * 
 * Salida:
 * - Mensaje en pantalla ganador o perdedor
*/


/* Pseudocódigo generalizado:
 * 	Inicio
 * 		Declarar variables
 * 		Leer y validar si desea jugar
 * 			Mientras el usuario quiera jugar
 * 				Calcular número al azar
 * 				Pintar en pantalla los vasos
 * 				Leer y validar respuesta
 * 				Mostrar resultado
 * 				Leer y validar si desea jugar de nuevo
 * 			Fin (Mientras el usuario quiera jugar)
 * 	Fin
*/


/* 
 * Estudio de los bucles:
 * 
 * (Mientras el usuario quiera jugar)
 * Tipo VCB: Centinela
 * Inicialización VCB: Lectura antes de la primera iteración
 * Actualización VCB: Lectura al final del bucle
 * Condición de salida: VCB == 'Y' ó VCB == 'N'
 * 
 * 	
 * 
 * 	
 */

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class boletinazar_7_trilero 
{	
	public static void main (String[] args) 
	{
		//Declarar variables
		char jugaryon;
		int trilero;
		int jugador;
		Scanner teclado = new Scanner (System.in);
		Random vaso = new Random();
		
		//Leer y validar si desea jugar
		do
		{
			System.out.println("¿Quieres jugar al trilero? (Y / N)");
			jugaryon = Character.toUpperCase(teclado.next().charAt(0));
			if (jugaryon != 'Y' && jugaryon != 'N')
				System.out.println("¡Solo Y o N!");
		} while (jugaryon != 'Y' && jugaryon != 'N');
		
		//Mientras el usuario quiera jugar
		while (jugaryon == 'Y')
		{
			//Calcular número al azar
			trilero = vaso.nextInt(3)+1;
			
			//Pintar en pantalla los vasos
			System.out.println("---------------------------------");
			System.out.println("\n ***       ***       ***");
			System.out.println("* 1 *     * 2 *	    * 3 *");
			System.out.println(" ***       ***       ***");
			System.out.println("\n¿En qué vaso está?");
			
			//Leer y validar respuesta
			do
			{
				jugador = teclado.nextInt();
				if (jugador < 1 || jugador > 3)
					System.out.println("¡Solo 1, 2 o 3!");
			} while (jugador < 1 || jugador > 3);
				
			
			//Mostrar resultado
			if (trilero == 1)
			{
				System.out.println("\n ***       ***       *** ");
				System.out.println("*   *     *   *     *   *");
				System.out.println("*   *     *   *     *   *");
				System.out.println("*   *     *   *     *   *");
				System.out.println(" (*)                     ");
			}
			else
			{
				if (trilero == 2)
				{
					System.out.println("\n ***       ***       *** ");
					System.out.println("*   *     *   *     *   *");
					System.out.println("*   *     *   *     *   *");
					System.out.println("*   *     *   *     *   *");
					System.out.println("           (*)           ");
				}
				else
				{
					System.out.println("\n ***       ***       *** ");
					System.out.println("*   *     *   *     *   *");
					System.out.println("*   *     *   *     *   *");
					System.out.println("*   *     *   *     *   *");
					System.out.println("                     (*) ");
				}
			}
			
			if (jugador == trilero)
				System.out.println("\n¡Has acertado!");
			else
				System.out.println("\n¡Has fallado!");
			System.out.println("\n---------------------------------");
				
			//Leer y validar si desea jugar de nuevo
			do
			{
				System.out.println("¿Quieres jugar de nuevo? (Y / N)");
				jugaryon = Character.toUpperCase(teclado.next().charAt(0));
				if (jugaryon != 'Y' && jugaryon != 'N')
					System.out.println("¡Solo Y o N!");
			} while (jugaryon != 'Y' && jugaryon != 'N');
		}
		//Fin (Mientras el usuario quiera jugar)
	}
}			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
