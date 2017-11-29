/* Nombre del programa: boletin6b_3_circunferencia
 * Descripción: Crear un programa dado el radio de una circunferencia calcule 
 * según opción del usuario la longitud de la misma, el área y el volumen de la esfera que determina
 * 
 * Análisis:
 * - Para calcular la longitud, usaremos la fórmula: 2 * PI * radio
 * - Para calcular el área, usaremos la fórmula: PI * radio al cuadrado
 * - Para calcular el volumen, usaremos la fórmula: 3/4 * PI * radio al cubo
 * 
 * Entradas:
 * - Radio de la circunferencia
 * 
 * Salidas:
 * - Menú
 * - Resultado de la Longitud
 * - Resultado del Área
 * - Resultado del Volumen
 * 
*/

/* Pseudocódigo Generalizado:
 * Inicio
 * 	MostrarMenú * y leer y validar opción
 * 	Mientras (opcion != 0)
 * 		Según (opcion)
 * 			caso 1: CalcularLongitud *
 * 					Imprimir resultado de Longitud
 * 			caso 2: CalcularArea *
 * 					Imprimir resultado de Area
 * 			caso 3: CalcularVolumen *
 * 					Imprimir resultado de Volumen
 * 		Fin Según
 * 		MostrarMenú * y leer y validar opción
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
		
		//MostrarMenú * y leer y validar opción
		do
		{
			Resguardos.mostrarMenu();
			opcion = teclado.next().charAt(0);
			if (opcion < 0 || opcion > 3)
				System.out.println("¡Solo 1, 2, 3, o 0 para salir!");
		}while (opcion < 0 || opcion > 3);
	}
}
		
		
		
		
		
		
		
		
		
