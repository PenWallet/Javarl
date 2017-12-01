import java.io.*;

public class FuncionesCircunferencia
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
 * Comentario: Muestra el men� del PP
 * Cabecera: MostrarMenu ()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: No hay, solo pinta en pantalla.
 * 
*/
	
	public static void mostrarMenu () 
	{
		System.out.println("\nElija una opci�n:");
		System.out.println("1. Calcular la longitud de la circunferencia");
		System.out.println("2. Calcular el �rea del c�rculo que encierra");
		System.out.println("3. Calcular el volumen de la esfera que forma");
		System.out.println("4. Cambiar radio");
		System.out.println("0. Salir");
	}
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Radio de la circunferencia
 * Devoluciones: Longitud de la misma
 * Nec/Dev: Ninguna
 * Restricciones: El radio debe ser mayor que 0 y menor o igual a 133
*/ 

/* Interfaz:
 * 
 * Comentario: Este subprograma calcula la longitud de la circunferencia
 * Cabecera: double CalcularLongitud (int radio)
 * Precondiciones: El radio debe ser mayor que 0 y menor o igual a 133
 * Entradas: Entero radio
 * Salidas: Double longitud
 * Entradas/Salidas: Ninguna
 * Postcondiciones: La longitud es calculada
 * 
*/
	public static double calcularLongitud (int radio)
	{
		double longitud;
		longitud = 2 * Math.PI * radio;
		return(longitud);
	}
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Radio de la circunferencia
 * Devoluciones: �rea de la circunferencia
 * Nec/Dev: Ninguna
 * Restricciones: El radio debe ser mayor que 0 y menor o igual a 133
*/ 

/* Interfaz:
 * 
 * Comentario: Este subprograma calcular� el �rea de la circunferencia
 * Cabecera: double CalcularArea (int radio)
 * Precondiciones: El radio debe ser mayor que 0 y menor o igual a 133
 * Entradas: Entero radio
 * Salidas: Double �rea
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El �rea es calculada
 * 
*/
	public static double calcularArea (int radio)
	{
		double area;
		area = Math.PI * radio * radio;
		return(area);
	}
	
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Radio de la circunferencia
 * Devoluciones: Volumen de la circunferencia
 * Nec/Dev: Ninguna
 * Restricciones: El radio debe ser mayor que 0 y menor o igual a 133
*/ 

/* Interfaz:
 * 
 * Comentario: Este subprograma calcular� el volumen de la circunferencia
 * Cabecera: double CalcularVolumen (int radio)
 * Precondiciones: El radio debe ser mayor que 0 y menor o igual a 133
 * Entradas: Entero radio
 * Salidas: Double volumen
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El �rea es calculada
 * 
*/

	public static double calcularVolumen (int radio)
	{
		double volumen;
		volumen = 4.0/3 * Math.PI * radio * radio * radio;
		return(volumen);
	}
}	
