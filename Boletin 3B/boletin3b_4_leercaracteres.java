/* Análisis:
 * Programa muy simple, apenas requiere de análisis. Se le pedirá al
 * usuario que siga introduciendo caracteres hasta que cuando lo desee,
 * escriba "*". En ese momento, parará de contar y se podrá leer
 * en pantalla cuántos caracteres a escrito
 * 
 * Requisitos:
 * - No hay condiciones ni requisitos
 * 
*/

/* Pseudocódigo Generalizado:
 * 	Inicio
 * 		Declarar variable de bucle y teclado
 * 		Preguntar si desea ejecutar el programa
 * 		Mientras el usuario quiera
 * 			Inicializar variables que vamos a usar
 * 			Pedir al usuario que introduzca valores hasta que desee
 * 				Mientras que lo introducido no sea *
 * 					Leer número introducido
 * 					Si no es *
 * 						Subir en 1 la variable de contador
 * 					Fin_SI
 * 				Fin (Mientras que lo introducido no sea *)
 * 			Mostrar en pantalla cuántos caracteres ha introducido
 * 			Preguntar si desea ejecutar el programa de nuevo
 * 		Fin (Mientras el usuario quiera)
 * 	Fin
 * 
*/


import java.io.*;
import java.util.Scanner;


public class boletin3b_4_leercaracteres
{

	public static void main (String[] args) 
	{
		//Declarar variable de bucle y teclado
		char bucleinicio;
		Scanner teclado = new Scanner (System.in);
		
		//Preguntar si desea ejecutar el programa
		do
		{
		System.out.println("¿Desea ejecutar el programa? (Y / N)");
		bucleinicio = teclado.next().charAt(0);
		if (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y')
			System.out.println("¡Solo Y o N!");
		} while (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y');
		
		
		//Mientras el usuario quiera
		while (bucleinicio == 'y' || bucleinicio == 'Y')
		{
			//Inicializar variables que vamos a usar
			int contador = 0;
			char input;
			
			//Pedir al usuario que introduzca valores hasta que desee
			System.out.println("Por favor, introduce un caracter y pulsa Intro");
			System.out.println("Cuando no quieras escribir más caracteres, escribe '*' y pulsa Intro");
			System.out.println("El programa te dirá cuántos caracteres has escrito hasta entonces");
			
			
			do
			{
				//Leer número introducido
				input = teclado.next().charAt(0);
				
				//Si no es *
				if (input != '*')
					contador++;
				//Fin_SI
				
			} while (input != '*');
			//Fin (Mientras que lo introducido no sea *)
		
			//Mostrar en pantalla cuántos caracteres ha introducido
			System.out.println("Has introducido "+contador+" caracteres en total");
			
			//Preguntar si desea ejecutar el programa de nuevo
			do
			{
			System.out.println("¿Desea ejecutar el programa de nuevo? (Y / N)");
			bucleinicio = teclado.next().charAt(0);
			if (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y')
				System.out.println("¡Solo Y o N!");
			} while (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y');
		}
	}
}
