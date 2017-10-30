/* Análisis:
 * Leeremos la nota introducida por el usuario y dependiendo de su valor,
 * imprimiremos un mensaje u otro en pantalla.
 * 
 * Entrada:
 * - Nota por teclado, no puede ser menor que 0, ni mayor que 10
 * 
 * Salida:
 * - Mensaje
 * 
 * Pseudocódigo Generalizado
 * 	Inicio
 * 		Declarar variables
 * 		Leer y validar si quiere ejecutar el programa
 * 		Mientras el usuario quiera
 * 			Leer y validar nota
 * 			Según nota
 * 				Nota menor que 5: Suspenso
 * 				Nota mayor o igual que 5 y menor o igual que 7: Aprobado
 * 				Nota mayor que 7 y menor que 9: Notable
 * 				Nota mayor o igual que 9 y menor o igual que 10: Aprobado
 * 			Fin (Según nota)
 * 			Leer y validar si desea ejecutar de nuevo
 * 		Fin (Mientras el usuario quiera)
 * 	Fin
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;
import java.io.*;

public class boletin3b_12_notaasignatura
{
	public static void main (String[] args)
	{
		//Declarar variables
		char bucleinicio;
		byte nota;
		Scanner teclado = new Scanner (System.in);
		
		//Leer y validar si el usuario quiere ejecutar
		do
		{
			System.out.println("¿Desea ejecutar el programa? (Y / N)?");
			bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
			if (bucleinicio != 'Y' && bucleinicio != 'N')
				System.out.println("¡Solo Y o N!");
		} while (bucleinicio != 'Y' && bucleinicio != 'N');
		
		//Mientras el usuario quiera
		while (bucleinicio == 'Y')
		{
			//Leer y validar nota
			do
			{
				System.out.println("¿Qué nota has sacado?");
				nota = teclado.nextByte();
				if (nota < 0 || nota > 10)
					System.out.println("Rly?");
			} while (nota < 0 || nota > 10);
			
			//Según nota
			switch (nota)
			{
				case 0: case 1: case 2: case 3: case 4:
					System.out.println("Suspenso");
				break;
				
				case 5: case 6: case 7:
					System.out.println("¡Aprobado!");
				break;
				
				case 8:
					System.out.println("¡NOTABLE!");
				break;
				
				case 9: case 10:
					System.out.println("¡¡¡¡SoBrESSALieNETTeeeEE1!!uno!");
				break;
			}
			//Fin (Según nota)
			
			//Leer y validar si quiere ejecutar de nuevo
			do
			{
				System.out.println("¿Desea ejecutar de nuevo el programa? (Y / N)?");
				bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
				if (bucleinicio != 'Y' && bucleinicio != 'N')
					System.out.println("¡Solo Y o N!");
			} while (bucleinicio != 'Y' && bucleinicio != 'N');
		}
		//Fin (Mientras el usuario quiera)
	}
}
	
		
		
		
		
		
		
		
		
		
		
