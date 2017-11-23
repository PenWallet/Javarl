import java.util.Scanner;
import java.io.*;

public class Cond_boletin5a_4_conversionCaF
{

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

	public static double ConversionCaF (double gradosC)
	{
		double gradosF;
		gradosF = (gradosC * 9/5.0) + 32;
		return(gradosF);
	}
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);	
		double grados = 0;
		double resultado;
		
		resultado = ConversionCaF(grados);
		System.out.println(resultado);
		grados = -200;
		resultado = ConversionCaF(grados);
		System.out.println(resultado);
		grados = -100;
		resultado = ConversionCaF(grados);
		System.out.println(resultado);
		grados = -50;
		resultado = ConversionCaF(grados);
		System.out.println(resultado);
		grados = 50;
		resultado = ConversionCaF(grados);
		System.out.println(resultado);
		grados = 100;
		resultado = ConversionCaF(grados);
		System.out.println(resultado);
		grados = 200;
		resultado = ConversionCaF(grados);
		System.out.println(resultado);
	}
}
		
		
		
		
		
		
		
		
