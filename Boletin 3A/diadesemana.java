/* En este programa, vamos a pedirle al usuario que introduzco un
 * n�mero entero del 1 al 7.
 * Si el n�mero introducido es 1, el output ser� "El d�a es lunes"
 * Si es 2, "El d�a es martes"
 * Y as� sucesivamente */

import java.io.*;
import java.util.Scanner;
public class diadesemana
{
	public static void main (String[] Args)
	{
		// Primero necesitamos la variable que guardar� la respuesta del usuario
		int dia;
		Scanner teclado = new Scanner (System.in);
		
		// Aqu� le preguntamos al usuario que lo introduzca
		System.out.println("�Qu� d�a quieres saber? (Del 1 al 7)");
		dia = teclado.nextInt();
		
		// Ahora procesamos su respuesta
		if (dia == 1)
			System.out.println("El d�a es lunes");
		else
		{
			if (dia == 2)
				System.out.println("El d�a es martes");
			else
			{
				if (dia == 3)
					System.out.println("El d�a es mi�rcoles");
				else
				{
					if (dia == 4)
						System.out.println("El d�a es jueves");
					else
					{
						if (dia == 5)
							System.out.println("El d�a es viernes");
						else
						{
							if (dia == 6)
								System.out.println("El d�a es s�bado");
							else
							{
								if (dia == 7)
									System.out.println("El d�a es domingo");
								else
									System.out.println("�No existe ese d�a de la semana!");
							 }
						}
					}
				}
			}
		}
	}
}
					
					
					
					
					
					
					
					
					
					
					
					
					
