
/* Nombre del programa: examen091117_oscar.java
 * 
 * Análisis:
 * Se presenta un menú con tres opciones, la cual cada una
 * dará paso a tres juegos distintos. Del primer juego, conocemos lo que
 * hace y las entradas,pero solo se validará esto último y se dejará "en construcción"
 * el resto. Del segundo no se sabe nada y se dejará todo "en construcción".
 * El tercer juego se deberá realizar entero, e incluirá su propio PG específico
 * El primer jugador del tercer programa siempre será Raquel
 * 
 * Entradas:
 * - Número de selección de opción en menú. Solo 1, 2 o 3. 9 servirá para salir.
 * - Dentro de "PintarEsfera", número impar de filas entre 5 y 13, incluídos.
 * - Dentro de "PintarEsfera", carácter de relleno. Solo letra mayúscula.
 * - Dentro de "PintarEsfera", dos caracteres de suavizado. Solo d, b, n, V ó P
 * - Dentro de "MonedaMágica", número de veces mayor que 0 que se jugará
 * 
 * Salidas:
 * - Menú inicial
 * - Esfera pintada en pantalla //En construcción
 * - Monedas
 * - Ganador o perdedor
*/

/* Pseudocódigo Generalizado:
 * 	Inicio
 * 		Repetir
 * 			Mostrar menú
 * 			Leer y Validar opción de menú
 * 			Según (opción)
 * 				caso 1: PintarEsfera //en construcción
 * 				caso 2: NúmeroOdioso //en construcción
 * 				caso 3: MonedaMágica
 * 				caso 9: Salir
 * 			Fin //Según opción
 * 		Mientras 
 * 	Fin
*/

// El estudio de los bucles se encuentra delante de cada uno de ellos dentro del código

