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
 * �ngulo que forman los dos vectores. Mediante 
 * 
 * - Producto vectorial: Este es m�s dif�cil y se dejar� por ahora en construcci�n
 * 
 * Entradas:
 * - Coordenadas de vectores, que por simplicidad, solo podr�n ser n�meros enteros
 * - Dentro de Producto Escalar, �ngulo que forman los vectores, otro n�mero entero
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
 * 		Mostrar men� y leer y validar opci�n
 * 		Mientras (opcion != 9)
 * 			Seg�n (opcion)
 * 				caso 1: Llamar a ModuloVectores y mostrar resultados
 * 				caso 2: Llamar a VectorSuma y mostrar resultados
 * 				caso 3: Llamar a ProductoEscalar y mostrar resultados
 * 				caso 4: Llamar a ProductoVectorial y mostrar resultados //En construcci�n
 * 			Fin Seg�n
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

 // **************************************************

/* Estudio interfaz:
 * 
 * Nombre subprograma: ModuloVectores
 * Proceso que realiza: Calcula el m�dulo de dos vectores
 * Precondiciones: Las coordenadas deben ser n�mero enteros
 * Entradas: Dos vectores
 * Salidas: M�dulo de vectores
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna
 */
 
 // **************************************************
 
/* Estudio interfaz:
 * 
 * Nombre subprograma: VectorSuma
 * Proceso que realiza: Suma los dos vectores
 * Precondiciones: Las coordenadas deben ser n�mero enteros
 * Entradas: Dos vectores
 * Salidas: Suma de vectores
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna
 */
 
 // **************************************************

/* Estudio interfaz:
 * 
 * Nombre subprograma: ProductoEscalar
 * Proceso que realiza: Realiza el producto escalar 
 * Precondiciones: Las coordenadas deben ser n�mero enteros
 * Entradas: Dos vectores y un �ngulo
 * Salidas: Producto escalar
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna
 */
 
 // **************************************************
 




import java.util.Scanner;
import java.io.*;

public class boletin5a_2_vectores
{
	private static double ModuloVectorPrimero (int x1, int y1)
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
		
		//Leer coordenadas de vectores
		System.out.println("Introduce la coordenada X del primer vector:");
		x1 = teclado.nextInt();
		System.out.println("Introduce la coordenada Y del primer vector:");
		y1 = teclado.nextInt();
		System.out.println("Introduce la coordenada X del segundo vector:");
		x2 = teclado.nextInt();
		System.out.println("Introduce la coordenada Y del segundo vector:");
		y2 = teclado.nextInt();
		
		//Mostrar men� y leer y validar opci�n
		do
		{
			System.out.println("Elige una opci�n:");
			System.out.println("1. Calcular m�dulo de ambos");
			System.out.println("2. Vector suma");
			System.out.println("3. Calcular producto escalar");
			System.out.println("4. Calcular producto vectorial");
			System.out.println("\n 9.Salir");
			opcion = teclado.next().charAt(0);
			if (opcion != '1' || opcion != '2' || opcion != '3' || opcion != '4' || opcion != '9')
				System.out.println("�Solo 1, 2, 3, 4 � 9 para salir!");
		}while (opcion != '1' || opcion != '2' || opcion != '3' || opcion != '4' || opcion != '9')
		
		while(opcion != 9)
		{
			switch (opcion) //Seg�n (opcion)
			{
				case '1':
				//EC
				
				case '2':
				//EC
				
				case '3':
				//EC
				
				case '4':
				//EC
			}
		}
	}
}
				
		
		
		
		
		
		
		
		
