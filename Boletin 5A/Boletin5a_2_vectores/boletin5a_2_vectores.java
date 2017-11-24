/* Nombre del programa: boletin5a_2_vectores
 * 
 * Explicaci�n:
 * Se pedir�n dos vectores al usuario, con esos dos vectores, se realizar�n 
 * operaciones, que se detallan en el An�lisis
 * 
 * An�lisis:
 * - M�dulo: Se consigue haciendo la ra�z cuadrada de la suma de los 
 * cuadrados de las dos coordenadas de cada vector
 *
 * - Vector suma: Se suman las 'x' y las 'y' de cada vector, y se suman.
 * 
 * - Producto escalar: Para este, adicionalmente, se requerir� pedir el
 * �ngulo que forman los dos vectores.
 * 
 * - Producto vectorial: Este es m�s dif�cil y se dejar� por ahora en construcci�n
 * 
 * Entradas:
 * - Coordenadas de vectores, que por simplicidad, solo podr�n ser n�meros enteros
 * - Dentro de Producto Escalar, �ngulo que forman los vectores, otro n�mero entero mayor o igual a 0
 * 
 * Salida:
 * - M�dulo de los vectores
 * - Vector suma
 * - Producto escalar de los vectores
*/

 // **************************************************

/* Pseudoc�digo Generalizado:
 * 	Inicio
 * 		Leer coordenadas de vectores
 * 		MostrarMen�* y leer y validar opci�n
 * 		Mientras (opcion != 9)
 * 			Seg�n (opcion)
 * 				caso 1: Llamar a ModuloVectores y mostrar resultados
 * 				caso 2: Llamar a VectorSuma y mostrar resultados
 * 				caso 3: Llamar a ProductoEscalar y mostrar resultados
 * 				caso 4: Llamar a ProductoVectorial y mostrar resultados //En construcci�n
 * 			Fin Seg�n
 * 			MostrarMen�* y leer y validar opci�n
 * 		Fin Mientras
 * 	Fin
*/

 // **************************************************

/* Pseudoc�digos Espec�ficos:
 * 
 * //ModuloVectores
 * 	Inicio
 * 		Realizar operaciones
 * 		Devolver resultado a PP
 * 	Fin
 * 
 * //VectorSuma
 * 	Inicio
 * 		Realizar operaciones
 * 		Devolver resultado a PP
 * 	Fin
 * 
 * //ProductoEscalar
 * 	Inicio
 * 		Leer y validar �ngulo
 * 		Realizar operaciones
 * 		Devolver resultado a PP
 * 	Fin
 * 
*/

import java.util.Scanner;
import java.io.*;

public class boletin5a_2_vectores
{		
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);	
		
		int x1;
		int y1;
		int x2;
		int y2;
		char opcion;
		
		double modulo1;
		double modulo2;
		
		int x3;
		int y3;
		
		double angulo;
		double productoEscalar;
		
		//Leer coordenadas de vectores
		System.out.println("Introduce la coordenada X del primer vector:");
		x1 = teclado.nextInt();
		System.out.println("Introduce la coordenada Y del primer vector:");
		y1 = teclado.nextInt();
		System.out.println("Introduce la coordenada X del segundo vector:");
		x2 = teclado.nextInt();
		System.out.println("Introduce la coordenada Y del segundo vector:");
		y2 = teclado.nextInt();
		
		
		//MostrarMen�* y leer y validar opci�n
		do
		{
			Vectores.PintarMenu();
			opcion = teclado.next().charAt(0);
			if (opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4' && opcion != '9')
				System.out.println("�Solo 1, 2, 3, 4 � 9 para salir!");
		}while (opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4' && opcion != '9');
	
		while (opcion != '9')
		{
			switch (opcion) //Seg�n (opcion)
			{
				case '1':
				modulo1 = Vectores.ModuloVector(x1, y1);
				System.out.println("El m�dulo de ("+x1+", "+y1+") es: "+modulo1);
				modulo2 = Vectores.ModuloVector(x2, y2);
				System.out.println("El m�dulo de ("+x2+", "+y2+") es: "+modulo2);
				break;
				
				
				case '2':
				x3 = Vectores.VectorSuma(x1, x2);
				y3 = Vectores.VectorSuma(y1, y2);
				System.out.println("El vector suma es: ("+x3+", "+y3+")");
				break;
				
				case '3':
				System.out.println("�Cu�l es el �ngulo que forman los dos vectores? (Mayor o igual a 0)");
				angulo = teclado.nextDouble();
				
				productoEscalar = Vectores.ProductoEscalar(angulo, x1, x2, y1, y2);
				System.out.println("El producto escalar de ("+x1+", "+y1+") y de ("+x2+", "+y2+") es: "+productoEscalar);
				break;
				
				case '4':
				//En Resguardo
			}
			
			//MostrarMen�* y leer y validar opci�n
			do
			{
				Vectores.PintarMenu();
				opcion = teclado.next().charAt(0);
				if (opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4' && opcion != '9')
					System.out.println("�Solo 1, 2, 3, 4 � 9 para salir!");
			}while (opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4' && opcion != '9');
			
		}
	}
}
				
		
		
		
		
		
		
		
		
