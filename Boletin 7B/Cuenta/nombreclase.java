/* Estudio interfaz (clase):
 * 
 * - Definición: 
 * 		Clase cuenta, donde podremos almacenar el dinero del que dispongamos
 * 		
 * 		Esta clase almacenará el nombre asociado a la cuenta, el dinero del que dispongamos,
 * 		el número de cuenta para acceder, y un código de acceso personal (PIN),
 * 		el que necesitaremos para realizar operaciones
 * 		
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		Nombre: String, consultable, modificable
 * 		Dinero: Double, consultable
 * 		Numero de cuenta: Entero, consultable
 * 		PIN: Entero, modificable
 * 		PUK: String, consultable
 * 
 * - Indicar las propiedades derivadas (fórmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * 		ContadorNumeroCuenta: Entero, sirve para asignar un número de cuenta diferente a cada cuenta
 * 
 * - Definir operaciones o funcionalidades del objeto:
 * 		String getNombre()
 * 		void setNombre(String nombre)
 * 
 * 		double getDinero()
 * 
 * 		int getNumeroCuenta()
 * 
 * 		void setPin(int pin)
 * 		
 * 		String getPuk(int pin)
 * 		
 * 		void depositar(int pin, double dinero)
 * 		boolean retirar(int pin, double dinero)
 * 		void transferir(int pin, Cuenta c)
 * 		void cambiarPin(int antiguoPin, nuevoPin)
 * 		
 * 		
 * 		
*/

import java.io.*;

class Cuenta 
{
	//Atributos
	private String nombre;
	protected final int numero_cuenta;
	protected double saldo;
	protected int pin;
	protected int puk;
	
	//Atributos compartidos
	private static int contadorNumeroCuenta = 0;
	
	//Constructores
	public Cuenta()
	{
		nombre = " ";
		numero_cuenta = contadorNumeroCuenta++;
		saldo = 0;
		pin = Integer.toString(0089);
	}
	
	public Cuenta(double saldo)
	{
		numero_cuenta = contadorNumeroCuenta++;
		this.saldo = saldo;
	} // Fin constructor cuenta
	
	public void depositar(double cantidad) { saldo += cantidad; }
	
	public double saldo() { return saldo; }

}//fin clase Cuenta
	
		
		
		
		
		
		
		
		
		
		
