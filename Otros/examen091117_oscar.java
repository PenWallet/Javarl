
/* Nombre del programa: examen091117_oscar.java
 * 
 * An�lisis:
 * Se presenta un men� con tres opciones, la cual cada una
 * dar� paso a tres juegos distintos. Del primer juego, conocemos lo que
 * hace y las entradas,pero solo se validar� esto �ltimo y se dejar� "en construcci�n"
 * el resto. Del segundo no se sabe nada y se dejar� todo "en construcci�n".
 * El tercer juego se deber� realizar entero, e incluir� su propio PG espec�fico
 * El primer jugador del tercer programa siempre ser� Raquel
 * 
 * Entradas:
 * - N�mero de selecci�n de opci�n en men�. Solo 1, 2 � 3.
 * - Dentro de "PintarEsfera", n�mero impar de filas entre 5 y 13, inclu�dos.
 * - Dentro de "PintarEsfera", car�cter de relleno. Solo letra may�scula.
 * - Dentro de "PintarEsfera", dos caracteres de suavizado. Solo d, b, n, P � V
 * - Dentro de "MonedaM�gica", n�mero de veces mayor que 0 que se jugar�
 * 
 * Salidas:
 * - Men� inicial
 * - Esfera pintada en pantalla //En construcci�n
 * - Monedas
 * - Ganador o perdedor
*/

/* Pseudoc�digo Generalizado:
 * 	Inicio
 * 		Leer y Validar si desea ejecutar
 * 		Mientras quiera jugar
 * 			Mostrar men�
 * 			Leer y Validar opci�n de men�
 * 			Seg�n (opci�n)
 * 				caso 1: PintarEsfera //en construcci�n
 * 				caso 2: N�meroOdioso //en construcci�n
 * 				caso 3: MonedaM�gica
 * 			Fin //Seg�n opci�n
 *	 		Leer y validar si desea volver a ejecutar
 * 		Fin //Mientras quiera jugar
 * 	Fin
*/

// El estudio de los bucles se encuentra delante de cada uno de ellos dentro del c�digo

/* Pseudoc�digos Generalizados espec�ficos:
 * 
 * //PintarEsfera
 * 	Inicio
 * 		Leer y validar di�metro
 * 		Leer y validar car�cter de relleno
 * 		Leer y validar caracteres de suavizado
 * 		Mostrar mensaje en construcci�n
 * 	Fin
 * 
 * //MonedaMagica
 * 	Inicio
 * 		Leer y validar n�mero de veces que desea jugar
 * 		Para (contador de tiradas igual a 0, mientras sea menor que el numero de tiradas, se suma en 1 el contador)
 * 			Se tiran las tres monedas
 * 			Evaluar ganador
 * 			Aumentar en 1 el contador de jugadas
 * 		Fin_Para
 * 		Imprimir ganador final
 * 	Fin 
 */


