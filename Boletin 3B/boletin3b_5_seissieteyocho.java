/* Análisis:
 * Este programa consiste de varios programas, los cuales tendrán sus
 * diferentes variables, condiciones, etc.
 * 
 * Para el primero, solo necesitaremos hacer un bucle que multiplique
 * los números enteros desde 1 hasta el número introducido por el usuario
 * 
 * Para el segundo, tendremos que leer continuamente los dígitos de un
 * número entero introducido por teclado, hasta quedarnos sin dígitos,
 * momento en el que podremos imprimir en pantalla cuántos dígitos tiene
 * el número introducido
 * 
 * Para el tercero, habrá que contar cuántos números múltiplos de 5 hay
 * hasta llegar a 100 desde el número entero introducido por el usuario
 * 
 * Requisitos:
 * 		Primero:
 * 			- Los números introducidos deberán ser enteros
 * 			- Los números introducidos deberán ser mayores o iguales a 1
 * 			- El número no podrá ser mayor a 20, para evitar errores de número muy grandes
 * 		Segundo:
 * 			- Solo números enteros
 * 		Tercero:
 * 			- Solo números enteros
 * 			- El número introducido debe ser mayor o igual a 1
 * 
*/

/* Pseudocódigo Generalizado:
 * 
 * Inicio
 * 	Declarar variable de bucle
 * 	Preguntar si desea ejecutar el programa
 * 	Mientras el usuario quiera
 * 		Declarar variable de opción
 * 		Preguntar qué programa quiere ejecutar
 * 		Mientras la opcion elegida sea la primera
 * 			Inicializar variables del primer programa
 * 			Mientras que el número introducido no esté dentro de los límites
 * 				Preguntar por numero al usuario
 * 				Leer numero
 * 			Fin (Mientras que el número introducido no esté dentro de los límites)
 * 			Mientras que el número no haya alcanzado el número establecido
 * 				Multiplicar continuamente el número por el siguiente
 * 			Fin (Mientras que el número no haya alcanzado el número establecido)
 * 			Mostrar resultado
 * 			Preguntar si quiere ejecutar de nuevo el programa uno
 * 		Fin (Mientras la opcion elegida sea la primera)
 * 		Mientras la opcion elegida sea la segunda
 * 			Inicializar variables del segundo programa
 * 			Preguntar por número
 * 			Leer número
 * 			Mientras que el carácter leído no sea un espacio en blanco
 * 				Leer carácter en la posición 0 e ir subiendo
 * 				Subir en 1 la variable contador
 * 			Fin (Mientras que el carácter leído no sea un espacio en blanco)
 * 			Mostrar resultado en pantalla
 * 			Preguntar si quiere ejecutar de nuevo el programa dos
 * 		Fin (Mientras la opcion elegida sea la segunda)
 * 		Mientras la opción elegida sea la tercera
 * 			Inicializar variables del tercer programa
 * 			Preguntar número al usuario y leer número
 * 			Mientras que la variable contador no alcance el 100
 * 				Sumar en 1 al número introducido
 * 				Comprobar si es múltiplo de 5
 * 					Si es múltiplo de 5
 * 						Añadir 1 a la segunda variable contador
 * 					Fin_SI
 * 			Fin (Mientras que la variable contador no alcance el 100)
 * 			Preguntar si quiere ejecutar de nuevo el programa tres
 * 		Fin (Mientras la opción elegida sea la tercera)
 * 		Preguntar si quiere elegir otro programa a ejecutar
 * 	Fin (Mientras el usuario quiera)
 * 	Fin
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/


import java.io.*;
import java.util.Scanner;


public class boletin3b_5_seissieteyocho
{

	public static void main (String[] args) 
	{
		//Declarar variable de bucle
		char bucleinicio;
		Scanner teclado = new Scanner (System.in);
		
		//Preguntar si desea ejecutar el programa
		do
		{
			System.out.println("¿Desea ejecutar el programa? (Y / N)");
			bucleinicio = teclado.next().charAt(0);
			if (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y')
				System.out.println("¡Solo Y o N!");
		} while (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y');
		
		//Mientras el usuario quiera
		while (bucleinicio == 'y' || bucleinicio == 'Y')
		{
			//Declarar la variable opcion
			char opcion;
			
			//Preguntar qué programa quiere ejecutar
			do
			{
				System.out.println("¿Qué programa quieres ejecutar?:");
				System.out.println("\n1. Calcular el factorial de un número entero");
				System.out.println("2. Leer la cantidad de dígitos de un número entero");
				System.out.println("3. Contar los divisores de 5 que hay entre un número entero menor de 100 y 100");
				System.out.println("Escribe \"1\", \"2\" o \"3\"");
				opcion = teclado.next().charAt(0);
				if (opcion != '1' && opcion != '2' && opcion != '3')
					System.out.println("¡Solo \"1\", \"2\" o \"3\"!");
			} while (opcion != '1' && opcion != '2' && opcion != '3');
			
			//Mientras la opción elegida sea la primera
			while (opcion == '1')
			{
				//Inicializar variables del programa
				byte factorial;
				long contador1 = 0;
				long resultado = 1;
				char ejecutar1;
				
				//Mientras que el número introducido no esté dentro de los límites
				do
				{
					//Preguntar por número al usuario
					System.out.println("¿De qué número entero quieres el factorial? (Entre 1 y 20)");
					//Leer número
					factorial = teclado.nextByte();
					if (factorial < 1 || factorial > 20)
						System.out.println("¡El número no puede ser menor que 1 ni mayor que 20!");
				} while (factorial < 1 || factorial > 20);
				//Fin (Mientras que el número introducido no esté dentro de los límites)
				
				//Mientras que el número no haya alcanzado el número establecido
				while (contador1 != factorial)
				{
					//Multiplicar continuamente el número por el siguiente
					contador1++;
					resultado = (resultado)*(contador1);
				}
				//Fin (Mientras que el número no haya alcanzado el número establecido)
				
				//Mostrar resultado
				System.out.println("El factorial de "+factorial+" es "+resultado);
				
				//Preguntar si quiere ejecutar de nuevo el programa uno
				do
				{
				System.out.println("¿Quieres volver a ejecutar el mismo ejercicio? (Y / N)");
				ejecutar1 = teclado.next().charAt(0);
				if (ejecutar1 != 'y' && ejecutar1 != 'Y' && ejecutar1 != 'n' && ejecutar1 != 'N')
					System.out.println("¡Solo Y o N!");
				} while (ejecutar1 != 'y' && ejecutar1 != 'Y' && ejecutar1 != 'n' && ejecutar1 != 'N');
				
				if (ejecutar1 == 'y' || ejecutar1 == 'Y')
					opcion = '1';
				else
					opcion = '0';
			}
			//Fin (Mientras la opcion elegida sea la primera)
			
			
			//Mientras la opción elegida sea la segunda
			while (opcion == '2')
			{
				//Inicializar variables del segundo programa
				long numero;
				byte contador = 1;
				long guardarnumero;
				char ejecutar2;
				
				//Preguntar por número
				System.out.println("¿De qué número quieres saber cuántos dígitos tiene?");
				//Leer número
				numero = teclado.nextLong();
				guardarnumero = numero;
				
				//Aplicar teorema fundamental de la numeración
				while (numero >= 10)
				{
					numero = numero/10;
					contador++;
				}
				
				/* No sirve
				do
				{
					if (numero.charAt(contador) != '')
						contador++;
				} while (numero.charAt(contador) == '');
				*/
				
				//Mostrar resultado en pantalla
				System.out.println("El número "+guardarnumero+" tiene "+contador+" dígitos");
				
				//Preguntar si quiere ejecutar de nuevo el programa dos
				do
				{
				System.out.println("¿Quieres volver a ejecutar el mismo ejercicio? (Y / N)");
				ejecutar2 = teclado.next().charAt(0);
				if (ejecutar2 != 'y' && ejecutar2 != 'Y' && ejecutar2 != 'n' && ejecutar2 != 'N')
					System.out.println("¡Solo Y o N!");
				} while (ejecutar2 != 'y' && ejecutar2 != 'Y' && ejecutar2 != 'n' && ejecutar2 != 'N');
				
				if (ejecutar2 == 'y' || ejecutar2 == 'Y')
					opcion = '2';
				else
					opcion = '0';
			}
			
			while (opcion == '3')
			{
				//Inicializar variables del tercer programa
				char ejecutar3;
				byte numero;
				byte contador;
				int suma = 0;
				byte contadordivisores = 0;
				
				//Preguntar número al usuario y leer número
				System.out.println("¿A partir de qué número?");
				numero = teclado.nextByte();
				contador = numero;
				
				//Mensaje en pantalla
				System.out.println("Los números divisores de 5 son:");
				
				// Mientras que el contador no llegue a 100
				while (contador < 100)
				{
					contador++;
					if ((contador  % 5) == 0)
					{
						System.out.println(contador);
						suma = suma + contador;
						contadordivisores++;
					}
				}
				
				System.out.println("\n\nA partir del número "+numero+" hay "+contadordivisores+" divisores de 5, y la suma de todos ellos es "+suma);
				
				
				
				do
				{
					System.out.println("¿Quieres volver a ejecutar el mismo ejercicio? (Y / N)");
					ejecutar3 = teclado.next().charAt(0);
					if (ejecutar3 != 'y' && ejecutar3 != 'Y' && ejecutar3 != 'n' && ejecutar3 != 'N')
						System.out.println("¡Solo Y o N!");
				} while (ejecutar3 != 'y' && ejecutar3 != 'Y' && ejecutar3 != 'n' && ejecutar3 != 'N');
				
				if (ejecutar3 == 'y' || ejecutar3 == 'Y')
					opcion = '3';
				else
					opcion = '0';
			}
			
			
			//Preguntar si quiere volver a ejecutar el programa
			do
			{
				System.out.println("¿Desea ejecutar el programa de nuevo? (Y / N)");
				bucleinicio = teclado.next().charAt(0);
				if (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y')
					System.out.println("¡Solo Y o N!");
			} while (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y');
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
