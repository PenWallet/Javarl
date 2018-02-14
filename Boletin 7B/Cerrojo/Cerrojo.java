/* Estudio interfaz (clase):
 * 
 * - Definición:
 * 		Con esta clase podremos crear objetos de tipo "Cerrojo", que tendrá una
 * 		combinación, tal y como un cerrojo de verdad. Este se podrá usar como medida
 * 		de seguridad.
 * 
 * 		Tendrá una combinación oculta, que será una secuencia de tres números.
 * 		No se podrán copiar los cerrojos por seguridad.
 * 		La combinación solo se podrá cambiar si está desbloqueada
 *  
 * 		Como función añadida, si se falla al intentar desbloquearla 3 veces, el cerrojo
 * 		quedará inservible y no se podrá volver a abrir		
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		- Numero 1: Entero, modificable
 * 		- Numero 2: Entero, modificable
 * 		- Número 3: Entero, modificable
 * 		- IsBloqueada: Boolean, consultable
 * 		- Intentos: Byte, consultable (indica cuántas veces se ha intentado abrir la cerradura)
 * 
 * - Indicar las propiedades derivadas (fórmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * - Definir operaciones o funcionalidades del objeto:
 * 		Void setN1(entero n1)
 * 		Void setN2(entero n2)
 * 		Void setN3(entero n3)
 * 
 * 		Boolean getBloqueada()
 * 		Byte getIntentos()
 * 
 * 		Void cerrarCerrojo();
 * 		Boolean abrirCerrojo(entero n1, entero n2, entero n3)
 * 
 * - Restricciones:
 * 		- Cada número de la combinación estará entre 0 y 64 (ambos incluidos)
 * 		- Los intentos solo podrá llegar hasta 3
*/

import java.io.*;

public class Cerrojo implements Cloneable, Comparable<Cerrojo>
{
	//Atributos
	private int n1;
	private int n2;
	private int n3;
	private boolean isBloqueada;
	private byte intentos;	
	
	//Constructores (no habrá de copia "por seguridad")
	public Cerrojo()
	{
		n1 = 0;
		n2 = 0;
		n3 = 0;
		isBloqueada = false;
		intentos = 0;
	}
	
	public Cerrojo(int n1, int n2, int n3)
	{
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		isBloqueada = true;
		intentos = 0;
	}
	
	//Funcionalidades (IMPORTANTE: Los gets han sido introducidos para poder visualizarlo en la prueba de los arrays)
	public int getN1() { return(this.n1); }
	public void setN1(int n1) throws CerrojoException
	{
		if(isBloqueada)
			throw new CerrojoException("¡El cerrojo está cerrado! No puedes cambiar su combinación");
		else if(n1 < 0 || n1 > 64)
			throw new CerrojoException("¡La combinación solo puede ser entre 0 y 64!");
		else
			this.n1 = n1;
		
		return;
	}
	
	public int getN2() { return(this.n2); }
	public void setN2(int n2) throws CerrojoException
	{
		if(isBloqueada)
			throw new CerrojoException("¡El cerrojo está cerrado! No puedes cambiar su combinación");
		else if(n2 < 0 || n2 > 64)
			throw new CerrojoException("¡La combinación solo puede ser entre 0 y 64!");
		else
			this.n2 = n2;
		
		return;
	}
	
	public int getN3() { return(this.n3); }
	public void setN3(int n3) throws CerrojoException
	{
		if(isBloqueada)
			throw new CerrojoException("¡El cerrojo está cerrado! No puedes cambiar su combinación");
		else if(n3 < 0 || n3 > 64)
			throw new CerrojoException("¡La combinación solo puede ser entre 0 y 64!");
		else
			this.n3 = n3;
		
		return;
	}
	
	public boolean getBloqueada() { return(isBloqueada); }
	public byte getIntentos() { return(intentos); }
	
	public void cerrarCerrojo()
	{
		this.isBloqueada = true;
		return;
	}
	
/* Interfaz:
 * 
 * Comentario: Función con la que se podrá desbloquear el cerrojo
 * Cabecera: boolean abrirCerrojo(int n1, int n2, int n3)
 * Precondiciones: Cada número de la combinación deberá estar entre 0 y 64, inclusive
 * Entradas: Tres enteros, que es la combinación de intento
 * Salidas: Un boolean, para indicar si la cerradura se ha abierto o no
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Asociado al nombre, se devolverá el boolean indicando si está abierto o no
 * 
*/
	
	public boolean abrirCerrojo(int n1, int n2, int n3) throws CerrojoException
	{
		boolean isAbierta;
		
		if (this.intentos > 2)
			throw new CerrojoException("¡Esta cerradura está bloqueada! Es inservible");
		else if (this.isBloqueada == false)
			throw new CerrojoException("¡La cerradura ya está abierta!");
		else if (this.n1 == n1 && this.n2 == n2 && this.n3 == n3)
		{
			isAbierta = true;
			this.isBloqueada = false;
			this.intentos = 0;
		}
		else
		{
			isAbierta = false;
			this.intentos++;
		}
		
		return(isAbierta);
	}
	
	@Override
	public String toString()
	{
		String s = ("N1: "+n1+", N2: "+n2+", N3: "+n3+", Bloqueada: "+isBloqueada+", Intentos: "+intentos+", Hash: "+this.hashCode());
		return(s);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		boolean ret = false;
		
		if (this == obj)
			ret = true;
		else if (obj != null && obj instanceof Cerrojo)
		{
			Cerrojo other = (Cerrojo)obj;
			
			if (this.n1 == other.n1 &&
				this.n2 == other.n2 &&
				this.n3 == other.n3 &&
				this.isBloqueada == other.isBloqueada &&
				this.intentos == other.intentos)
			{
				ret = true;
			}
		}
		
		return (ret);
	}
	
	@Override
	public int hashCode()
	{
		int hash;
		hash = n1 * 17 + n2 * 3 + n3 * 5;
		return(hash);
	}
	
	//Solo está aquí para poder probar el equals
	@Override
	public Cerrojo clone()
	{
		Cerrojo copia = null;
		
		try
		{
			copia = (Cerrojo)super.clone();
		}catch(CloneNotSupportedException error){System.out.println("¡Clone no creado!");};
		
		return (copia);
	}
	
	//Devuelve -1 si es menor, 0 si es igual, 1 si es mayor. Aunque aquí no tiene mucho sentido
	@Override
	public int compareTo(Cerrojo other)
	{
		int ret = -1;
		
		if(this == other || this.getN1() == other.getN1())
			ret = 0;
		else if(this.getN1() > other.getN1())
			ret = 1;
		
		return ret;
	}
	
	
}
		
		
		
