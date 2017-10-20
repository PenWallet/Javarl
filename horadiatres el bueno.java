import java.io.*;
import java.util.Scanner;

public class horadiatres
{
	public static void main (String[] Args)
	{
		// Declaramos las dos variables que vamos a usar
		// (Una para la hora, h; y otra para los minutos, m)
		byte h;
		byte m;
		
		// Inicializamos las variables String
		// (Estas variables ayudarán a acortar el código)
		String mensajeDia = "\n¡Buenos días!";
		String mensajeTarde = "\n¡Buenas tardes!";
		String mensajeNoche = "\n¡Buenas noches!";
		
		// Función teclado
		Scanner teclado = new Scanner (System.in);
		
		// Pedir al usuario la hora
		System.out.println("¿Qué hora es?");
		h = teclado.nextByte();
		System.out.println("¿Qué minutos son?");
		m = teclado.nextByte();
		
		// Cálculos
		if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
		{
			if ((h >= 7 && m >= 30) && (h >= 8 && h < 14))
			System.out.println(mensajeDia);
			else
			{
				if ((h >= 14 && h < 20) || (h <= 20 && m <= 30))
				System.out.println(mensajeTarde);
				else
				System.out.println(mensajeNoche);
			}
		}
		else
			System.out.println("\nK ase illo");
	}
}
