/* Estudio interfaz (clase):
 * 
 * - Definición: 
 * 		Clase cuenta, donde podremos almacenar el dinero del que dispongamos
 * 		
 * 		Esta clase almacenará el nombre asociado a la cuenta, el saldo del que dispongamos,
 * 		el número de cuenta para acceder, y un código de acceso personal (PIN),
 * 		el que necesitaremos para realizar operaciones
 * 
 * 		Además, como medida de seguridad, si falla en introducir el PIN 3 veces, se bloqueará
 * 		la cuenta, y solo se podrá desbloquear introduciendo correctamente el PUK
 * 		Si falla en introducir el PUK 3 veces, la cuenta quedará inservible
 * 		
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		Nombre: String, consultable, modificable
 * 		Dinero: Double, consultable
 * 		Numero de cuenta: Entero, consultable
 * 		PIN: String, modificable
 * 		PUK: String, consultable
 * 		ContadorPIN: Byte, consultable
 * 		ContadorPUK: Byte, consultable
 * 
 * - Indicar las propiedades derivadas (fórmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * 		ContadorNumeroCuenta: Entero, sirve para asignar un número de cuenta diferente a cada cuenta
 * 
 * - Definir operaciones o funcionalidades del objeto:
 * 		String getNombre()
 * 		void setNombre(String pin, String nombre)
 * 
 * 		double getDinero(String pin)
 * 
 * 		int getNumeroCuenta()
 * 
 * 		void setPin(String pin)
 * 		
 * 		long getPuk(String pin)
 * 		
 * 		boolean depositar(String pin, double dinero)
 * 		boolean retirar(String pin, double dinero)
 * 		boolean transferir(String pin, Cuenta c)
 * 		boolean cambiarPin(String antiguoPin, String nuevoPin)
 * 		boolean desbloquearCuenta(long puk)
 * 		
 * 		
 * 		
*/

import java.io.*;
import java.util.*;

class Cuenta 
{
	//Atributos
	private String nombre;
	private final int numero_cuenta;
	private double saldo;
	private String pin;
	private long puk;
	private byte contadorPIN = 0;
	private byte contadorPUK = 0;
	
	//Atributos compartidos
	private static int contadorNumeroCuenta = 0;
	
	//Constructores
	public Cuenta()
	{
		Random random = new Random();
		nombre = " ";
		numero_cuenta = contadorNumeroCuenta++;
		saldo = 0;
		pin = "0000";
		puk = random.nextLong();
		puk = puk < 0 ? puk*-1 : puk;
	}
	
	public Cuenta(String nombre, double saldo, String pin)
	{
		Random random = new Random();
		numero_cuenta = contadorNumeroCuenta++;
		this.saldo = saldo;
		puk = random.nextLong();
		puk = puk < 0 ? puk*-1 : puk;
	}
	
	public Cuenta(Cuenta c) { this.cuenta = c; }
	
	
	//Funciones
	public String getNombre() { return(nombre); }
	public void setNombre(String pin, String nombre) throws IncorrectPinException
	{
		if(this.pin.equals(pin) == false)
		{
			throw new IncorrectPinException("¡Pin incorrecto!");
			contadorPIN++;
		}
		else
		{
			this.nombre = nombre;
			contadorPIN = 0;
		}
	}
	
	public double getDinero(String pin) throws IncorrectPinException
	{
		if(this.pin.equals(pin) == false)
		{
			throw new IncorrectPinException("¡Pin incorrecto!");
			contadorPIN++;
		}
		else
		{
			contadorPIN = 0;
			return(saldo);
		}
	}
	
	public int getNumeroCuenta()
	{
		
			
			
	
	
	public void depositar(double cantidad) { saldo += cantidad; }
	
	public double saldo() { return saldo; }

}
	
		
		
		
		
		
		
		
		
		
		
