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
 * - Los s�mbolos ser�n: A, B, C, D, E, F
 * 
 * - A cada carta se le asignar� un s�mbolo al azar
 * 
 * - Existe la modalidad un jugador y dos jugadores. Por ahora solo est� disponible la de dos jugadores,
 * ya que la de 1 jugador requiere de un poco de IA, y lo har� m�s adelante
 * 
 * Entradas:
 * - 1 o 2 para elegir modo de juego
 * - N�mero 1 al 12
 * 
 * Salidas:
 * - Men�
 * - Cartas en pantalla
 * - Mensaje de Victoria o Derrota
 * 
 * Requisitos:
 * - El n�mero de selecci�n en men� solo puede ser 1 o 2
 * - El n�mero solo puede ser un n�mero entero del 1 al 12, siendo cada n�mero una carta distinta
*/

/* Pseudoc�digo Generalizado:
 * 	Inicio
 * 		Men� * y leer y validar opci�n
 * 		Mientras el usuario quiera jugar
 * 			Seg�n (opcion)
 * 				caso '1':
 * 					//En construcci�n
 * 					Men� *
 * 					Leer y validar opci�n de men�
 * 			
 * 				caso '2':
 * 					Leer nombre del primer jugador
 * 					Leer nombre del segundo jugador
 * 					Cartas random
 * 					Para (parejasEncontradas = 0; parejasEncontradas < 6)
 * 						Mensaje jugador
 * 						CartasPantalla *
 * 						Leer y validar selecci�n //Primera carta
 * 						CartasPantalla *
 * 						Leer y validar selecci�n //Segunda carta
 * 						CartasPantalla *
 * 						Si ambas son iguales
 *							Aumentar en 1 el contador de parejas encontradas
 * 							Si es el turno del primer jugador
 * 								Sumar puntos al primer jugador
 * 							Sino
 *								Sumar puntos al segundo jugador
 * 						Si no
 * 							Resetear cartas elegidas
 * 							Cambiar turno
 * 						Fin SI
 *						Time *
 * 					Fin Para
 * 			Fin Seg�n
 * 			Leer y validar si desea volver a jugar
 * 		Fin Mientras
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
		Scanner teclado1 = new Scanner (System.in);
		Scanner teclado2 = new Scanner (System.in);
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
		char eleccion2 = 0;
		
		byte seleccion1;
		byte seleccion2;
		byte parejasEncontradas = 0;
		byte puntosPrimerJugador = 0;
		byte puntosSegundoJugador = 0;
		
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
		
		String nombre1 = "";
		String nombre2 = "";
		
		//Presentar men�, leer y validar opci�n
		do
		{
			Funciones.Menu();
			opcion = teclado.next().charAt(0);
			if (opcion != '1' && opcion != '2' && opcion != '0')
				System.out.println("�Solo 1, 2, o 0 para salir!");
		}while (opcion != '1' && opcion != '2' && opcion != '0');
		
		while (opcion == '1' || opcion == '2') //Mientras el usuario quiera jugar
		{
			
			switch(opcion)
			{
				case '1':
					System.out.println("\nEn construcci�n, sorry\n");
					
					break;
				
				case '2':
					//Leer nombre del primer jugador
					System.out.println("Introduce el nombre del primer jugador");
					nombre1 = teclado1.nextLine();
					
					//Leer nombre del segundo jugador
					System.out.println("Introduce el nombre del segundo jugador");
					nombre2 = teclado2.nextLine();
					
					
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
					
					for (parejasEncontradas = 0; parejasEncontradas < 6;)
					{
						//Mensaje jugador
						if (turnoPrimerJugador)
							System.out.println("\nEs el turno de "+nombre1);
						else
							System.out.println("\nEs el turno de "+nombre2);
						
						//CartasPantalla *
						Funciones.CartasPantalla(cartaSimbolo1, cartaDescubierta1, cartaSimbolo2, cartaDescubierta2, cartaSimbolo3, cartaDescubierta3, cartaSimbolo4, cartaDescubierta4, cartaSimbolo5, cartaDescubierta5, cartaSimbolo6, cartaDescubierta6, cartaSimbolo7, cartaDescubierta7, cartaSimbolo8, cartaDescubierta8, cartaSimbolo9, cartaDescubierta9, cartaSimbolo10, cartaDescubierta10, cartaSimbolo11, cartaDescubierta11, cartaSimbolo12, cartaDescubierta12);
						
						//Leer y validar selecci�n //Primera carta
						do
						{
							cartaYaDescubierta = false;
							System.out.println("\nElige la primera carta (1-12)");
							seleccion1 = teclado.nextByte();
							switch (seleccion1)
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
						}while (cartaYaDescubierta || (seleccion1 < 1 || seleccion1 > 12));
						
						//CartasPantalla *
						System.out.println("\n");
						Funciones.CartasPantalla(cartaSimbolo1, cartaDescubierta1, cartaSimbolo2, cartaDescubierta2, cartaSimbolo3, cartaDescubierta3, cartaSimbolo4, cartaDescubierta4, cartaSimbolo5, cartaDescubierta5, cartaSimbolo6, cartaDescubierta6, cartaSimbolo7, cartaDescubierta7, cartaSimbolo8, cartaDescubierta8, cartaSimbolo9, cartaDescubierta9, cartaSimbolo10, cartaDescubierta10, cartaSimbolo11, cartaDescubierta11, cartaSimbolo12, cartaDescubierta12);

						//Leer y validar selecci�n //Segunda carta
						do
						{
							cartaYaDescubierta = false;
							System.out.println("\nElige la segunda carta (1-12)");
							seleccion2 = teclado.nextByte();
							switch (seleccion2)
							{
								case 1:
									eleccion2 = cartaSimbolo1;
									if (cartaDescubierta1)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta1 = true;
									
									break;
									
								case 2:
									eleccion2 = cartaSimbolo2;
									if (cartaDescubierta2)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta2 = true;
									
									break;							
									
								case 3:
									eleccion2 = cartaSimbolo3;
									if (cartaDescubierta3)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta3 = true;
									
									break;
									
								case 4:
									eleccion2 = cartaSimbolo4;
									if (cartaDescubierta4)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta4 = true;
									
									break;
									
								case 5:
									eleccion2 = cartaSimbolo5;
									if (cartaDescubierta5)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta5 = true;
									
									break;
									
								case 6:
									eleccion2 = cartaSimbolo6;
									if (cartaDescubierta6)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta6 = true;
									
									break;
									
								case 7:
									eleccion2 = cartaSimbolo7;
									if (cartaDescubierta7)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta7 = true;
									
									break;
									
								case 8:
									eleccion2 = cartaSimbolo8;
									if (cartaDescubierta8)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta8 = true;
									
									break;
									
								case 9:
									eleccion2 = cartaSimbolo9;
									if (cartaDescubierta9)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta9 = true;
									
									break;
									
								case 10:
									eleccion2 = cartaSimbolo10;
									if (cartaDescubierta10)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta10 = true;
									
									break;
									
								case 11:
									eleccion2 = cartaSimbolo11;
									if (cartaDescubierta11)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta11 = true;
									
									break;
									
								case 12:
									eleccion2 = cartaSimbolo12;
									if (cartaDescubierta12)
									{
										System.out.println("�Esa carta ya est� dada la vuelta!");
										cartaYaDescubierta = true;
									}
									else
										cartaDescubierta12 = true;
									
									break;
							
							}
						}while (cartaYaDescubierta || (seleccion2 < 1 || seleccion2 > 12));
							
						//CartasPantalla *
						System.out.println("\n");
						Funciones.CartasPantalla(cartaSimbolo1, cartaDescubierta1, cartaSimbolo2, cartaDescubierta2, cartaSimbolo3, cartaDescubierta3, cartaSimbolo4, cartaDescubierta4, cartaSimbolo5, cartaDescubierta5, cartaSimbolo6, cartaDescubierta6, cartaSimbolo7, cartaDescubierta7, cartaSimbolo8, cartaDescubierta8, cartaSimbolo9, cartaDescubierta9, cartaSimbolo10, cartaDescubierta10, cartaSimbolo11, cartaDescubierta11, cartaSimbolo12, cartaDescubierta12);
						
						if (eleccion1 == eleccion2) //Si ambas cartas son iguales
						{
							//Aumentar en 1 el contador de parejas encontradas
							parejasEncontradas++;
							
							if (turnoPrimerJugador) //Si es el turno del primer jugador
								//Sumar puntos al primer jugador
								puntosPrimerJugador++;
							else
								//Sumar puntos al segundo jugador
								puntosSegundoJugador++;
							
							System.out.println("�Acertaste! Has ganado un punto");
							if (parejasEncontradas < 6)
								System.out.println("Te toca de nuevo");
						}
						else //Si no
						{
							//Cambiar turno
							turnoPrimerJugador = !turnoPrimerJugador;
							//Resetear cartas elegidas
							switch (seleccion1)
							{
								case 1: cartaDescubierta1 = false; break;
								case 2: cartaDescubierta2 = false; break;
								case 3: cartaDescubierta3 = false; break;
								case 4: cartaDescubierta4 = false; break;
								case 5: cartaDescubierta5 = false; break;
								case 6: cartaDescubierta6 = false; break;
								case 7: cartaDescubierta7 = false; break;
								case 8: cartaDescubierta8 = false; break;
								case 9: cartaDescubierta9 = false; break;
								case 10: cartaDescubierta10 = false; break;
								case 11: cartaDescubierta11 = false; break;
								case 12: cartaDescubierta12 = false; break;
							}
							switch (seleccion2)
							{
								case 1: cartaDescubierta1 = false; break;
								case 2: cartaDescubierta2 = false; break;
								case 3: cartaDescubierta3 = false; break;
								case 4: cartaDescubierta4 = false; break;
								case 5: cartaDescubierta5 = false; break;
								case 6: cartaDescubierta6 = false; break;
								case 7: cartaDescubierta7 = false; break;
								case 8: cartaDescubierta8 = false; break;
								case 9: cartaDescubierta9 = false; break;
								case 10: cartaDescubierta10 = false; break;
								case 11: cartaDescubierta11 = false; break;
								case 12: cartaDescubierta12 = false; break;
							}
						}
						//Time *
						Funciones.Time();
					}
					
					//Mensaje ganador
					if (puntosPrimerJugador > puntosSegundoJugador)
						System.out.println("\n�El ganador es "+nombre1+", con "+puntosPrimerJugador+" puntos!");
					else
					{
						if (puntosPrimerJugador == puntosSegundoJugador)
							System.out.println("\n�Empate! Nadie gana");
						else
							System.out.println("\n�El ganador es "+nombre2+", con "+puntosSegundoJugador+" puntos!");
					}
						
					break;
			}
			
			do
			{
				Funciones.Menu();
				opcion = teclado.next().charAt(0);
				if (opcion != '1' && opcion != '2' && opcion != '0')
					System.out.println("�Solo 1, 2, o 0 para salir!");
			}while (opcion != '1' && opcion != '2' && opcion != '0');
			
		} //Fin Mientras
	}
}
		
		
		
		
		
		
		
		
