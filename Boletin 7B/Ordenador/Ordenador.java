/* Estudio interfaz (clase):
 * 
 * - Definición:
 * 		Clase ordenador, con los componente más importantes del mismo
 *		
 * 		Tendrá memoria, disco duro, procesador, precio base, IVA, y precio del mercado
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		Memoria: Memoria, consultable, modificable
 * 		Disco Duro: DiscoDuro, consultable, modificable
 * 		Procesador: Procesador, consultable, modificable
 * 		Precio base: Double, consultable, modificable
 * 
 * - Indicar las propiedades derivadas (fórmula si necesario):
 * 		Precio del mercado: Precio base * (IVA+100)/100
 * 
 * - Indicar si cada propiedad es compartida por los objetos:
 * 		IVA: Entero, consultable, modificable
 * 
 * - Definir operaciones o funcionalidades del objeto:
 * 		Memoria getMemoria()
 * 		void setMemoria (Memoria m)
 * 		
 * 		DiscoDuro getDiscoDuro()
 * 		void setDiscoDuro(DiscoDuro d)
 * 		
 * 		Procesador getProcesador()
 * 		void setProcesador(Procesador p)
 * 		
 * 		double getPrecioBase()
 * 		void setPrecioBase(double pbase)
 * 		
 *		int getIva()
 * 		void setIva(int iva)
 * 		
 * 		double getPrecioMercado()
*/

import java.io.*;

public class Ordenador
{
	private Memoria memoria;
	private DiscoDuro discoDuro;
	private Procesador procesador;
	double precioBase;
	final int iva = 21;
	
	//Constructores
	public Ordenador()
	{
		memoria = new Memoria();
		discoDuro = new DiscoDuro();
		procesador = new Procesador();
		precioBase = 0;
	}
	
	public Ordenador(Memoria m, DiscoDuro d, Procesador p, double precioBase)
	{
		this.memoria = m;
		this.discoDuro = d;
		this.procesador = p;
		this.precioBase = precioBase;
	}
	
	public Ordenador(int mCapacidad, String mTipo, int mVelocidad, int dCapacidad, int dVelocidad, String pMarca, String pModelo, double pVelocidad, double precioBase)
	{
		this.memoria = new Memoria(mCapacidad, mTipo, mVelocidad);
		this.discoDuro = new DiscoDuro(dCapacidad, dVelocidad);
		this.procesador = new Procesador(pMarca, pModelo, pVelocidad);
		this.precioBase = precioBase;
	}
	
	public Ordenador(Ordenador o)
	{
		this.memoria = o.memoria;
		this.discoDuro = o.discoDuro;
		this.procesador = o.procesador;
	}
	
	//Funciones
}
	
		
		
		
		
		
		
		
		
		
		
