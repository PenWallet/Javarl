/* Mismo programa de "horadia" pero de otra forma, m�s sencilla,
 * que ahorrar� m�s l�neas de c�digo */

import java.io.*;
import java.util.Scanner;

public class horadiados
{
	public static void main (String[] Args)
	{
		// Primero las variables que usaremos
		float h;
		float m;
		float total;
		
		// La funci�n de teclado
		Scanner teclado = new Scanner (System.in);
		
		/* Pedimos al usuario que introduzca las horas y minutos
		 * *Nota* Al usar teclado.next.Byte nos aseguramos que lo que
		 * el usuario introduzca sea un n�mero real. Que solo
		 * pueda ser -256 y 255 no nos importa ya que eso s� lo
		 * definimos m�s tarde */
		 
		System.out.println("�Qu� hora es?");
		h = teclado.nextByte();
		System.out.println("�Qu� minutos son?");
		m = teclado.nextByte();
		
		// Ahora con esa informaci�n, pasamos los minutos a horas, y
		// lo sumamos todo a total
		total = h + m/60;
		
		/* L�nea de prueba
		 * if (necesario == true)
		 * {
		 * 		eliminar.LineaDePrueba();
		 * }
		 * else
		 * {
		 * 		mantener.LineaDePrueba();
		 * }
		 */
		
		System.out.println("\nEl total es "+total);
		
		// Una vez tenemos el total, podemos calcular cu�l ser�
		// la respuesta
		if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
		{
			if (total >= 7.5)
			{
				if (total <= 14)
					System.out.println("\n�Buenos d�as!");
				else
				{
					if (total <= 20.5)
						System.out.println("\n�Buenas tardes!");
					else
						System.out.println("\n�Buenas noches!");
				}
			}
			else
				System.out.println("\n�Buenas noches!");
		}
		else
			System.out.println("\n�Las horas y minutos introducidos no son v�lidos!");y
	}
}
