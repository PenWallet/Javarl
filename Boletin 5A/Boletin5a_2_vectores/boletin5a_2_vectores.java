/* Nombre del programa: boletin5a_2_vectores
 * 
 * Explicación:
 * Se pedirán dos vectores al usuario, con esos dos vectores, se realizarán 
 * operaciones, que se detallan en el Análisis
 * 
 * Análisis:
 * - Módulo: Se consigue haciendo la raíz cuadrada de la suma de los 
 * cuadrados de las dos coordenadas de cada vector
 *
 * - Vector suma: Se suman las 'x' y las 'y' de cada vector, y se suman.
 * 
 * - Producto escalar: Para este, adicionalmente, se requerirá pedir el
 * ángulo que forman los dos vectores.
 * 
 * - Producto vectorial: Este es más difícil y se dejará por ahora en construcción
 * 
 * Entradas:
 * - Coordenadas de vectores, que por simplicidad, solo podrán ser números enteros
 * - Dentro de Producto Escalar, ángulo que forman los vectores, otro número entero mayor o igual a 0
 * 
 * Salida:
 * - Módulo de los vectores
 * - Vector suma
 * - Producto escalar de los vectores
*/

 // **************************************************

/* Pseudocódigo Generalizado:
 * 	Inicio
 * 		Leer coordenadas de vectores
 * 		MostrarMenú* y leer y validar opción
 * 		Mientras (opcion != 9)
 * 			Según (opcion)
 * 				caso 1: Llamar a ModuloVectores y mostrar resultados
 * 				caso 2: Llamar a VectorSuma y mostrar resultados
 * 				caso 3: Llamar a ProductoEscalar y mostrar resultados
 * 				caso 4: Llamar a ProductoVectorial y mostrar resultados //En construcción
 * 			Fin Según
 * 			MostrarMenú* y leer y validar opción
 * 		Fin Mientras
 * 	Fin
*/

 // **************************************************

/* Pseudocódigos Específicos:
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
 * 		Leer y validar ángulo
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
		
		
		//MostrarMenú* y leer y validar opción
		do
		{
			Vectores.PintarMenu();
			opcion = teclado.next().charAt(0);
			if (opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4' && opcion != '9')
				System.out.println("¡Solo 1, 2, 3, 4 ó 9 para salir!");
		}while (opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4' && opcion != '9');
	
		while (opcion != '9')
		{
			switch (opcion) //Según (opcion)
			{
				case '1':
				modulo1 = Vectores.ModuloVector(x1, y1);
				System.out.println("El módulo de ("+x1+", "+y1+") es: "+modulo1);
				modulo2 = Vectores.ModuloVector(x2, y2);
				System.out.println("El módulo de ("+x2+", "+y2+") es: "+modulo2);
				break;
				
				
				case '2':
				x3 = Vectores.VectorSuma(x1, x2);
				y3 = Vectores.VectorSuma(y1, y2);
				System.out.println("El vector suma es: ("+x3+", "+y3+")");
				break;
				
				case '3':
				System.out.println("¿Cuál es el ángulo que forman los dos vectores? (Mayor o igual a 0)");
				angulo = teclado.nextDouble();
				
				productoEscalar = Vectores.ProductoEscalar(angulo, x1, x2, y1, y2);
				System.out.println("El producto escalar de ("+x1+", "+y1+") y de ("+x2+", "+y2+") es: "+productoEscalar);
				break;
				
				case '4':
				//En Resguardo
			}
			
			//MostrarMenú* y leer y validar opción
			do
			{
				Vectores.PintarMenu();
				opcion = teclado.next().charAt(0);
				if (opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4' && opcion != '9')
					System.out.println("¡Solo 1, 2, 3, 4 ó 9 para salir!");
			}while (opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4' && opcion != '9');
			
		}
	}
}
				
		
		
		
		
		
		
		
		
