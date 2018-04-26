/* Estudio interfaz (clase):
 * 
 * - Definición:
 * 		Para poder crear la clase ordenador, necesitaremos la clase Procesador,
 * 		que representará el procesador del ordenador
 * 
 * 		Tendrá marca, modelo y velocidad
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		Marca: String, consultable, modificable
 * 		Modelo: String, consultable, modificable
 * 		Velocidad: Double, consultable, modificable
 *
 * - Indicar las propiedades derivadas (f?rmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 *
 * - Definir operaciones o funcionalidades del objeto:
 * 		String getMarca()
 * 		void setMarca(String marca)
 * 		
 * 		String getModelo()
 * 		void setModelo(String modelo)
 * 		
 * 		Double getVelocidad()
 * 		void setVelocidad(double velocidad)
 * 
 * 
 * - Restricciones:
 * 		- La marca solo puede ser Intel o AMD
 * 		- La velocidad deber? ser mayor de 0
 * 		- La velocidad estar? dada en GHz
*/

import java.io.*;

public class Procesador
{
	private String marca;
	private String modelo;
	private double velocidad;
	
	//Constructores
	public Procesador()
	{
		marca = " ";
		modelo = " ";
		velocidad = 0;
	}
	
	public Procesador(String marca, String modelo, double velocidad)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	public Procesador(Procesador p)
	{
		this.marca = p.marca;
		this.modelo = p.modelo;
		this.velocidad = p.velocidad;
	}
	
	//Getters y setters
	public String getMarca() { return(marca); }
	public void setMarca() { this.marca = marca; }
	
	public String getModelo() { return(modelo); }
	public void setModelo(String modelo) { this.modelo = modelo; }
	
	public double getVelocidad() { return(velocidad); }
	public void setVelocidad() { this.velocidad = velocidad; }
}
	
	
	
	
	
	
	
	
	
