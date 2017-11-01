/* Análisis:
 * Programa que simulará una carrera de caballo, en la que cada uno de
 * ellos tendrá una posibilidad al azar de ganar.
 * 
 * Esto se hará mediante la función estática Random de Math.
 * Generaremos un número del 0 al 100, y el caballo que saque el número
 * mayor, ganará.
 * Quick-Fix tendrá un 10% más de probabilidades de ganar
 * 
 * Permitiremos al usuario hacer apuestas de igual forma usando el
 * dinero que él mismo se asignará antes de empezar.
 * 
 * Entrada:
 * - Carácter indicador de si desea ejecutar el programa o no
 * - Cantidad de dinero inicial, mayor que 0 y menor que 1000
 * - Caballo al que apostará
 * 
 * Salida:
 * - Mensaje si ha ganado o perdido
 * - Cantidad de dinero restante
*/



/* Pseudocódigo generalizado:
 * 	Inicio
 * 		Declarar variables
 * 		Leer y validar si desea ejecutar el programa
 * 			Mientras el usuario quiera
 * 				Leer y validar cantidad de dinero inicial
 *				Mientras tenga dinero con el que apostar
 * 					Repetir
 * 						Mostrar menú
 * 						Leer y validar selección de caballo
 * 						Según caballo
 * 							Caballo 1: Mostrar información y leer y validar si desea elegirlo
 * 							Caballo 2: Mostrar información y leer y validar si desea elegirlo
 * 							Caballo 3: Mostrar información y leer y validar si desea elegirlo
 * 					Mientras no haya elegido un caballo
 * 					Leer y validar dinero apostado
 * 					Calcular caballo ganador
 * 					Si gana
 * 						Doblar dinero apostado
 * 					Sino
 * 						Restar dinero apostado
 * 				Fin (Mientras tenga dinero con el que apostar)
 * 				Mostrar mensaje de haber perdido
 * 				Leer y validar si desea ejecutar de nuevo el programa
 * 			Fin (Mientras el usuario quiera)
 * 	Fin
*/ 



