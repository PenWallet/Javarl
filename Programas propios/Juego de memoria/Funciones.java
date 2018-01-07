import java.util.Random;
import java.io.*;

public class Funciones
{
	public static void Menu()
	{
		System.out.println("|-------------------------|");
		System.out.println("|           Menú          |");
		System.out.println("|-------------------------|");
		System.out.println("|      1. Un jugador      |");
		System.out.println("|     2. Dos jugadores    |");
		System.out.println("|*************************|");
		System.out.println("|        0. Salir         |");
		System.out.println("|-------------------------|");
		System.out.println("\nElija una opción:");
	}
	
	public static void Time()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){};
	}
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Ninguna
 * Devoluciones: Número que representa cara o cruz
 * Nec/Dev: Ninnguna
 * Restricciones: Ninguna
*/ 

/* Interfaz:
 * 
 * Comentario: Se tira una moneda y sale un resultado
 * Cabecera: real TirarMoneda ()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Número real
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Número real devuelto asociado al nombre
*/
	public static double TirarMoneda (char primerJugador)
	{
		double resultado;
		
		//Calcular aleatorio
		resultado = Math.random();
		
		//Mostrar resultado (cara o cruz)
		if (resultado < 0.5)
		{
			System.out.println("  -------");
			System.out.println(" /       \\");
			System.out.println("|  CARA   |");
			System.out.println(" \\       /");
			System.out.println("  -------");
			
		}
		
		if (resultado > 0.5)
		{
			System.out.println("  -------");
			System.out.println(" /       \\");
			System.out.println("|  CRUZ   |");
			System.out.println(" \\       /");
			System.out.println("  -------");
		}
		
		if (resultado == 0.5)
		{
			System.out.println("  -------");
			System.out.println(" /       \\");
			System.out.println("|DE CANTO |");
			System.out.println("\\        /");
			System.out.println("  -------");
		}
		
		return(resultado);
	}




/* Estudio de la Interfaz:
 * 
 * Necesidades: 12 caracteres y 12 booleans
 * Devoluciones: Ninguna
 * Nec/Dev: Ninnguna
 * Restricciones: Los caracteres solo pueden ser A, B, C, D, E o F
*/ 

