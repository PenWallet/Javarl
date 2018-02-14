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
 * 		String getNombre(String pin)
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
 * 		void depositar(String pin, double cantidad)
 * 		void retirar(String pin, double cantidad)
 * 		void transferir(String pin, Cuenta c, double cantidad)
 * 		void cambiarPin(String antiguoPin, String nuevoPin)
 * 		void desbloquearCuenta(long puk)
 * 		
 * 		
 * 		
*/

import java.io.*;
import java.util.*;

public class Cuenta implements Cloneable
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
		this.nombre = nombre;
		this.saldo = saldo;
		this.pin = pin;
		puk = random.nextLong();
		puk = puk < 0 ? puk*-1 : puk;
	}
	
	public Cuenta(Cuenta c) 
	{
		this.nombre = c.nombre;
		this.numero_cuenta = c.numero_cuenta;
		this.saldo = c.saldo;
		this.pin = c.pin;
		this.puk = c.puk;
		this.contadorPIN = c.contadorPIN;
		this.contadorPUK = c.contadorPUK;
		
	}
	
	
	//Funciones
	public String getNombre(String pin) throws IncorrectPinException, AccountPinBlockedException, AccountPukBlockedException
	{
		if(this.pin.equals(pin) == false)
		{
			contadorPIN++;
			throw new IncorrectPinException("¡Pin incorrecto!");
		}
		else if(contadorPIN > 2)
		{
			if(contadorPUK > 2)
				throw new AccountPukBlockedException("¡La cuenta ha sido bloqueada!");
			else
				throw new AccountPinBlockedException("¡El PIN está bloqueado!");
		}
		else
		{
			contadorPIN = 0;
			return(nombre);
		}
	}
	
	public void setNombre(String pin, String nombre) throws IncorrectPinException, AccountPinBlockedException, AccountPukBlockedException
	{
		if(this.pin.equals(pin) == false)
		{
			contadorPIN++;
			throw new IncorrectPinException("¡Pin incorrecto!");
		}
		else if(contadorPIN > 2)
		{
			if(contadorPUK > 2)
				throw new AccountPukBlockedException("¡La cuenta ha sido bloqueada!");
			else
				throw new AccountPinBlockedException("¡El PIN está bloqueado!");
		}
		else
		{
			contadorPIN = 0;
			this.nombre = nombre;
		}
	}
	
	public double getDinero(String pin) throws IncorrectPinException, AccountPinBlockedException, AccountPukBlockedException
	{
		if(this.pin.equals(pin) == false)
		{
			contadorPIN++;
			throw new IncorrectPinException("¡Pin incorrecto!");
		}
		else if(contadorPIN > 2)
		{
			if(contadorPUK > 2)
				throw new AccountPukBlockedException("¡La cuenta ha sido bloqueada!");
			else
				throw new AccountPinBlockedException("¡El PIN está bloqueado!");
		}
		else
		{
			contadorPIN = 0;
			return(saldo);
		}
	}
	
	public int getNumeroCuenta() { return(this.numero_cuenta); }
	
	public long getPuk() throws IncorrectPinException, AccountPinBlockedException, AccountPukBlockedException
	{
		if(this.pin.equals(pin) == false)
		{
			contadorPIN++;
			throw new IncorrectPinException("¡Pin incorrecto!");
		}
		else if(contadorPIN > 2)
		{
			if(contadorPUK > 2)
				throw new AccountPukBlockedException("¡La cuenta ha sido bloqueada!");
			else
				throw new AccountPinBlockedException("¡El PIN está bloqueado!");
		}
		else
		{
			contadorPIN = 0;
			return(puk);
		}
	}
	
	
	//Funciones añadidas
	public void depositar(String pin, double cantidad) throws IncorrectPinException, AccountPinBlockedException, AccountPukBlockedException
	{
		if(this.pin.equals(pin) == false)
		{
			contadorPIN++;
			throw new IncorrectPinException("¡Pin incorrecto!");
		}
		else if(contadorPIN > 2)
		{
			if(contadorPUK > 2)
				throw new AccountPukBlockedException("¡La cuenta ha sido bloqueada!");
			else
				throw new AccountPinBlockedException("¡El PIN está bloqueado!");
		}
		else
		{
			contadorPIN = 0;
			saldo += cantidad;
		}
	}
	
	public void retirar(String pin, double cantidad) throws IncorrectPinException, AccountPinBlockedException, AccountPukBlockedException, InsufficientFundsException
	{
		if(this.pin.equals(pin) == false)
		{
			contadorPIN++;
			throw new IncorrectPinException("¡Pin incorrecto!");
		}
		else if(contadorPIN > 2)
		{
			if(contadorPUK > 2)
				throw new AccountPukBlockedException("¡La cuenta ha sido bloqueada!");
			else
				throw new AccountPinBlockedException("¡El PIN está bloqueado!");
		}
		else if(cantidad > saldo)
		{
			throw new InsufficientFundsException("¡Tu saldo es insuficiente!");
		}
		else
		{
			saldo -= cantidad;
			contadorPIN = 0;
		}
	}

	public void transferir(String pin, Cuenta c, double cantidad) throws IncorrectPinException, AccountPinBlockedException, AccountPukBlockedException, InsufficientFundsException
	{
		if(this.pin.equals(pin) == false)
		{
			contadorPIN++;
			throw new IncorrectPinException("¡Pin incorrecto!");
		}
		else if(contadorPIN > 2)
		{
			if(contadorPUK > 2)
				throw new AccountPukBlockedException("¡La cuenta ha sido bloqueada!");
			else
				throw new AccountPinBlockedException("¡El PIN está bloqueado!");
		}
		else if(cantidad > saldo)
		{
			throw new InsufficientFundsException("¡Tu saldo es insuficiente!");
		}
		else
		{
			saldo -= cantidad;
			c.saldo += cantidad;
			contadorPIN = 0;
		}
	}

	public void cambiarPin(String antiguoPin, String nuevoPin) throws IncorrectPinException, AccountPinBlockedException, AccountPukBlockedException
	{
		if(this.pin.equals(antiguoPin) == false)
		{
			contadorPIN++;
			throw new IncorrectPinException("¡Pin incorrecto!");
		}
		else if(contadorPIN > 2)
		{
			if(contadorPUK > 2)
				throw new AccountPukBlockedException("¡La cuenta ha sido bloqueada!");
			else
				throw new AccountPinBlockedException("¡El PIN está bloqueado!");
		}
		else
		{
			this.pin = nuevoPin;
			contadorPIN = 0;
		}
	}

	public void desbloquearCuenta(long puk) throws IncorrectPukException, AccountPukBlockedException, AccountNotBlockedException
	{
		if(contadorPUK > 2)
			throw new AccountPukBlockedException("¡La cuenta ha sido bloqueada!");
		else if(contadorPIN < 3)
			throw new AccountNotBlockedException("¡La cuenta no está bloqueada!");
		else if(this.puk != puk)
		{
			contadorPUK++;
			throw new IncorrectPukException("¡El PUK es incorrecto!");
		}
		else
		{
			contadorPIN = 0;
			contadorPUK = 0;
		}
	}


	@Override
	public String toString()
	{
		String s = ("Nombre: "+nombre+", Numero de cuenta: "+numero_cuenta+", Saldo: "+saldo+", Pin: "+pin+", Puk: "+puk+", Contador PIN: "+contadorPIN+", Contador PUK: "+contadorPUK);
		return(s);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		boolean ret = false;
		
		if (this == obj)
			ret = true;
		else if (obj != null && obj instanceof Cuenta)
		{
			Cuenta other = (Cuenta)obj;
			
			if (this.nombre == other.nombre &&
				this.numero_cuenta == other.numero_cuenta &&
				this.saldo == other.saldo &&
				this.pin == other.pin &&
				this.puk == other.puk &&
				this.contadorPIN == other.contadorPIN &&
				this.contadorPUK == other.contadorPUK)
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
		hash = numero_cuenta * 13 + (int)saldo * 3 + contadorPIN * 5;
		return(hash);
	}
	
	//Solo está aquí para poder probar el equals
	@Override
	public Cuenta clone()
	{
		Cuenta copia = null;
		
		try
		{
			copia = (Cuenta)super.clone();
		}catch(CloneNotSupportedException error){System.out.println("¡Clone no creado!");};
		
		return (copia);
	}
}
	
		
		
		
		
		
		
		
		
		
		
