/* Análisis:
 * Tiraremos un dado tantas veces como el usuario indique, y se mostrará
 * las veces que ha caído un número, y el porcentaje de veces. Esto se
 * repetirá hasta que el usuario quiera terminar
 * 
 * Entrada:
 * - Número entero mayor que 0 de tiradas que desea realizar
 * - Si desea volver a repetir las tiradas
 * 
 * Salida
 * - Cantidad de veces que ha salido un número
 * - Porcentajes de cada número
 * 
 * 
 * Pseudocódigo generalizado:
 * 	Inicio
 * 		Declarar variables
 * 		Leer y validar si quiere ejecutar el programa
 * 		Mientras el usuario quiera
 * 			Leer y validar entrada de número de tiradas
 * 			Mientras no se hayan realizado todas las tiradas
 * 				Tirar dado
 * 				Mostrar dado y actualizar contadores
 * 		Fin (Mientras no se hayan realizado todas las tiradas)
 * 		Mostrar resultados
 * 		Leer y validar si quiere volver a ejecutar el programa
 * 		Fin (Mientras el usuario quiera)
 * 	Fin
 * 	
 * 
 * 	
 */

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class boletinazar_2_dados 
{	
	public static void main (String[] args) 
	{
		//Declarar variables de inicio
		char bucleinicio;
		Scanner teclado = new Scanner (System.in);
		Random tirardado = new Random();
		
		
		
		//Leer y validar si quiere ejecutar el programa
		do
		{
			System.out.println("¿Desea ejecutar el programa? (Y / N)");
			bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
			if (bucleinicio != 'Y' && bucleinicio != 'N')
				System.out.println("¡Solo Y o N!");
		} while (bucleinicio != 'Y' && bucleinicio != 'N');
		
		//Mientras el usuario quiera
		while (bucleinicio == 'Y')
		{
			//Declarar variables de programa
			int tiradas;
			int dado;
			int c1 = 0;
			int c2 = 0;
			int c3 = 0;
			int c4 = 0;
			int c5 = 0;
			int c6 = 0;
			int contadortiradas = 0;
			
			//Leer y validar entrada de número de tiradas
			do
			{
				System.out.println("¿Cuántas veces quieres tirar el dado?");
				tiradas = teclado.nextInt();
				if (tiradas <= 0)
					System.out.println("¡Solo números mayores que 0!");
			} while (tiradas <= 0);
			
			//Mientras no se hayan realido todas las tiradas
			while (contadortiradas != tiradas)
			{
				//Tirar dado
				dado = tirardado.nextInt(6)+1;
					
				//Mostrar dado y actualizar contadores
				contadortiradas++;
				System.out.println("\nDado de la tirada nº: "+contadortiradas);
				
				if (dado == 1)
				{
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|   *   |");
					System.out.println("|       |");
					System.out.println("---------");
					c1++;
				}
				
				if (dado == 2)
				{
					System.out.println("---------");
					System.out.println("| *     |");
					System.out.println("|       |");
					System.out.println("|     * |");
					System.out.println("---------");
					c2++;
				}
				
				if (dado == 3)
				{
					System.out.println("---------");
					System.out.println("| *     |");
					System.out.println("|   *   |");
					System.out.println("|     * |");
					System.out.println("---------");
					c3++;
				}
				
				if (dado == 4)
				{
					System.out.println("---------");
					System.out.println("| *   * |");
					System.out.println("|       |");
					System.out.println("| *   * |");
					System.out.println("---------");
					c4++;
				}
				
				if (dado == 5)
				{
					System.out.println("---------");
					System.out.println("| *   * |");
					System.out.println("|   *   |");
					System.out.println("| *   * |");
					System.out.println("---------");
					c5++;
				}
				
				if (dado == 6)
				{
					System.out.println("---------");
					System.out.println("| *   * |");
					System.out.println("| *   * |");
					System.out.println("| *   * |");
					System.out.println("---------");
					c6++;
				}
			}
		
			//Mostrar resultados
			System.out.println("\n\nEl dado 1 ha salido: "+c1+" veces, con un porcentaje de salida del "+(((float)c1/tiradas)*100)+"%");
			System.out.println("El dado 2 ha salido: "+c2+" veces, con un porcentaje de salida del "+(((float)c2/tiradas)*100)+"%");
			System.out.println("El dado 3 ha salido: "+c3+" veces, con un porcentaje de salida del "+(((float)c3/tiradas)*100)+"%");
			System.out.println("El dado 4 ha salido: "+c4+" veces, con un porcentaje de salida del "+(((float)c4/tiradas)*100)+"%");
			System.out.println("El dado 5 ha salido: "+c5+" veces, con un porcentaje de salida del "+(((float)c5/tiradas)*100)+"%");
			System.out.println("El dado 6 ha salido: "+c6+" veces, con un porcentaje de salida del "+(((float)c6/tiradas)*100)+"%");
			
			//Leer y validar si quiere volver a ejecutar el programa
			do
			{
				System.out.println("¿Desea volver ejecutar el programa? (Y / N)");
				bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
				if (bucleinicio != 'Y' && bucleinicio != 'N')
					System.out.println("¡Solo Y o N!");
			} while (bucleinicio != 'Y' && bucleinicio != 'N');
		}
		//Fin (Mientras el usuario quiera)
	}
}
