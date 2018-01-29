/* Estudio interfaz (clase):
 * 
 * - Definición:
 * 		Clase con la que podremos crear objetos de tipo Gasto, que como en la vida real,
 * 		podrán ser de distintos tipos:
 * 			Alimentación, transporte, vivienda, ropa, luz, agua, gas y electricidad
 * 		Además, incorporará el poder trabajar en euros y en dólares
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		Tipo: String, consultable, modificable
 * 		Cantidad: Double, consultable, modificable
 * 		esEuro: Boolean, consultable, modificable
 * 
 * - Indicar las propiedades derivadas (fórmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * - Definir operaciones o funcionalidades del objeto:
 * 		String getTipo()
 * 		Void setTipo(String tipo)
 * 
 * 		Double getCantidad()
 * 		Void setCantidad(double cantidad)
 * 
 * 		Boolean getEsEuro()
 * 		Void setEsEuro(boolean esEuro)
 * 	
 * - Restricciones:
*/

import java.io.*;

public class Gasto
{
	String tipo;
	double cantidad;
	boolean esEuro;
	
	//Constructores
	public Gasto()
	{
		tipo = "";
		cantidad = 0;
		esEuro = true;
	}
	
	public Gasto(String tipo, double cantidad, boolean esEuro)
	{
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.esEuro = esEuro;
	}
	
	public Gasto(Gasto g)
	{
		this.tipo = g.tipo;
		this.cantidad = g.cantidad;
		this.esEuro = g.esEuro;
	}
	
	//Funciones
	public String getTipo() { return(this.tipo); }
	public void setTipo(String tipo) throws GastoException
	{
		if( tipo != "alimentacion" &&
			tipo != "transporte" &&
			tipo != "vivienda" &&
			tipo != "ropa" &&
			tipo != "luz" &&
			tipo != "telefono" &&
			tipo != "agua" &&
			tipo != "gas" &&
			tipo != "electricidad") throw new GastoException("¡El tipo no es correcto!");
		else
			this.tipo = tipo;
		
		return;
	}
	
	public double getCantidad() { return(this.cantidad); }
	public void setCantidad(double cantidad) throws GastoException
	{
		if(cantidad <= 0)
			throw new GastoException("¡El gasto no puede ser igual o menor a 0!");
		else
			this.cantidad = cantidad;
	}
	
	public boolean getEsEuro() { return(this.esEuro); }
	/*public void setEsEuro(boolean esEuro)
	{*/
	
}
		
		
		
		
		
		
		
		
		
		
		
