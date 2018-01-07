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
 * Comentario: Muestra el primer men�
 * Cabecera: MostrarMenu ()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Ninguna
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Ninguna, solo pinta en pantalla
 * 
 * (Esto va para todos los men�s, son iguales al fin y al cabo)

	public static void MostrarMenu ()
	{
		System.out.println("En resguardo");
		return;
	}
*/	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Dos fechas
 * Devoluciones: N�mero (0 igual, 1 anterior, 2 posterior)
 * Nec/Dev: Ninguna
 * Restricciones: Las fechas no pueden ser anteriores a 1582
*/ 

/* Interfaz:
 * 
 * Comentario: Este subprograma comparar� dos fechas y dir� cu�l es anterior a cual
 * Cabecera: byte comparaFechas (int dia1, int mes1, int anyo1, int dia2, int mes2, int anyo2)
 * Precondiciones: Las fechas no pueden ser anteriores a 1582
 * Entradas: 2 d�as, 2 meses y 2 a�os
 * Salidas: N�mero
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El n�mero habr� sido devuelto asociado al nombre al final del programa
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
 * Comentario: Este subprograma sumar� dos fechas y tendr� como salida dicha suma
 * Cabecera: addFecha (int dia1, int mes1, int anyo1, int dia2, int mes2, int anyo2)
 * Precondiciones: Las fechas no pueden ser anteriores a 1582
 * Entradas: 2 d�as, 2 meses y 2 a�os
 * Salidas: Ninguna, ya que no dispongo del tipo fecha, solo podr� pintar en pantalla el resultado
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
 * Devoluciones: N�mero indicando qu� semana del a�o es
 * Nec/Dev: Ninguna
 * Restricciones: La fecha no puede ser posterior a 1582
 * 
 * Interfaz:
 * 
 * Comentario: Este subprograma dir� qu� semana del a�o es dada una fecha
 * Cabecera: byte semanaAnyo (int dia, int mes, int anyo)
 * Precondiciones: La fecha no puede ser anterior a 1582
 * Entradas: D�a, mes y a�o
 * Salidas: N�mero de semana del a�o
 * Entradas/Salidas: Ninguna
 * Postcondiciones: La semana habr� sido calculada y devuelta asociada al nombre

	public static byte semanaAnyo (int dia, int mes, int anyo)
	{
		byte prueba = 125;
		return(prueba);
	}
*/	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Car�cter y n�mero
 * Devoluciones: Ninguna
 * Nec/Dev: Ninguna
 * Restricciones: El car�cter debe ser imprimible y el n�mero mayor que 0
*/ 

/* Interfaz:
 * 
 * Comentario: Este subprograma pintar� un cuadrado en pantalla dado un car�cter imprimible y el n�mero de niveles
 * Cabecera: pintarCuadrado (char caracter, int niveles)
 * Precondiciones: El car�cter debe ser imprimible y el n�mero mayor que 0
 * Entradas: Car�cter y n�mero
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
 * Necesidades: Un a�o
 * Devoluciones: Boolean
 * Nec/Dev: Ninguna
 * Restricciones: El a�o debe ser igual o posterior a 1582
 * 
 * Interfaz:
 * 
 * Comentario: Calcula si es a�o bisiesto o no
 * Cabecera: boolean anyoBisiesto (int a�o)
 * Precondiciones: El a�o debe ser igual o posterior a 1582
 * Entradas: A�o
 * Salidas: Boolean
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El boolean ser� devuelto asociado al nombre

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
 * Comentario: Funci�n que se encargar� de detectar si una fecha es correcta o no
 * Cabecera: boolean fechaCorrecta (int dia, int mes, int anyo)
 * Precondiciones: Ninguna
 * Entradas: D�a, mes y a�o
 * Salidas: Boolean
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Se habr� calculado si la fecha es correcta o no y el boolean habr� sido devuelto asociado al nombre

	public static boolean fechaCorrecta (int dia, int mes, int anyo)
	{
		boolean esCorrecta = true;
		
		return(esCorrecta);
	}
*/
}
		
		
		
		
		
		
		
		
		
