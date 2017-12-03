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
			System.out.print("| 1 |   ");
		else
		{
			if (cartaSimbolo1 == 'A')
				System.out.print("| A |   ");
			else
			{
				if (cartaSimbolo1 == 'B')
				System.out.print("| B |   ");
				else
				{
					if (cartaSimbolo1 == 'C')
					System.out.print("| C |   ");
					else
					{
						if (cartaSimbolo1 == 'D')
						System.out.print("| D |   ");
						else
						{
							if (cartaSimbolo1 == 'E')
							System.out.print("| E |   ");
							else
							{
								if (cartaSimbolo1 == 'F')
								System.out.print("| F |   ");
							}
						}
					}
				}
			}
		}
		if (!cartaDescubierta2)
			System.out.print("| 2 |   ");
		else
		{
			if (cartaSimbolo2 == 'A')
				System.out.print("| A |   ");
			else
			{
				if (cartaSimbolo2 == 'B')
				System.out.print("| B |   ");
				else
				{
					if (cartaSimbolo2 == 'C')
					System.out.print("| C |   ");
					else
					{
						if (cartaSimbolo2 == 'D')
						System.out.print("| D |   ");
						else
						{
							if (cartaSimbolo2 == 'E')
							System.out.print("| E |   ");
							else
							{
								if (cartaSimbolo2 == 'F')
								System.out.print("| F |   ");
							}
						}
					}
				}
			}
		}
		
		if (!cartaDescubierta3)
			System.out.print("| 3 |   ");
		else
		{
			if (cartaSimbolo3 == 'A')
				System.out.print("| A |   ");
			else
			{
				if (cartaSimbolo3 == 'B')
				System.out.print("| B |   ");
				else
				{
					if (cartaSimbolo3 == 'C')
					System.out.print("| C |   ");
					else
					{
						if (cartaSimbolo3 == 'D')
						System.out.print("| D |   ");
						else
						{
							if (cartaSimbolo3 == 'E')
							System.out.print("| E |   ");
							else
							{
								if (cartaSimbolo3 == 'F')
								System.out.print("| F |   ");
							}
						}
					}
				}
			}
		}
		
		if (!cartaDescubierta4)
			System.out.print("| 4 |");
		else
		{
			if (cartaSimbolo4 == 'A')
				System.out.print("| A |");
			else
			{
				if (cartaSimbolo4 == 'B')
				System.out.print("| B |");
				else
				{
					if (cartaSimbolo4 == 'C')
					System.out.print("| C |");
					else
					{
						if (cartaSimbolo4 == 'D')
						System.out.print("| D |");
						else
						{
							if (cartaSimbolo4 == 'E')
							System.out.print("| E |");
							else
							{
								if (cartaSimbolo4 == 'F')
								System.out.print("| F |");
							}
						}
					}
				}
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
			if (cartaSimbolo5 == 'A')
				System.out.print("| A |   ");
			else
			{
				if (cartaSimbolo5 == 'B')
				System.out.print("| B |   ");
				else
				{
					if (cartaSimbolo5 == 'C')
					System.out.print("| C |   ");
					else
					{
						if (cartaSimbolo5 == 'D')
						System.out.print("| D |   ");
						else
						{
							if (cartaSimbolo5 == 'E')
							System.out.print("| E |   ");
							else
							{
								if (cartaSimbolo5 == 'F')
								System.out.print("| F |   ");
							}
						}
					}
				}
			}
		}
		if (!cartaDescubierta6)
			System.out.print("| 6 |   ");
		else
		{
			if (cartaSimbolo6 == 'A')
				System.out.print("| A |   ");
			else
			{
				if (cartaSimbolo6 == 'B')
				System.out.print("| B |   ");
				else
				{
					if (cartaSimbolo6 == 'C')
					System.out.print("| C |   ");
					else
					{
						if (cartaSimbolo6 == 'D')
						System.out.print("| D |   ");
						else
						{
							if (cartaSimbolo6 == 'E')
							System.out.print("| E |   ");
							else
							{
								if (cartaSimbolo6 == 'F')
								System.out.print("| F |   ");
							}
						}
					}
				}
			}
		}
		
		if (!cartaDescubierta7)
			System.out.print("| 7 |   ");
		else
		{
			if (cartaSimbolo7 == 'A')
				System.out.print("| A |   ");
			else
			{
				if (cartaSimbolo7 == 'B')
				System.out.print("| B |   ");
				else
				{
					if (cartaSimbolo7 == 'C')
					System.out.print("| C |   ");
					else
					{
						if (cartaSimbolo7 == 'D')
						System.out.print("| D |   ");
						else
						{
							if (cartaSimbolo7 == 'E')
							System.out.print("| E |   ");
							else
							{
								if (cartaSimbolo7 == 'F')
								System.out.print("| F |   ");
							}
						}
					}
				}
			}
		}
		
		if (!cartaDescubierta8)
			System.out.print("| 8 |");
		else
		{
			if (cartaSimbolo8 == 'A')
				System.out.print("| A |");
			else
			{
				if (cartaSimbolo8 == 'B')
				System.out.print("| B |");
				else
				{
					if (cartaSimbolo8 == 'C')
					System.out.print("| C |");
					else
					{
						if (cartaSimbolo8 == 'D')
						System.out.print("| D |");
						else
						{
							if (cartaSimbolo8 == 'E')
							System.out.print("| E |");
							else
							{
								if (cartaSimbolo8 == 'F')
								System.out.print("| F |");
							}
						}
					}
				}
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
			if (cartaSimbolo9 == 'A')
				System.out.print("| A |   ");
			else
			{
				if (cartaSimbolo9 == 'B')
				System.out.print("| B |   ");
				else
				{
					if (cartaSimbolo9 == 'C')
					System.out.print("| C |   ");
					else
					{
						if (cartaSimbolo9 == 'D')
						System.out.print("| D |   ");
						else
						{
							if (cartaSimbolo9 == 'E')
							System.out.print("| E |   ");
							else
							{
								if (cartaSimbolo9 == 'F')
								System.out.print("| F |   ");
							}
						}
					}
				}
			}
		}
		if (!cartaDescubierta10)
			System.out.print("|10 |   ");
		else
		{
			if (cartaSimbolo10 == 'A')
				System.out.print("| A |   ");
			else
			{
				if (cartaSimbolo10 == 'B')
				System.out.print("| B |   ");
				else
				{
					if (cartaSimbolo10 == 'C')
					System.out.print("| C |   ");
					else
					{
						if (cartaSimbolo10 == 'D')
						System.out.print("| D |   ");
						else
						{
							if (cartaSimbolo10 == 'E')
							System.out.print("| E |   ");
							else
							{
								if (cartaSimbolo10 == 'F')
								System.out.print("| F |   ");
							}
						}
					}
				}
			}
		}
		
		if (!cartaDescubierta11)
			System.out.print("|11 |   ");
		else
		{
			if (cartaSimbolo11 == 'A')
				System.out.print("| A |   ");
			else
			{
				if (cartaSimbolo11 == 'B')
				System.out.print("| B |   ");
				else
				{
					if (cartaSimbolo11 == 'C')
					System.out.print("| C |   ");
					else
					{
						if (cartaSimbolo11 == 'D')
						System.out.print("| D |   ");
						else
						{
							if (cartaSimbolo11 == 'E')
							System.out.print("| E |   ");
							else
							{
								if (cartaSimbolo11 == 'F')
								System.out.print("| F |   ");
							}
						}
					}
				}
			}
		}
		
		if (!cartaDescubierta12)
			System.out.print("|12 |");
		else
		{
			if (cartaSimbolo12 == 'A')
				System.out.print("| A |");
			else
			{
				if (cartaSimbolo12 == 'B')
				System.out.print("| B |");
				else
				{
					if (cartaSimbolo12 == 'C')
					System.out.print("| C |");
					else
					{
						if (cartaSimbolo12 == 'D')
						System.out.print("| D |");
						else
						{
							if (cartaSimbolo12 == 'E')
							System.out.print("| E |");
							else
							{
								if (cartaSimbolo12 == 'F')
								System.out.print("| F |");
							}
						}
					}
				}
			}
		}
		System.out.println("\n|   |   |   |   |   |   |   |");
		System.out.println("-----   -----   -----   -----");
	}
}
		
		
		
		
		
		
		
		
		
