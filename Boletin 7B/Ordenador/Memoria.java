			/* Estudio interfaz (clase):
 * 
 * - Definici?n:
 * 		Para poder crear la clase ordenador, necesitaremos la clase Memoria,
 * 		que representar? a la memoria RAM del ordenador
 * 
 * 		Tendr? capacidad, tipo, y velocidad
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		Capacidad: Entero, consultable, modificable
 * 		Tipo: String, consultable, modificable
 * 		Velocidad: Entero, consultable, modificable 
 * 
 * - Indicar las propiedades derivadas (f?rmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * 
 * - Definir operaciones o funcionalidades del objeto:
 * 		int getCapacidad()
 * 		void setCapacidad(int capacidad)
 * 		
 * 		String getTipo()
 * 		void setTipo(String tipo)
 * 		
 * 		int getVelocidad()
 * 		void setVelocidad(int velocidad)
 * 
 * - Restricciones:
 * 		- El tipo solo puede ser DDR1, DDR2, DDR3 y DDR4
 * 		- La capacidad y la velocidad deben ser mayores de 0
 * 		- La capacidad se introducir? en MB
 * 
*/

import java.io.*;

public class Memoria
{
	private int capacidad;
	private String tipo;
	private int velocidad;
	
	//Constructores
	public Memoria()
	{
		this.capacidad = 0;
		this.tipo = " ";
		this.velocidad = 0;
	}
	
	public Memoria(int capacidad, String tipo, int velocidad)
	{
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.velocidad = velocidad;
	}
	
	public Memoria(Memoria m)
	{
		this.capacidad = m.capacidad;
		this.tipo = m.tipo;
		this.velocidad = m.velocidad;
	}
	
	//Funciones
	public int getCapacidad() { return(capacidad); }
	public void setCapacidad(int capacidad) throws MemoriaSmallerThanZeroException
	{
		if(capacidad < 0)
			throw new MemoriaSmallerThanZeroException("Error");
		else
			this.capacidad = capacidad;
	}
	
	public String getTipo() { return(tipo); }
	public void setTipo(String tipo) throws MemoriaTypeNotAllowedException
	{
		if(tipo != "DDR1" && tipo != "DDR2" && tipo != "DDR3" && tipo != "DDR4")
			throw new MemoriaTypeNotAllowedException("Error");
		else
			this.tipo = tipo;
	}
	
	public int getVelocidad() { return(velocidad); }
	public void setVelocidad(int velocidad) throws MemoriaSmallerThanZeroException
	{
		if(velocidad < 0)
			throw new MemoriaSmallerThanZeroException("Error");
		else
			this.velocidad = velocidad;
	}
	
	@Override
	public Memoria clone()
	{
		Memoria copia = null;
		
		try
		{
			copia = (Memoria)super.clone();
		}catch(CloneNotSupportedException error){System.out.println("?Clone no creado!");};
		
		return (copia);
	}
}
		
		
		
		
	
