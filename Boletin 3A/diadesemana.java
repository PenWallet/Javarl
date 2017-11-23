/* En este programa, vamos a pedirle al usuario que introduzco un
 * número entero del 1 al 7.
 * Si el número introducido es 1, el output será "El día es lunes"
 * Si es 2, "El día es martes"
 * Y así sucesivamente */

import java.io.*;
import java.util.Scanner;
public class diadesemana
{
	public static void main (String[] Args)
	{
		// Primero necesitamos la variable que guardará la respuesta del usuario
		int dia;
		Scanner teclado = new Scanner (System.in);
		
		// Aquí le preguntamos al usuario que lo introduzca
		System.out.println("¿Qué día quieres saber? (Del 1 al 7)");
		dia = teclado.nextInt();
		
		// Ahora procesamos su respuesta
		if (dia == 1)
			System.out.println("El día es lunes");
		else
		{
			if (dia == 2)
				System.out.println("El día es martes");
			else
			{
				if (dia == 3)
					System.out.println("El día es miércoles");
				else
				{
					if (dia == 4)
						System.out.println("El día es jueves");
					else
					{
						if (dia == 5)
							System.out.println("El día es viernes");
						else
						{
							if (dia == 6)
								System.out.println("El día es sábado");
							else
							{
								if (dia == 7)
									System.out.println("El día es domingo");
								else
									System.out.println("¡No existe ese día de la semana!");
							 }
						}
					}
				}
			}
		}
	}
}
					
					
					
					
					
					
					
					
					
					
					
					
					
