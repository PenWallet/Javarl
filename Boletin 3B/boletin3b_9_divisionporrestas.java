/* Análisis:
 * En este programa, el usuario introducirá un número, que será el
 * dividendo, y otro número, que será el divisor. 
 * El divisor se irá restando consecutivamente al dividendo, contando
 * cuántas veces será posible restárselo. Este número será el cociente.
 * Una vez el dividendo sea menor que el divisor, lo que quede de
 * dividendo pasará a ser conocido como el resto.
 * 
 * Entrada:
 * - Dividendo
 * 		- Debe ser número entero
 * - Divisor
 * 		- Debe ser número entero
 * 		- No puede ser igual a 0
 * 
 * Salida:
 * - Cociente
 * - Resto
 * 
 * 
 * 
 * 
*/



/* Pseudocódigo Detallado:
 * 	Inicio
 * 		// 
 * 		Preguntar si quiere iniciar el programa y leer respuesta  //Obtener y validar inicio del programa
 * 		Mientras el usuario quiera
 * 			Preguntar por dividendo y leer respuesta
 * 			Preguntar por divisor y leer respuesta
 * 			Si uno o todos los datos introducidos son negativos
 * 				Hacer valor absoluto
 * 			Fin_SI
 * 			Mientras el dividendo sea mayor que el divisor
 * 				Restar una vez el divisor a dividendo
 * 				Aumentar en uno el contador (cociente)
 * 			Fin (Mientras el dividendo sea mayor que el divisor)
 * 			Mostrar resultado
 * 			Fin_SI
 * 			Preguntar si quiere ejecutar de nuevo el programa y leer respuesta
 * 		Fin (Mientras el usuario quiera)
 * 	Fin
 * 				
 * 
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;
import java.io.*;

public class boletin3b_9_divisionporrestas
{
	
	public static void main (String[] args) 
	{
		//Inicializar variable de bucle y teclado
		char bucleinicio;
		Scanner teclado = new Scanner (System.in);
		//Inicializar variables de programa
		int dividendo;
		int divisor;
		int cociente = 0;
		int dividendo_copia;
		int divisor_copia;
			
		//Preguntar si quiere iniciar el programa y leer respuesta
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
			
			
			//Preguntar por dividendo y leer respuesta
			System.out.println("¿Cuál es el dividendo?");
			dividendo = teclado.nextInt();
			dividendo_copia = dividendo;
			
			//Preguntar por divisor y leer respuesta
			do
			{
			System.out.println("¿Cuál es el divisor?");
			divisor = teclado.nextInt();
			divisor_copia = divisor;
			if (divisor == 0)
				System.out.println("¡El divisor no puede ser 0!");
			} while (divisor == 0);
		
			
			//Si uno o todos los datos introducidos son negativos
			if (dividendo < 0)
				//Hacer valor absoluto
				dividendo = dividendo * -1;
			if (divisor < 0)
				//Hacer valor absoluto
				divisor = divisor * -1;
			//Fin_SI
			
			//Mientras el dividendo sea mayor que el divisor
			while (dividendo > divisor || dividendo == divisor)
			{
				//Restar una vez el divisor a dividendo
				dividendo = dividendo - divisor;
				//Aumentar en uno el contador (cociente)
				cociente++;
			}
			//Fin (Mientras el dividendo sea mayor que el divisor)
			
			//Mostrar resultados
			if (dividendo_copia < 0 && divisor_copia > 0)
			{
				System.out.println("Dividir "+dividendo_copia+" entre "+divisor_copia+" es igual a:");
				System.out.println("Cociente: "+(cociente * -1));
				System.out.println("Resto: "+(dividendo * -1));
			}
			if (dividendo_copia > 0 && divisor_copia < 0)
			{
				System.out.println("Dividir "+dividendo_copia+" entre "+divisor_copia+" es igual a:");				
				System.out.println("Cociente: "+(cociente * -1));
				System.out.println("Resto: "+(dividendo * -1));
			}
			if ((dividendo_copia > 0 && divisor_copia > 0) || (dividendo_copia < 0 && divisor_copia < 0))
			{
				System.out.println("Dividir "+dividendo_copia+" entre "+divisor_copia+" es igual a:");				
				System.out.println("Cociente: "+cociente);
				System.out.println("Resto: "+dividendo);
			}
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

