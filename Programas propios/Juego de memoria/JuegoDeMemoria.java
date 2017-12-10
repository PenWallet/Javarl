/* Nombre del programa: JuegoDeMemoria
 * Descripción: Juego de cartas en el que el jugador deberá elegir dos al azar hasta que 
 * 
 * Análisis:
 * - Al principio de cada partida, se elegirán al azar la posición de todas las cartas. Habrá 12 cartas
 * en total. Cada número del 1 al 12 tendrá asignado un valor de una carta, así como su estado (descubierta o no)
 * El estado de la carta pasará a descubierto cuando se haya encontrado la pareja correspondiente
 * De otra forma, no estará descubierta, y tendrá el estado de descubierto temporalmente mientras el jugador
 * elige la segunda carta que dar la vuelta
 * 
 * - El jugador podrá elegir 2 por cada turno. Si falla 3 veces seguidas, pierde la partida.
 * 
 * - Los símbolos serán: A, B, C, D, E, F
 * 
 * - A cada carta se le asignará un símbolo al azar
 * 
 * Entradas:
 * - Número 1 al 12
 * - Carácter Y o N
 * 
 * Salidas:
 * - Cartas en pantalla
 * - Mensaje de Victoria o Derrota
 * 
 * Requisitos:
 * - El número solo puede ser un número entero del 1 al 12, siendo cada número una carta distinta
 * - El carácter solo podrá ser Y o N
*/

/* Pseudocódigo Generalizado:
 * 	Inicio
 * 		Menú *
 * 		Leer y validar opción de menú
 * 		Repetir
 * 			//En construcción
 * 			Menú *
 * 			Leer y validar opción de menú
 * 		Mientras (1 jugador)
 * 		
 * 		Repetir
 * 			Leer nombre primer jugador
 * 			Leer nombre segundo jugador
 * 			Cartas random
 * 			Repetir
 * 				CartasPantalla *
 * 				Leer y validar selección de primera carta
 * 				CartasPantalla *
 * 				Leer y validar selección de segunda carta
 * 				CartasPantalla *
 * 				Si ambas son iguales
 * 					Resetear contador de errores
 * 					Fijar valores de cartas descubiertas
 * 					Sumar punto
 * 				Si no
 *					Agregar en 1 el contador de errores
 * 					Resetear 
 * 				Fin SI
 * 			Leer y validar si desea volver a jugar
 * 		Mientras (2 jugadores)
 * 	Fin
 * 
 * //Pseudocódigos específicos
 * 
 * //Cartas random
 * Inicio
 * 	//Primera carta
 * 	CartasRandom *
 * 	Asignar símbolo a la primera carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 	
 * 	//Segunda carta
 * 	CartasRandom *
 * 	Asignar símbolo a la segunda carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 	
 * 	//Tercera carta
 * 	CartasRandom *
 * 	Asignar símbolo a la tercera carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 
 * 	//Cuarta carta
 * 	CartasRandom *
 * 	Asignar símbolo a la cuarta carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 
 * 	//Quinta carta
 * 	CartasRandom *
 * 	Asignar símbolo a la quinta carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 
 * 	//Sexta carta
 * 	CartasRandom *
 * 	Asignar símbolo a la sexta carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 
 * 	//Séptima carta
 * 	CartasRandom *
 * 	Asignar símbolo a la séptima carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 
 * 	//Octava carta
 * 	CartasRandom *
 * 	Asignar símbolo a la octava carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 
 * 	//Novena carta
 * 	CartasRandom *
 * 	Asignar símbolo a la novena carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 
 * 	//Décima carta
 * 	CartasRandom *
 * 	Asignar símbolo a la décima carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 
 * 	//Undécima carta
 * 	CartasRandom *
 * 	Asignar símbolo a la undécima carta
 * 	Aumentar en 1 el contador del símbolo que haya salido
 * 
 * 	//Duodécima carta
 * 	CartasRandom *
 * 	Asignar símbolo a la duodécima carta
 * 
 * 
 * //Aumentar en 1 el contador del símbolo que haya salido
 * 	Según (símbolo)
 * 		caso 'A': Aumentar en 1 el contador A
 * 		caso 'B': Aumentar en 1 el contador B
 * 		caso 'C': Aumentar en 1 el contador C
 * 		caso 'D': Aumentar en 1 el contador D
 * 		caso 'E': Aumentar en 1 el contador E
 * 		caso 'F': Aumentar en 1 el contador F
 * 	Fin Según
 * 		
 * 		
 * 	
 * 
 * 
 * 
*/

import java.util.Scanner;
import java.io.*;

public class JuegoDeMemoria
{
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);	
		char cartaSimbolo1;
		char cartaSimbolo2;
		char cartaSimbolo3;
		char cartaSimbolo4;
		char cartaSimbolo5;
		char cartaSimbolo6;
		char cartaSimbolo7;
		char cartaSimbolo8;
		char cartaSimbolo9;
		char cartaSimbolo10;
		char cartaSimbolo11;
		char cartaSimbolo12;
		
		int contA = 0;
		int contB = 0;
		int contC = 0;
		int contD = 0;
		int contE = 0;
		int contF = 0;
		
		boolean cartaDescubierta1 = false;
		boolean cartaDescubierta2 = false;
		boolean cartaDescubierta3 = false;
		boolean cartaDescubierta4 = false;
		boolean cartaDescubierta5 = false;
		boolean cartaDescubierta6 = false;
		boolean cartaDescubierta7 = false;
		boolean cartaDescubierta8 = false;
		boolean cartaDescubierta9 = false;
		boolean cartaDescubierta10 = false;
		boolean cartaDescubierta11 = false;
		boolean cartaDescubierta12 = false;
		
		//Cartas random
		//Primera carta
		cartaSimbolo1 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo1)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Segunda carta
		cartaSimbolo2 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo2)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Tercera carta
		cartaSimbolo3 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo3)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Cuarta carta
		cartaSimbolo4 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo4)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Quinta carta
		cartaSimbolo5 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo5)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Sexta carta
		cartaSimbolo6 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo6)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Séptima carta
		cartaSimbolo7 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo7)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Octava carta
		cartaSimbolo8 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo8)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Novena carta
		cartaSimbolo9 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo9)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Décima carta
		cartaSimbolo10 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo10)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Undécima carta
		cartaSimbolo11 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		switch(cartaSimbolo11)
		{
			case 'A': contA++; break;
			case 'B': contB++; break;
			case 'C': contC++; break;
			case 'D': contD++; break;
			case 'E': contE++; break;
			case 'F': contF++; break;
		}
		
		//Duodécima carta
		cartaSimbolo12 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
		
		
		
		
		
		Funciones.CartasPantalla(cartaSimbolo1, cartaDescubierta1, cartaSimbolo2, cartaDescubierta2, cartaSimbolo3, cartaDescubierta3, cartaSimbolo4, cartaDescubierta4, cartaSimbolo5, cartaDescubierta5, cartaSimbolo6, cartaDescubierta6, cartaSimbolo7, cartaDescubierta7, cartaSimbolo8, cartaDescubierta8, cartaSimbolo9, cartaDescubierta9, cartaSimbolo10, cartaDescubierta10, cartaSimbolo11, cartaDescubierta11, cartaSimbolo12, cartaDescubierta12);
		
	}
}
		
		
		
		
		
		
		
		
