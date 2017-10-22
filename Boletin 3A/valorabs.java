/* El programa va a leer el número introducido por el usuario
 * y dará su valor absoluto */

import java.io.*;
import java.util.Scanner;
public class valorabs
{
	public static void main (String[] Args)
	{
		// Primero declaramos la única variable
		float numero;
		
		// Pedimos al usuario que introduzca el número
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿De qué número quieres el valor absoluto?");
		numero = teclado.nextFloat();
		
		// Calculamos el valor absoluto
		if (numero >= 0)
		{
			System.out.println("El valor absoluto de "+numero+" es "+numero);
		}
		else
		{
			System.out.println("El valor absoluto de "+numero+" es "+numero*(-1));
		}
	}
}
