import java.util.Scanner;
import java.io.*;

public class ejercicio2
{
/* Estudio de la Interfaz:
 * 
 * Necesidades: N�mero
 * Devoluciones: Boolean
 * Nec/Dev: Ninguna
 * Restricciones: Ninguna
*/ 

/* Interfaz:
 * 
 * Comentario: El programa nos dir� si es un n�mero compuesto (mayor que 1 no primo)
 * Cabecera: boolean esCompuesto(int n)
 * Precondiciones: Ninguna
 * Entradas: N�mero
 * Salidas: Boolean
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El boolean ser� devuelto asociado al nombre
 * 
*/
	public static boolean esCompuesto (int n)
	{
		boolean esCompuesto;
		int contDivisores = 0;
		int divisor;
		
		if(n <= 1)
			esCompuesto = false;
		else
		{
			for (divisor = 1; divisor <= n; divisor++)
			{
				if(n % divisor == 0)
					contDivisores++;
			}
				
			if(contDivisores > 2)
				esCompuesto = true;
			else
				esCompuesto = false;
		}
		
		return(esCompuesto);
	}
}
		
		
		
		
		
		
		
		
		
