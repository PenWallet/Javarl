/* Nombre del programa: JuegoDeMemoria
 * Descripci�n: Juego de cartas en el que el jugador deber� elegir dos al azar hasta que 
 * 
 * An�lisis:
 * - Al principio de cada partida, se elegir�n al azar la posici�n de todas las cartas. Habr� 12 cartas
 * en total. Cada n�mero del 1 al 12 tendr� asignado un valor de una carta, as� como su estado (descubierta o no)
 * El estado de la carta pasar� a descubierto cuando se haya encontrado la pareja correspondiente
 * De otra forma, no estar� descubierta, y tendr� el estado de descubierto temporalmente mientras el jugador
 * elige la segunda carta que dar la vuelta
 * 
 * - El jugador podr� elegir 2 por cada turno. Si falla 3 veces seguidas, pierde la partida.
 * 
 * - Los s�mbolos ser�n: A, B, C, D, E, F
 * 
 * - A cada carta se le asignar� un s�mbolo al azar
 * 
 * Entradas:
 * - N�mero 1 al 12
 * - Car�cter Y o N
 * 
 * Salidas:
 * - Cartas en pantalla
 * - Mensaje de Victoria o Derrota
 * 
 * Requisitos:
 * - El n�mero solo puede ser un n�mero entero del 1 al 12, siendo cada n�mero una carta distinta
 * - El car�cter solo podr� ser Y o N
*/

/* Pseudoc�digo Generalizado:
 * 	Inicio
 * 		Repetir
 * 			Cartas random
 * 			CartasPantalla *
 * 			Repetir
 * 				Leer y validar selecci�n de primera carta
 * 				CartasPantalla *
 * 				Leer y validar selecci�n de primera carta
 * 				CartasPantalla *
 * 				Si ambas son iguales
 * 					Resetear contador de errores
 * 					Fijar valores de cartas descubiertas
 * 					Sumar punto
 * 				Si no
 *					Agregar en 1 el contador de errores
 * 					Resetear 
 * 				Fin SI
 * 			Mientras (contadorErrores < 3)
 * 			Leer y validar si desea volver a jugar
 * 		Mientras desee jugar
 * 	Fin
 * 
 * //Pseudoc�digo espec�fico de //Cartas random
 * Inicio
 * 	Generar n�mero al azar del 1 al 12
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
		
		boolean cartaSimbolo1Asignado = false;
		boolean cartaSimbolo2Asignado = false;
		boolean cartaSimbolo3Asignado = false;
		boolean cartaSimbolo4Asignado = false;
		boolean cartaSimbolo5Asignado = false;
		boolean cartaSimbolo6Asignado = false;
		boolean cartaSimbolo7Asignado = false;
		boolean cartaSimbolo8Asignado = false;
		boolean cartaSimbolo9Asignado = false;
		boolean cartaSimbolo10Asignado = false;
		boolean cartaSimbolo11Asignado = false;
		boolean cartaSimbolo12Asignado = false;
		
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
		
		
		
		Funciones.CartasPantalla
		(
		cartaSimbolo1, cartaDescubierta1,
		cartaSimbolo2, cartaDescubierta2,
		cartaSimbolo3, cartaDescubierta3,
		cartaSimbolo4, cartaDescubierta4,
		cartaSimbolo5, cartaDescubierta5,
		cartaSimbolo6, cartaDescubierta6,
		cartaSimbolo7, cartaDescubierta7,
		cartaSimbolo8, cartaDescubierta8,
		cartaSimbolo9, cartaDescubierta9,
		cartaSimbolo10, cartaDescubierta10,
		cartaSimbolo11, cartaDescubierta11,
		cartaSimbolo12, cartaDescubierta12);
	}
}
		
		
		
		
		
		
		
		
