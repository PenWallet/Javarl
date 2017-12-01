import java.util.Scanner;
import java.io.*;

public class Funciones
{
	public static void time()
	{
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e){};
	}
	
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: 12 caracteres y 12 booleans
 * Devoluciones: 
 * Nec/Dev: 
 * Restricciones: 
*/ 

/* Interfaz:
 * 
 * Comentario: 
 * Cabecera: 
 * Precondiciones: 
 * Entradas: 
 * Salidas: 
 * Entradas/Salidas: 
 * Postcondiciones: 
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
			System.out.println("| 1 |   ");
		else
		{
			if (cartaSimbolo1 == 'A')
				System.out.println("| A |   ");
			else
			{
				if (cartaSimbolo1 == 'B')
				System.out.println("| B |   ");
				else
				{
					if (cartaSimbolo1 == 'C')
					System.out.println("| C |   ");
					else
					{
						if (cartaSimbolo1 == 'D')
						System.out.println("| D |   ");
						else
						{
							if (cartaSimbolo1 == 'E')
							System.out.println("| E |   ");
							else
							{
								if (cartaSimbolo1 == 'F')
								System.out.println("| F |   ");
							}
						}
					}
				}
			}
		}
			
				
				
		
		System.out.println("| 1 |   | 2 |   | 3 |   | 4 |");
		System.out.println("|   |   |   |   |   |   |   |");
		System.out.println("-----   -----   -----   -----");
	}
}
		
		
		
		
		
		
		
		
		
