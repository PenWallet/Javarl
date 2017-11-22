import java.util.Scanner;
import java.io.*;

public class Cond_boletin5a_4_conversionFaC
{

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

	public static double ConversionFaC (double gradosF)
	{
		double gradosC;
		gradosC = (gradosF - 32) * (5/9.0);
		return(gradosC);
	}
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);	
		final double grados = 0;
		double resultado;
		
		resultado = ConversionFaC(grados);
		System.out.println(resultado);
	}
}
		
		
		
		
		
		
		
		
