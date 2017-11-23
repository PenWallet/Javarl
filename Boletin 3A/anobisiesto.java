/* Este programa será capaz de identificar si un año es bisiesto o no.
 * Lo realizaremos mediante la siguiente técnica:
 * El año será bisiesto si el año introducido por el usuario
 * es divisible por 400, o si es divisible por 4 pero no por 100 */

import java.io.*;
import java.util.Scanner;
public class anobisiesto
{
	public static void main (String[] Args)
	{
		// Primero declaramos las variables
		short year;
		// Además de la función teclado
		Scanner teclado = new Scanner (System.in);
		
		// Ahora pedimos al usuario que introduzca el año
		System.out.println("¿Qué año?");
		year = teclado.nextShort();
		
		// Siguiente, las operaciones
		if ((year % 400) == 0)
			System.out.println("El año ES bisiesto");
		else
		{
			if ((year % 4) == 0)
			{
				if ((year % 100) == 0)
					System.out.println("El año NO es bisiesto");
				else
					System.out.println("El año ES bisiesto");
			}
			else
				System.out.println("El año NO es bisiesto");
		}
	}
}
