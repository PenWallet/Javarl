/* Nombre del programa: boletinnav_14_chicago
 * 
 * An�lisis:
 * Comentario: Programa con men� para elegir diferentes juegos.
 * Juego de chicago: 11 rondas, en la primera, se llevar� puntos el que saque un 2 o que la suma de los dados sea 2,
 * en la segunda ronda, el que saque un 3, en la tercera, un 4, y as� sucesivamente.
 * Se podr� apostar al principio del juego
 * 
 * Entradas:
 * - N�mero para opci�n
 * - Cantidad de dinero de apuesta
 * - 
 * 
 * 
*/

/* Pseudoc�digo Generalizado:
 * 	Inicio
 * 		PresentarMenu * y leer y validar selecci�n
 * 		Mientras (opcion no sea 0)
 * 			Seg�n (opcion)
 * 				caso 1:
 * 					Leer nombre del jugador
 * 					Leer y validar dinero con el que entras
 * 					Repetir
 * 						Leer y validar apuesta
 * 						Repetir
 * 							Para (ronda 1; mientras la ronda sea menor de 12; a�adir 1 a ronda)
 * 								Repetir
 * 									Ambos jugadores tiran los dados //Ver qui�n sale primero
 * 								Mientras (no sea empate)
 * 								Jugador 1: TirarDados *
 * 								Si es correcto
 * 									Sumar los puntos correspondientes a jugador1
 * 									Si (no es la partida 1)
 * 										Ganador jugador1
 * 										Fijar rondas en 11
 * 									Fin Si
 * 								Fin Si
 * 								Jugador 2: TirarDados *
 * 								Si es correcto
 * 									Sumar los puntos correspondientes a jugador2
 * 									Si (no es la partida 1)
 * 										Ganador jugador2
 * 										Fijar rondas en 11
 * 									Fin Si
 * 								Fin Si
 * 							Fin_Para
 * 							Si (puntuaci�n es igual)
 * 								Partida no finalizada
 * 								Fijar rondas en 1
 * 							Si no
 * 								Partida finalizada
 * 						Mientras (partida no finalizada)
 * 					Leer y validar si desea volver a jugar
 *					Mientras (jugador desee jugar)
 * 					Mostrar mensaje de ganador y sumar/restar dinero
 * 				
 * 				caso 2:
 * 					//En construcci�n
 * 				caso 3:
 * 					//En construcci�n
 * 			Fin Seg�n
 * 			PresentarMenu * y leer y validar selecci�n
 * 		Fin Mientras
 * 	Fin
*/

import java.util.Scanner;
import java.io.*;

