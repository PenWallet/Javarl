/* Este programa resolver� ecuaciones de segundo grado y printar� en
 * la pantalla los dos resultados posibles.
 * Necesitaremos que el usuario introduzca a, b, y c */

import java.io.*;
import java.util.Scanner;

public class segundogrado
{
	public static void main (String Args[])
	{
		// Declaramos las variables necesarias
		int a = 0; 
		int b = 0;
		int c = 0;
		double discriminante = 0;
		double x1 = 0;
		double x2 = 0;
		Scanner teclado =  new Scanner (System.in);
		
		
		// Primero necesitaremos indicarle al usuario cu�les son las
		// variables necesarias
		System.out.println("La ecuaci�n de segundo grado es la siguiente:");
		System.out.println("\n-b +- sqrt(b^2 - 4ac)");
		System.out.println("---------------------");
		System.out.println("         2a          ");
		
		// Ahora que el usuario sabe cu�l es la forma de la ecuaci�n
		// pasamos a pedirle las variables necesarias
		System.out.println("\n\n�Cu�l es la variable a?");
		a = teclado.nextInt();
		if (a == 0)
			System.out.println("ERROR");
		else
		{
			System.out.println("�Cu�l es la variable b?");
			b = teclado.nextInt();
			System.out.println("�Cu�l es la variable c?");
			c = teclado.nextInt();
			
			// Operaciones
			// Primero calculamos el discriminante
			// Pero antes nos aseguramos de que se pueda realizar
			if (4*a*c <= b*b)
			{
				discriminante = Math.sqrt(b*b - 4*a*c);
				
				// Ahora podemos calcular la primera soluci�n
				x1 = (-1 * b + discriminante)/(2*a);
				System.out.println("\nx1 = "+x1);
		
				// Y la segunda
				x2 = (-b - discriminante)/(2*a);
				System.out.println("x2 = "+x2);
			}
			else
				System.out.println("La ra�z es negativa. ERROR");
		}
	}
}
