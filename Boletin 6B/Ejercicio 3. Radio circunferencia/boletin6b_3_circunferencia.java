/* Nombre del programa: boletin6b_3_circunferencia
 * Descripci�n: Crear un programa dado el radio de una circunferencia calcule 
 * seg�n opci�n del usuario la longitud de la misma, el �rea y el volumen de la esfera que determina
 * 
 * An�lisis:
 * - Para calcular la longitud, usaremos la f�rmula: 2 * PI * radio
 * - Para calcular el �rea, usaremos la f�rmula: PI * radio al cuadrado
 * - Para calcular el volumen, usaremos la f�rmula: 3/4 * PI * radio al cubo
 * 
 * Entradas:
 * - Radio de la circunferencia
 * 
 * Salidas:
 * - Men�
 * - Resultado de la Longitud
 * - Resultado del �rea
 * - Resultado del Volumen
 * 
 * Requisitos:
 * - El radio ser� un n�mero entero, mayor estricto de 0 y menor o igual a 133
*/

/* Pseudoc�digo Generalizado:
 * Inicio
 * 	Leer y validar medida del radio
 * 	MostrarMen� * y leer y validar opci�n
 * 	Mientras (opcion != 0)
 * 		Seg�n (opcion)
 * 			caso 1: CalcularLongitud *
 * 					Imprimir resultado de Longitud
 * 			caso 2: CalcularArea *
 * 					Imprimir resultado de Area
 * 			caso 3: CalcularVolumen *
 * 					Imprimir resultado de Volumen
 * 			caso 4: Leer y validar medida del radio
 * 		Fin Seg�n
 * 		MostrarMen� * y leer y validar opci�n
 * 	Fin Mientras
 * Fin
 * 
*/

import java.util.Scanner;
import java.io.*;

public class boletin6b_3_circunferencia
{
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);
		char opcion;
		int radio;
		byte contadorError = 0;
		boolean contadorErrorVoF = false;
		double longitud;
		double area;
		double volumen;
		
		// ************************************************************************
		
		/* Nombre del bucle: Bucle Radio
		*  Tipo de VCB: Centinela
		*  Descripci�n: Se repite mientras el usuario no introduzca un radio v�lido por teclado
		*  Inicializaci�n VCB: Dentro del mismo bucle
		*  Actualizaci�n VCB: Dentro del mismo bucle
		*  Condici�n de entrada: radio <= 0 || radio > 133
		*  Condici�n de salida: radio > 0 && radio <= 133
		*/ 

		// ************************************************************************
		
		do
		{
			System.out.println("�Cu�l es el radio de tu circunferencia? (N�mero entero mayor que 0)");
			radio = teclado.nextInt();
			if (radio <= 0 || radio > 133)
			{
				System.out.println("El radio no puede ser menor que 0");
				contadorError++;
				if (contadorError >= 3 && !contadorErrorVoF)
				{
					System.out.println("QUE FUNCIONA BIEEEEEEEEEEEN");
					contadorErrorVoF = true;
				}
			}
		}while (radio <= 0 || radio > 133);
		
		
		// ************************************************************************
		
		/* Nombre del bucle: Bucle Men�
		*  Tipo de VCB: Centinela
		*  Descripci�n: Se repite mientras el usuario no elija una opci�n disponible
		*  Inicializaci�n VCB: Dentro del mismo bucle
		*  Actualizaci�n VCB: Dentro del mismo bucle
		*  Condici�n de entrada: opcion < 0 || opcion > 3
		*  Condici�n de salida: opcion >= 0 && opcion <= 3
		*/ 

		// ************************************************************************
		
		//MostrarMen� * y leer y validar opci�n
		do
		{
			FuncionesCircunferencia.mostrarMenu();
			opcion = teclado.next().charAt(0);
			if (opcion < '0' || opcion > '4')
				System.out.println("�Solo 1, 2, 3 o 4! O pulse 0 para salir");
		}while (opcion < '0' || opcion > '4');
		
		// ************************************************************************
		
		/* Nombre del bucle: Bucle Programa
		*  Tipo de VCB: Centinela
		*  Descripci�n: Se repite mientras el usuario quiera
		*  Inicializaci�n VCB: Lectura anticipada
		*  Actualizaci�n VCB: Lectura al final del bucle
		*  Condici�n de entrada: opcion < 0 || opcion > 3
		*  Condici�n de salida: opcion >= 0 && opcion <= 3
		*/ 

		// ************************************************************************
		
		while(opcion != '0') //Mientras (opcion != '0')
		{
			switch (opcion) //Seg�n (opci�n)
			{
				case '1':
				longitud = FuncionesCircunferencia.calcularLongitud(radio);
				
				//Imprimir resultado de Longitud
				System.out.println("\nLa longitud de la circunferencia de radio "+radio+" es "+longitud);
				
				break;
				
				case '2':
				area = FuncionesCircunferencia.calcularArea(radio);
				
				//Imprimir resultado de �rea
				System.out.println("\nEl �rea de la circunferencia de radio "+radio+" es "+area);
				
				break;
				
				case '3':
				volumen = FuncionesCircunferencia.calcularVolumen(radio);
				
				//Imprimir resultado de �rea
				System.out.println("\nEl volumen de la esfera de radio "+radio+" es "+volumen);
				
				break;
				
				case '4':
				do
				{
					System.out.println("�Cu�l es el radio de tu circunferencia? (N�mero entero mayor que 0)");
					radio = teclado.nextInt();
					if (radio <= 0 || radio > 133)
						System.out.println("El radio no puede ser menor que 0");
				}while (radio <= 0 || radio > 133);
				
				break;
				
			} //Fin Seg�n
			
			//MostrarMen� * y leer y validar opci�n
			do
			{
				FuncionesCircunferencia.mostrarMenu();
				opcion = teclado.next().charAt(0);
				if (opcion < '0' || opcion > '4')
					System.out.println("�Solo 1, 2, 3 o 4! O pulse 0 para salir");
			}while (opcion < '0' || opcion > '4');
			
		} //Fin mientras
		
	}
	
}
		
		
		
		
		
		
		
		
		