/* Estudio de los bucles:
 * 
 * ----------------------------------
 * 
 * (Mientras el usuario quiera jugar)
 * Tipo VCB: Centinela
 * Inicialización VCB: Lectura antes de la primera iteración
 * Actualización VCB: Lectura al final del bucle
 * Condición de salida: VCB == 'Y' ó VCB == 'N'
 * 
 * ----------------------------------
 * 
 * (Mientras el usuario tenga dinero)
 * Tipo VCB: Centinela
 * Inicialización VCB: Lectura antes de la primera iteración
 * Actualización VCB: Lectura al final del bucle
 * Condición de salida: VCB == 0
 * 
 * ----------------------------------
 * 
 * (Repetir ... Mientras no haya elegido un caballo)
 * Tipo VCB: Centinela
 * Inicialización VCB: Lectura dentro del bucle, tras (Mostrar menú)
 * Actualización VCB: Lectura al final del bucle
 * Condición de salida: VCB == '1' ó VCB == '2' ó VCB == '3'
 * 
 * ----------------------------------
 */

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class boletinazar_8_apuestacaballos
{	
	public static void main (String[] args) 
	{
		//Declarar variables
		char bucleinicio;
		int dinero;
		char caballo = '0';
		char elegir;
		int apuesta;
		double quickfix;
		double tomislav;
		double letranger;
		char ganador;
		Scanner teclado = new Scanner (System.in);
		
		//Leer y validar si desea ejecutar el programa
		do
		{
			System.out.println("¿Quieres ejecutar el programa? (Y / N)");
			bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
			if (bucleinicio != 'Y' && bucleinicio != 'N')
				System.out.println("¡Solo Y o N!");
		} while (bucleinicio != 'Y' && bucleinicio != 'N');
		
		//Mientras el usuario quiera ejecutar el programa
		while (bucleinicio == 'Y')
		{
			//Leer y validar cantidad de dinero inicial
			System.out.println("¿Con cuánto dinero deseas empezar?");
			System.out.println("Introduce una cantidad mayor que 0 y menor o igual a 1000");
			do
			{
				dinero = teclado.nextInt();
				if (dinero <= 0 || dinero > 1000)
					System.out.println("\n¡Solo entre 1 y 1000!");
			} while (dinero <= 0 || dinero > 1000);
			
			//Mientras tenga dinero con el que apostar
			while (dinero > 0)
			{
				//Repetir
				do
				{
					//Mostrar menú
					System.out.println("Estos son los caballos:");
					System.out.println("1. Quick-Fix");
					System.out.println("2. Tomislav");
					System.out.println("3. L'étranger");
					System.out.println("\nElige uno para ver su descripción");
					caballo = teclado.next().charAt(0);
					
					//Leer y validar selección de caballo
					while (caballo != '1' && caballo != '2' && caballo != '3')
					{
						System.out.println("¡Solo 1, 2 o 3!");
						caballo = teclado.next().charAt(0);
					}
					
					//Según caballo
					switch (caballo)
					{
						//Caballo 1: Mostrar información y leer y validar si desea elegirlo
						case '1':
							System.out.println("\nDescripción de Quick-Fix:");
							System.out.println("\nImparable, rápido, atropella a quien sea, donde sea y porque sea.");
							System.out.println("Lo que le falta en herraduras e higiene, lo compensa en velocidad.");
							System.out.println("Criado en Stuttgart, Alemania, durante una época en la que los caballos");
							System.out.println("tenían más derechos que las personas.");
							
							System.out.println("\n¿Quieres elegir este caballo? (Y / N)");
							do
							{
								elegir = Character.toUpperCase(teclado.next().charAt(0));
								if (elegir != 'Y' && elegir != 'N')
									System.out.println("¡Solo Y o N!");
							} while (elegir != 'Y' && elegir != 'N');
							
							if (elegir == 'N')
								caballo = '0';
							
							break;
						
						//Caballo 2: Mostrar información y leer y validar si desea elegirlo
						case '2':
							System.out.println("\nescripción de Tomislav:");
							System.out.println("\nNacido en la antigua USSR, criado con cariño de látigo.");
							System.out.println("El más feroz de todos los caballos que vas a ver por aquí.");
							System.out.println("Parece que es capaz de entender que está en una carrera, y si hace falta");
							System.out.println("tirar a alguien, se hace. Sin preguntas.");
							
							System.out.println("\n¿Quieres elegir este caballo? (Y / N)");
							do
							{
								elegir = Character.toUpperCase(teclado.next().charAt(0));
								if (elegir != 'Y' && elegir != 'N')
									System.out.println("¡Solo Y o N!");
							} while (elegir != 'Y' && elegir != 'N');
							
							if (elegir == 'N')
								caballo = '0';
							
							break;
							
						//Caballo 3: Mostrar información y leer y validar si desea elegirlo
						case '3':
							System.out.println("\nDescripción de L'étranger:");
							System.out.println("\nNacido en Francia. No se sabe en qué región.");
							System.out.println("Usa el sigilo, y es capaz de camuflarse entre los demás caballos.");
							System.out.println("Es capaz de ver la energía que le queda a los demás caballos.");
							System.out.println("No es el más rápido, pero es el más inteligente. Puede sumar con sus pezuñas.");
							
							System.out.println("\n¿Quieres elegir este caballo? (Y / N)");
							do
							{
								elegir = Character.toUpperCase(teclado.next().charAt(0));
								if (elegir != 'Y' && elegir != 'N')
									System.out.println("¡Solo Y o N!");
							} while (elegir != 'Y' && elegir != 'N');
							
							if (elegir == 'N')
								caballo = '0';
							
							break;
					}
				//Mientras no haya elegido un caballo
				} while (caballo != '1' && caballo != '2' && caballo != '3');
				
				
				//Leer y validar dinero apostado
				System.out.println("¿Cuánto dinero deseas apostar?");
				do
				{
					apuesta = teclado.nextInt();
					if (apuesta > dinero)
						System.out.println("\n¡No tienes tanto dinero!");
					if (apuesta <= 0)
						System.out.println("\n¡No puedes apostar tan poco!");
				} while ((apuesta > dinero) || (apuesta <= 0));
				
				//Calcular caballo ganador
				quickfix = (Math.random()*100)+10; //Quick-Fix tiene un 10% más de posibilidades de ganar
				tomislav = Math.random()*100;
				letranger = Math.random()*100;
				
				if (quickfix > tomislav)
					ganador = '1';
				else
					if (tomislav > letranger)
						ganador = '2';
					else
						ganador = '3';
				
				//Si gana
				if (caballo == ganador)
				{
					dinero = dinero + apuesta;
					System.out.println("¡Has ganado! Ahora cuentas con: "+dinero+" leuros");
				}
				else
				{
					dinero = dinero - apuesta;
					System.out.println("¡Has perdido! Te has quedado con: "+dinero+" leuros");
				}
			}
			//Fin (Mientras tenga dinero con el que apostar)
			
			//Mostrar mensaje de haber perdido
			System.out.println("¡Te has quedado sin dinero! ¡A la calle!");
			
			//Leer y validar si desea ejecutar de nuevo el programa
			do
			{
				System.out.println("¿Quieres ejecutar de nuevo el programa? (Y / N)");
				bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
				if (bucleinicio != 'Y' && bucleinicio != 'N')
					System.out.println("¡Solo Y o N!");
			} while (bucleinicio != 'Y' && bucleinicio != 'N');
		}
		//Fin (Mientras el usuario quiera)
	}
}
