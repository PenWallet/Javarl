/* An�lisis:
 * El usuario podr� introducir tantos n�meros como quiera, e iremos
 * almacenando la informacion sobre, de los n�meros que ha introducido,
 * cu�l es el menor, cu�l el mayor, y cu�l es la media de todos ellos.
 * 
 * Requisitos:
 * - Los n�meros introducidos deben ser mayores o iguales que a cero
 * - Los n�meros no est�n limitados a ser n�meros enteros
 * 
*/

/* Pseudoc�digo Generalizado:
* 	Inicio
 *		Declarar variable de bucle (1)
 * 		Preguntar si quiere ejecutar el programa
 * 		Mientras el usuario quiera (1)
 * 		Inicializar variables
 * 			Mientras el usuario quiera (2)
 * 				Pedir que introduzca un n�mero y Mientras que el n�mero introducido no sea menor a 0
 * 				Leer n�mero introducido
 * 				Fin (Mientras que el n�mero introducido no sea menor a 0)
 *				Agregar uno al contador
 *				Si el contador es igual a 1
 *					Guardar n�mero mayor
 *					Guardar n�mero menor
 *				Fin_SI
 * 				Si el n�mero introducido es mayor que los ya introducidos
 * 					Guardar n�mero mayor
 * 				Fin_SI
 * 				Si el n�mero introducido es menor que los ya introducidos
 * 					Guardar n�mero menor
 * 				Fin_SI
 * 				Sumar n�mero a la suma total de n�meros introducidos
 * 				Preguntar si quiere introducir otro n�mero
 * 			Fin (Mientras el usuario quiera (2))
 * 		Calcular media total
 * 		Mostrar n�mero mayor en pantalla
 * 		Mostrar n�mero menor en pantalla
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
		System.out.println("�Desea ejecutar el programa? (Y / N)");
		bucleinicio = teclado.next().charAt(0);
		if (bucleinicio != 'Y' && bucleinicio != 'y' && bucleinicio != 'n' && bucleinicio != 'N')
			System.out.println("�Solo Y o N!");
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
				// Pedir que introduzca un n�mero y Mientras que el n�mero introducido no sea menor a 0
				do
				{
					// Leer n�mero introducido
					System.out.println("Introduce un n�mero por favor");
					numero = teclado.nextDouble();
					if (numero < 0)
						System.out.println("�Solo n�meros mayores o iguales a 0!");
				} while (numero < 0);
				// Fin (Mientras que el n�mero introducido no sea menor a 0)
				// Agregar uno al contador
				contador++;
				
				
				// Si el contador es igual a 1
				if (contador == 1)
				{
					// Guardar n�mero mayor
					mayor = numero;
					// Guardar n�mero menor
					menor = numero;
				}
				//Fin_SI
				
				
				// Si el n�mero introducido es mayor que los ya introducidos
				if (numero > mayor)
					// Guardar n�mero mayor
					mayor = numero;
				// Fin_SI
				
				// Si el n�mero introducido es menor que los ya introducidos
				if (numero < menor)
					// Guardar n�mero menor
					menor = numero;
				// Fin_SI
				
				//Sumar n�mero a la suma total de n�meros introducidos
				media = media + numero;
				
				//Preguntar si quiere introducir otro n�mero
				do
				{
				System.out.println("�Desea introducir otro n�mero? (Y / N)");
				otronumero = teclado.next().charAt(0);
				if (otronumero != 'Y' && otronumero != 'y' && otronumero != 'n' && otronumero != 'N')
					System.out.println("�Solo Y o N!");
				} while (otronumero != 'Y' && otronumero != 'y' && otronumero != 'n' && otronumero != 'N');
			
			} while (otronumero == 'y' || otronumero == 'Y');
			// Fin (Mientras el usuario quiera (2))
			
			// Calcular media total
			media = media / contador;
			
			// Mostrar n�mero mayor en pantalla
			System.out.println("El n�mero mayor de los introducidos es: "+mayor);
			
			// Mostrar n�mero menor en pantalla
			System.out.println("El n�mero menor de los introducidos es: "+menor);
			
			// Mostrar media total en pantalla
			System.out.println("La media de los n�meros introducidos es: "+media);
			
			
			// Preguntar si quiere iniciar el programa de nuevo
			do
			{
			System.out.println("\n\n�Desea ejecutar el programa de nuevo? (Y / N)");
			bucleinicio = teclado.next().charAt(0);
			if (bucleinicio != 'Y' && bucleinicio != 'y' && bucleinicio != 'n' && bucleinicio != 'N')
				System.out.println("�Solo Y o N!");
			} while (bucleinicio != 'Y' && bucleinicio != 'y' && bucleinicio != 'n' && bucleinicio != 'N');	
			// Fin (Mientras el usuario quiera (1))
		}
	}
}
					
					
					
					
					