/* Interfaz:
 * 
 * Comentario: Mostrará en pantalla el estado de las cartas según la partida se vaya desarrollando
 * Cabecera: CartasPantalla(unmontondevariables) 
 * // Debido a la falta de herramientas y conocimientos,
 * esta es la única forma disponible de hacerlo. Es rústica de cojones
 * Precondiciones: Ninguna
 * Entradas: 12 caracteres y 12 booleans
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna, solo se pintará en pantalla
 * 

	public static void CartasPantalla
	(
	char cartaSimbolo1, boolean cartaDescubierta1,
	char cartaSimbolo2, boolean cartaDescubierta2,
	char cartaSimbolo3, boolean cartaDescubierta3,
	char cartaSimbolo4, boolean cartaDescubierta4,
	char cartaSimbolo5, boolean cartaDescubierta5,
	char cartaSimbolo6, boolean cartaDescubierta6,
	char cartaSimbolo7, boolean cartaDescubierta7,
	char cartaSimbolo8, boolean cartaDescubierta8,
	char cartaSimbolo9, boolean cartaDescubierta9,
	char cartaSimbolo10, boolean cartaDescubierta10,
	char cartaSimbolo11, boolean cartaDescubierta11,
	char cartaSimbolo12, boolean cartaDescubierta12
	)
	{
		System.out.println("En Resguardo");
	}
*/
	public static void CartasPantalla
	(
	char cartaSimbolo1, boolean cartaDescubierta1,
	char cartaSimbolo2, boolean cartaDescubierta2,
	char cartaSimbolo3, boolean cartaDescubierta3,
	char cartaSimbolo4, boolean cartaDescubierta4,
	char cartaSimbolo5, boolean cartaDescubierta5,
	char cartaSimbolo6, boolean cartaDescubierta6,
	char cartaSimbolo7, boolean cartaDescubierta7,
	char cartaSimbolo8, boolean cartaDescubierta8,
	char cartaSimbolo9, boolean cartaDescubierta9,
	char cartaSimbolo10, boolean cartaDescubierta10,
	char cartaSimbolo11, boolean cartaDescubierta11,
	char cartaSimbolo12, boolean cartaDescubierta12
	)
	{
		System.out.println("-----   -----   -----   -----");
		System.out.println("|   |   |   |   |   |   |   |");
		if (!cartaDescubierta1)
			System.out.print("| 1 |   ");
		else
		{
			switch (cartaSimbolo1)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		
		if (!cartaDescubierta2)
			System.out.print("| 2 |   ");
		else
		{
			switch (cartaSimbolo2)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		
		if (!cartaDescubierta3)
			System.out.print("| 3 |   ");
		else
		{
			switch (cartaSimbolo3)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		
		if (!cartaDescubierta4)
			System.out.print("| 4 |");
		else
		{
			switch (cartaSimbolo4)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		System.out.println("\n|   |   |   |   |   |   |   |");
		System.out.println("-----   -----   -----   -----");
		
		//Segunda fila
		
		System.out.println("-----   -----   -----   -----");
		System.out.println("|   |   |   |   |   |   |   |");
		if (!cartaDescubierta5)
			System.out.print("| 5 |   ");
		else
		{
			switch (cartaSimbolo5)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		if (!cartaDescubierta6)
			System.out.print("| 6 |   ");
		else
		{
			switch (cartaSimbolo6)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		
		if (!cartaDescubierta7)
			System.out.print("| 7 |   ");
		else
		{
			switch (cartaSimbolo7)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		
		if (!cartaDescubierta8)
			System.out.print("| 8 |");
		else
		{
			switch (cartaSimbolo8)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		System.out.println("\n|   |   |   |   |   |   |   |");
		System.out.println("-----   -----   -----   -----");
		
		//Tercera fila
		
		System.out.println("-----   -----   -----   -----");
		System.out.println("|   |   |   |   |   |   |   |");
		if (!cartaDescubierta9)
			System.out.print("| 9 |   ");
		else
		{
			switch (cartaSimbolo9)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		if (!cartaDescubierta10)
			System.out.print("|10 |   ");
		else
		{
			switch (cartaSimbolo10)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		
		if (!cartaDescubierta11)
			System.out.print("|11 |   ");
		else
		{
			switch (cartaSimbolo11)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		
		if (!cartaDescubierta12)
			System.out.print("|12 |");
		else
		{
			switch (cartaSimbolo12)
			{
				case 'A': System.out.print("| A |   "); break;
				case 'B': System.out.print("| B |   "); break;
				case 'C': System.out.print("| C |   "); break;
				case 'D': System.out.print("| D |   "); break;
				case 'E': System.out.print("| E |   "); break;
				case 'F': System.out.print("| F |   "); break;
			}
		}
		System.out.println("\n|   |   |   |   |   |   |   |");
		System.out.println("-----   -----   -----   -----");
	}

/* Estudio de la Interfaz:
 * 
 * Necesidades: 6 contadores, cada uno de cada símbolo
 * Devoluciones: Carácter
 * Nec/Dev: Ninguna
 * Restricciones: Cada contador será mayor de 0 y menor o igual a 2
*/ 

/* Interfaz:
 * 
 * Comentario: Calcula un número random, se asegura de que no haya salido más de 2 veces y lo asigna a una letra
 * Cabecera: Carácter CartasRandom(int ContA, int ContB, int ContC, int ContD, int ContE, int ContF)
 * Precondiciones: Cada contador será mayor de 0 y menor o igual a 2
 * Entradas: 6 contadores
 * Salidas: Carácter
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El carácter será devuelto asociado al nombre y será A, B, C, D, E o F 
 * 

	
	public static char CartasRandom (int ContA, int ContB, int ContC, int ContD, int ContE, int ContF)
	{
		char letra = 'A';
		return(letra);
	}
*/	
	public static char CartasRandom (int contA, int contB, int contC, int contD, int contE, int contF)
	{
		
		char letra = 'A';
		boolean simboloNoRepetido = true;
		int numeroRandom;
		
		Random random = new Random();
		
		do
		{
			numeroRandom = random.nextInt(6)+1;
			
			switch (numeroRandom)
			{
				case 1:
					if (contA < 2)
					{
						letra = 'A';
						simboloNoRepetido = true;
					}
					else
						simboloNoRepetido = false;
					
					break;
					
				case 2:
					if (contB < 2)
					{
						letra = 'B';
						simboloNoRepetido = true;
					}
					else
						simboloNoRepetido = false;
					
					break;
					
				case 3:
					if (contC < 2)
					{
						letra = 'C';
						simboloNoRepetido = true;
					}
					else
						simboloNoRepetido = false;
						
					break;
					
				case 4:
					if (contD < 2)
					{
						letra = 'D';
						simboloNoRepetido = true;
					}
					else
						simboloNoRepetido = false;
						
					break;
					
				case 5:
					if (contE < 2)
					{
						letra = 'E';
						simboloNoRepetido = true;
					}
					else
						simboloNoRepetido = false;
						
					break;
					
				case 6:
					if (contF < 2)
					{
						letra = 'F';
						simboloNoRepetido = true;
					}
					else
						simboloNoRepetido = false;
						
					break;
			}
			
		}while (!simboloNoRepetido);
		
		return(letra);
	}
}
