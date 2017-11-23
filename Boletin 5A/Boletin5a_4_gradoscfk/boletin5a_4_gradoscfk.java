/* Nombre del programa: boletin5a_4_gradoscfk
 * Descripción: Diseñar un programa que permita cambiar de grados Celsius 
 * a Fahrenheit o Kelvin, o cualquier cambio posible entre ellos, según elija el usuario.
 * 
 * Análisis:
 * - De Celsius a Fahrenheit: F = C * 9/5 + 32
 * - De Celsius a Kelvin: K = C + 273.15
 * - De Fahrenheit a Celsius: C = (F - 32) / (9/5)
 * - De Fahrenheit a Kelvin: K = (F + 459.67) / (9/5)
 * - De Kelvin a Celsius: C = K - 273.15
 * - De Kelvin a Fahrenheit: F = K * 9/5 - 459.67
 * 
 * 
 * Entradas:
 * - Grados
 * 
 * Salidas:
 * - Grados convertidos
 * 
*/

/* Pseudocódigo Generalizado:
 * 	Inicio
 * 		Mostrar menú y leer y validar opcion //Conversion.Menu
 * 		Mientras (opcion != 9)
 * 			Según (opcion)
 * 				caso 1: Leer y validar grados y Conversion.CaF
 * 				caso 2: Leer y validar grados y Conversion.CaK
 * 				caso 3: Leer y validar grados y Conversion.FaC
 * 				caso 4: Leer y validar grados y Conversion.FaK
 * 				caso 5: Leer y validar grados y Conversion.KaC
 * 				caso 6: Leer y validar grados y Conversion.KaF
 * 			Fin Según
 * 			Mostrar menú y leer y validar opcion //Conversion.Menu
 * 		Fin Mientras
 * 	Fin
*/

import java.util.Scanner;
import java.io.*;

public class boletin5a_4_gradoscfk
{
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);
		char opcion;
		double grados;
		double gradosConvertidos;
		
		//Mostrar menú y leer y validar opcion
		do
		{
			Conversion.Menu();
			opcion = teclado.next().charAt(0);
			if ((opcion < '1' || opcion > '6') && opcion != '9')
				System.out.println("¡Solo del 1 al 6 o el 9 para salir!");
		}while ((opcion < '1' || opcion > '6') && opcion != '9');
	
	
/* Estudio del bucle:
 * 
 * ----------------------------------
 * 
 * (Mientras opcion != '9')
 * Tipo VCB: Centinela
 * Inicialización VCB: Lectura antes del bucle en (Leer y validar opcion)
 * Actualización VCB: Antes del final del bucle 
 * Condición de entrada: opcion != '9'
 * Condición de salida: opcion == '9'
 * 
 * ----------------------------------
 */
		while (opcion != '9')
		{
			switch (opcion) //Según (opcion)
			{
				case '1':
				//Leer y validar grados y Conversion.CaF
				System.out.println("\n¿Cuántos grados Celsius deseas convertir a Fahrenheit?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -273.15)
						System.out.println("¡Los grados Celsius no pueden ser menores a -273.15!");
				}while (grados < -273.15);
				
				gradosConvertidos = Conversion.CaF(grados);
				System.out.println(grados+"ºC son "+gradosConvertidos+"ºF");
				
				break;
				
				case '2':
				//Leer y validar grados y Conversion.CaK
				System.out.println("\n¿Cuántos grados Celsius deseas convertir a Kelvin?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -273.15)
						System.out.println("¡Los grados Celsius no pueden ser menores a -273.15!");
				}while (grados < -273.15);
				
				gradosConvertidos = Conversion.CaK(grados);
				System.out.println(grados+"ºC son "+gradosConvertidos+"K");
				
				break;
				
				case '3':
				//Leer y validar grados y Conversion.FaC
				System.out.println("\n¿Cuántos grados Fahrenheit deseas convertir a Celsius?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -459.67)
						System.out.println("¡Los grados Fahrenheit no pueden ser menores a -459.67!");
				}while (grados < -459.67);
				
				gradosConvertidos = Conversion.FaC(grados);
				System.out.println(grados+"ºF son "+gradosConvertidos+"ºC");
				
				break;
				
				case '4':
				//Leer y validar grados y Conversion.FaK
				System.out.println("\n¿Cuántos grados Fahrenheit deseas convertir a Kelvin?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -459.67)
						System.out.println("¡Los grados Fahrenheit no pueden ser menores a -459.67!");
				}while (grados < -459.67);
				
				gradosConvertidos = Conversion.FaK(grados);
				System.out.println(grados+"ºF son "+gradosConvertidos+"K");
				
				break;
				
				case '5':
				//Leer y validar grados y Conversion.KaC
				System.out.println("\n¿Cuántos grados Kelvin deseas convertir a Celsius?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < 0)
						System.out.println("¡Los grados Kelvin no pueden ser menores a 0!");
				}while (grados < 0);
				
				gradosConvertidos = Conversion.KaC(grados);
				System.out.println(grados+"K son "+gradosConvertidos+"ºC");
				
				break;
				
				case '6':
				//Leer y validar grados y Conversion.KaF
				System.out.println("\n¿Cuántos grados Kelvin deseas convertir a Fahrenheit?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < 0)
						System.out.println("¡Los grados Kelvin no pueden ser menores a 0!");
				}while (grados < 0);
				
				gradosConvertidos = Conversion.KaF(grados);
				System.out.println(grados+"K son "+gradosConvertidos+"ºF");
				
				break;
			}
			
			//Mostrar menú y leer y validar opcion
			do
			{
				Conversion.Menu();
				opcion = teclado.next().charAt(0);
				if ((opcion < '1' || opcion > '6') && opcion != '9')
					System.out.println("¡Solo del 1 al 6 o el 9 para salir!");
			}while ((opcion < '1' || opcion > '6') && opcion != '9');
			
		}
	}
}
		
		
		
		
		
		
		
		
		
