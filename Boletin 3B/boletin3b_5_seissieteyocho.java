/* An�lisis:
 * Este programa consiste de varios programas, los cuales tendr�n sus
 * diferentes variables, condiciones, etc.
 * 
 * Para el primero, solo necesitaremos hacer un bucle que multiplique
 * los n�meros enteros desde 1 hasta el n�mero introducido por el usuario
 * 
 * Para el segundo, tendremos que leer continuamente los d�gitos de un
 * n�mero entero introducido por teclado, hasta quedarnos sin d�gitos,
 * momento en el que podremos imprimir en pantalla cu�ntos d�gitos tiene
 * el n�mero introducido
 * 
 * Para el tercero, habr� que contar cu�ntos n�meros m�ltiplos de 5 hay
 * hasta llegar a 100 desde el n�mero entero introducido por el usuario
 * 
 * Requisitos:
 * 		Primero:
 * 			- Los n�meros introducidos deber�n ser enteros
 * 			- Los n�meros introducidos deber�n ser mayores o iguales a 1
 * 			- El n�mero no podr� ser mayor a 20, para evitar errores de n�mero muy grandes
 * 		Segundo:
 * 			- Solo n�meros enteros
 * 		Tercero:
 * 			- Solo n�meros enteros
 * 			- El n�mero introducido debe ser mayor o igual a 1
 * 
*/

