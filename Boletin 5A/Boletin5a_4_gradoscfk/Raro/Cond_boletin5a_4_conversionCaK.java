import java.util.Scanner;
import java.io.*;

public class Cond_boletin5a_4_conversionCaK
{

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
	
	public static double ConversionCaK (double gradosC)
	{
		double gradosK;
		gradosK = gradosC + 273.15;
		return(gradosK);
	}
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);	
		double grados = 0;
		double resultado;
		
		resultado = ConversionCaK(grados);
		System.out.println(resultado);
		grados = -200;
		resultado = ConversionCaK(grados);
		System.out.println(resultado);
		grados = -100;
		resultado = ConversionCaK(grados);
		System.out.println(resultado);
		grados = -50;
		resultado = ConversionCaK(grados);
		System.out.println(resultado);
		grados = 50;
		resultado = ConversionCaK(grados);
		System.out.println(resultado);
		grados = 100;
		resultado = ConversionCaK(grados);
		System.out.println(resultado);
		grados = 200;
		resultado = ConversionCaK(grados);
		System.out.println(resultado);
	}
}
		
		
		
		
		
		
		
		
