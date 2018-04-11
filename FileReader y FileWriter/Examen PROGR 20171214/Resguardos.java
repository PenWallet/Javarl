public class Resguardos
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
 * Comentario: Muestra el primer menú
 * Cabecera: MostrarMenu ()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna, solo pinta en pantalla
 * 
 * (Esto va para todos los menús, son iguales al fin y al cabo)

	public static void MostrarMenu ()
	{
		System.out.println("En resguardo");
		return;
	}
*/	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Dos fechas
 * Devoluciones: Número (0 igual, 1 anterior, 2 posterior)
 * Nec/Dev: Ninguna
 * Restricciones: Las fechas no pueden ser anteriores a 1582
*/ 

/* Interfaz:
 * 
 * Comentario: Este subprograma comparará dos fechas y dirá cuál es anterior a cual
 * Cabecera: byte comparaFechas (int dia1, int mes1, int anyo1, int dia2, int mes2, int anyo2)
 * Precondiciones: Las fechas no pueden ser anteriores a 1582
 * Entradas: 2 días, 2 meses y 2 años
 * Salidas: Número
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El número habrá sido devuelto asociado al nombre al final del programa
 * 
 * //No dispongo del tipo fecha, por lo que cada fecha queda dividida en sus componentes

	public static byte comparaFechas (int dia1, int mes1, int anyo1, int dia2, int mes2, int anyo2)
	{
		byte prueba = 1;
		return(prueba);
	}
*/
/* Estudio de la Interfaz:
 * 
 * Necesidades: Dos fechas
 * Devoluciones: Una fecha
 * Nec/Dev: Ninguna
 * Restricciones: Las fechas no pueden ser anteriores a 1582
*/ 

/* Interfaz:
 * 
 * Comentario: Este subprograma sumará dos fechas y tendrá como salida dicha suma
 * Cabecera: addFecha (int dia1, int mes1, int anyo1, int dia2, int mes2, int anyo2)
 * Precondiciones: Las fechas no pueden ser anteriores a 1582
 * Entradas: 2 días, 2 meses y 2 años
 * Salidas: Ninguna, ya que no dispongo del tipo fecha, solo podré pintar en pantalla el resultado
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna, solo pinta en pantalla
 * 

	public static void addFecha (int dia1, int mes1, int anyo1, int dia2, int mes2, int anyo2)
	{
		System.out.println("En resguardo");
		return;
	}
*/	

/* Estudio de la Interfaz:
 * 
 * Necesidades: Una fecha
 * Devoluciones: Número indicando qué semana del año es
 * Nec/Dev: Ninguna
 * Restricciones: La fecha no puede ser posterior a 1582
 * 
 * Interfaz:
 * 
 * Comentario: Este subprograma dirá qué semana del año es dada una fecha
 * Cabecera: byte semanaAnyo (int dia, int mes, int anyo)
 * Precondiciones: La fecha no puede ser anterior a 1582
 * Entradas: Día, mes y año
 * Salidas: Número de semana del año
 * Entradas/Salidas: Ninguna
 * Postcondiciones: La semana habrá sido calculada y devuelta asociada al nombre

	public static byte semanaAnyo (int dia, int mes, int anyo)
	{
		byte prueba = 125;
		return(prueba);
	}
*/	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Carácter y número
 * Devoluciones: Ninguna
 * Nec/Dev: Ninguna
 * Restricciones: El carácter debe ser imprimible y el número mayor que 0
*/ 

/* Interfaz:
 * 
 * Comentario: Este subprograma pintará un cuadrado en pantalla dado un carácter imprimible y el número de niveles
 * Cabecera: pintarCuadrado (char caracter, int niveles)
 * Precondiciones: El carácter debe ser imprimible y el número mayor que 0
 * Entradas: Carácter y número
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna, solo pinta en pantalla

	public static void pintarCuadrado (char caracter, int niveles)
	{
		System.out.println("En resguardo");
		return;
	}
*/
/* Estudio de la Interfaz:
 * 
 * Necesidades: Un año
 * Devoluciones: Boolean
 * Nec/Dev: Ninguna
 * Restricciones: El año debe ser igual o posterior a 1582
 * 
 * Interfaz:
 * 
 * Comentario: Calcula si es año bisiesto o no
 * Cabecera: boolean anyoBisiesto (int año)
 * Precondiciones: El año debe ser igual o posterior a 1582
 * Entradas: Año
 * Salidas: Boolean
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El boolean será devuelto asociado al nombre

	public static boolean anyoBisiesto (int anyo)
	{
		boolean esBisiesto = false;
		
		return(esBisiesto);
	}
*/
/* Estudio de la Interfaz:
 * 
 * Necesidades: Una fecha
 * Devoluciones: Boolean
 * Nec/Dev: Ninguna
 * Restricciones: Ninguna
 * 
 * Interfaz:
 * 
 * Comentario: Función que se encargará de detectar si una fecha es correcta o no
 * Cabecera: boolean fechaCorrecta (int dia, int mes, int anyo)
 * Precondiciones: Ninguna
 * Entradas: Día, mes y año
 * Salidas: Boolean
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Se habrá calculado si la fecha es correcta o no y el boolean habrá sido devuelto asociado al nombre

	public static boolean fechaCorrecta (int dia, int mes, int anyo)
	{
		boolean esCorrecta = true;
		
		return(esCorrecta);
	}
*/
}
		
		
		
		
		
		
		
		
		
