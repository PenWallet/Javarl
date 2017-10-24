/* An�lisis:
 * En este programa necesitaremos realizar la ra�z cuadrada, la potencia,
 * y la multiplicaci�n de tantos n�meros consecutivos como el usuario
 * introduzca
 * 
 * Requisitos:
 * - N ser� el n�mero de n�meros naturales, y ser� entre 1 y 20
 * - n ser� la potencia a la que est�n elevados dichos n�meros, entre 2 y 5
 * 
*/

/* Pseudoc�digo Generalizado:
 *	Inicio
 * 		Inicializar las variables necesarias
 * 		Preguntar al usuario y obtener datos
 * 		Mientras que no se alcance el valor dado
 * 			Escribir n�mero que se est� calculando
 * 			Calcular ra�z cuadrada
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
		byte N; // N�mero de n�meros naturales introducido por usuario
		byte contador = 1; // Variable contador para el bucle
		byte n; // N�mero de potencia introducido por usuario
		Scanner teclado = new Scanner (System.in);
		
		// Preguntar al usuario y obtener datos
		do
		{
			System.out.println("�Cu�ntos n�meros naturales quieres? (1 - 20)");
			N = teclado.nextByte();
		} while (N <= 0 || N > 20);
		
		do
		{
			System.out.println("�A qu� potencia quieres elevar los n�meros? (2 - 5)");
			n = teclado.nextByte();
		} while (n <= 1 || n > 5);
		
		// Mientras que no se alcance el valor dado
		while (contador != N+1)
		{
			System.out.println("---------------------------------------------");
			// Escribir n�mero que se est� calculando
			System.out.println("\nN�mero: "+(contador));
			// Calcular ra�z cuadrada
			System.out.println("Ra�z cuadrada: "+Math.sqrt(contador));
			// Calcular potencia
			System.out.println("Potencia: "+Math.pow(contador,n));
			// Calcular producto
			System.out.println("Producto: "+(double)((contador)*(Math.sqrt(contador))*(Math.pow(contador,n)))+"\n");
			// Se sube en 1 el contador
			contador++;
		}
	}
}
		
		
		
		
		
		
		
		
		
		
