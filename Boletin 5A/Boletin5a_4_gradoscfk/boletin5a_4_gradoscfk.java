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
 * 		Mostrar menú y leer y validar opción
 * 		Mientras (opcion != 9)
 * 			Según (opcion)
 * 				caso 1: Leer y validar grados y llamar a Conversion.CaF  //quitar lo de "y llamar"
 * 				caso 2: Leer y validar grados y llamar a Conversion.CaK
 * 				caso 3: Leer y validar grados y llamar a Conversion.FaC
 * 				caso 4: Leer y validar grados y llamar a Conversion.FaK
 * 				caso 5: Leer y validar grados y llamar a Conversion.KaC
 * 				caso 6: Leer y validar grados y llamar a Conversion.KaF
 * 			Fin Según
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
		char opcion = '0';
		double grados;
		double gradosConvertidos;
		
		while (opcion != '9')
		{
			//Mostrar menú y leer y validar opcion
			System.out.println("\nElija una de las opciones:");
			System.out.println("1. Convertir de Celsius a Fahrenheit");
			System.out.println("2. Convertir de Celsius a Kelvin");
			System.out.println("3. Convertir de Fahrenheit a Celsius");
			System.out.println("4. Convertir de Fahrenheit a Kelvin");
			System.out.println("5. Convertir de Kelvin a Celsius");
			System.out.println("6. Convertir de Kelvin a Fahrenheit");
			System.out.println("9. Salir");
			
			do
			{
				opcion = teclado.next().charAt(0);
				if ((opcion < '1' || opcion > '6') && opcion != '9')
					System.out.println("¡Solo del 1 al 6 o el 9 para salir!");
			}while ((opcion < '1' || opcion > '6') && opcion != '9');
		
		
			switch (opcion) //Según (opcion)
			{
				case '1':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Celsius deseas convertir a Fahrenheit?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -273.15)
						System.out.println("¡Los grados Celsius no pueden ser menores a -273.15!");
				}while (grados < -273.15);
				
				//Llamar a ConversionCaF
				gradosConvertidos = Conversion.CaF(grados);
				System.out.println(grados+"ºC son "+gradosConvertidos+"ºF");
				
				break;
				
				case '2':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Celsius deseas convertir a Kelvin?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -273.15)
						System.out.println("¡Los grados Celsius no pueden ser menores a -273.15!");
				}while (grados < -273.15);
				
				//Llamar a ConversionCaF
				gradosConvertidos = Conversion.CaK(grados);
				System.out.println(grados+"ºC son "+gradosConvertidos+"K");
				
				break;
				
				case '3':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Fahrenheit deseas convertir a Celsius?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -459.67)
						System.out.println("¡Los grados Fahrenheit no pueden ser menores a -459.67!");
				}while (grados < -459.67);
				
				//Llamar a ConversionFaC
				gradosConvertidos = Conversion.FaC(grados);
				System.out.println(grados+"ºF son "+gradosConvertidos+"ºC");
				
				break;
				
				case '4':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Fahrenheit deseas convertir a Kelvin?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -459.67)
						System.out.println("¡Los grados Fahrenheit no pueden ser menores a -459.67!");
				}while (grados < -459.67);
				
				//Llamar a ConversionFaK
				gradosConvertidos = Conversion.FaK(grados);
				System.out.println(grados+"ºF son "+gradosConvertidos+"K");
				
				break;
				
				case '5':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Kelvin deseas convertir a Celsius?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < 0)
						System.out.println("¡Los grados Kelvin no pueden ser menores a 0!");
				}while (grados < 0);
				
				//Llamar a ConversionKaC
				gradosConvertidos = Conversion.KaC(grados);
				System.out.println(grados+"K son "+gradosConvertidos+"ºC");
				
				break;
				
				case '6':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Kelvin deseas convertir a Fahrenheit?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < 0)
						System.out.println("¡Los grados Kelvin no pueden ser menores a 0!");
				}while (grados < 0);
				
				//Llamar a ConversionKaF
				gradosConvertidos = Conversion.KaF(grados);
				System.out.println(grados+"K son "+gradosConvertidos+"ºF");
				
				break;
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
