import java.util.Random;
import java.io.*;

public class Funciones
{
	public static void Menu()
	{
		System.out.println("|------------------|");
		System.out.println("|       Menú       |");
		System.out.println("|------------------|");
		System.out.println("|  1. 1 jugador    |");
		System.out.println("|  2. 2 jugadores  |");
		System.out.println("|------------------|");
	}
	
	public static void Time()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){};
	}
	
	
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
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
				System.out.print("| A |   ");
				break;
				
				case 'B':
				System.out.print("| B |   ");
				break;
				
				case 'C':
				System.out.print("| C |   ");
				break;
				
				case 'D':
				System.out.print("| D |   ");
				break;
				
				case 'E':
				System.out.print("| E |   ");
				break;
				
				case 'F':
				System.out.print("| F |   ");
				break;
			}
		}
		System.out.println("\n|   |   |   |   |   |   |   |");
		System.out.println("-----   -----   -----   -----");
	}
	
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
		
		
		
		
		
		
		
		
		
