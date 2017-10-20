/* Pediremos al usuario que introduzca qu� hora y qu� minutos son.
 * Si es m�s de las 7:30 pero menos que las 14:00, entonces el mensaje
 * ser� "Buenos d�as"
 * Si es m�s de las 14:01 pero menos que las 20:30, "Buenas tardes"
 * Si no, entonces "Buenas noches" */

/* Requisitos:
 * - Los valores de la hora deben ser entre 0 y 23
 * - Los valores de los minutos deben ser entre 0 y 59

 /* Pseudoc�digo Generalizado
  * 
  * Inicio
  * 	Declaramos las variables que vamos a usar
  * 	Inicializamos las variables String
  * 	Funci�n teclado
  * 	Pedir al usuario la hora
  * 		Si la hora est� entre los par�metros, entonces
  * 			Si la hora es menor o igual que 7, entonces
  * 				Si la hora es igual que 7, entonces
  * 					Si los minutos es menor a 30, entonces
  * 						mensajeNoche
  * 					Sino
  * 						mensajeDia
  * 				Sino
  * 					mensajeNoche
  * 			Sino
  * 				Si la hora es menor o igual a 14, entonces
  * 					Si la hora es igual a 14, entonces
  * 						Si los minutos es igual a 0, entonces
  * 							mensajeDia
  * 						Sino
  * 							mensajeTarde
  * 					Sino
  * 						mensajeDia
  *					Sino
  * 					mensajeNoche
  * 		Sino
  * 			ERROR
  * 		
  * 		Fin_SI
  * Fin
  * */

import java.io.*;
import java.util.Scanner;

public class horadia
{
	public static void main (String[] Args)
	{
		// Declaramos las dos variables que vamos a usar
		// (Una para la hora, h; y otra para los minutos, m)
		byte h;
		byte m;
		
		// Inicializamos las variables String
		// (Estas variables ayudar�n a acortar el c�digo)
		String mensajeDia = "\n�Buenos d�as!";
		String mensajeTarde = "\n�Buenas tardes!";
		String mensajeNoche = "\n�Buenas noches!";
		
		// Funci�n teclado
		Scanner teclado = new Scanner (System.in);
		
		// Pedir al usuario la hora
		System.out.println("�Qu� hora es?");
		h = teclado.nextByte();
		System.out.println("�Qu� minutos son?");
		m = teclado.nextByte();
		
		// C�lculos
		if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
		{
			if (h <= 7)
			{
				if (h == 7)
				{
					if (m < 30)
						System.out.println(mensajeNoche);
					else
						System.out.println(mensajeDia);
				}
				else
					System.out.println(mensajeNoche);
			}
			else
			{
				if (h <= 14)
				{
					if (h == 14)
					{
						if (m == 0)
							System.out.println(mensajeDia);
						else
							System.out.println(mensajeTarde);
					}
					else
						System.out.println(mensajeDia);
				}
				else
					System.out.println(mensajeNoche);
			}
		}
		else
			System.out.println("\n�Las horas y minutos introducidos no son v�lidos!");
	}
}
