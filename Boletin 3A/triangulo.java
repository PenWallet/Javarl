/* El programa consistirá en pedir al usuario que introduzca tres
 * variables, una por cada lado de un triángulo. Con estas tres
 * medidas, se calculará el área de dicho triángulo */

// Librerías importadas
import java.io.*;
import java.util.Scanner;
import java.lang.*;

// Inicio del programa
public class triangulo
{
	public static void main (String[] Args)
	{
		// Primero declaramos las variables
		byte n1 = 0;
		byte n2 = 0;
		byte n3 = 0;
		double area = 0;
		double s;
		
		// Luego declaramos el input
		Scanner teclado = new Scanner (System.in);
		
		// Ahora le pedimos al usuario que introduzca los valores
		System.out.println("¿Cuánto mide el primer lado?");
		n1 = teclado.nextByte();
		System.out.println("¿Cuánto mide el segundo lado?");
		n2 = teclado.nextByte();
		System.out.println("¿Cuánto mide el tercer lado?");
		n3 = teclado.nextByte();
		
		// Comprobar input y calcular
		if (n1 > 0 && n2 > 0 && n3 > 0)
		{
			// Primero calculamos s, como se pide en el ejercicio
			s = (n1+n2+n3)/2;
			
			// Una vez tenemos s, podemos calcular el área
			area = Math.sqrt(s*(s-n1)*(s-n2)*(s-n3));
			
			//Ahora mostramos el resultado en pantalla
			System.out.println("El área del triángulo es "+area);
		}
		else
		{
			System.out.println("¡Un lado no puede medir un número negativo!");
		}
	}
}
