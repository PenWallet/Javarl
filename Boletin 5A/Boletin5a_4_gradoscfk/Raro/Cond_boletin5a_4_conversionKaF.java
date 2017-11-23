import java.util.Scanner;
import java.io.*;

public class Cond_boletin5a_4_conversionKaF
{

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
		double grados = 0;
		double resultado;
		
		resultado = ConversionKaF(grados);
		System.out.println(resultado);
		grados = -200;
		resultado = ConversionKaF(grados);
		System.out.println(resultado);
		grados = -100;
		resultado = ConversionKaF(grados);
		System.out.println(resultado);
		grados = -50;
		resultado = ConversionKaF(grados);
		System.out.println(resultado);
		grados = 50;
		resultado = ConversionKaF(grados);
		System.out.println(resultado);
		grados = 100;
		resultado = ConversionKaF(grados);
		System.out.println(resultado);
		grados = 200;
		resultado = ConversionKaF(grados);
		System.out.println(resultado);
	}
}
		
		
		
		
		
		
		
		
