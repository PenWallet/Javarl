import java.util.Scanner;
import java.io.*;

public class Conversion
{
	public static void Menu()
	{
		System.out.println("\nElija una de las opciones:");
		System.out.println("1. Convertir de Celsius a Fahrenheit");
		System.out.println("2. Convertir de Celsius a Kelvin");
		System.out.println("3. Convertir de Fahrenheit a Celsius");
		System.out.println("4. Convertir de Fahrenheit a Kelvin");
		System.out.println("5. Convertir de Kelvin a Celsius");
		System.out.println("6. Convertir de Kelvin a Fahrenheit");
		System.out.println("9. Salir");
	}
	
// *********************************************************************

/* Interfaz:   //hacer estudio de la interfaz (Necesidades, devoluciones, nec/dev, requisitos)
 * 
 * Proceso que realiza: Convierte grados C a F 
 * Cabecera: double CaF (double grados)
 * Precondiciones: El número debe ser mayor o igual a -273.15
 * Entradas: Número //grados
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número es mayor o igual a -459.67
 * 
 * //Revisar y corregir en el resto de interfaces
 * 
*/

	public static double CaF (double gradosC)
	{
		double gradosF;
		gradosF = (gradosC * 9/5.0) + 32;
		return(gradosF);
	}

// *********************************************************************

/* Estudio interfaz:
 * 
 * Proceso que realiza: Convierte grados C a K
 * Precondiciones: El número debe ser mayor o igual a -273.15
 * Entradas: Número
 * Salidas: Número 
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a 0
 * 
 * Cabecera:
 * double CaK (double grados)
*/
	
	public static double CaK (double gradosC)
	{
		double gradosK;
		gradosK = gradosC + 273.15;
		return(gradosK);
	}

// *********************************************************************

/* Estudio interfaz:
 * 
 * Proceso que realiza: Convierte grados F a C
 * Precondiciones: El número debe ser mayor o igual a -459.67
 * Entradas: Número
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a -273.15
 * 
 * Cabecera:
 * double FaC (double grados)
*/

	public static double FaC (double gradosF)
	{
		double gradosC;
		gradosC = (gradosF - 32) * (5/9.0);
		return(gradosC);
	}

// *********************************************************************

/* Estudio interfaz:
 * 
 * Proceso que realiza: Convierte grados F a K
 * Precondiciones: El número debe ser mayor o igual a -459.67
 * Entradas: Número
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a 0
 * 
 * Cabecera:
 * double FaK (double grados)
*/

	public static double FaK (double gradosF)
	{
		double gradosK;
		gradosK = (gradosF + 459.67) * (5/9.0);
		return(gradosK);
	}

// *********************************************************************

/* Estudio interfaz:
 * 
 * Proceso que realiza: Convierte grados K a C
 * Precondiciones: El número debe ser mayor o igual a 0
 * Entradas: Número
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a -273.15
 * 
 * Cabecera:
 * double KaC (double grados)
*/

	public static double KaC (double gradosK)
	{
		double gradosC;
		gradosC = gradosK - 273.15;
		return(gradosC);
	}

// *********************************************************************

/* Estudio interfaz:
 * 
 * Proceso que realiza: Convierte grados K a F
 * Precondiciones: El número debe ser mayor o igual a 0
 * Entradas: Número
 * Salidas: Número
 * Entradas/Salidas: No
 * Postcondiciones: El número debe ser mayor o igual a -459.67
 * 
 * Cabecera:
 * double KaF (double grados)
*/

	public static double KaF (double gradosK)
	{
		double gradosF;
		gradosF = (gradosK / (5/9.0)) - 459.67;
		return(gradosF);
	}

// *********************************************************************
}
		
		
		
		
		
		
		
		