/* Pseudoc�digo Generalizado:
 * 
 * Inicio
 * 	Declarar variable de bucle
 * 	Preguntar si desea ejecutar el programa
 * 	Mientras el usuario quiera
 * 		Declarar variable de opci�n
 * 		Preguntar qu� programa quiere ejecutar
 * 		Mientras la opcion elegida sea la primera
 * 			Inicializar variables del primer programa
 * 			Mientras que el n�mero introducido no est� dentro de los l�mites
 * 				Preguntar por numero al usuario
 * 				Leer numero
 * 			Fin (Mientras que el n�mero introducido no est� dentro de los l�mites)
 * 			Mientras que el n�mero no haya alcanzado el n�mero establecido
 * 				Multiplicar continuamente el n�mero por el siguiente
 * 			Fin (Mientras que el n�mero no haya alcanzado el n�mero establecido)
 * 			Mostrar resultado
 * 			Preguntar si quiere ejecutar de nuevo el programa uno
 * 		Fin (Mientras la opcion elegida sea la primera)
 * 		Mientras la opcion elegida sea la segunda
 * 			Inicializar variables del segundo programa
 * 			Preguntar por n�mero
 * 			Leer n�mero
 * 			Mientras que el car�cter le�do no sea un espacio en blanco
 * 				Leer car�cter en la posici�n 0 e ir subiendo
 * 				Subir en 1 la variable contador
 * 			Fin (Mientras que el car�cter le�do no sea un espacio en blanco)
 * 			Mostrar resultado en pantalla
 * 			Preguntar si quiere ejecutar de nuevo el programa dos
 * 		Fin (Mientras la opcion elegida sea la segunda)
 * 		Mientras la opci�n elegida sea la tercera
 * 			Inicializar variables del tercer programa
 * 			Preguntar n�mero al usuario y leer n�mero
 * 			Mientras que la variable contador no alcance el 100
 * 				Sumar en 1 al n�mero introducido
 * 				Comprobar si es m�ltiplo de 5
 * 					Si es m�ltiplo de 5
 * 						A�adir 1 a la segunda variable contador
 * 					Fin_SI
 * 			Fin (Mientras que la variable contador no alcance el 100)
 * 			Preguntar si quiere ejecutar de nuevo el programa tres
 * 		Fin (Mientras la opci�n elegida sea la tercera)
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
			System.out.println("�Desea ejecutar el programa? (Y / N)");
			bucleinicio = teclado.next().charAt(0);
			if (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y')
				System.out.println("�Solo Y o N!");
		} while (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y');
		
		//Mientras el usuario quiera
		while (bucleinicio == 'y' || bucleinicio == 'Y')
		{
			//Declarar la variable opcion
			char opcion;
			
			//Preguntar qu� programa quiere ejecutar
			do
			{
				System.out.println("�Qu� programa quieres ejecutar?:");
				System.out.println("\n1. Calcular el factorial de un n�mero entero");
				System.out.println("2. Leer la cantidad de d�gitos de un n�mero entero");
				System.out.println("3. Contar los divisores de 5 que hay entre un n�mero entero menor de 100 y 100");
				System.out.println("Escribe \"1\", \"2\" o \"3\"");
				opcion = teclado.next().charAt(0);
				if (opcion != '1' && opcion != '2' && opcion != '3')
					System.out.println("�Solo \"1\", \"2\" o \"3\"!");
			} while (opcion != '1' && opcion != '2' && opcion != '3');
			
			//Mientras la opci�n elegida sea la primera
			while (opcion == '1')
			{
				//Inicializar variables del programa
				byte factorial;
				long contador1 = 0;
				long resultado = 1;
				char ejecutar1;
				
				//Mientras que el n�mero introducido no est� dentro de los l�mites
				do
				{
					//Preguntar por n�mero al usuario
					System.out.println("�De qu� n�mero entero quieres el factorial? (Entre 1 y 20)");
					//Leer n�mero
					factorial = teclado.nextByte();
					if (factorial < 1 || factorial > 20)
						System.out.println("�El n�mero no puede ser menor que 1 ni mayor que 20!");
				} while (factorial < 1 || factorial > 20);
				//Fin (Mientras que el n�mero introducido no est� dentro de los l�mites)
				
				//Mientras que el n�mero no haya alcanzado el n�mero establecido
				while (contador1 != factorial)
				{
					//Multiplicar continuamente el n�mero por el siguiente
					contador1++;
					resultado = (resultado)*(contador1);
				}
				//Fin (Mientras que el n�mero no haya alcanzado el n�mero establecido)
				
				//Mostrar resultado
				System.out.println("El factorial de "+factorial+" es "+resultado);
				
				//Preguntar si quiere ejecutar de nuevo el programa uno
				do
				{
				System.out.println("�Quieres volver a ejecutar el mismo ejercicio? (Y / N)");
				ejecutar1 = teclado.next().charAt(0);
				if (ejecutar1 != 'y' && ejecutar1 != 'Y' && ejecutar1 != 'n' && ejecutar1 != 'N')
					System.out.println("�Solo Y o N!");
				} while (ejecutar1 != 'y' && ejecutar1 != 'Y' && ejecutar1 != 'n' && ejecutar1 != 'N');
				
				if (ejecutar1 == 'y' || ejecutar1 == 'Y')
					opcion = '1';
				else
					opcion = '0';
			}
			//Fin (Mientras la opcion elegida sea la primera)
			
			
			//Mientras la opci�n elegida sea la segunda
			while (opcion == '2')
			{
				//Inicializar variables del segundo programa
				long numero;
				byte contador = 1;
				long guardarnumero;
				char ejecutar2;
				
				//Preguntar por n�mero
				System.out.println("�De qu� n�mero quieres saber cu�ntos d�gitos tiene?");
				//Leer n�mero
				numero = teclado.nextLong();
				guardarnumero = numero;
				
				//Aplicar teorema fundamental de la numeraci�n
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
				System.out.println("El n�mero "+guardarnumero+" tiene "+contador+" d�gitos");
				
				//Preguntar si quiere ejecutar de nuevo el programa dos
				do
				{
				System.out.println("�Quieres volver a ejecutar el mismo ejercicio? (Y / N)");
				ejecutar2 = teclado.next().charAt(0);
				if (ejecutar2 != 'y' && ejecutar2 != 'Y' && ejecutar2 != 'n' && ejecutar2 != 'N')
					System.out.println("�Solo Y o N!");
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
				
				//Preguntar n�mero al usuario y leer n�mero
				System.out.println("�A partir de qu� n�mero?");
				numero = teclado.nextByte();
				contador = numero;
				
				//Mensaje en pantalla
				System.out.println("Los n�meros divisores de 5 son:");
				
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
				
				System.out.println("\n\nA partir del n�mero "+numero+" hay "+contadordivisores+" divisores de 5, y la suma de todos ellos es "+suma);
				
				
				
				do
				{
					System.out.println("�Quieres volver a ejecutar el mismo ejercicio? (Y / N)");
					ejecutar3 = teclado.next().charAt(0);
					if (ejecutar3 != 'y' && ejecutar3 != 'Y' && ejecutar3 != 'n' && ejecutar3 != 'N')
						System.out.println("�Solo Y o N!");
				} while (ejecutar3 != 'y' && ejecutar3 != 'Y' && ejecutar3 != 'n' && ejecutar3 != 'N');
				
				if (ejecutar3 == 'y' || ejecutar3 == 'Y')
					opcion = '3';
				else
					opcion = '0';
			}
			
			
			//Preguntar si quiere volver a ejecutar el programa
			do
			{
				System.out.println("�Desea ejecutar el programa de nuevo? (Y / N)");
				bucleinicio = teclado.next().charAt(0);
				if (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y')
					System.out.println("�Solo Y o N!");
			} while (bucleinicio != 'N' && bucleinicio != 'n' && bucleinicio != 'Y' && bucleinicio != 'y');
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
