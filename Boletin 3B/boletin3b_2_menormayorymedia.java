/* Análisis:
 * El usuario podrá introducir tantos números como quiera, e iremos
 * almacenando la informacion sobre, de los números que ha introducido,
 * cuál es el menor, cuál el mayor, y cuál es la media de todos ellos.
 * 
 * Requisitos:
 * - Los números introducidos deben ser mayores o iguales que a cero
 * - Los números no están limitados a ser números enteros
 * 
*/

/* Pseudocódigo Generalizado:
* 	Inicio
 *		Declarar variable de bucle (1)
 * 		Preguntar si quiere ejecutar el programa
 * 		Mientras el usuario quiera (1)
 * 		Inicializar variables
 * 			Mientras el usuario quiera (2)
 * 				Pedir que introduzca un número y Mientras que el número introducido no sea menor a 0
 * 				Leer número introducido
 * 				Fin (Mientras que el número introducido no sea menor a 0)
 *				Agregar uno al contador
 *				Si el contador es igual a 1
 *					Guardar número mayor
 *					Guardar número menor
 *				Fin_SI
 * 				Si el número introducido es mayor que los ya introducidos
 * 					Guardar número mayor
 * 				Fin_SI
 * 				Si el número introducido es menor que los ya introducidos
 * 					Guardar número menor
 * 				Fin_SI
 * 				Sumar número a la suma total de números introducidos
 * 				Preguntar si quiere introducir otro número
 * 			Fin (Mientras el usuario quiera (2))
 * 		Calcular media total
 * 		Mostrar número mayor en pantalla
 * 		Mostrar número menor en pantalla
 * 		Mostrar media total en pantalla
 * 		Preguntar si quiere iniciar el programa de nuevo
 * 		Fin (Mientras el usuario quiera (1))
 * 	Fin		
 * 
 * 
 * 
*/


import java.io.*;
import java.util.Scanner;


public class boletin3b_2_menormayorymedia 
{

	public static void main (String[] args) 
	{		
		
		// Declarar variable de bucle (1)
		char bucleinicio;
		Scanner teclado = new Scanner (System.in);
		
		// Preguntar si quiere ejecutar el programa
		do
		{
		System.out.println("¿Desea ejecutar el programa? (Y / N)");
		bucleinicio = teclado.next().charAt(0);
		if (bucleinicio != 'Y' && bucleinicio != 'y' && bucleinicio != 'n' && bucleinicio != 'N')
			System.out.println("¡Solo Y o N!");
		} while (bucleinicio != 'Y' && bucleinicio != 'y' && bucleinicio != 'n' && bucleinicio != 'N');	
		
		// Mientras el usuario quiera (1)
		while (bucleinicio == 'y' || bucleinicio == 'Y')
		{
			// Inicializar variables
			double numero;
			double menor = 0;
			double mayor = 0;
			double media = 0;
			long contador = 0;
			char otronumero;
			
			// Mientras el usuario quiera (2)
			do
			{
				// Pedir que introduzca un número y Mientras que el número introducido no sea menor a 0
				do
				{
					// Leer número introducido
					System.out.println("Introduce un número por favor");
					numero = teclado.nextDouble();
					if (numero < 0)
						System.out.println("¡Solo números mayores o iguales a 0!");
				} while (numero < 0);
				// Fin (Mientras que el número introducido no sea menor a 0)
				// Agregar uno al contador
				contador++;
				
				
				// Si el contador es igual a 1
				if (contador == 1)
				{
					// Guardar número mayor
					mayor = numero;
					// Guardar número menor
					menor = numero;
				}
				//Fin_SI
				
				
				// Si el número introducido es mayor que los ya introducidos
				if (numero > mayor)
					// Guardar número mayor
					mayor = numero;
				// Fin_SI
				
				// Si el número introducido es menor que los ya introducidos
				if (numero < menor)
					// Guardar número menor
					menor = numero;
				// Fin_SI
				
				//Sumar número a la suma total de números introducidos
				media = media + numero;
				
				//Preguntar si quiere introducir otro número
				do
				{
				System.out.println("¿Desea introducir otro número? (Y / N)");
				otronumero = teclado.next().charAt(0);
				if (otronumero != 'Y' && otronumero != 'y' && otronumero != 'n' && otronumero != 'N')
					System.out.println("¡Solo Y o N!");
				} while (otronumero != 'Y' && otronumero != 'y' && otronumero != 'n' && otronumero != 'N');
			
			} while (otronumero == 'y' || otronumero == 'Y');
			// Fin (Mientras el usuario quiera (2))
			
			// Calcular media total
			media = media / contador;
			
			// Mostrar número mayor en pantalla
			System.out.println("El número mayor de los introducidos es: "+mayor);
			
			// Mostrar número menor en pantalla
			System.out.println("El número menor de los introducidos es: "+menor);
			
			// Mostrar media total en pantalla
			System.out.println("La media de los números introducidos es: "+media);
			
			
			// Preguntar si quiere iniciar el programa de nuevo
			do
			{
			System.out.println("\n\n¿Desea ejecutar el programa de nuevo? (Y / N)");
			bucleinicio = teclado.next().charAt(0);
			if (bucleinicio != 'Y' && bucleinicio != 'y' && bucleinicio != 'n' && bucleinicio != 'N')
				System.out.println("¡Solo Y o N!");
			} while (bucleinicio != 'Y' && bucleinicio != 'y' && bucleinicio != 'n' && bucleinicio != 'N');	
			// Fin (Mientras el usuario quiera (1))
		}
	}
}
					
					
					
					
					
