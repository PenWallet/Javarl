
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
 * - N�mero de selecci�n de opci�n en men�. Solo 1, 2 o 3. 9 servir� para salir.
 * - Dentro de "PintarEsfera", n�mero impar de filas entre 5 y 13, inclu�dos.
 * - Dentro de "PintarEsfera", car�cter de relleno. Solo letra may�scula.
 * - Dentro de "PintarEsfera", dos caracteres de suavizado. Solo d, b, n, V � P
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
 * 		Repetir
 * 			Mostrar men�
 * 			Leer y Validar opci�n de men�
 * 			Seg�n (opci�n)
 * 				caso 1: PintarEsfera //en construcci�n
 * 				caso 2: N�meroOdioso //en construcci�n
 * 				caso 3: MonedaM�gica
 * 				caso 9: Salir
 * 			Fin //Seg�n opci�n
 * 		Mientras 
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
 * 		Leer y validar si desea ver el men� de nuevo
 * 	Fin
 * 
 * //MonedaMagica
 * 	Inicio
 * 		Leer y validar n�mero de veces que desea jugar
 * 		Para (contador de tiradas igual a 0, mientras sea menor que el numero de tiradas, se suma en 1 el contador)
 * 			Se tiran las tres monedas
 * 			Evaluar ganador
 * 		Fin_Para
 * 		Imprimir ganador final
 * 		Leer y validar si desea ver el men� de nuevo
 * 	Fin 
 */


