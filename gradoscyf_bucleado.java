/* An�lisis:
 * En este programa dejaremos al usuario elegir si desea convertir
 * de Celsius a Fahrenheit o de Fahrenheit a Celsius y aplicaremos la
 * correspondiente ecuaci�n a cada caso 
 */
 
 /* Pseudoc�digo generalizado
  * Inicio
  * 	Inicializamos las variables
  * 	Mientras que la respuesta no sea correcta
  * 		Preguntar al usuario qu� quiere hacer
  * 	Fin Mientras
  * 	Evaluar
  * Fin
 */

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class gradoscyf_bucleado
{
	public static void main (String[] Args)
	{
		// Inicializamos las variables
		double grados = 0;
		char conversion;
		double resultado = 0;
		Scanner teclado = new Scanner (System.in);
		
		// Ahora le preguntamos al usuario qu� desea hacer
		do
		{
			System.out.println("�A qu� deseas convertir?");
			System.out.println("Si deseas pasar Celsius a Fahrenheit, escribe \"F\"");
			System.out.println("Si deseas pasar Fahrenheit a Celsius, escribe \"C\"");
			conversion = teclado.next().charAt(0);
		} while (conversion != 'F' || conversion != 'f' || conversion != 'C' || conversion != 'c');
		
		// Le preguntamos por los grados que desea pasar
		System.out.println("\n�Cu�ntos grados?");
		grados = teclado.nextDouble();
		
		// Las temperaturas tienen un n�mero m�nimo, as� que
		
		if ((conversion == 'c' || conversion == 'C') && grados < -459.67)
		{
			System.out.println("�Los grados Fahrenheit no puede ser menor a -459.67!");
		}
		else
		{
			if ((conversion == 'f' || conversion == 'F') && grados < -273.15)
			{
				System.out.println("�Los grados Celsius no puede ser menor a -273.15!");
			}
			else
			{
				// Ahora podemos realizar las operaciones tras
				// comprobar todos los inputs del usuario
				if (conversion == 'f' || conversion == 'F')
				{
					resultado = grados * 1.8 + 32;
					System.out.println(grados+"�C"+" son "+resultado+"�F");
				}
				else
				{
					resultado = (grados - 32) / 1.8;
					System.out.println(grados+"�F"+" son "+resultado+"�C");
				}
			}
		}
	}
}
