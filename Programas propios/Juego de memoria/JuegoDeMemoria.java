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
 * 			CartasRandom
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
		char cartaSimbolo1 = '1';
		char cartaSimbolo2 = '1';
		char cartaSimbolo3 = '1';
		char cartaSimbolo4 = '1';
		char cartaSimbolo5 = '1';
		char cartaSimbolo6 = '1';
		char cartaSimbolo7 = '1';
		char cartaSimbolo8 = '1';
		char cartaSimbolo9 = '1';
		char cartaSimbolo10 = '1';
		char cartaSimbolo11 = '1';
		char cartaSimbolo12 = '1';
		
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
		
		Resguardos.CartasPantalla(cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1, cartaSimbolo1, cartaDescubierta1);
	}
}
		
		
		
		
		
		
		
		
