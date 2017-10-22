/* En este programa pediremos al usuario que introduzca un número, con
 * el cual calcularemos su inverso y lo imprimiremos en pantalla */

import java.io.*;
import java.util.Scanner;

public class inversa
{
	public static void main (String[] Args)
	{
		//Primero las variables
		long numero;
		Scanner teclado = new Scanner (System.in);
		
		//Le preguntamos al usuario por el número
		System.out.println("¿De qué número deseas calcular la inversa?");
		numero = teclado.nextLong();
		
		//Ahora lo calculamos
		System.out.println("El inverso de "+numero+" es "+(double)1/numero);
	}
}
