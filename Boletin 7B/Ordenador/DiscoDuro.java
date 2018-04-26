/* Estudio interfaz (clase):
 * 
 * - Definici?n:
 * 		Para poder crear la clase ordenador, necesitaremos la clase Disco Duro,
 * 		que representar? a la memoria de disco duro del ordenador
 * 
 * 		Tendr? capacidad y velocidad
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		Capacidad: Entero, consultable, modificable
 * 		Velocidad: Entero, consultable modificable
 * 
 * - Indicar las propiedades derivadas (f?rmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * 
 * - Definir operaciones o funcionalidades del objeto:
 * 		int getCapacidad()
 * 		void setCapacidad(int capacidad)
 * 
 * 		int getVelocidad()
 * 		void setVelocidad(int velocidad)
 * 
 * - Restricciones:
 * 		- La capacidad y la velocidad deben ser mayores de 0
 * 		- La capacidad estar? en GB, y la velocidad en RPM
*/

import java.io.*;

public class DiscoDuro
{
	private int capacidad;
	private int velocidad;
	
	//Constructores
	public DiscoDuro()
	{
		capacidad = 0;
		velocidad = 0;
	}
	
	public DiscoDuro(int capacidad, int velocidad)
	{
		this.capacidad = capacidad;
		this.velocidad = velocidad;
	}
	
	public DiscoDuro(DiscoDuro d)
	{
		this.capacidad = d.capacidad;
		this.velocidad = d.velocidad;
	}
	
	//Getters y setters
	public int getCapacidad() { return(capacidad); }
	public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
	
	public int getVelocidad() { return(velocidad); }
	public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
	
}
		
		
		
		
		
		
		
		
		
