/* En este programa dejaremos al usuario elegir si desea convertir
 * de Celsius a Fahrenheit o de Fahrenheit a Celsius y aplicaremos la
 * correspondiente ecuaci�n a cada caso */

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class gradoscyf
{
	public static void main (String[] Args)
	{
		// Primero las variables que vamos a usar
		double grados = 0;
		String conversion = "";
		double resultado = 0;
		Scanner teclado = new Scanner (System.in);
		
		// Ahora le preguntamos al usuario qu� desea hacer
		System.out.println("�A qu� deseas convertir?");
		System.out.println("Si deseas pasar Celsius a Fahrenheit, escribe \"fahrenheit\"");
		System.out.println("Si deseas pasar Fahrenheit a Celsius, escribe \"celsius\"");
		conversion = teclado.nextLine();
				
		// Nos aseguramos de que ha escrito correctamente lo que desea hacer
		if (conversion.equals("fahrenheit") || conversion.equals("celsius"))
		{
			// Le preguntamos por los grados que desea pasar
			System.out.println("\n�Cu�ntos grados?");
			grados = teclado.nextDouble();
			
			// Las temperaturas tienen un n�mero m�nimo, as� que
			// nos aseguramos de eso igualmente
			// -459.67�F y -273.15�C
			if (conversion.equals("celsius") && grados < -459.67)
			{
				System.out.println("�Los grados Fahrenheit no puede ser menor a -459.67!");
			}
			else
			{
				if (conversion.equals("fahrenheit") && grados < -273.15)
				{
					System.out.println("�Los grados Celsius no puede ser menor a -273.15!");
				}
				else
				{
					// Ahora podemos realizar las operaciones tras
					// comprobar todos los inputs del usuario
					if (conversion.equals("fahrenheit"))
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
		else
		{
			System.out.println("\nNo has introducido el nombre correctamente");
		}
	}
}
