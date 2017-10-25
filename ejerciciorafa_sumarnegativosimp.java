/* An�lisis:
 * Programa que sumar� solo los n�meros negativos e impares que el
 * usuario introduzca.
 * 
 * Entrada:
 * - Solo n�meros enteros negativos e impares, se validar� en el programa
 * 
 * Salida:
 * - Suma de todos ellos
 * 
 * PG
 * 
 * Inicio
 * 	Leer y validar si quiere ejecutar
 * 	Mientras el usuario quiera
 *	 	ExplicarNormas
 * 		Leer, Validar si el numero es distinto de 0 //Inicializar VCB
 * 		Mientras sea negativo e impar
 * 			Realizar suma
 * 			Leer, Validar si el numero es negativo e impar//Actualizar VCB
 *	 	FinMientras
 * 		imprimirResultados
 * 	FinMientras
 * FinPP
 * 	
 */

import java.io.*;
import java.util.Scanner;
public class ejerciciorafa_sumarnegativosimp
{
	public static void main (String[] Args)
	{
		//Declarar variables
		char bucleinicial = 'z';
		int numero = 1;
		long suma = 0;
		Scanner teclado = new Scanner (System.in);
		
		//Leer y validar si quiere ejecutar
		while (bucleinicial != 'Y' && bucleinicial != 'N')
		{
			System.out.println("�Desea ejecutar el programa? (Y / N)");
			bucleinicial = Character.toUpperCase( teclado.next().charAt(0) );
			if (bucleinicial != 'Y' && bucleinicial != 'N')
				System.out.println("�Solo Y o N!");
		}
		
		//Si es ejecutar
		while (bucleinicial == 'Y')
		{
			//Explicar normas
			System.out.println("\nIntroduce n�meros negativos impares hasta que quieras parar.");
			System.out.println("Cuando quieras parar, escribe 0.");
			System.out.println("Al final, se te dar� la suma de todos los n�meros introducidos.");
			
			//Leer y validar si el n�mero es distinto de 0
			System.out.println("\nIntroduce n�meros:");
			
			while (numero != 0)
			{
				numero = teclado.nextInt();
				
				//Mientras el n�mera sea mayor que 0 o negativo y par
				while (numero > 0 || (numero < 0 && (numero % 2 == 0)))
				{
					System.out.println("�Solo n�meros negativos e impares!");
					numero = teclado.nextInt();
				}
				//Fin Mientras
					suma = suma + numero;
			}
			//Fin Mientras
			
			//imprimirResultadoss
			System.out.println("La suma de todos los n�meros que has introducido es: "+suma);
			
			//Validar bucle inicial de nuevo
			do
			{
				System.out.println("�Desea volver a ejecutar el programa? (Y / N)");
				bucleinicial = Character.toUpperCase(teclado.next().charAt(0));
				if (bucleinicial != 'Y' && bucleinicial != 'N')
					System.out.println("�Solo Y o N!");
			} while (bucleinicial != 'Y' && bucleinicial != 'N');
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
