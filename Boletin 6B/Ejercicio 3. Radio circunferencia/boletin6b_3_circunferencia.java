/* Nombre del programa: boletin6b_3_circunferencia
 * Descripción: Crear un programa dado el radio de una circunferencia calcule 
 * según opción del usuario la longitud de la misma, el área y el volumen de la esfera que determina
 * 
 * Análisis:
 * - Para calcular la longitud, usaremos la fórmula: 2 * PI * radio
 * - Para calcular el área, usaremos la fórmula: PI * radio al cuadrado
 * - Para calcular el volumen, usaremos la fórmula: 3/4 * PI * radio al cubo
 * 
 * Entradas:
 * - Radio de la circunferencia
 * 
 * Salidas:
 * - Menú
 * - Resultado de la Longitud
 * - Resultado del Área
 * - Resultado del Volumen
 * 
 * Requisitos:
 * - El radio será un número entero, mayor estricto de 0 y menor o igual a 133
*/

/* Pseudocódigo Generalizado:
 * Inicio
 * 	Leer y validar medida del radio
 * 	MostrarMenú * y leer y validar opción
 * 	Mientras (opcion != 0)
 * 		Según (opcion)
 * 			caso 1: CalcularLongitud *
 * 					Imprimir resultado de Longitud
 * 			caso 2: CalcularArea *
 * 					Imprimir resultado de Area
 * 			caso 3: CalcularVolumen *
 * 					Imprimir resultado de Volumen
 * 			caso 4: Leer y validar medida del radio
 * 		Fin Según
 * 		MostrarMenú * y leer y validar opción
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
		*  Descripción: Se repite mientras el usuario no introduzca un radio válido por teclado
		*  Inicialización VCB: Dentro del mismo bucle
		*  Actualización VCB: Dentro del mismo bucle
		*  Condición de entrada: radio <= 0 || radio > 133
		*  Condición de salida: radio > 0 && radio <= 133
		*/ 

		// ************************************************************************
		
		do
		{
			System.out.println("¿Cuál es el radio de tu circunferencia? (Número entero mayor que 0)");
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
		
		/* Nombre del bucle: Bucle Menú
		*  Tipo de VCB: Centinela
		*  Descripción: Se repite mientras el usuario no elija una opción disponible
		*  Inicialización VCB: Dentro del mismo bucle
		*  Actualización VCB: Dentro del mismo bucle
		*  Condición de entrada: opcion < 0 || opcion > 3
		*  Condición de salida: opcion >= 0 && opcion <= 3
		*/ 

		// ************************************************************************
		
		//MostrarMenú * y leer y validar opción
		do
		{
			FuncionesCircunferencia.mostrarMenu();
			opcion = teclado.next().charAt(0);
			if (opcion < '0' || opcion > '4')
				System.out.println("¡Solo 1, 2, 3 o 4! O pulse 0 para salir");
		}while (opcion < '0' || opcion > '4');
		
		// ************************************************************************
		
		/* Nombre del bucle: Bucle Programa
		*  Tipo de VCB: Centinela
		*  Descripción: Se repite mientras el usuario quiera
		*  Inicialización VCB: Lectura anticipada
		*  Actualización VCB: Lectura al final del bucle
		*  Condición de entrada: opcion < 0 || opcion > 3
		*  Condición de salida: opcion >= 0 && opcion <= 3
		*/ 

		// ************************************************************************
		
		while(opcion != '0') //Mientras (opcion != '0')
		{
			switch (opcion) //Según (opción)
			{
				case '1':
				longitud = FuncionesCircunferencia.calcularLongitud(radio);
				
				//Imprimir resultado de Longitud
				System.out.println("\nLa longitud de la circunferencia de radio "+radio+" es "+longitud);
				
				break;
				
				case '2':
				area = FuncionesCircunferencia.calcularArea(radio);
				
				//Imprimir resultado de Área
				System.out.println("\nEl área de la circunferencia de radio "+radio+" es "+area);
				
				break;
				
				case '3':
				volumen = FuncionesCircunferencia.calcularVolumen(radio);
				
				//Imprimir resultado de Área
				System.out.println("\nEl volumen de la esfera de radio "+radio+" es "+volumen);
				
				break;
				
				case '4':
				do
				{
					System.out.println("¿Cuál es el radio de tu circunferencia? (Número entero mayor que 0)");
					radio = teclado.nextInt();
					if (radio <= 0 || radio > 133)
						System.out.println("El radio no puede ser menor que 0");
				}while (radio <= 0 || radio > 133);
				
				break;
				
			} //Fin Según
			
			//MostrarMenú * y leer y validar opción
			do
			{
				FuncionesCircunferencia.mostrarMenu();
				opcion = teclado.next().charAt(0);
				if (opcion < '0' || opcion > '4')
					System.out.println("¡Solo 1, 2, 3 o 4! O pulse 0 para salir");
			}while (opcion < '0' || opcion > '4');
			
		} //Fin mientras
		
	}
	
}
		
		
		
		
		
		
		
		
		
