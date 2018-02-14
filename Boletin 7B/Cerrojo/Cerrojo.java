/* Estudio interfaz (clase):
 * 
 * - Definici�n:
 * 		Con esta clase podremos crear objetos de tipo "Cerrojo", que tendr� una
 * 		combinaci�n, tal y como un cerrojo de verdad. Este se podr� usar como medida
 * 		de seguridad.
 * 
 * 		Tendr� una combinaci�n oculta, que ser� una secuencia de tres n�meros.
 * 		No se podr�n copiar los cerrojos por seguridad.
 * 		La combinaci�n solo se podr� cambiar si est� desbloqueada
 *  
 * 		Como funci�n a�adida, si se falla al intentar desbloquearla 3 veces, el cerrojo
 * 		quedar� inservible y no se podr� volver a abrir		
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		- Numero 1: Entero, modificable
 * 		- Numero 2: Entero, modificable
 * 		- N�mero 3: Entero, modificable
 * 		- IsBloqueada: Boolean, consultable
 * 		- Intentos: Byte, consultable (indica cu�ntas veces se ha intentado abrir la cerradura)
 * 
 * - Indicar las propiedades derivadas (f�rmula si necesario):
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
 * 		- Cada n�mero de la combinaci�n estar� entre 0 y 64 (ambos incluidos)
 * 		- Los intentos solo podr� llegar hasta 3
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
	
	//Constructores (no habr� de copia "por seguridad")
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
			throw new CerrojoException("�El cerrojo est� cerrado! No puedes cambiar su combinaci�n");
		else if(n1 < 0 || n1 > 64)
			throw new CerrojoException("�La combinaci�n solo puede ser entre 0 y 64!");
		else
			this.n1 = n1;
		
		return;
	}
	
	public int getN2() { return(this.n2); }
	public void setN2(int n2) throws CerrojoException
	{
		if(isBloqueada)
			throw new CerrojoException("�El cerrojo est� cerrado! No puedes cambiar su combinaci�n");
		else if(n2 < 0 || n2 > 64)
			throw new CerrojoException("�La combinaci�n solo puede ser entre 0 y 64!");
		else
			this.n2 = n2;
		
		return;
	}
	
	public int getN3() { return(this.n3); }
	public void setN3(int n3) throws CerrojoException
	{
		if(isBloqueada)
			throw new CerrojoException("�El cerrojo est� cerrado! No puedes cambiar su combinaci�n");
		else if(n3 < 0 || n3 > 64)
			throw new CerrojoException("�La combinaci�n solo puede ser entre 0 y 64!");
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
 * Comentario: Funci�n con la que se podr� desbloquear el cerrojo
 * Cabecera: boolean abrirCerrojo(int n1, int n2, int n3)
 * Precondiciones: Cada n�mero de la combinaci�n deber� estar entre 0 y 64, inclusive
 * Entradas: Tres enteros, que es la combinaci�n de intento
 * Salidas: Un boolean, para indicar si la cerradura se ha abierto o no
 * Entradas/Salidas: Ninguna
 * Postcondiciones: Asociado al nombre, se devolver� el boolean indicando si est� abierto o no
 * 
*/
	
	public boolean abrirCerrojo(int n1, int n2, int n3) throws CerrojoException
	{
		boolean isAbierta;
		
		if (this.intentos > 2)
			throw new CerrojoException("�Esta cerradura est� bloqueada! Es inservible");
		else if (this.isBloqueada == false)
			throw new CerrojoException("�La cerradura ya est� abierta!");
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
	
	//Solo est� aqu� para poder probar el equals
	@Override
	public Cerrojo clone()
	{
		Cerrojo copia = null;
		
		try
		{
			copia = (Cerrojo)super.clone();
		}catch(CloneNotSupportedException error){System.out.println("�Clone no creado!");};
		
		return (copia);
	}
	
	//Devuelve -1 si es menor, 0 si es igual, 1 si es mayor. Aunque aqu� no tiene mucho sentido
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
		
		
		
