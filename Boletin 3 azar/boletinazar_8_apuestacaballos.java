/* Nombre del programa: boletinazar_8_apuestacaballos
 * 
 * Análisis:
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
 * - Cantidad de dinero inicial
 * - Caballo al que apostará
 * 
 * Salida:
 * - Mensaje si ha ganado o perdido
 * - Cantidad de dinero restante
 * 
 * Requisitos:
 * - El carácter de entrada debe ser Y o N
 * - El dinero solo puede ser entre 1 y 1000, incluídos
 * - El caballo por el que se apuesta será un carácter,
 * y sólo tendrá en cuenta '1', '2' o '3'.
*/



/* Estudio de los bucles:
 * 
 * ----------------------------------
 * 
 * (Mientras tenga dinero con el que apostar y quiera apostar)
 * Tipo VCB: Acumulador y centinela
 * Inicialización VCB Acumulador Lectura antes del bucle en (Leer y validar cantidad de dinero inicial)
 * Actualización VCB Acumulador: Lectura al final del bucle en (Calcular caballo ganador)
 * Inicialización VCB Centinela: Lectura antes del bucle en (Leer y validar si quiere apostar)
 * Actualización VCB Centinela: Lectura al final del bucle en ("Leer y validar si desea apostar de nuevo)
 * Condición de salida: (apostarYoN == 'N' && dinero > 0) || (apostarYoN == 'Y' && dinero == 0)
 * 
 * ----------------------------------
 * 
 * (Repetir ... Mientras no haya elegido un caballo)
 * Tipo VCB: Centinela
 * Inicialización VCB: Lectura al principio del bucle en (Leer y validar selección de caballo)
 * Actualización VCB: Lectura dentro del bucle dentro de cada caso del switch
 * Condición de salida: VCB == '1' ó VCB == '2' ó VCB == '3'
 * 
 * ----------------------------------
 */
 
 

/* Pseudocódigo generalizado:
 * 	Inicio
 * 		Declarar variables
 * 		Leer y validar cantidad de dinero inicial
 * 		Leer y validar si quiere apostar
 *		Mientras tenga dinero con el que apostar y quiera apostar
 * 			Repetir
 * 				Mostrar menú
 * 				Leer y validar selección de caballo
 * 				Según caballo
 * 					Caballo 1: Mostrar información y leer y validar si desea elegirlo
 * 					Caballo 2: Mostrar información y leer y validar si desea elegirlo
 * 					Caballo 3: Mostrar información y leer y validar si desea elegirlo
 * 				Fin (Según caballo)
 * 			Mientras no haya elegido un caballo
 * 			Leer y validar dinero apostado
 * 			Calcular caballo ganador
 *			Según ganador (Calcular posición de pole)
 * 				Ganador 1: Calcular segunda y tercera posición e imprimir en pantalla resultados
 * 				Ganador 2: Calcular segunda y tercera posición e imprimir en pantalla resultados
 * 				Ganador 3: Calcular segunda y tercera posición e imprimir en pantalla resultados
 * 			Fin (Según ganador)
 * 			Mostrar mensaje ganador/perdedor
 * 			Leer y validar si desea apostar de nuevo
 * 		Fin (Mientras tenga dinero con el que apostar y quiera apostar)
 * 		Imprimir mensaje final
 * 	Fin
*/ 


