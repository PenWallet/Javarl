import java.io.*;
import java.util.Scanner;

public class horadiatres_el_bueno_v3
{
	public static void main (String[] Args)
	{
		// Declaramos las dos variables que vamos a usar
		// (Una para la hora, h; y otra para los minutos, m)
		byte h;
		byte m;
		char siono;
		
		// Inicializamos las variables String
		// (Estas variables ayudarán a acortar el código)
		String mensajeDia = "\n¡Buenos días!";
		String mensajeTarde = "\n¡Buenas tardes!";
		String mensajeNoche = "\n¡Buenas noches!";
		Scanner teclado = new Scanner (System.in);
		
		//Preguntamos si el usuario quiere ejecutar
		do
		{
			System.out.println("¿Desea ejecutar el programa? (Y / N)");
			siono = teclado.next().charAt(0);
		} while (siono != 'n' && siono != 'N' && siono != 'y' && siono != 'Y');
		
		
		while (siono == 'Y' || siono == 'y')
		{
			// Preguntar hora y bucle si no es correcta
			do
			{
				System.out.println("¿Qué hora es?");
				h = teclado.nextByte();
				if (h < 0 || h > 23)
					System.out.println("Hora inválida. Número entero entre 0 y 23");
			} while (h < 0 || h > 23);
			
			// Preguntar minutos y bucle si no son correctos
			do
			{
				System.out.println("¿Qué minutos son?");
				m = teclado.nextByte();
				if (m < 0 || m > 59)
					System.out.println("Minutos inválidos. Número entero entre 0 y 59");
			} while (m < 0 || m > 59);
			
			// Imprimimos la hora en pantalla
			System.out.println("La hora que has introducido es: \""+h+":"+m+"\"");
			
			
			// Cálculos
			if ((h >= 7 && m >= 30) || (h >= 8 && h < 14))
			System.out.println(mensajeDia);
			else
			{
				if ((h >= 14 && h < 20) || (h == 20 && m <= 30))
				System.out.println(mensajeTarde);
				else
				System.out.println(mensajeNoche);
			}
			
			// Volver a preguntar (bucle)

			do
			{
			System.out.println("\n\n¿Quieres volver a ejecutar el programa? (Y/N)");
			siono = teclado.next().charAt(0);
			} while (siono != 'n' && siono != 'N' && siono != 'y' && siono != 'Y');
		}
	}
}