public class boletinnav_14_chicago
{
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);
		
		char opcion;
		char ganador; //J para el jugador, M para la m�quina
		char volverAJugar;
		
		boolean turnoJugador; //Indica si es el turno del jugador o no (true, jugador; false, m�quina)
		boolean esPrimeraPartida = true;
		boolean gameOver = false;
		
		int dinero;
		int apuesta;
		
		byte ronda;
		byte dadoJ1; //dados del jugador
		byte dadoJ2;
		byte dadoM1; //dados de la m�quina
		byte dadoM2;
		byte dado1; //dados que se tiran jugando
		byte dado2;
		byte puntuacionJ = 0;
		byte puntuacionM = 0;
		
		String nombre = "";
		
		//PresentarMenu * y leer y validar seleccion
		do
		{
			Funciones.Menu();
			opcion = teclado.next().charAt(0);
			if (opcion < '0' || opcion > '3')
				System.out.println("�Solo 1, 2, 3, o 0 para salir!");
		}while(opcion < '0' || opcion > '3');
		
		while(opcion != '0')
		{
			switch (opcion)
			{
				case '1':
					//Leer nombre del jugador
					System.out.println("/n�Cu�l es tu nombre?");
					nombre = teclado.nextLine();
					System.out.println("�Bonito nombre, "+nombre+"!");
					
					//Leer y validar dinero con el que entras
					do
					{
						System.out.println("/n�Con cu�nto dinero vienes? (1-1000)");
						dinero = teclado.nextInt();
						if (dinero < 1 || dinero > 1000)
							System.out.println("�Solo entre 1 y 1000!");
					}while(dinero < 1 || dinero > 1000);
					System.out.println("�De acuerdo! Vienes con "+dinero+" simoleones");
					
					
					do
					{
						//Leer y validar apuesta
						do
						{
							System.out.println("�Cu�nto deseas apostar?");
							apuesta = teclado.nextInt();
							if (apuesta < 1 || apuesta > dinero)
								System.out.println("�No puedes apostar esa cantidad!");
						}while(apuesta < 1 || apuesta > dinero);
						
						do
						{
							if(!esPrimeraPartida)
							{
								puntuacionM = 0;
								puntuacionJ = 0;
							}
							
							for(ronda = 1; ronda < 12; ronda++)
							{
								//Tirar dados para ver qui�n sale primero
								do
								{
									System.out.println("Tiremos los dados para ver qui�n tira primero");
									System.out.println("Tirando los dados...");
									Funciones.TimeDados();
									
									dadoJ1 = Funciones.Dados();
									dadoJ2 = Funciones.Dados();
									
									Funciones.Time();
									
									System.out.println("Ahora tirar� los dados la m�quina");
									System.out.println("Tirando los dados...");
									Funciones.TimeDados();
									
									dadoM1 = Funciones.Dados();
									dadoM2 = Funciones.Dados(); 
									
									if((dadoJ1+dadoJ2) == (dadoM1+dadoM2))
									{
										System.out.println("�Hab�is empatado! Se vuelven a tirar los dados!");
										Funciones.Time();
									}
								}while((dadoJ1+dadoJ2) == (dadoM1+dadoM2));
								
								if((dadoJ1+dadoJ2) > (dadoM1+dadoM2))
								{
									turnoJugador = true;
									System.out.println("Sale primero "+nombre);
								}
								else
								{
									turnoJugador = false;
									System.out.println("Sale primero la m�quina");
								}
								
								//Jugador 1
								System.out.println("Tirando los dados...");
								Funciones.TimeDados();
								dado1 = Funciones.Dados();
								dado2 = Funciones.Dados();
								
								if(dado1 == (ronda+1) || dado2 == (ronda+1) || (dado1+dado2) == (ronda+1)) //Si es correcto
								{
									if(esPrimeraPartida)
									{
										if(turnoJugador)
										{
											puntuacionJ += (ronda+1);
											System.out.println("�Acertaste! Ahora tienes "+puntuacionJ+" puntos");
										}
										else
										{
											puntuacionM += (ronda+1);
											System.out.println("�La m�quina ha acertado! Ahora tiene "+puntuacionM+" puntos");
										}
									}
									else
									{
										if(turnoJugador)
										{
											System.out.println("�Has ganado la partida, "+nombre+"!");
											ganador = 'J';
											ronda = 12;
											gameOver = true;
										}
										else
										{
											System.out.println("�Has perdido, "+nombre+"! Gana la m�quina");
											ganador = 'M';
											ronda = 12;
											gameOver = true;
										}
									}
								}
								else
								{
									if(turnoJugador)
										System.out.println("�Fallaste! Le toca tirar a la m�quina");
									else
										System.out.println("�La m�quina ha fallado! Te toca tirar, "+nombre);
								}
								
								turnoJugador = !turnoJugador;
								
								//Jugador 2
								while(!gameOver)
								{
									System.out.println("Tirando los dados...");
									Funciones.TimeDados();
									dado1 = Funciones.Dados();
									dado2 = Funciones.Dados();
									
									if(dado1 == (ronda+1) || dado2 == (ronda+1) || (dado1+dado2) == (ronda+1)) //Si es correcto
									{
										if(esPrimeraPartida)
										{
											if(turnoJugador)
											{
												puntuacionJ += (ronda+1);
												System.out.println("�Acertaste! Ahora tienes "+puntuacionJ+" puntos");
											}
											else
											{
												puntuacionM += (ronda+1);
												System.out.println("�La m�quina ha acertado! Ahora tiene "+puntuacionM+" puntos");
											}
										}
										else
										{
											if(turnoJugador)
											{
												System.out.println("�Has ganado la partida, "+nombre+"!");
												ganador = 'J';
												ronda = 12;
												gameOver = true;
											}
											else
											{
												System.out.println("�Has perdido, "+nombre+"! Gana la m�quina");
												ganador = 'M';
												ronda = 12;
												gameOver = true;
											}
										}
									}
									else
									{
										if(turnoJugador)
											System.out.println("�Fallaste!");
										else
											System.out.println("�La m�quina ha fallado!");
									}
								}
							}
							
							if(puntuacionJ != puntuacionM) //Partida finalizada
							{
								if(puntuacionJ > puntuacionM)
								{
									System.out.println("�El ganador de esta partida ha sido "+nombre+"!");
									dinero += apuesta;
								}
								else
								{
									System.out.println("�Has perdido, la m�quina ha ganado esta partida!");
									dinero -= apuesta;
								}
								
								gameOver = true;
							}
							else
							{
								System.out.println("�Hab�is empatado en puntos!");
								System.out.println("La partida volver� a empezar. El primero que gane una ronda, ganar� la partida");
								gameOver = false;
								esPrimeraPartida = false;
							}
						
						}while(!gameOver);
						
						if(dinero > 1)
						{
							do
							{
								System.out.println("�Deseas volver a jugar otra partida (Y / N)");
								volverAJugar = Character.toUpperCase(teclado.next().charAt(0));
								if(volverAJugar != 'Y' && volverAJugar != 'N')
									System.out.println("�Solo Y o N!");
							}while(volverAJugar != 'Y' && volverAJugar != 'N');
						}
						else
						{
							System.out.println("�No te queda dinero para jugar! Byeeee~");
							volverAJugar = 'N';
						}
					}while(volverAJugar == 'Y');
					
					break;
				
				case '2':
					System.out.println("\n�En construcci�n!");
					break;
				
				case '3':
					System.out.println("\n�En construcci�n!");
					break;	
			}
			
			
			//PresentarMenu * y leer y validar seleccion
			do
			{
				Funciones.Menu();
				opcion = teclado.next().charAt(0);
				if (opcion < '0' || opcion > '3')
					System.out.println("�Solo 1, 2, 3, o 0 para salir!");
			}while(opcion < '0' || opcion > '3');
		}
	}
}
		
		
		
		
		
		
		
		