import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class boletinazar_8_apuestacaballos
{	
	public static void main (String[] args) 
	{
		//Declarar variables
		char apostarYoN = 'Y';
		char caballo = '0';
		char elegir;
		char ganador;
		
		double letranger;
		double quickfix;
		double tomislav;
		
		int apuesta;
		int dinero;
		
		Scanner teclado = new Scanner (System.in);
	
		//Leer y validar cantidad de dinero inicial
		System.out.println("¿Con cuánto dinero vienes?");
		System.out.println("Introduce una cantidad mayor que 0 y menor o igual a 1000");
		do
		{
			dinero = teclado.nextInt();
			if (dinero <= 0 || dinero > 1000)
				System.out.println("\n¡Solo entre 1 y 1000!");
		} while (dinero <= 0 || dinero > 1000);
		
		//Leer y validar si quiere apostar
		do
		{
			System.out.println("¿Deseas apostar? (Y / N)");
			apostarYoN = Character.toUpperCase(teclado.next().charAt(0));
			if (apostarYoN != 'Y' && apostarYoN != 'N')
				System.out.println("¡Solo Y o N!");
		} while (apostarYoN != 'Y' && apostarYoN != 'N');
			
		
		//Mientras tenga dinero con el que apostar y quiera apostar
		while (dinero > 0 && apostarYoN == 'Y')
		{
			//Repetir
			do
			{
				//Mostrar menú
				System.out.println("\nEstos son los caballos:");
				System.out.println("1. Quick-Fix");
				System.out.println("2. Tomislav");
				System.out.println("3. L'étranger");
				System.out.println("\nElige uno para ver su descripción");
				
				//Leer y validar selección de caballo
				do
				{
					caballo = teclado.next().charAt(0);
					if (caballo != '1' && caballo != '2' && caballo != '3')
						System.out.println("¡Solo 1, 2 o 3!");
				}while (caballo != '1' && caballo != '2' && caballo != '3');
				
				//Según caballo
				switch (caballo)
				{
					//Caballo 1: Mostrar información y leer y validar si desea elegirlo
					case '1':
						System.out.println("\nDescripción de Quick-Fix:");
						System.out.println("\nCriado en Stuttgart, Alemania, durante una época en la que los caballos");
						System.out.println("tenían más derechos que las personas.");
						System.out.println("Es imparable, rápido, atropella a quien sea, donde sea y porque sea.");
						System.out.println("Lo que le falta en herraduras e higiene, lo compensa en velocidad.");
						
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
						System.out.println("\nDescripción de Tomislav:");
						System.out.println("\nNacido en la antigua URSS, criado con cariño de látigo.");
						System.out.println("El más feroz de todos los caballos que vas a ver por aquí.");
						System.out.println("Parece que es capaz de entender que está en una carrera, y si hace falta");
						System.out.println("empujar y tirar a alguien, se hace. Sin preguntas.");
						
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
					
			//Según ganador (Calcular posición de pole)
			switch (ganador)
			{
				//Ganador 1: Calcular segunda y tercera posición e imprimir en pantalla resultados
				case '1':
					System.out.println("\nEn primer puesto: Quick-Fix");
					if (tomislav > letranger)
					{
						System.out.println("En segundo puesto: Tomislav");
						System.out.println("En tercer puesto: L'étranger");
					}
					else
					{
						System.out.println("En segundo puesto: L'étranger");
						System.out.println("En tercer puesto: Tomislav");
					}
				break;
				
				//Ganador 2: Calcular segunda y tercera posición e imprimir en pantalla resultados
				case '2':
					System.out.println("\nEn primer puesto: Tomislav");
					if (quickfix > letranger)
					{
						System.out.println("En segundo puesto: Quick-Fix");
						System.out.println("En tercer puesto: L'étranger");
					}
					else
					{
						System.out.println("En segundo puesto: L'étranger");
						System.out.println("En tercer puesto: Quick-Fix");
					}
				break;
				
				//Ganador 3: Calcular segunda y tercera posición e imprimir en pantalla resultados
				case '3':
					System.out.println("\nEn primer puesto: L'etranger");
					if (quickfix > tomislav)
					{
						System.out.println("En segundo puesto: Quick-Fix");
						System.out.println("En tercer puesto: Tomislav");
					}
					else
					{
						System.out.println("En segundo puesto: Tomislav");
						System.out.println("En tercer puesto: Quick-Fix");
					}
				break;
			}
			//Fin (Según ganador)
						
					
			
			//Calcular si ha ganado o no
			if (caballo == ganador) //Si gana (el caballo elegido es el que ha ganado)
			{
				dinero = dinero + apuesta;
				System.out.println("\n¡Has ganado! Ahora cuentas con: "+dinero+" leuros");
			}
			else // Si no (el caballo elegido no es el ganador)
			{
				dinero = dinero - apuesta;
				System.out.println("\n¡Has perdido! Te quedan: "+dinero+" leuros");
			}
			
			if (dinero > 0) //Si el dinero es 0, no hace falta preguntar, ya ha perdido
			{
				do
				{
					System.out.println("¿Deseas apostar de nuevo? (Y / N)");
					apostarYoN = Character.toUpperCase(teclado.next().charAt(0));
					if (apostarYoN != 'Y' && apostarYoN != 'N')
						System.out.println("¡Solo Y o N!");
				} while (apostarYoN != 'Y' && apostarYoN != 'N');
			}		
		}
		//Fin (Mientras tenga dinero con el que apostar y quiera apostar de nuevo)
		
		//Mensaje final
		if (dinero == 0)
			System.out.println("\n¡A la calle, pobretón!");
		else
			System.out.println("\nVuelve cuando quieras y déjate todo el dinero pls :D");
	}
}
