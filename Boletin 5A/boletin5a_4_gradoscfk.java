/* Nombre del programa: boletin5a_4_gradoscfk
 * Descripción: Diseñar un programa que permita cambiar de grados Celsius 
 * a Fahrenheit o Kelvin, o cualquier cambio posible entre ellos, según elija el usuario.
 * 
 * Análisis:
 * Nada difícil ni que considere que haya que mencionar
 * 
 * Entradas:
 * - Grados
 * 
 * Salidas:
 * - Grados convertidos
 * 
*/

/* Pseudocódigo Generalizado:
 * 	Inicio
 * 		Mientras (opcion != 9)
 * 			Mostrar menú y leer y validar opción
 * 			Según (opcion)
 * 				caso 1: Leer y validar grados y llamar a ConversionCaF
 * 				caso 2: Leer y validar grados y llamar a ConversionCaK
 * 				caso 3: Leer y validar grados y llamar a ConversionFaC
 * 				caso 4: Leer y validar grados y llamar a ConversionFaK
 * 				caso 5: Leer y validar grados y llamar a ConversionKaC
 * 				caso 6: Leer y validar grados y llamar a ConversionKaF
 * 			Fin Según
 * 		Fin Mientras
 * 	Fin
*/

/* Estudio interfaz:
 * 
 * Nombre subprograma: ConversionCaF
 * Proceso que realiza: Convierte grados C a F 
 * Precondiciones: El número debe ser mayor o igual a -273.15
 * Entradas: Número
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a -459.67
 * 
 * Cabecera:
 * double ConversionCaF (double grados)
*/

/* Estudio interfaz:
 * 
 * Nombre subprograma: ConversionCaK
 * Proceso que realiza: Convierte grados C a K
 * Precondiciones: El número debe ser mayor o igual a -273.15
 * Entradas: Número
 * Salidas: Número 
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a 0
 * 
 * Cabecera:
 * double ConversionCaK (double grados)
*/

/* Estudio interfaz:
 * 
 * Nombre subprograma: ConversionFaC
 * Proceso que realiza: Convierte grados F a C
 * Precondiciones: El número debe ser mayor o igual a -459.67
 * Entradas: Número
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a -273.15
 * 
 * Cabecera:
 * double ConversionFaC (double grados)
*/

/* Estudio interfaz:
 * 
 * Nombre subprograma: ConversionFaK
 * Proceso que realiza: Convierte grados F a K
 * Precondiciones: El número debe ser mayor o igual a -459.67
 * Entradas: Número
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a 0
 * 
 * Cabecera:
 * double ConversionFaK (double grados)
*/

/* Estudio interfaz:
 * 
 * Nombre subprograma: ConversionKaC
 * Proceso que realiza: Convierte grados K a C
 * Precondiciones: El número debe ser mayor o igual a 0
 * Entradas: Número
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a -273.15
 * 
 * Cabecera:
 * double ConversionKaC (double grados)
*/

/* Estudio interfaz:
 * 
 * Nombre subprograma: ConversionKaF
 * Proceso que realiza: Convierte grados K a F
 * Precondiciones: El número debe ser mayor o igual a 0
 * Entradas: Número
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a -459.67
 * 
 * Cabecera:
 * double ConversionKaF (double grados)
*/




import java.util.Scanner;
import java.io.*;

public class boletin5a_4_gradoscfk
{
	public static double ConversionCaF (double gradosC)
	{
		double gradosF;
		gradosF = (gradosC * 9/5.0) + 32;
		return(gradosF);
	}
	
	public static double ConversionCaK (double gradosC)
	{
		double gradosK;
		gradosK = gradosC + 273.15;
		return(gradosK);
	}
	
	public static double ConversionFaC (double gradosF)
	{
		double gradosC;
		gradosC = (gradosF - 32) * (5/9.0);
		return(gradosC);
	}
	