import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class examen091117_oscar_v2 {
	
	public static void main (String[] args) {
		
		//Declarar variables
		Scanner teclado = new Scanner (System.in);
		Random tirarmoneda = new Random();
		char volverMenu = 'Y';
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

		// ************************************************************************
		
		/* Nombre del bucle: BucleInicio
		*  Tipo de VCB: Centinela
		*  Descripci�n: Se repite todo el programa mientras el usuario quiera
		*  Inicializaci�n y Actualizaci�n VCB: Tras cada opci�n de men�
		*  Condici�n de entrada: volverMenu == 'Y'
		*  Condici�n de salida: volverMenu != 'Y'
		*/
		
		// ************************************************************************
		
		do
		{
			//Mostrar men�
			System.out.println("Bienvenido, elige una de estas opciones:");
			System.out.println("1. Pintar una esfera de s�mbolos");
			System.out.println("2. Jugar a N�mero Odioso");
			System.out.println("3. Jugar a la Moneda M�gica");
			System.out.println("\n9. Salir");
			
			// ************************************************************************
		
			/* Nombre del bucle: BucleOpcionMenu
			*  Tipo de VCB: Centinela
			*  Descripci�n: Se repite hasta que se introduzca una opci�n correcta
			*  Inicializaci�n y Actualizaci�n VCB: Dentro del mismo
			*  Condici�n de entrada: (opcion < '1' || opcion > '3') && opcion != '9'
			*  Condici�n de salida: (opcion >= '1' || opcion >= '3') || opcion == '9'
			*/
			
			// ************************************************************************
			
			
			//Leer y validar opci�n de men�
			do
			{
				opcion = teclado.next().charAt(0);
				if (opcion < '1' || opcion > '3' && opcion != '9')
					System.out.println("�Solo 1, 2, 3 � 9 para salir!");
			}while (opcion < '1' || opcion > '3' && opcion != '9');
			
			
			switch (opcion) //Seg�n (opci�n)
			{
				case '1':
					System.out.println("Bienvenido a Pintar Esfera");
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleValidarDiametro
					*  Tipo de VCB: Centinela
					*  Descripci�n: Se repite hasta que se introduzca un n�mero correcto
					*  Inicializaci�n y Actualizaci�n VCB: Dentro del mismo
					*  Condici�n de entrada: (diametroEsfera < 5 || diametroEsfera > 13) || ((diametroEsfera >= 5 && diametroEsfera <= 13) && diametroEsfera % 2 == 0)
					*  Condici�n de salida: (diametroEsfera >= 5 || diametroEsfera <= 13) && diametroEsfera % 2 != 0)
					*/
					
					// ************************************************************************
					
					//Leer y validar di�metro
					do
					{
						System.out.println("\n�Cu�l es el di�metro de la esfera?");
						System.out.println("S�lo un n�mero impar entre 5 y 13");
						diametroEsfera = teclado.nextByte();
						if ((diametroEsfera < 5 || diametroEsfera > 13) || ((diametroEsfera >= 5 && diametroEsfera <= 13) && diametroEsfera % 2 == 0))
							System.out.println("ERROR");
					}while ((diametroEsfera < 5 || diametroEsfera > 13) || ((diametroEsfera >= 5 && diametroEsfera <= 13) && diametroEsfera % 2 == 0));
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleValidarCaracterRelleno
					*  Tipo de VCB: Centinela
					*  Descripci�n: Se repite hasta que se introduzca un car�cter correcto
					*  Inicializaci�n y Actualizaci�n VCB: Dentro del mismo bucle
					*  Condici�n de entrada: (caracterRelleno < 'A' || caracterRelleno > 'Z')
					*  Condici�n de salida: (caracterRelleno >= 'A' && caracterRelleno <= 'Z')
					*/
					
					// ************************************************************************
					
					//Leer y validar car�cter de relleno
					do
					{
						System.out.println("\nIntroduce el car�cter de relleno que quieras");
						System.out.println("S�lo letras");
						caracterRelleno = Character.toUpperCase(teclado.next().charAt(0));
						if (caracterRelleno < 'A' || caracterRelleno > 'Z')
							System.out.println("�Solo una letra!");
					}while (caracterRelleno < 'A' || caracterRelleno > 'Z');
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleValidarCaracterSuavizado
					*  Tipo de VCB: Centinela
					*  Descripci�n: Se repite hasta que se introduzca un car�cter correcto
					*  Inicializaci�n y Actualizaci�n VCB: Dentro del mismo bucle
					*  Condici�n de entrada: (caracterSuavizado1 != 'd' && caracterSuavizado1 != 'b' && caracterSuavizado1 != 'n' && caracterSuavizado1 != 'V' && caracterSuavizado1 != 'P')
					*  Condici�n de salida: (caracterSuavizado1 == 'd' || caracterSuavizado1 == 'b' || caracterSuavizado1 == 'n' || caracterSuavizado1 == 'V' || caracterSuavizado1 == 'P')
					*/
					
					// ************************************************************************
					
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
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleVolverMenu
					*  Tipo de VCB: Centinela
					*  Descripci�n: Se repite hasta que se introduzca Y o N
					*  Inicializaci�n y Actualizaci�n VCB: Dentro del mismo bucle
					*  Condici�n de entrada: (volverMenu != 'Y' && volverMenu != 'N')
					*  Condici�n de salida: (volverMenu == 'Y' || volverMenu == 'N')
					*/
					
					// ************************************************************************
					
					//Leer y validar si desea ver el men� de nuevo
					do
					{
						System.out.println("\n\n�Deseas volver al men�? (Y / N)");
						volverMenu = Character.toUpperCase(teclado.next().charAt(0));
						if (volverMenu != 'Y' && volverMenu != 'N')
							System.out.println("�Solo Y o N!");
					}while(volverMenu != 'Y' && volverMenu != 'N');
					
					break;
				
				
				case '2':
					System.out.println("\n***Lo sentimos. Todo este m�dulo se encuentra bajo construcci�n***");
					
					// ************************************************************************
		
					// Nombre del bucle: BucleVolverMenu
					
					// ************************************************************************
					
					//Leer y validar si desea ver el men� de nuevo
					do
					{
						System.out.println("\n\n�Deseas volver al men�? (Y / N)");
						volverMenu = Character.toUpperCase(teclado.next().charAt(0));
						if (volverMenu != 'Y' && volverMenu != 'N')
							System.out.println("�Solo Y o N!");
					}while(volverMenu != 'Y' && volverMenu != 'N');
					
					break;
				
				
				case '3':
					contadorGanadorN = 0;
					contadorGanadorR = 0;
					
					System.out.println("\n�Bienvenido a la Moneda M�gica!");
					System.out.println("�Cu�ntas veces deseas jugar?");
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleVecesTiradas
					*  Tipo de VCB: Centinela
					*  Descripci�n: Se repite hasta que se introduzca un n�mero contador
					*  Inicializaci�n y Actualizaci�n VCB: Dentro del mismo bucle
					*  Condici�n de entrada: (numeroTiradas <= 0)
					*  Condici�n de salida: (numeroTiradas > 0)
					*/
					
					// ************************************************************************
					
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
						if (contadorGanadorN > contadorGanadorR)
							System.out.println("\n�Ha ganado Nzhdeh!");
						else
							System.out.println("\n�Hab�is empatado!");
						
					// ************************************************************************
		
					// Nombre del bucle: BucleVolverMenu
					
					// ************************************************************************
					
					//Leer y validar si desea ver el men� de nuevo
					do
					{
						System.out.println("\n\n�Deseas volver al men�? (Y / N)");
						volverMenu = Character.toUpperCase(teclado.next().charAt(0));
						if (volverMenu != 'Y' && volverMenu != 'N')
							System.out.println("�Solo Y o N!");
					}while(volverMenu != 'Y' && volverMenu != 'N');
					
					break;
				
				case '9':
					volverMenu = 'N';
				
			}
		}while (volverMenu == 'Y');
	}
}
