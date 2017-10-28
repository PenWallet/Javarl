/* Análisis:
 * Tirador de monedas cara y cruz.
 * Se generará un número al azar, y dependiendo del valor, será cara,
 * cruz, o, con una ínfima posibilidad, decanto.
 * 
 * Entrada:
 * - Y o N, dependiendo de si el usuario quiere tirar la moneda o no
 * 
 * Salida:
 * - Cara o cruz
 * 
 * Pseudocódigo Generalizado
 * 	Inicio
 * 		Declarar variables
 * 		Leer y validar si quiere tirar la moneda
 * 		Mientras el usuario quiera
 * 			Calcular aleatorio
 * 			Mostrar resultado (cara o cruz)
 * 			Leer y validar si quiere volver tirar la moneda
 * 		Fin (Mientras el usuario quiera
 *	Fin
 * 
 * Estudio del bucle:
 * 	- Bucle controlado por centinela
 * 		Dato centinela:		
 */

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class boletinazar_1_monedas 
{	
	public static void main (String[] args) 
	{
		//Declarar variables
		char tirar;
		double resultado;
		long caras = 0;
		long cruces = 0;
		byte decantos = 0;
		long contador = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		//Leer y validar si quiere tirar la moneda
		do
		{
			System.out.println("¿Desea tirar la moneda?");
			tirar = Character.toUpperCase(teclado.next().charAt(0));
			if (tirar != 'Y' && tirar != 'N')
				System.out.println("¡Solo Y o N!");
		} while (tirar != 'Y' && tirar != 'N');
		
		//Repetir
		while (tirar == 'Y')
		{
			//Calcular aleatorio
			resultado = Math.random();
			System.out.println(resultado);
			//Mostrar resultado (cara o cruz)
			if (resultado < 0.5)
			{
				System.out.println("  -------");
				System.out.println(" /       \\");
				System.out.println("|  CARA   |");
				System.out.println(" \\       /");
				System.out.println("  -------");
				caras++;
			}
			
			if (resultado > 0.5)
			{
				System.out.println("  -------");
				System.out.println(" /       \\");
				System.out.println("|  CRUZ   |");
				System.out.println(" \\       /");
				System.out.println("  -------");
				cruces++;
			}
			
			if (resultado == 0.5)
			{
				System.out.println("  -------");
				System.out.println(" /       \\");
				System.out.println("|DE CANTO |");
				System.out.println("\\        /");
				System.out.println("  -------");
				decantos++;
			}
			contador++;
			System.out.println("\nCaras: "+caras+" Cruces: "+cruces+" Decantos: "+decantos);
			
			//Leer y validar si quiere volver a tirar la moneda
			do
			{
				System.out.println("¿Desea volver tirar la moneda? (Y / N)");
				tirar = Character.toUpperCase(teclado.next().charAt(0));
				if (tirar != 'Y' && tirar != 'N')
					System.out.println("¡Solo Y o N!");
			} while (tirar != 'Y' && tirar != 'N');
		}
		//Fin (Mientras el usuario quiera)
	}
}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