	public static double ConversionFaK (double gradosF)
	{
		double gradosK;
		gradosK = (gradosF + 459.67) * (5/9.0);
		return(gradosK);
	}
	
	public static double ConversionKaC (double gradosK)
	{
		double gradosC;
		gradosC = gradosK - 273.15;
		return(gradosC);
	}
	
	public static double ConversionKaF (double gradosK)
	{
		double gradosF;
		gradosF = (gradosK / (5/9.0)) - 459.67;
		return(gradosF);
	}
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);
		char opcion = '0';
		double grados;
		double gradosConvertidos;
		
		while (opcion != '9')
		{
			//Mostrar menú y leer y validar opcion
			System.out.println("\nElija una de las opciones:");
			System.out.println("1. Convertir de Celsius a Fahrenheit");
			System.out.println("2. Convertir de Celsius a Kelvin");
			System.out.println("3. Convertir de Fahrenheit a Celsius");
			System.out.println("4. Convertir de Fahrenheit a Kelvin");
			System.out.println("5. Convertir de Kelvin a Celsius");
			System.out.println("6. Convertir de Kelvin a Fahrenheit");
			System.out.println("9. Salir");
			
			do
			{
				opcion = teclado.next().charAt(0);
				if ((opcion < '1' || opcion > '6') && opcion != '9')
					System.out.println("¡Solo del 1 al 6 o el 9 para salir!");
			}while ((opcion < '1' || opcion > '6') && opcion != '9');
		
		
			switch (opcion) //Según (opcion)
			{
				case '1':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Celsius deseas convertir a Fahrenheit?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -273.15)
						System.out.println("¡Los grados Celsius no pueden ser menores a -273.15!");
				}while (grados < -273.15);
				
				//Llamar a ConversionCaF
				gradosConvertidos = ConversionCaF(grados);
				System.out.println(grados+"ºC son "+gradosConvertidos+"ºF");
				
				break;
				
				case '2':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Celsius deseas convertir a Kelvin?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -273.15)
						System.out.println("¡Los grados Celsius no pueden ser menores a -273.15!");
				}while (grados < -273.15);
				
				//Llamar a ConversionCaF
				gradosConvertidos = ConversionCaK(grados);
				System.out.println(grados+"ºC son "+gradosConvertidos+"K");
				
				break;
				
				case '3':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Fahrenheit deseas convertir a Celsius?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -459.67)
						System.out.println("¡Los grados Fahrenheit no pueden ser menores a -459.67!");
				}while (grados < -459.67);
				
				//Llamar a ConversionFaC
				gradosConvertidos = ConversionFaC(grados);
				System.out.println(grados+"ºF son "+gradosConvertidos+"ºC");
				
				break;
				
				case '4':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Fahrenheit deseas convertir a Kelvin?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < -459.67)
						System.out.println("¡Los grados Fahrenheit no pueden ser menores a -459.67!");
				}while (grados < -459.67);
				
				//Llamar a ConversionFaK
				gradosConvertidos = ConversionFaK(grados);
				System.out.println(grados+"ºF son "+gradosConvertidos+"K");
				
				break;
				
				case '5':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Kelvin deseas convertir a Celsius?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < 0)
						System.out.println("¡Los grados Kelvin no pueden ser menores a 0!");
				}while (grados < 0);
				
				//Llamar a ConversionKaC
				gradosConvertidos = ConversionKaC(grados);
				System.out.println(grados+"K son "+gradosConvertidos+"ºC");
				
				break;
				
				case '6':
				//Leer y validar grados
				System.out.println("\n¿Cuántos grados Kelvin deseas convertir a Fahrenheit?");
				do
				{
					grados = teclado.nextDouble();
					if (grados < 0)
						System.out.println("¡Los grados Kelvin no pueden ser menores a 0!");
				}while (grados < 0);
				
				//Llamar a ConversionKaF
				gradosConvertidos = ConversionKaF(grados);
				System.out.println(grados+"K son "+gradosConvertidos+"ºF");
				
				break;
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
