import java.util.Scanner;
import java.io.*;

public class Cond_boletin5a_4_conversionKaC
{

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

	public static double ConversionKaC (double gradosK)
	{
		double gradosC;
		gradosC = gradosK - 273.15;
		return(gradosC);
	}
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);	
		final double grados = 0;
		double resultado;
		
		resultado = ConversionKaC(grados);
		System.out.println(resultado);
	}
}
		
		
		
		
		
		
		
		