/* Pseudocódigos Generalizados específicos:
 * 
 * //PintarEsfera
 * 	Inicio
 * 		Leer y validar diámetro
 * 		Leer y validar carácter de relleno
 * 		Leer y validar caracteres de suavizado
 * 		Mostrar mensaje en construcción
 * 		Leer y validar si desea ver el menú de nuevo
 * 	Fin
 * 
 * //MonedaMagica
 * 	Inicio
 * 		Leer y validar número de veces que desea jugar
 * 		Para (contador de tiradas igual a 0, mientras sea menor que el numero de tiradas, se suma en 1 el contador)
 * 			Se tiran las tres monedas
 * 			Evaluar ganador
 * 		Fin_Para
 * 		Imprimir ganador final
 * 		Leer y validar si desea ver el menú de nuevo
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
		*  Descripción: Se repite todo el programa mientras el usuario quiera
		*  Inicialización y Actualización VCB: Tras cada opción de menú
		*  Condición de entrada: volverMenu == 'Y'
		*  Condición de salida: volverMenu != 'Y'
		*/
		
		// ************************************************************************
		
		do
		{
			//Mostrar menú
			System.out.println("Bienvenido, elige una de estas opciones:");
			System.out.println("1. Pintar una esfera de símbolos");
			System.out.println("2. Jugar a Número Odioso");
			System.out.println("3. Jugar a la Moneda Mágica");
			System.out.println("\n9. Salir");
			
			// ************************************************************************
		
			/* Nombre del bucle: BucleOpcionMenu
			*  Tipo de VCB: Centinela
			*  Descripción: Se repite hasta que se introduzca una opción correcta
			*  Inicialización y Actualización VCB: Dentro del mismo
			*  Condición de entrada: (opcion < '1' || opcion > '3') && opcion != '9'
			*  Condición de salida: (opcion >= '1' || opcion >= '3') || opcion == '9'
			*/
			
			// ************************************************************************
			
			
			//Leer y validar opción de menú
			do
			{
				opcion = teclado.next().charAt(0);
				if (opcion < '1' || opcion > '3' && opcion != '9')
					System.out.println("¡Solo 1, 2, 3 ó 9 para salir!");
			}while (opcion < '1' || opcion > '3' && opcion != '9');
			
			
			switch (opcion) //Según (opción)
			{
				case '1':
					System.out.println("Bienvenido a Pintar Esfera");
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleValidarDiametro
					*  Tipo de VCB: Centinela
					*  Descripción: Se repite hasta que se introduzca un número correcto
					*  Inicialización y Actualización VCB: Dentro del mismo
					*  Condición de entrada: (diametroEsfera < 5 || diametroEsfera > 13) || ((diametroEsfera >= 5 && diametroEsfera <= 13) && diametroEsfera % 2 == 0)
					*  Condición de salida: (diametroEsfera >= 5 || diametroEsfera <= 13) && diametroEsfera % 2 != 0)
					*/
					
					// ************************************************************************
					
					//Leer y validar diámetro
					do
					{
						System.out.println("\n¿Cuál es el diámetro de la esfera?");
						System.out.println("Sólo un número impar entre 5 y 13");
						diametroEsfera = teclado.nextByte();
						if ((diametroEsfera < 5 || diametroEsfera > 13) || ((diametroEsfera >= 5 && diametroEsfera <= 13) && diametroEsfera % 2 == 0))
							System.out.println("ERROR");
					}while ((diametroEsfera < 5 || diametroEsfera > 13) || ((diametroEsfera >= 5 && diametroEsfera <= 13) && diametroEsfera % 2 == 0));
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleValidarCaracterRelleno
					*  Tipo de VCB: Centinela
					*  Descripción: Se repite hasta que se introduzca un carácter correcto
					*  Inicialización y Actualización VCB: Dentro del mismo bucle
					*  Condición de entrada: (caracterRelleno < 'A' || caracterRelleno > 'Z')
					*  Condición de salida: (caracterRelleno >= 'A' && caracterRelleno <= 'Z')
					*/
					
					// ************************************************************************
					
					//Leer y validar carácter de relleno
					do
					{
						System.out.println("\nIntroduce el carácter de relleno que quieras");
						System.out.println("Sólo letras");
						caracterRelleno = Character.toUpperCase(teclado.next().charAt(0));
						if (caracterRelleno < 'A' || caracterRelleno > 'Z')
							System.out.println("¡Solo una letra!");
					}while (caracterRelleno < 'A' || caracterRelleno > 'Z');
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleValidarCaracterSuavizado
					*  Tipo de VCB: Centinela
					*  Descripción: Se repite hasta que se introduzca un carácter correcto
					*  Inicialización y Actualización VCB: Dentro del mismo bucle
					*  Condición de entrada: (caracterSuavizado1 != 'd' && caracterSuavizado1 != 'b' && caracterSuavizado1 != 'n' && caracterSuavizado1 != 'V' && caracterSuavizado1 != 'P')
					*  Condición de salida: (caracterSuavizado1 == 'd' || caracterSuavizado1 == 'b' || caracterSuavizado1 == 'n' || caracterSuavizado1 == 'V' || caracterSuavizado1 == 'P')
					*/
					
					// ************************************************************************
					
					//Leer y validar caracteres de suavizado
					System.out.println("\nIntroduce dos caracteres de suavizado (d, b, n, V o P):"); //Se puede elegir dos veces el mismo carácter
					do
					{
						System.out.println("Introduce el primero:");
						caracterSuavizado1 = teclado.next().charAt(0);
						if (caracterSuavizado1 != 'd' && caracterSuavizado1 != 'b' && caracterSuavizado1 != 'n' && caracterSuavizado1 != 'V' && caracterSuavizado1 != 'P')
							System.out.println("¡Solo d, b, n, V o P!");
					}while (caracterSuavizado1 != 'd' && caracterSuavizado1 != 'b' && caracterSuavizado1 != 'n' && caracterSuavizado1 != 'V' && caracterSuavizado1 != 'P');
					
					do
					{
						System.out.println("\nIntroduce el segundo:");
						caracterSuavizado2 = teclado.next().charAt(0);
						if (caracterSuavizado2 != 'd' && caracterSuavizado2 != 'b' && caracterSuavizado2 != 'n' && caracterSuavizado2 != 'V' && caracterSuavizado2 != 'P')
							System.out.println("¡Solo d, b, n, V o P!");
					}while (caracterSuavizado2 != 'd' && caracterSuavizado2 != 'b' && caracterSuavizado2 != 'n' && caracterSuavizado2 != 'V' && caracterSuavizado2 != 'P');
					
					//Mostrar mensaje en construcción
					System.out.println("\n***Lo sentimos. El resto se encuentra en construcción***");
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleVolverMenu
					*  Tipo de VCB: Centinela
					*  Descripción: Se repite hasta que se introduzca Y o N
					*  Inicialización y Actualización VCB: Dentro del mismo bucle
					*  Condición de entrada: (volverMenu != 'Y' && volverMenu != 'N')
					*  Condición de salida: (volverMenu == 'Y' || volverMenu == 'N')
					*/
					
					// ************************************************************************
					
					//Leer y validar si desea ver el menú de nuevo
					do
					{
						System.out.println("\n\n¿Deseas volver al menú? (Y / N)");
						volverMenu = Character.toUpperCase(teclado.next().charAt(0));
						if (volverMenu != 'Y' && volverMenu != 'N')
							System.out.println("¡Solo Y o N!");
					}while(volverMenu != 'Y' && volverMenu != 'N');
					
					break;
				
				
				case '2':
					System.out.println("\n***Lo sentimos. Todo este módulo se encuentra bajo construcción***");
					
					// ************************************************************************
		
					// Nombre del bucle: BucleVolverMenu
					
					// ************************************************************************
					
					//Leer y validar si desea ver el menú de nuevo
					do
					{
						System.out.println("\n\n¿Deseas volver al menú? (Y / N)");
						volverMenu = Character.toUpperCase(teclado.next().charAt(0));
						if (volverMenu != 'Y' && volverMenu != 'N')
							System.out.println("¡Solo Y o N!");
					}while(volverMenu != 'Y' && volverMenu != 'N');
					
					break;
				
				
				case '3':
					contadorGanadorN = 0;
					contadorGanadorR = 0;
					
					System.out.println("\n¡Bienvenido a la Moneda Mágica!");
					System.out.println("¿Cuántas veces deseas jugar?");
					
					// ************************************************************************
		
					/* Nombre del bucle: BucleVecesTiradas
					*  Tipo de VCB: Centinela
					*  Descripción: Se repite hasta que se introduzca un número contador
					*  Inicialización y Actualización VCB: Dentro del mismo bucle
					*  Condición de entrada: (numeroTiradas <= 0)
					*  Condición de salida: (numeroTiradas > 0)
					*/
					
					// ************************************************************************
					
					//Leer y validar número de veces que desea jugar
					do
					{
						numeroTiradas = teclado.nextShort();
						if (numeroTiradas <= 0)
							System.out.println("¡El número de tiradas no puede ser igual o menor que 0!");
					}while (numeroTiradas <= 0);
					
					// ************************************************************************
					
					/* Nombre del bucle: BucleTirarMonedas
					*  Tipo de VCB: Contador
					*  Descripción: Se repite el juego Monedas Mágicas tantas veces como el usuario haya especificado
					*  Inicialización VCB: Dentro del para
					*  Actualización VCB: Una vez terminado el bucle, se incrementa en 1 el contador
					*  Condición de entrada: contadorTiradas < numeroTiradas
					*  Condición de salida: contadorTiradas >= numeroTiradas
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
						//El primer jugador siempre será Raquel
						if (ganador == 'R')
						{
							if (contadorCaras == 3 || contadorCruces == 3)
							{
								ganador = 'N';
								System.out.println("¡Ha ganado Nzhdeh!");
								contadorGanadorN++;
							}
							else
							{
								ganador = 'R';
								System.out.println("¡Ha ganado Raquel!");
								contadorGanadorR++;
							}
						}
						else
						{
							if (contadorCaras == 3 || contadorCruces == 3)
							{
								ganador = 'R';
								System.out.println("¡Ha ganado Raquel!");
								contadorGanadorR++;
							}
							else
							{
								ganador = 'N';
								System.out.println("¡Ha ganado Nzhdeh!");
								contadorGanadorN++;
							}
						}
					}
					
					//Imprimir ganador final
					System.out.println("\nRaquel ha ganado "+contadorGanadorR+" veces");
					System.out.println("Nzhdeh ha ganado "+contadorGanadorN+" veces");
					
					if (contadorGanadorR > contadorGanadorN)
						System.out.println("\n¡Ha ganado Raquel!");
					else
						if (contadorGanadorN > contadorGanadorR)
							System.out.println("\n¡Ha ganado Nzhdeh!");
						else
							System.out.println("\n¡Habéis empatado!");
						
					// ************************************************************************
		
					// Nombre del bucle: BucleVolverMenu
					
					// ************************************************************************
					
					//Leer y validar si desea ver el menú de nuevo
					do
					{
						System.out.println("\n\n¿Deseas volver al menú? (Y / N)");
						volverMenu = Character.toUpperCase(teclado.next().charAt(0));
						if (volverMenu != 'Y' && volverMenu != 'N')
							System.out.println("¡Solo Y o N!");
					}while(volverMenu != 'Y' && volverMenu != 'N');
					
					break;
				
				case '9':
					volverMenu = 'N';
				
			}
		}while (volverMenu == 'Y');
	}
}
