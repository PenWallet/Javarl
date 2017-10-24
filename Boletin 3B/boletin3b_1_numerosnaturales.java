/* Análisis:
 * En este programa necesitaremos realizar la raíz cuadrada, la potencia,
 * y la multiplicación de tantos números consecutivos como el usuario
 * introduzca
 * 
 * Requisitos:
 * - N será el número de números naturales, y será entre 1 y 20
 * - n será la potencia a la que están elevados dichos números, entre 2 y 5
 * 
*/

/* Pseudocódigo Generalizado:
 *	Inicio
 * 		Inicializar las variables necesarias
 * 		Preguntar al usuario y obtener datos
 * 		Mientras que no se alcance el valor dado
 * 			Escribir número que se está calculando
 * 			Calcular raíz cuadrada
 * 			Calcular potencia
 * 			Calcular producto
 * 			Se sube en 1 el contador
 * 		Fin (Mientras que no se alcance el valor dado)
 * 	Fin
*/

import java.util.Scanner;
import java.io.*;

public class boletin3b_1_numerosnaturales 
{
	
	public static void main (String[] args) 
	{
		// Inicializamos las variables
		byte N; // Número de números naturales introducido por usuario
		byte contador = 1; // Variable contador para el bucle
		byte n; // Número de potencia introducido por usuario
		Scanner teclado = new Scanner (System.in);
		
		// Preguntar al usuario y obtener datos
		do
		{
			System.out.println("¿Cuántos números naturales quieres? (1 - 20)");
			N = teclado.nextByte();
		} while (N <= 0 || N > 20);
		
		do
		{
			System.out.println("¿A qué potencia quieres elevar los números? (2 - 5)");
			n = teclado.nextByte();
		} while (n <= 1 || n > 5);
		
		// Mientras que no se alcance el valor dado
		while (contador != N+1)
		{
			System.out.println("---------------------------------------------");
			// Escribir número que se está calculando
			System.out.println("\nNúmero: "+(contador));
			// Calcular raíz cuadrada
			System.out.println("Raíz cuadrada: "+Math.sqrt(contador));
			// Calcular potencia
			System.out.println("Potencia: "+Math.pow(contador,n));
			// Calcular producto
			System.out.println("Producto: "+(double)((contador)*(Math.sqrt(contador))*(Math.pow(contador,n)))+"\n");
			// Se sube en 1 el contador
			contador++;
		}
	}
}
		
		
		
		
		
		
		
		
		
		
