/* Pseudocódigo Generalizado
  * 
  * Inicio
  * 	Declaramos las variables que vamos a usar
  * 	Preguntar usuario
  * 	Pedir al usuario la hora
  * 		Si la hora está entre los parámetros, entonces
  * 			Si la hora es menor o igual que 7, entonces
  * 				Si la hora es igual que 7, entonces
  * 					Si los minutos es menor a 30, entonces
  * 						mensajeNoche
  * 					Sino
  * 						mensajeDia
  * 				Sino
  * 					mensajeNoche
  * 			Sino
  * 				Si la hora es menor o igual a 14, entonces
  * 					Si la hora es igual a 14, entonces
  * 						Si los minutos es igual a 0, entonces
  * 							mensajeDia
  * 						Sino
  * 							mensajeTarde
  * 					Sino
  * 						mensajeDia
  *					Sino
  * 					mensajeNoche
  * 		Sino
  * 			ERROR
  * 		
  * 		Fin_SI
  * Fin
  * */

import java.io.*;
import java.util.Scanner;

public class horadiatres_el_bueno_v2
{
	public static void main (String[] Args)
	{
		// Declaramos las dos variables que vamos a usar
		// (Una para la hora, h; y otra para los minutos, m)
		byte h;
		byte m;
		char siono;
		String mensajeDia = "\n¡Buenos días!";
		String mensajeTarde = "\n¡Buenas tardes!";
		String mensajeNoche = "\n¡Buenas noches!";
		Scanner teclado = new Scanner (System.in);
		Scanner tecladodos = new Scanner (System.in);
		
		//Preguntamos si el usuario quiere ejecutar
		do
		{
		System.out.println("¿Desea ejecutar el programa? (Y / N)");
		siono = teclado.nextLine().charAt(0);
		} while (siono != 'Y' && siono != 'N' && siono != 'y' && siono != 'n');
		
		
		// Inicio del programa en sí
		while (siono == 'y' || siono == 'Y')
		{
		// Pedir al usuario la hora
		System.out.println("¿Qué hora es?");
		h = teclado.nextByte();
		System.out.println("¿Qué minutos son?");
		m = teclado.nextByte();
		
		// Cálculos
		if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
		{
			if ((h >= 7 && m >= 30) && (h >= 8 && h < 14))
			System.out.println(mensajeDia);
			else
			{
				if ((h >= 14 && h < 20) || (h <= 20 && m <= 30))
				System.out.println(mensajeTarde);
				else
				System.out.println(mensajeNoche);
			}
		}
		else
			System.out.println("\nK ase illo");
			
			// Preguntamos si quiere ejecutar de nuevo
			do
			{
			System.out.println("¿Desea ejecutar el programa de nuevo? (Y / N)");
			siono = tecladodos.nextLine().charAt(0);
			} while (siono != 'Y' && siono != 'N' && siono != 'y' && siono != 'n');
			
/*			
			do {
			System.out.println("¿Desea ejecutar el programa de nuevo?");
			siono = teclado.nextLine().charAt(0);
			if (siono == 'Y')
				ejecutar = true;
			else
				{
					if (siono == 'N')
					ejecutar = false;
					else
					System.out.println("¡Solo Y o N!");
				}
			} while (siono != 'Y' || siono != 'N');
*/
		}	
	}
}

