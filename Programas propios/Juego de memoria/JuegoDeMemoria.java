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
 * 		Men� * y leer y validar opci�n
 * 		Seg�n (opcion)
 * 			caso '1':
 * 				//En construcci�n
 * 				Men� *
 * 				Leer y validar opci�n de men�
 * 		
 * 			caso '2':
 * 				Leer nombre primer jugador
 * 				Leer nombre segundo jugador
 * 				Cartas random
 * 				Repetir
 * 					Mensaje jugador
 * 					CartasPantalla *
 * 					Leer y validar selecci�n //Primera carta
 * 					CartasPantalla *
 * 					Leer y validar selecci�n //Segunda carta
 * 					CartasPantalla *
 * 					Si ambas son iguales
 * 						Resetear contador de errores
 * 						Fijar valores de cartas descubiertas
 * 						Sumar punto al jugador correcto
 * 					Si no
 * 						Resetear cartas elegidas
 * 					Fin SI
 * 				Mientras (
 * 				Leer y validar si desea volver a jugar
 * 	Fin
 * 
 * //Pseudoc�digos espec�ficos
 * 
 * //Cartas random
 * Inicio
 * 	//Primera carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la primera carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 	
 * 	//Segunda carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la segunda carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 	
 * 	//Tercera carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la tercera carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 
 * 	//Cuarta carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la cuarta carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 
 * 	//Quinta carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la quinta carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 
 * 	//Sexta carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la sexta carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 
 * 	//S�ptima carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la s�ptima carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 
 * 	//Octava carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la octava carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 
 * 	//Novena carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la novena carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 
 * 	//D�cima carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la d�cima carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 
 * 	//Und�cima carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la und�cima carta
 * 	Aumentar en 1 el contador del s�mbolo que haya salido
 * 
 * 	//Duod�cima carta
 * 	CartasRandom *
 * 	Asignar s�mbolo a la duod�cima carta
 * 
 * 
 * //Aumentar en 1 el contador del s�mbolo que haya salido
 * 	Seg�n (s�mbolo)
 * 		caso 'A': Aumentar en 1 el contador A
 * 		caso 'B': Aumentar en 1 el contador B
 * 		caso 'C': Aumentar en 1 el contador C
 * 		caso 'D': Aumentar en 1 el contador D
 * 		caso 'E': Aumentar en 1 el contador E
 * 		caso 'F': Aumentar en 1 el contador F
 * 	Fin Seg�n
 * 
 * 
 * //Leer y validar selecci�n de carta
 * 	Inicio
 * 		Seg�n
 * 			caso 1:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 2:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 3:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 4:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 5:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 6:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 7:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 8:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 9:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 10:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 11:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
 * 
 * 			caso 12:
 * 				Si la primera carta ya ha sido descubierta
 * 					Mensaje error
 * 					Cambiar variable de error a true
 * 				Sino
 * 					Darle la vuelta a la carta temporalmente
 * 				Fin_Si
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
		char opcion;
		char eleccion1 = 0;
		char eleccion2;
		
		byte seleccion;
		
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
		boolean cartaYaDescubierta = false;
		boolean turnoPrimerJugador = true;
		
		String nombre1;
		String nombre2;
		
		//Presentar men�, leer y validar opci�n
		do
		{
			Funciones.Menu();
			opcion = teclado.next().charAt(0);
			if (opcion != '1' && opcion != '2')
				System.out.println("�Solo 1 o 2!");
		}while (opcion != '1' && opcion != '2');
		
		switch(opcion)
		{
			case '1':
				System.out.println("En construcci�n, sorry");
			
			case '2':
				//Leer nombre del primer jugador
				System.out.println("Introduce el nombre del primer jugador");
				nombre1 = teclado.nextLine();
				
				System.out.println("Introduce el nombre del segundo jugador");
				nombre2 = teclado.nextLine();
				
				
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
				
				//S�ptima carta
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
				
				//D�cima carta
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
				
				//Und�cima carta
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
				
				//Duod�cima carta
				cartaSimbolo12 = Funciones.CartasRandom(contA, contB, contC, contD, contE, contF);
				
				do
				{
					//Mensaje jugador
					if (turnoPrimerJugador)
						System.out.println("Es el turno de "+nombre1);
					else
						System.out.println("Es el turno de "+nombre2);
					
					Funciones.CartasPantalla(cartaSimbolo1, cartaDescubierta1, cartaSimbolo2, cartaDescubierta2, cartaSimbolo3, cartaDescubierta3, cartaSimbolo4, cartaDescubierta4, cartaSimbolo5, cartaDescubierta5, cartaSimbolo6, cartaDescubierta6, cartaSimbolo7, cartaDescubierta7, cartaSimbolo8, cartaDescubierta8, cartaSimbolo9, cartaDescubierta9, cartaSimbolo10, cartaDescubierta10, cartaSimbolo11, cartaDescubierta11, cartaSimbolo12, cartaDescubierta12);
					
					//Leer y validar primera carta
					do
					{
						cartaYaDescubierta = false;
						System.out.println("\nElige la primera carta (1-12)");
						seleccion = teclado.nextByte();
						switch (seleccion)
						{
							case 1:
								eleccion1 = cartaSimbolo1;
								if (cartaDescubierta1)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta1 = true;
								
								break;
								
							case 2:
								eleccion1 = cartaSimbolo2;
								if (cartaDescubierta2)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta2 = true;
								
								break;							
								
							case 3:
								eleccion1 = cartaSimbolo3;
								if (cartaDescubierta3)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta3 = true;
								
								break;
								
							case 4:
								eleccion1 = cartaSimbolo4;
								if (cartaDescubierta4)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta4 = true;
								
								break;
								
							case 5:
								eleccion1 = cartaSimbolo5;
								if (cartaDescubierta5)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta5 = true;
								
								break;
								
							case 6:
								eleccion1 = cartaSimbolo6;
								if (cartaDescubierta6)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta6 = true;
								
								break;
								
							case 7:
								eleccion1 = cartaSimbolo7;
								if (cartaDescubierta7)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta7 = true;
								
								break;
								
							case 8:
								eleccion1 = cartaSimbolo8;
								if (cartaDescubierta8)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta8 = true;
								
								break;
								
							case 9:
								eleccion1 = cartaSimbolo9;
								if (cartaDescubierta9)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta9 = true;
								
								break;
								
							case 10:
								eleccion1 = cartaSimbolo10;
								if (cartaDescubierta10)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta10 = true;
								
								break;
								
							case 11:
								eleccion1 = cartaSimbolo11;
								if (cartaDescubierta11)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta11 = true;
								
								break;
								
							case 12:
								eleccion1 = cartaSimbolo12;
								if (cartaDescubierta12)
								{
									System.out.println("�Esa carta ya est� dada la vuelta!");
									cartaYaDescubierta = true;
								}
								else
									cartaDescubierta12 = true;
								
								break;
						
						}
					}while (cartaYaDescubierta && (eleccion1 < 1 || eleccion1 > 12));
								
								
						
					
					
					
					Funciones.CartasPantalla(cartaSimbolo1, cartaDescubierta1, cartaSimbolo2, cartaDescubierta2, cartaSimbolo3, cartaDescubierta3, cartaSimbolo4, cartaDescubierta4, cartaSimbolo5, cartaDescubierta5, cartaSimbolo6, cartaDescubierta6, cartaSimbolo7, cartaDescubierta7, cartaSimbolo8, cartaDescubierta8, cartaSimbolo9, cartaDescubierta9, cartaSimbolo10, cartaDescubierta10, cartaSimbolo11, cartaDescubierta11, cartaSimbolo12, cartaDescubierta12);
					Funciones.CartasPantalla(cartaSimbolo1, cartaDescubierta1, cartaSimbolo2, cartaDescubierta2, cartaSimbolo3, cartaDescubierta3, cartaSimbolo4, cartaDescubierta4, cartaSimbolo5, cartaDescubierta5, cartaSimbolo6, cartaDescubierta6, cartaSimbolo7, cartaDescubierta7, cartaSimbolo8, cartaDescubierta8, cartaSimbolo9, cartaDescubierta9, cartaSimbolo10, cartaDescubierta10, cartaSimbolo11, cartaDescubierta11, cartaSimbolo12, cartaDescubierta12);
					
				}while(opcion == 2);
					
		}
	}
}
		
		
		
		
		
		
		
		
