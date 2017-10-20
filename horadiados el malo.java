/* Mismo programa de "horadia" pero de otra forma, más sencilla,
 * que ahorrará más líneas de código */

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
		
		// La función de teclado
		Scanner teclado = new Scanner (System.in);
		
		/* Pedimos al usuario que introduzca las horas y minutos
		 * *Nota* Al usar teclado.next.Byte nos aseguramos que lo que
		 * el usuario introduzca sea un número real. Que solo
		 * pueda ser -256 y 255 no nos importa ya que eso sí lo
		 * definimos más tarde */
		 
		System.out.println("¿Qué hora es?");
		h = teclado.nextByte();
		System.out.println("¿Qué minutos son?");
		m = teclado.nextByte();
		
		// Ahora con esa información, pasamos los minutos a horas, y
		// lo sumamos todo a total
		total = h + m/60;
		
		/* Línea de prueba
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
		
		// Una vez tenemos el total, podemos calcular cuál será
		// la respuesta
		if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
		{
			if (total >= 7.5)
			{
				if (total <= 14)
					System.out.println("\n¡Buenos días!");
				else
				{
					if (total <= 20.5)
						System.out.println("\n¡Buenas tardes!");
					else
						System.out.println("\n¡Buenas noches!");
				}
			}
			else
				System.out.println("\n¡Buenas noches!");
		}
		else
			System.out.println("\n¡Las horas y minutos introducidos no son válidos!");y
	}
}
