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
 * - Indicar las propiedades derivadas (fórmula si necesario):
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
 * 		- La velocidad deberá ser mayor de 0
 * 		- La velocidad estará dada en GHz
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
		marca = "Intel";
		modelo = "i7 7700K";
		velocidad = 3.8;
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
	
	//Funciones
	public String getMarca() { return(marca); }
	public void setMarca() throws ProcesadorBrandNotAllowedException
	{
		if(marca != "Intel" && marca != "AMD")
			throw new ProcesadorBrandNotAllowedException("Error");
		else
			this.marca = marca;
	}
	
	public String getModelo() { return(modelo); }
	public void setModelo(String modelo) { this.modelo = modelo; }
	
	public double getVelocidad() { return(velocidad); }
	public void setVelocidad() throws ProcesadorSmallerThanZeroException
	{
		if(velocidad < 0)
			throw new ProcesadorSmallerThanZeroException("Error");
		else
			this.velocidad = velocidad;
	}
	
	@Override
	public Procesador clone()
	{
		Procesador copia = null;
		
		try
		{
			copia = (Procesador)super.clone();
		}catch(CloneNotSupportedException error){System.out.println("¡Clone no creado!");};
		
		return (copia);
	}
	
	
}
	
	
	
	
	
	
	
	
	
