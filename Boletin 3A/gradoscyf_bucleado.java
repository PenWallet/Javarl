/* An�lisis:
 * En este programa dejaremos al usuario elegir si desea convertir
 * de Celsius a Fahrenheit o de Fahrenheit a Celsius y aplicaremos la
 * correspondiente ecuaci�n a cada caso 
 * 
 * Requisitos:
 *  - Los grados Celsius no pueden ser menores -273.15
 *  - Los grados Fahrenheit no pueden ser menores a -459.67
 *  - El usuario solo puede introducir F, f, C o c
 */
 
 /* Pseudoc�digo generalizado
  * Inicio
  * 	Declarar variable de bucle ++
  * 	Preguntar al usuario si desea iniciar el programa ++
  * 	Mientras que el usuario quiera ++
  * 	Inicializamos las variables
  * 	Mientras que la respuesta no sea correcta
  * 		Preguntar al usuario qu� quiere hacer
  * 	Fin (Mientras que la respuesta no sea correcta)
  * 	Mientras que los grados no est�n en los l�mites
  * 		Preguntar por los grados
  * 		Evaluar entrada de datos
  * 		Si los datos introducidos no son correctos
  * 			Si nos referimos a los datos incorrectos de 'C'
  * 				ERROR C
  * 			Si no
  * 				ERROR F
  * 		Si no
  * 			Entrada correcta de datos
  * 		Fin SI
  * 	Fin (Mientras que los grados no est�n en los l�mites)
  * 	Si se quiere pasar de C a F
  * 		C�lculo del resultado
  * 		Impresi�n en pantalla
  * 	Si no, se quiere pasar de F a C
  * 		C�lculo del resultado
  * 		Impresi�n en pantalla
  * 	Fin SI
  * 	Preguntar al usuario si quiere ejecutar de nuevo ++
  *		Fin (Mientras que el usuario quiera) ++
  * Fin
 */

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class gradoscyf_bucleado
{
	public static void main (String[] Args)
	{
		// Declarar variable del bucle
		char bucle;
		Scanner teclado = new Scanner (System.in);
		
		// Preguntar al usuario si quiere ejecutar el programa
		do
		{
			System.out.println("�Quieres ejecutar el programa? (Y / N)");
			bucle = teclado.next().charAt(0);
			if (bucle != 'y' && bucle != 'Y' && bucle != 'n' && bucle != 'N')
				System.out.println("�Solo Y o N!");
		} while (bucle != 'y' && bucle != 'Y' && bucle != 'n' && bucle != 'N');
		
		// Mientras que el usuario quiera
		while (bucle == 'y' || bucle == 'Y')
		{
			
			// Inicializamos las variables
			double grados = 0;
			char conversion;
			double resultado = 0;
			boolean correcto = false;

			
			// Mientras que la respuesta no sea correcta
			do
			{
				// Preguntar al usuario qu� desea hacer
				System.out.println("�A qu� deseas convertir?");
				System.out.println("Si deseas pasar Celsius a Fahrenheit, escribe \"F\"");
				System.out.println("Si deseas pasar Fahrenheit a Celsius, escribe \"C\"");
				conversion = teclado.next().charAt(0);
			} while (conversion != 'F' && conversion != 'f' && conversion != 'C' && conversion != 'c');
			// Fin (Mientras que la respuesta no sea correcta)
			
			
			// Mientras que los grados no est�n en los l�mites
			while (correcto == false)
			{
			// Preguntar por los grados
			System.out.println("\n�Cu�ntos grados?");
			grados = teclado.nextDouble();
			// Evaluar entrada de datos
			// Si los datos introducidos son incorrectos
			if (((conversion == 'c' ||  conversion  == 'C') && grados < -459.67) || (conversion == 'f' ||  conversion == 'F') && grados < -273.15)
			{
				// Si nos referimos a los datos incorrectos de 'C'
				if (conversion == 'c' || conversion == 'C')
				{
					// ERROR C
					correcto = false;
					System.out.println("�Los grados Fahrenheit no puede ser menor a -459.67!");
				}
				// Si no
				else
				{
					// ERROR F
					correcto = false;
					System.out.println("�Los grados Celsius no puede ser menor a -273.15!");
				}
			}
			// Si no
			else
				// Entrada correcta de grados
				correcto = true;
			// Fin Si
			
			} // Fin (Mientras que los grados no est�n en los l�mites)
			
			// Si se quiere pasar de C a F
			if (conversion == 'f' || conversion == 'F')
			{
				// C�lculo del resultado
				resultado = grados * 1.8 + 32;
				// Impresi�n en pantalla
				System.out.println(grados+"�C"+" son "+resultado+"�F");
			}
			// Si no, se quiere pasar de F a C
			else
			{
				// C�lculo del resultado
				resultado = (grados - 32) / 1.8;
				// Impresi�n en pantalla
				System.out.println(grados+"�F"+" son "+resultado+"�C");
			}	
			// Fin Si
			
			// Preguntar si desea ejecutar de nuevo
			do
			{
				System.out.println("�Quieres ejecutar el programa de nuevo? (Y / N)");
				bucle = teclado.next().charAt(0);
				if (bucle != 'y' && bucle != 'Y' && bucle != 'n' && bucle != 'N')
					System.out.println("�Solo Y o N!");
			} while (bucle != 'y' && bucle != 'Y' && bucle != 'n' && bucle != 'N');
		}
	}
}
