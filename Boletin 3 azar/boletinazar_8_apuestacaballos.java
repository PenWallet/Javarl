/* Nombre del programa: boletinazar_8_apuestacaballos
 * 
 * An�lisis:
 * Programa que simular� una carrera de caballo, en la que cada uno de
 * ellos tendr� una posibilidad al azar de ganar.
 * 
 * Esto se har� mediante la funci�n est�tica Random de Math.
 * Generaremos un n�mero del 0 al 100, y el caballo que saque el n�mero
 * mayor, ganar�.
 * Quick-Fix tendr� un 10% m�s de probabilidades de ganar
 * 
 * Permitiremos al usuario hacer apuestas de igual forma usando el
 * dinero que �l mismo se asignar� antes de empezar.
 * 
 * Entrada:
 * - Car�cter indicador de si desea ejecutar el programa o no
 * - Cantidad de dinero inicial
 * - Caballo al que apostar�
 * 
 * Salida:
 * - Mensaje si ha ganado o perdido
 * - Cantidad de dinero restante
 * 
 * Requisitos:
 * - El car�cter de entrada debe ser Y o N
 * - El dinero solo puede ser entre 1 y 1000, inclu�dos
 * - El caballo por el que se apuesta ser� un car�cter,
 * y s�lo tendr� en cuenta '1', '2' o '3'.
*/



/* Estudio de los bucles:
 * 
 * ----------------------------------
 * 
 * (Mientras el usuario quiera jugar)
 * Tipo VCB: Centinela
 * Inicializaci�n VCB: Lectura antes de la primera iteraci�n
 * Actualizaci�n VCB: Lectura al final del bucle
 * Condici�n de salida: VCB == 'Y' � VCB == 'N'
 * 
 * ----------------------------------
 * 
 * (Mientras el usuario tenga dinero)
 * Tipo VCB: Centinela
 * Inicializaci�n VCB: Lectura antes de la primera iteraci�n
 * Actualizaci�n VCB: Lectura al final del bucle
 * Condici�n de salida: VCB == 0
 * 
 * ----------------------------------
 * 
 * (Repetir ... Mientras no haya elegido un caballo)
 * Tipo VCB: Centinela
 * Inicializaci�n VCB: Lectura dentro del bucle, tras (Mostrar men�)
 * Actualizaci�n VCB: Lectura al final del bucle
 * Condici�n de salida: VCB == '1' � VCB == '2' � VCB == '3'
 * 
 * ----------------------------------
 */
 
 

