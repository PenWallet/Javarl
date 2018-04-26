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
	
	//Getters y setters
	public int getCapacidad() { return(capacidad); }
	public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
	
	public String getTipo() { return(tipo); }
	public void setTipo(String tipo) { this.tipo = tipo; }

	public int getVelocidad() { return(velocidad); }
	public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
}
		
		
		
		
	
