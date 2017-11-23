/* Este programa ser� capaz de identificar si un a�o es bisiesto o no.
 * Lo realizaremos mediante la siguiente t�cnica:
 * El a�o ser� bisiesto si el a�o introducido por el usuario
 * es divisible por 400, o si es divisible por 4 pero no por 100 */

import java.io.*;
import java.util.Scanner;
public class anobisiesto
{
	public static void main (String[] Args)
	{
		// Primero declaramos las variables
		short year;
		// Adem�s de la funci�n teclado
		Scanner teclado = new Scanner (System.in);
		
		// Ahora pedimos al usuario que introduzca el a�o
		System.out.println("�Qu� a�o?");
		year = teclado.nextShort();
		
		// Siguiente, las operaciones
		if ((year % 400) == 0)
			System.out.println("El a�o ES bisiesto");
		else
		{
			if ((year % 4) == 0)
			{
				if ((year % 100) == 0)
					System.out.println("El a�o NO es bisiesto");
				else
					System.out.println("El a�o ES bisiesto");
			}
			else
				System.out.println("El a�o NO es bisiesto");
		}
	}
}
