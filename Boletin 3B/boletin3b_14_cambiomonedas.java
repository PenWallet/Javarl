/* An�lisis:
 * Este programa ofrecer� la posibilidad de cambiar de Euros a otras
 * divisas.
 * 
 * Necesitaremos pedirle al usuario a qu� divisa desea cambiar, y
 * posteriormente, qu� cantidad.
 * Adem�s, el programa necesitar� poder volver a ejecutarse tantas veces
 * como el usuario desee.
 * Las monedas a las que podremos cambiar son:
 * Libras, D�lares, Coronas Checas
 * 
 * Entradas:
 * 	- A qu� divisa quiere cambiar, que ser� un caracter
 *  - Cantidad que desea cambiar, que deber� ser mayor o igual a 0
 * 
 * Salida:
 *  - Resultado del cambio de divisas
 * 
 * 
*/

/* Pseudoc�digo Generalizado:
 * 	Inicio
 * 		Declarar variables
 * 		Leer y validar si el usuario quiere ejecutar
 * 		Mientras el usuario quiera ejecutar
 * 			Declarar variables
 * 			Leer y validar divisa a cambiar
 * 			Mientras sea libra
 * 				Declarar variables de libra
 * 				Leer y validar cantidad
 * 				Calcular e imprimir cambio de moneda (E -> L)
 * 				Leer y validar si quiere volver a cambiar la misma moneda
 * 			Fin (Mientras sea libra)
 * 			Mientras sea D�lares
 * 				Declarar variables de d�lares
 * 				Leer y validar cantidad
 * 				Calcular e imprimir cambio de moneda (E -> D)
 * 				Leer y validar si quiere volver a cambiar la misma moneda
 * 			Fin (Mientras sea D�lares)
 * 			Mientras sea Coronas Checas
 * 				Declarar variables de coronas
 * 				Leer y validar cantidad
 * 				Calcular e imprimir cambio de moneda (E -> C)
 * 				Leer y validar si quiere volver a cambiar la misma moneda
 * 			Fin (Mientras sea Coronas Checas)
 * 			Leer y validar si quiere volver a ejecutar el programa
 * 		Fin (Mientras el usuario quiera ejecutar)
 * 	Fin
 * 			
 * 
 * 
 * Estudio de los bucles:
 * - Todos los bucles de este programa est�n controlados por datos centinelas
 * 
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;
import java.io.*;

public class boletin3b_14_cambiomonedas 
{
	
	public static void main (String[] args) 
	{
		//Declarar variables
		char bucleinicio;
		Scanner teclado = new Scanner (System.in);
		
		//Leer y validar si el usuario quiere ejecutar
		do
		{
			System.out.println("�Desea ejecutar el programa (Y / N)?");
			bucleinicio = Character.toUpperCase(teclado.next().charAt(0));
			if (bucleinicio != 'Y' && bucleinicio != 'N')
				System.out.println("�Solo Y o N!");
		} while (bucleinicio != 'Y' && bucleinicio != 'N');
		
		//Mientras el usuario quiera ejecutar
		while (bucleinicio == 'Y')
		{
			//Declarar variables
			char opcion;
			
			//Leer y validar divisa a cambiar
			System.out.println("Si deseas cambiar de Euros a Libras, escribe 'L'");
			System.out.println("Si deseas cambiar de Euros a D�lares, escribe 'D'");
			System.out.println("Si deseas cambiar de Euros a Coronas Checas, escribe 'C'");
			
			do
			{
				System.out.println("�A qu� divisa deseas cambiar?");
				opcion = Character.toUpperCase(teclado.next().charAt(0));
				if (opcion != 'L' && opcion != 'D' && opcion != 'C')
					System.out.println("�Solo 'L', 'D' o 'C'!");
			} while (opcion != 'L' && opcion != 'D' && opcion != 'C');
			
			//Mientras sea libra
			while (opcion == 'L')
			{
				//Declarar variables de libras
				float cantidad_l;
				char mismamoneda;
				
				//Leer y validar cantidad
				do
				{
					System.out.println("�Qu� cantidad deseas cambiar?");
					cantidad_l = teclado.nextFloat();
					if (cantidad_l < 0)
						System.out.println("�La cantidad no puede ser negativa!");
				} while (cantidad_l < 0);
				
				//Calcular e imprimir cambio de moneda (E -> L)
				System.out.println(cantidad_l + " euros son "+(cantidad_l * 0.89)+ " libras");
				
				//Leer y validar si quiere volver a cambiar la misma moneda
				do
				{
					System.out.println("�Quieres volver a cambiar la misma moneda? (Y / N)");
					mismamoneda = Character.toUpperCase(teclado.next().charAt(0));
					if (mismamoneda != 'Y' && mismamoneda != 'N')
						System.out.println("�Solo Y o N!");
				} while (mismamoneda != 'Y' && mismamoneda != 'N');
				
				if (mismamoneda == 'Y')
					opcion = 'L';
				else
					opcion = 'R';
				
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
