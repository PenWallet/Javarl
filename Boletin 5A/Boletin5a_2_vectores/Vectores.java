import java.io.*;

public class Vectores
{

/* Estudio de la Interfaz:
 * 
 * Necesidades: Ninguna
 * Devoluciones: Ninguna
 * Nec/Dev: Ninguna
 * Restricciones: Ninguna
*/ 

/* Interfaz:
 * 
 * Comentario: Pinta en pantalla el menú
 * Cabecera: PintarMenu()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna
 * 
*/

	public static void PintarMenu ()
	{
		System.out.println("\nElige una opción:");
		System.out.println("1. Calcular módulo de ambos");
		System.out.println("2. Vector suma");
		System.out.println("3. Calcular producto escalar");
		System.out.println("4. Calcular producto vectorial");
		System.out.println("\n9. Salir");
	}
	
// ***************************************************************************

/* Estudio de la Interfaz:
 * 
 * Necesidades: Vector
 * Devoluciones: Módulo (asociada al nombre //FUNCIÓN
 * Nec/Dev: Ninguna
 * Restricciones: Ninguna
*/ 

//Como Java no tiene tipo de dato Vector, y no tengo las destrezas necesarias (Asun no nos ha enseñado), convierto el vector en dos coordenadas

/* Interfaz:
 * 
 * Comentario: Calcula el módulo de un vector
 * Cabecera: double ModuloVector (int x, int y)
 * Precondiciones: Ninguna
 * Entradas: Coordenadas Vector
 * Salidas: Módulo
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El subprograma devolverá asociado al nombre el módulo calculado
*/
 
// ***************************************************************************

	public static double ModuloVector (int x, int y)
	{
		double modulo;
		modulo = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		return(modulo);
	}
	
// ***************************************************************************
 
/* Estudio de la Interfaz:
 * 
 * Necesidades: Coordenada X o Y de dos vectores distintos
 * Devoluciones: Suma de ambos
 * Nec/Dev: Ninguna
 * Restricciones: Ninguna
*/ 

/* Interfaz:
 * 
 * Comentario: Suma las coordenadas X o las coordenadas Y de dos vectores distintos
 * Cabecera: int VectorSuma (int cord1, int cord2)
 * Precondiciones: Ninguna
 * Entradas: Dos coordenadas X o Y
 * Salidas: 
 * Entradas/Salidas: 
 * Postcondiciones: 
 * 
*/
 
// ***************************************************************************

	public static int VectorSuma (int cord1, int cord2)
	{
		int cordFinal;
		cordFinal = cord1+cord2;
		return(cordFinal);
	}

// ***************************************************************************

/* Estudio interfaz:
 * 
 * Nombre subprograma: ProductoEscalar
 * Proceso que realiza: Realiza el producto escalar 
 * Precondiciones: Las coordenadas deben ser número enteros
 * Entradas: Dos vectores y un ángulo
 * Salidas: Producto escalar
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna
 */
 
// ***************************************************************************

	public static double ProductoEscalar (double angulo, int x1, int x2, int y1, int y2)
	{
		double modulo1;
		double modulo2;
		double productoEscalar;
		
		modulo1 = ModuloVector(x1, y1);
		modulo2 = ModuloVector(x2, y2);
		
		System.out.println(Math.toRadians(angulo));
		System.out.println(Math.cos(Math.toRadians(angulo)));
		
		productoEscalar = modulo1 * modulo2 * Math.cos(Math.toRadians(angulo));
		
		return(productoEscalar);
	}
}
		
		
		
		
		
		
		
		
		