/* Pseudoc�digo generalizado:
 * 	Inicio
 * 		Declarar variables
 * 		Leer y validar cantidad de dinero inicial
 * 		Leer y validar si quiere apostar
 *		Mientras tenga dinero con el que apostar y quiera apostar
 * 			Repetir
 * 				Mostrar men�
 * 				Leer y validar selecci�n de caballo
 * 				Seg�n caballo
 * 					Caballo 1: Mostrar informaci�n y leer y validar si desea elegirlo
 * 					Caballo 2: Mostrar informaci�n y leer y validar si desea elegirlo
 * 					Caballo 3: Mostrar informaci�n y leer y validar si desea elegirlo
 * 			Mientras no haya elegido un caballo
 * 			Leer y validar dinero apostado
 * 			Calcular caballo ganador
 * 			Mostrar mensaje ganador/perdedor
 * 			Leer y validar si desea apostar de nuevo
 * 		Fin (Mientras tenga dinero con el que apostar y quiera apostar)
 * 		Imprimit mensaje final
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
		char apostaryon = 'Y';
		int dinero;
		char elegir;
		int apuesta;
		double quickfix;
		double tomislav;
		double letranger;
		char ganador;
		char caballo = '0';
		Scanner teclado = new Scanner (System.in);
	
		//Leer y validar cantidad de dinero inicial
		System.out.println("�Con cu�nto dinero vienes?");
		System.out.println("Introduce una cantidad mayor que 0 y menor o igual a 1000");
		do
		{
			dinero = teclado.nextInt();
			if (dinero <= 0 || dinero > 1000)
				System.out.println("\n�Solo entre 1 y 1000!");
		} while (dinero <= 0 || dinero > 1000);
		
		do
		{
			System.out.println("�Deseas apostar? (Y / N)");
			apostaryon = Character.toUpperCase(teclado.next().charAt(0));
			if (apostaryon != 'Y' && apostaryon != 'N')
				System.out.println("�Solo Y o N!");
		} while (apostaryon != 'Y' && apostaryon != 'N');
			
		
		//Mientras tenga dinero con el que apostar y quiera apostar
		while (dinero > 0 && apostaryon == 'Y')
		{
			//Repetir
			do
			{
				//Mostrar men�
				System.out.println("\nEstos son los caballos:");
				System.out.println("1. Quick-Fix");
				System.out.println("2. Tomislav");
				System.out.println("3. L'�tranger");
				System.out.println("\nElige uno para ver su descripci�n");
				caballo = teclado.next().charAt(0);
				
				//Leer y validar selecci�n de caballo
				while (caballo != '1' && caballo != '2' && caballo != '3')
				{
					System.out.println("�Solo 1, 2 o 3!");
					caballo = teclado.next().charAt(0);
				}
				
				//Seg�n caballo
				switch (caballo)
				{
					//Caballo 1: Mostrar informaci�n y leer y validar si desea elegirlo
					case '1':
						System.out.println("\nDescripci�n de Quick-Fix:");
						System.out.println("\nImparable, r�pido, atropella a quien sea, donde sea y porque sea.");
						System.out.println("Lo que le falta en herraduras e higiene, lo compensa en velocidad.");
						System.out.println("Criado en Stuttgart, Alemania, durante una �poca en la que los caballos");
						System.out.println("ten�an m�s derechos que las personas.");
						
						System.out.println("\n�Quieres elegir este caballo? (Y / N)");
						do
						{
							elegir = Character.toUpperCase(teclado.next().charAt(0));
							if (elegir != 'Y' && elegir != 'N')
								System.out.println("�Solo Y o N!");
						} while (elegir != 'Y' && elegir != 'N');
						
						if (elegir == 'N')
							caballo = '0';
						
						break;
					
					//Caballo 2: Mostrar informaci�n y leer y validar si desea elegirlo
					case '2':
						System.out.println("\nDescripci�n de Tomislav:");
						System.out.println("\nNacido en la antigua USSR, criado con cari�o de l�tigo.");
						System.out.println("El m�s feroz de todos los caballos que vas a ver por aqu�.");
						System.out.println("Parece que es capaz de entender que est� en una carrera, y si hace falta");
						System.out.println("tirar a alguien, se hace. Sin preguntas.");
						
						System.out.println("\n�Quieres elegir este caballo? (Y / N)");
						do
						{
							elegir = Character.toUpperCase(teclado.next().charAt(0));
							if (elegir != 'Y' && elegir != 'N')
								System.out.println("�Solo Y o N!");
						} while (elegir != 'Y' && elegir != 'N');
						
						if (elegir == 'N')
							caballo = '0';
						
						break;
						
					//Caballo 3: Mostrar informaci�n y leer y validar si desea elegirlo
					case '3':
						System.out.println("\nDescripci�n de L'�tranger:");
						System.out.println("\nNacido en Francia. No se sabe en qu� regi�n.");
						System.out.println("Usa el sigilo, y es capaz de camuflarse entre los dem�s caballos.");
						System.out.println("Es capaz de ver la energ�a que le queda a los dem�s caballos.");
						System.out.println("No es el m�s r�pido, pero es el m�s inteligente. Puede sumar con sus pezu�as.");
						
						System.out.println("\n�Quieres elegir este caballo? (Y / N)");
						do
						{
							elegir = Character.toUpperCase(teclado.next().charAt(0));
							if (elegir != 'Y' && elegir != 'N')
								System.out.println("�Solo Y o N!");
						} while (elegir != 'Y' && elegir != 'N');
						
						if (elegir == 'N')
							caballo = '0';
						
						break;
				}
			//Mientras no haya elegido un caballo
			} while (caballo != '1' && caballo != '2' && caballo != '3');
			
			
			//Leer y validar dinero apostado
			System.out.println("�Cu�nto dinero deseas apostar?");
			do
			{
				apuesta = teclado.nextInt();
				if (apuesta > dinero)
					System.out.println("\n�No tienes tanto dinero!");
				if (apuesta <= 0)
					System.out.println("\n�No puedes apostar tan poco!");
			} while ((apuesta > dinero) || (apuesta <= 0));
			
			//Calcular caballo ganador
			quickfix = (Math.random()*100)+10; //Quick-Fix tiene un 10% m�s de posibilidades de ganar
			tomislav = Math.random()*100;
			letranger = Math.random()*100;
			
			if (quickfix > tomislav)
				ganador = '1';
			else
				if (tomislav > letranger)
					ganador = '2';
				else
					ganador = '3';
					
			
			//Calcular si ha ganado o no
			if (caballo == ganador) //Si gana (el caballo elegido es el que ha ganado)
			{
				dinero = dinero + apuesta;
				System.out.println("�Has ganado! Ahora cuentas con: "+dinero+" leuros");
			}
			else // Si no (el caballo elegido no es el ganador)
			{
				dinero = dinero - apuesta;
				System.out.println("�Has perdido! Te has quedado con: "+dinero+" leuros");
			}
			
			if (dinero > 0) //Si el dinero es 0, no hace falta preguntar, ya ha perdido
			{
				do
				{
					System.out.println("�Deseas apostar de nuevo? (Y / N)");
					apostaryon = Character.toUpperCase(teclado.next().charAt(0));
					if (apostaryon != 'Y' && apostaryon != 'N')
						System.out.println("�Solo Y o N!");
				} while (apostaryon != 'Y' && apostaryon != 'N');
			}		
		}
		//Fin (Mientras tenga dinero con el que apostar y quiera apostar de nuevo)
		
		//Mensaje final
		if (dinero == 0)
			System.out.println("\n�A la calle, pobret�n!");
		else
			System.out.println("\nVuelve cuando quieras y d�jate todo el dinero pls");
		
		
	}
}