import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class examen091117_oscar {
	
	public static void main (String[] args) {
		
		//Declarar variables
		Scanner teclado = new Scanner (System.in);
		Random tirarmoneda = new Random();
		char bucleinicio;
		char opcion;
		
		byte diametroEsfera;
		char caracterRelleno;
		char caracterSuavizado1;
		char caracterSuavizado2;
		
		short numeroTiradas = 0;
		short contadorTiradas = 0;
		byte tirarMonedaTresVeces;
		int moneda1;
		int moneda2;
		int moneda3;
		byte contadorCaras;
		byte contadorCruces;
		short contadorGanadorR = 0;
		short contadorGanadorN = 0;
		char ganador = 'R'; //R de Raquel, que juega la primera
		
		//Leer y validar si desea jugar
		do
		{
			System.out.println("�Deseas ejecutar? (Y / N)");
			bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
			if (bucleinicio != 'Y' && bucleinicio != 'N')
				System.out.println("�Solo Y o N!");
		}while (bucleinicio != 'Y' && bucleinicio != 'N');

		// ************************************************************************
		
		/* Nombre del bucle: BucleInicial
		*  Tipo de VCB: Centinela
		*  Descripci�n: Se repite todo el programa mientras el usuario quiera
		*  Inicializaci�n VCB: Justo antes del bucle, dentro de Leer y Validar si desea ejecutar
		*  Actualizaci�n VCB: Inmediatamente antes del fin del bucle, dentro de Leer y Validar si desea volver a ejecutar
		*  Condici�n de entrada: bucleinicio == 'Y'
		*  Condici�n de salida: bucleinicio != 'Y'
		*/
		
		// ************************************************************************
		
		while(bucleinicio == 'Y') //Mientras quiera jugar
		{
			//Mostrar men�
			System.out.println("\nBienvenido, elige una de estas opciones:");
			System.out.println("1. Pintar una esfera de s�mbolos");
			System.out.println("2. Jugar a N�mero Odioso");
			System.out.println("3. Jugar a la Moneda M�gica");
			
			//Leer y validar opci�n de men�
			do
			{
				opcion = teclado.next().charAt(0);
				if (opcion < '1' || opcion > '3')
					System.out.println("�Solo 1, 2 o 3!");
			}while (opcion < '1' || opcion > '3');
			
			
			switch (opcion) //Seg�n (opci�n)
			{
				case '1':
					System.out.println("Bienvenido a Pintar Esfera");
					
					//Leer y validar di�metro
					do
					{
						System.out.println("\n�Cu�l es el di�metro de la esfera?");
						System.out.println("S�lo un n�mero impar entre 5 y 13");
						diametroEsfera = teclado.nextByte();
						if ((diametroEsfera < 5 || diametroEsfera > 13) || ((diametroEsfera >= 5 && diametroEsfera <= 13) && diametroEsfera % 2 == 0))
							System.out.println("ERROR");
					}while ((diametroEsfera < 5 || diametroEsfera > 13) || ((diametroEsfera >= 5 && diametroEsfera <= 13) && diametroEsfera % 2 == 0));
					
					//Leer y validar car�cter de relleno
					do
					{
						System.out.println("\nIntroduce el car�cter de relleno que quieras");
						System.out.println("S�lo letras");
						caracterRelleno = Character.toUpperCase(teclado.next().charAt(0));
						if (caracterRelleno < 'A' || caracterRelleno > 'Z')
							System.out.println("�Solo una letra!");
					}while (caracterRelleno < 'A' || caracterRelleno > 'Z');
					
					//Leer y validar caracteres de suavizado
					System.out.println("\nIntroduce dos caracteres de suavizado (d, b, n, V o P):"); //Se puede elegir dos veces el mismo car�cter
					do
					{
						System.out.println("Introduce el primero:");
						caracterSuavizado1 = teclado.next().charAt(0);
						if (caracterSuavizado1 != 'd' && caracterSuavizado1 != 'b' && caracterSuavizado1 != 'n' && caracterSuavizado1 != 'V' && caracterSuavizado1 != 'P')
							System.out.println("�Solo d, b, n, V o P!");
					}while (caracterSuavizado1 != 'd' && caracterSuavizado1 != 'b' && caracterSuavizado1 != 'n' && caracterSuavizado1 != 'V' && caracterSuavizado1 != 'P');
					
					do
					{
						System.out.println("\nIntroduce el segundo:");
						caracterSuavizado2 = teclado.next().charAt(0);
						if (caracterSuavizado2 != 'd' && caracterSuavizado2 != 'b' && caracterSuavizado2 != 'n' && caracterSuavizado2 != 'V' && caracterSuavizado2 != 'P')
							System.out.println("�Solo d, b, n, V o P!");
					}while (caracterSuavizado2 != 'd' && caracterSuavizado2 != 'b' && caracterSuavizado2 != 'n' && caracterSuavizado2 != 'V' && caracterSuavizado2 != 'P');
					
					//Mostrar mensaje en construcci�n
					System.out.println("\n***Lo sentimos. El resto se encuentra en construcci�n***");
					
					break;
				
				
				case '2':
					System.out.println("\n***Lo sentimos. Todo este m�dulo se encuentra bajo construcci�n***");
					break;
				
				
				case '3':
					contadorGanadorN = 0;
					contadorGanadorR = 0;
					
					System.out.println("\n�Bienvenido a la Moneda M�gica!");
					System.out.println("�Cu�ntas veces deseas jugar?");
					
					//Leer y validar n�mero de veces que desea jugar
					do
					{
						numeroTiradas = teclado.nextShort();
						if (numeroTiradas <= 0)
							System.out.println("�El n�mero de tiradas no puede ser igual o menor que 0!");
					}while (numeroTiradas <= 0);
					
					// ************************************************************************
					
					/* Nombre del bucle: BucleTirarMonedas
					*  Tipo de VCB: Contador
					*  Descripci�n: Se repite el juego Monedas M�gicas tantas veces como el usuario haya especificado
					*  Inicializaci�n VCB: Dentro del para
					*  Actualizaci�n VCB: Una vez terminado el bucle, se incrementa en 1 el contador
					*  Condici�n de entrada: contadorTiradas < numeroTiradas
					*  Condici�n de salida: contadorTiradas >= numeroTiradas
					*/
					
					// ************************************************************************
					
					//Para (contador de tiradas igual a 0, mientras sea menor que el numero de tiradas, se suma en 1 el contador)
					for (contadorTiradas = 0; contadorTiradas < numeroTiradas; contadorTiradas++)
					{
						contadorCaras = 0;
						contadorCruces = 0;
						
						//Se tiran las tres monedas
						moneda1 = tirarmoneda.nextInt(2)+1;
						if (moneda1 == 1)
						{
							System.out.println("\n  -------  ");
							System.out.println(" /       \\");
							System.out.println("|  CARA   |");
							System.out.println(" \\       /");
							System.out.println("  -------  ");
							contadorCaras++;
						}
						else
						{
							System.out.println("\n  -------  ");
							System.out.println(" /       \\");
							System.out.println("|  CRUZ   |");
							System.out.println(" \\       /");
							System.out.println("  -------  ");
							contadorCruces++;
						}
						
						moneda2 = tirarmoneda.nextInt(2)+1;
						if (moneda2 == 1)
						{
							System.out.println("\n  -------  ");
							System.out.println(" /       \\");
							System.out.println("|  CARA   |");
							System.out.println(" \\       /");
							System.out.println("  -------  ");
							contadorCaras++;
						}
						else
						{
							System.out.println("\n  -------  ");
							System.out.println(" /       \\");
							System.out.println("|  CRUZ   |");
							System.out.println(" \\       /");
							System.out.println("  -------  ");
							contadorCruces++;
						}
						
						moneda3 = tirarmoneda.nextInt(2)+1;
						if (moneda3 == 1)
						{
							System.out.println("\n  -------  ");
							System.out.println(" /       \\");
							System.out.println("|  CARA   |");
							System.out.println(" \\       /");
							System.out.println("  -------  ");
							contadorCaras++;
						}
						else
						{
							System.out.println("\n  -------  ");
							System.out.println(" /       \\");
							System.out.println("|  CRUZ   |");
							System.out.println(" \\       /");
							System.out.println("  -------  ");
							contadorCruces++;
						}
						
						
						//Evaluar ganador
						//El primer jugador siempre ser� Raquel
						if (ganador == 'R')
						{
							if (contadorCaras == 3 || contadorCruces == 3)
							{
								ganador = 'N';
								System.out.println("�Ha ganado Nzhdeh!");
								contadorGanadorN++;
							}
							else
							{
								ganador = 'R';
								System.out.println("�Ha ganado Raquel!");
								contadorGanadorR++;
							}
						}
						else
						{
							if (contadorCaras == 3 || contadorCruces == 3)
							{
								ganador = 'R';
								System.out.println("�Ha ganado Raquel!");
								contadorGanadorR++;
							}
							else
							{
								ganador = 'N';
								System.out.println("�Ha ganado Nzhdeh!");
								contadorGanadorN++;
							}
						}
					}
					
					//Imprimir ganador final
					System.out.println("\nRaquel ha ganado "+contadorGanadorR+" veces");
					System.out.println("Nzhdeh ha ganado "+contadorGanadorN+" veces");
					if (contadorGanadorR > contadorGanadorN)
						System.out.println("\n�Ha ganado Raquel!");
					else
						System.out.println("\n�Ha ganado Nzhdeh!");
				
			}
			//Leer y validar si desea volver a jugar
			do
			{
			System.out.println("\n\n�Deseas volver a ejecutar? (Y / N)");
			bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
			if (bucleinicio != 'Y' && bucleinicio != 'N')
				System.out.println("�Solo Y o N!");
			}while (bucleinicio != 'Y' && bucleinicio != 'N');
		}
	}
}
