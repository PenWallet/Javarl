/* Análisis:
 * Se tirarán dos monedas a la vez, y se imprimirá en la pantalla
 * la cantidad de veces que salen dos caras, dos cruces, o uno de cada
 * 
 * 
 * Entrada:
 * - Si desea tirar las monedas (Y / N)
 * 
 * Salida:
 * - Cantidad de veces que ha salido cada opción
 * 
 * 
 * Pseudocódigo generalizado:
 * 	Inicio
 * 		Declarar variables
 * 		Leer y validar si quiere tirar las monedas
 * 		Mientras quiera tirar las monedas
 * 			Tirar dados y mostrar resultado
 * 			Leer y validar si quiere volver a tirar las monedas
 * 		Fin (Mientras quiera tirar las monedas)
 * 	Fin
 * 	
 * 
 * 	
 */

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class boletinazar_3_variasmonedas 
{	
	public static void main (String[] args) 
	{
		//Declarar variables
		char bucleinicio;
		int moneda1;
		int moneda2;
		long doblecaras = 0;
		long doblecruces = 0;
		long distintos = 0;
		Scanner teclado = new Scanner (System.in);
		Random tirardado = new Random();
		
		//Leer y validar si quiere tirar las monedas
		do
		{
			System.out.println("¿Quieres tirar las monedas al aire? (Y / N)");
			bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
			if (bucleinicio != 'Y' && bucleinicio != 'N')
				System.out.println("¡Solo Y o N!");
		} while (bucleinicio != 'Y' && bucleinicio != 'N');
		
		//Mientras quiera tirar las monedas
		while (bucleinicio == 'Y')
		{
			//Tirar dados y mostrar resultado
			moneda1 = tirardado.nextInt(2)+1;
			moneda2 = tirardado.nextInt(2)+1;
			
			if ((moneda1 == moneda2) && moneda1 == 1)
			{
				System.out.println("\n  -------        -------");
				System.out.println(" /       \\      /       \\");
				System.out.println("|  CARA   |    |  CARA   |");
				System.out.println(" \\       /      \\       /");
				System.out.println("  -------        -------");
				doblecaras++;
				System.out.println("Dobles caras: "+doblecaras);
				System.out.println("Dobles cruzes: "+doblecruces);
				System.out.println("Distintas: "+distintos);
			}
			
			if ((moneda1 == moneda2) && moneda1 == 2)
			{
				System.out.println("\n  -------        -------");
				System.out.println(" /       \\      /       \\");
				System.out.println("|  CRUZ   |    |  CRUZ   |");
				System.out.println(" \\       /      \\       /");
				System.out.println("  -------        -------");
				doblecruces++;
				System.out.println("Dobles caras: "+doblecaras);
				System.out.println("Dobles cruzes: "+doblecruces);
				System.out.println("Distintas: "+distintos);
			}
			
			if ((moneda1 != moneda2) && moneda1 == 1)
			{
				System.out.println("\n  -------        -------");
				System.out.println(" /       \\      /       \\");
				System.out.println("|  CARA   |    |  CRUZ   |");
				System.out.println(" \\       /      \\       /");
				System.out.println("  -------        -------");
				distintos++;
				System.out.println("Dobles caras: "+doblecaras);
				System.out.println("Dobles cruzes: "+doblecruces);
				System.out.println("Distintas: "+distintos);
			}
			
			if ((moneda1 != moneda2) && moneda1 == 2)
			{
				System.out.println("\n  -------        -------");
				System.out.println(" /       \\      /       \\");
				System.out.println("|  CRUZ   |    |  CARA   |");
				System.out.println(" \\       /      \\       /");
				System.out.println("  -------        -------");
				distintos++;
				System.out.println("Dobles caras: "+doblecaras);
				System.out.println("Dobles cruzes: "+doblecruces);
				System.out.println("Distintas: "+distintos);
			}
			
			//Leer y validar si quiere volver a tirar las monedas
			do
			{
				System.out.println("\n¿Quieres volver a tirar las monedas al aire? (Y / N)");
				bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
				if (bucleinicio != 'Y' && bucleinicio != 'N')
					System.out.println("¡Solo Y o N!");
			} while (bucleinicio != 'Y' && bucleinicio != 'N');
		}
		//Fin (Mientras quiera tirar las monedas)
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
