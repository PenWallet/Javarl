/* Nombre del programa: boletin6b_3_circunferencia
 * Descripci�n: Crear un programa dado el radio de una circunferencia calcule 
 * seg�n opci�n del usuario la longitud de la misma, el �rea y el volumen de la esfera que determina
 * 
 * An�lisis:
 * - Para calcular la longitud, usaremos la f�rmula: 2 * PI * radio
 * - Para calcular el �rea, usaremos la f�rmula: PI * radio al cuadrado
 * - Para calcular el volumen, usaremos la f�rmula: 3/4 * PI * radio al cubo
 * 
 * Entradas:
 * - Radio de la circunferencia
 * 
 * Salidas:
 * - Men�
 * - Resultado de la Longitud
 * - Resultado del �rea
 * - Resultado del Volumen
 * 
*/

/* Pseudoc�digo Generalizado:
 * Inicio
 * 	MostrarMen� * y leer y validar opci�n
 * 	Mientras (opcion != 0)
 * 		Seg�n (opcion)
 * 			caso 1: CalcularLongitud *
 * 					Imprimir resultado de Longitud
 * 			caso 2: CalcularArea *
 * 					Imprimir resultado de Area
 * 			caso 3: CalcularVolumen *
 * 					Imprimir resultado de Volumen
 * 		Fin Seg�n
 * 		MostrarMen� * y leer y validar opci�n
 * 	Fin Mientras
 * Fin
 * 
*/

import java.util.Scanner;
import java.io.*;

public class boletin6b_3_circunferencia
{
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);
		char opcion;
		
		//MostrarMen� * y leer y validar opci�n
		do
		{
			Resguardos.mostrarMenu();
			opcion = teclado.next().charAt(0);
			if (opcion < 0 || opcion > 3)
				System.out.println("�Solo 1, 2, 3, o 0 para salir!");
		}while (opcion < 0 || opcion > 3);
	}
}
		
		
		
		
		
		
		
		
		
