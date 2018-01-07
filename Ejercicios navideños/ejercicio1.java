public class ejercicio1
{
/* Estudio de la Interfaz:
 * 
 * Necesidades: Letra
 * Devoluciones: Boolean
 * Nec/Dev: Ninguna
 * Restricciones: Debe ser una letra del alfabeto
*/ 

/* Interfaz:
 * 
 * Comentario: Funcionalidad que nos dirá si la letra es mayúscula o no
 * Cabecera: boolean MayusONo(char letra)
 * Precondiciones: El carácter introducido debe ser una letra del alfabeto
 * Entradas: Carácter
 * Salidas: Boolean
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Se devolverá el boolean asociado al nombre
 * 
*/

	public static boolean MayusONo(char letra)
	{
		boolean esMayus;
		
		if(letra >= 'A' && letra <= 'Z')
			esMayus = true;
		else
			esMayus = false;
		
		return(esMayus);
	}
	
/* Estudio de la Interfaz:
 * 
 * Necesidades: Letra
 * Devoluciones: Boolean
 * Nec/Dev: Ninguna
 * Restricciones: Debe ser una letra del alfabeto
*/ 

/* Interfaz:
 * 
 * Comentario: Funcionalidad que nos dirá si la letra es minúscula o no
 * Cabecera: boolean MinusONo(char letra)
 * Precondiciones: El carácter introducido debe ser una letra del alfabeto
 * Entradas: Carácter
 * Salidas: Boolean
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Se devolverá el boolean asociado al nombre
 * 
*/
	public static boolean MinusONo(char letra)
	{
		boolean esMinus;
		
		if(letra >= 'a' && letra <= 'z')
			esMayus = true;
		else
			esMayus = false;
		
		return(esMayus);
	}
		
		
		
		
		
		
		
		
		
