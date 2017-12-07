import java.util.Scanner;
import java.io.*;

public class Funciones
{
	public static void time()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){};
	}
	
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: 12 caracteres y 12 booleans
 * Devoluciones: Ninguna
 * Nec/Dev: Ninguna
 * Restricciones: El carácter solo podrá ser A, B, C, D, E o F
*/ 

/* Interfaz:
 * 
 * Comentario: Pintará en pantalla el estado de la partida
 * Cabecera: CartasPantalla(y todas las variables char y boolean aquí)
 * Precondiciones: Los caracteres solo son A, B, C, D, E o F
 * Entradas: 12 caracteres y 12 booleans
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna, solo pinta en pantalla
 * 
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
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		
		if (!cartaDescubierta2)
			System.out.print("| 2 |   ");
		else
		{
			switch (cartaSimbolo2)
			{
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		
		if (!cartaDescubierta3)
			System.out.print("| 3 |   ");
		else
		{
			switch (cartaSimbolo3)
			{
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		
		if (!cartaDescubierta4)
			System.out.print("| 4 |");
		else
		{
			switch (cartaSimbolo4)
			{
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
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
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		if (!cartaDescubierta6)
			System.out.print("| 6 |   ");
		else
		{
			switch (cartaSimbolo6)
			{
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		
		if (!cartaDescubierta7)
			System.out.print("| 7 |   ");
		else
		{
			switch (cartaSimbolo7)
			{
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		
		if (!cartaDescubierta8)
			System.out.print("| 8 |");
		else
		{
			switch (cartaSimbolo8)
			{
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
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
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		if (!cartaDescubierta10)
			System.out.print("|10 |   ");
		else
		{
			switch (cartaSimbolo10)
			{
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		
		if (!cartaDescubierta11)
			System.out.print("|11 |   ");
		else
		{
			switch (cartaSimbolo11)
			{
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		
		if (!cartaDescubierta12)
			System.out.print("|12 |");
		else
		{
			switch (cartaSimbolo12)
			{
				case 'A':
				System.out.println("| A |   ");
				break;
				
				case 'B':
				System.out.println("| B |   ");
				break;
				
				case 'C':
				System.out.println("| C |   ");
				break;
				
				case 'D':
				System.out.println("| D |   ");
				break;
				
				case 'E':
				System.out.println("| E |   ");
				break;
				
				case 'F':
				System.out.println("| F |");
				break;
			}
		}
		System.out.println("\n|   |   |   |   |   |   |   |");
		System.out.println("-----   -----   -----   -----");
	}
}
		
		
		
		
		
		
		
		
		
