import java.io.*;
import java.util.Random;

public class Funciones
{
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Ninguna
 * Devoluciones: Ninguna
 * Nec/Dev: Ninguna
 * Restricciones: Ninguna
*/ 

/* Interfaz:
 * 
 * Comentario: Pinta menú en la pantalla
 * Cabecera: Menu()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El menú habrá sido pintado en pantalla
 * 
*/

	public static void Menu ()
	{
		System.out.println("|------------------------|");
		System.out.println("|           Menú         |");
		System.out.println("|------------------------|");
		System.out.println("|      1. Chicago        |");
		System.out.println("|      2. Barbudi        |");
		System.out.println("|      3. Chinos         |");
		System.out.println("|************************|");
		System.out.println("|        0. Salir        |");
		System.out.println("|------------------------|");
		System.out.println("\nElija una opción:");
	}
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Ninguna 
 * Devoluciones: Ninguna
 * Nec/Dev: Ninguna
 * Restricciones: Ninguna
*/ 

/* Interfaz:
 * 
 * Comentario: Retrasa la siguiente linea de ser ejecutada
 * Cabecera: Time ()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna
 * 
*/
	public static void Time()
	{
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e){};
	}
	
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Ninguna 
 * Devoluciones: Ninguna
 * Nec/Dev: Ninguna
 * Restricciones: Ninguna
*/ 

/* Interfaz:
 * 
 * Comentario: Retrasa la siguiente linea de ser ejecutada
 * Cabecera: Time ()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna
 * 
*/
	public static void TimeDados()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){};
	}
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Ninguna
 * Devoluciones: Número entre 1 y 6 (cara de un dado)
 * Nec/Dev: Ninguna
 * Restricciones: Ninguna
*/ 

/* Interfaz:
 * 
 * Comentario: Calcula un número entre 1 y 6, y escribe en pantalla el dado que ha salido
 * Cabecera: Entero Dados()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Número entero
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El número entero habrá sido calculado y pasado asociado al nombre
 * 
*/
	public static int Dados()
	{
		Random random = new Random();
		int dado;
		
		dado = random.nextInt(6)+1;
		
		switch(dado)
		{
			case 1:
				System.out.println("-------");
				System.out.println("|     |");
				System.out.println("|  *  |");
				System.out.println("|     |");
				System.out.println("-------");
				break;
				
			case 2:
				System.out.println("-------");
				System.out.println("| *   |");
				System.out.println("|     |");
				System.out.println("|   * |");
				System.out.println("-------");
				break;
				
			case 3:
				System.out.println("-------");
				System.out.println("| *   |");
				System.out.println("|  *  |");
				System.out.println("|   * |");
				System.out.println("-------");
				break;
				
			case 4:
				System.out.println("-------");
				System.out.println("| * * |");
				System.out.println("|     |");
				System.out.println("| * * |");
				System.out.println("-------");
				break;
				
			case 5:
				System.out.println("-------");
				System.out.println("| * * |");
				System.out.println("|  *  |");
				System.out.println("| * * |");
				System.out.println("-------");
				break;
				
			case 6:
				System.out.println("-------");
				System.out.println("| * * |");
				System.out.println("| * * |");
				System.out.println("| * * |");
				System.out.println("-------");
				break;
		}
		
		return(dado);
	}
	
}
		
		
		
		
		
