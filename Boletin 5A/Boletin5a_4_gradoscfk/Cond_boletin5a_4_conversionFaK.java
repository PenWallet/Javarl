import java.util.Scanner;
import java.io.*;

public class Cond_boletin5a_4_conversionFaK
{

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

	public static double ConversionFaK (double gradosF)
	{
		double gradosK;
		gradosK = (gradosF + 459.67) * (5/9.0);
		return(gradosK);
	}
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);	
		double grados = 0;
		double resultado;
		
		resultado = ConversionFaK(grados);
		System.out.println(resultado);
		grados = -200;
		resultado = ConversionFaK(grados);
		System.out.println(resultado);
		grados = -100;
		resultado = ConversionFaK(grados);
		System.out.println(resultado);
		grados = -50;
		resultado = ConversionFaK(grados);
		System.out.println(resultado);
		grados = 50;
		resultado = ConversionFaK(grados);
		System.out.println(resultado);
		grados = 100;
		resultado = ConversionFaK(grados);
		System.out.println(resultado);
		grados = 200;
		resultado = ConversionFaK(grados);
		System.out.println(resultado);
	}
}
		
		
		
		
		
		
		
		
