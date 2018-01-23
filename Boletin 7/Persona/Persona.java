/* Estudio interfaz (clase):
 * 
 * - Definición: 
 * 		Clase persona, de la que nos interesa saber su nombre, edad,
 * 		DNI, sexo, peso y altura
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		- Nombre: String, consultable, modificable
 * 		- Edad: Int, consultable, modificable
 * 		- DNI: String, consultable, modificable
 * 		- Sexo: Char, consultable, modificable
 * 		- Peso: Double, consultable, modificable
 * 		- Altura: Double, consultable, modificable
 * 
 * - Indicar las propiedades derivadas (fórmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * - Definir operaciones o funcionalidades del objeto:
 * 		String getNombre()
 * 		Int getEdad()
 * 		String getDni()
 * 		Char getSexo()
 * 		Double getPeso()
 * 		Double getAltura()
 * 		
 * 		Void setNombre(String nombre)
 * 		Void setEdad(int edad)
 * 		Void setDni(String dni)
 * 		Void setSexo(char sexo)
 * 		Void setPeso(double peso)
 * 		Void setAltura(double altura)
 * 		
 * 		byte calcularImc()
 * 		boolean esMayorDeEdad()
*/

public class Persona implements Cloneable
{
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	//Constructores
	//Por defecto
	public Persona()
	{
		nombre = " ";
		edad = 0;
		dni = "00000000A";
		sexo = 'M';
		peso = 0;
		altura = 0;
	}
	
	//Sobrecargado
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) throws PersonaException
	{
		if(edad < 0)
		{
			throw new PersonaException("¡Una persona no puede tener menos de 0 años! El objeto '"+nombre+"' no se ha creado");
		}
		else if (sexo != 'M' && sexo != 'H')
		{
			throw new PersonaException("¡Solo M para mujer o H para hombre! El objeto '"+nombre+"' no se ha creado");
		}
		else if (peso < 0)
		{
			throw new PersonaException("¡Una persona no puede pesar menos que 0! El objeto '"+nombre+"' no se ha creado");
		}
		else if (altura < 0)
		{
			throw new PersonaException("¡Una persona no puede medir menos de 0 centímetros! El objeto '"+nombre+"' no se ha creado");
		}
		else
		{
			this.nombre = nombre;
			this.edad = edad;
			this.dni = dni;
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}
	}
	
	//Copia
	public Persona(Persona p)
	{
		this.nombre = p.nombre;
		this.edad = p.edad;
		this.dni = p.dni;
		this.sexo = p.sexo;
		this.peso = p.peso;
		this.altura = p.altura;
	}
	
	//Métodos
	public String getNombre() { return(nombre); }
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	
	public int getEdad() { return(edad); }
	public void setEdad(int edad) throws PersonaException
	{
		if(edad < 0)
			throw new PersonaException("¡Una persona no puede tener menos de 0 años! El objeto '"+nombre+"' no se ha creado");
		else
			this.edad = edad;
	}
	
	
	public String getDni() { return(dni); }
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	
	
	public char getSexo() { return(sexo); }
	public void setSexo(char sexo) throws PersonaException
	{
		if (sexo != 'M' && sexo != 'H')
			throw new PersonaException("¡Solo M para mujer o H para hombre! El objeto '"+nombre+"' no se ha creado");
		else
			this.sexo = sexo;
	}
	
	
	public double getPeso() { return(peso); }
	public void setPeso(double peso) throws PersonaException
	{
		if(peso < 0)
			throw new PersonaException("¡Una persona no puede pesar menos que 0! El objeto '"+nombre+"' no se ha creado");
		else
			this.peso = peso;
	}
	
	
	public double getAltura() { return(altura); }
	public void setAltura(double altura) throws PersonaException
	{
		if(altura < 0)
			throw new PersonaException("¡Una persona no puede medir menos de 0 centímetros! El objeto '"+nombre+"' no se ha creado");
		else
			this.altura = altura;
	}
	
	
/* Estudio de la Interfaz (funcionalidad):
 * 
 * Necesidades: Peso y altura
 * Devoluciones: Un número
 * Nec/Dev: Ninguna
 * Restricciones: La altura debe estar en metros
*/ 

/* Interfaz:
 * 
 * Comentario: Calculará el IMC de una persona, y, si está por debajo de su peso ideal,
 * 			   mandará un -1, si está en su peso ideal, un 0, si tiene sobrepeso, un 1.
 * Cabecera: byte calcularImc()
 * Precondiciones: Ninguna
 * Entradas: Ninguna
 * Salidas: Un byte
 * Entradas/Salidas: Ninguna
 * Postcondiciones: El IMC habrá sido calculado, y acorde a este, se habra enviado
 * 					asociado al nombre el byte correspondiente a su IMC
*/
	
	public byte calcularImc()
	{
		double imc;
		byte imcByte;
		
		imc = peso/((altura*altura)/10000);
		if (imc < 18.5)
			imcByte = -1;
		else if (imc >= 25)
			imcByte = 1;
		else
			imcByte = 0;
		
		return(imcByte);
	}
	
	public boolean esMayorDeEdad()
	{
		boolean esMdE = (edad >= 18) ? true : false;
		
		return(esMdE);
	}
	
	@Override
	public String toString()
	{
		String s = ("Nombre: "+nombre+", Edad: "+edad+", DNI: "+dni+", Sexo: "+sexo+", Peso: "+peso+", Altura: "+altura);
		return(s);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		boolean ret = false;
		
		if (this == obj)
			ret = true;
		else if (obj != null && obj instanceof Persona)
		{
			Persona other = (Persona)obj;
			
			if (this.nombre == other.nombre &&
				this.edad == other.edad &&
				this.dni == other.dni &&
				this.sexo == other.sexo &&
				this.peso == other.peso &&
				this.altura == other.altura)
			{
				ret = true;
			}
		}
		
		return (ret);
	}
	
	@Override
	public Persona clone()
	{
		Persona copia = null;
		
		try
		{
			copia = (Persona)super.clone();
		}catch(CloneNotSupportedException error){System.out.println("¡Clone no creado!");};
		
		return (copia);
	}
	
	@Override
	public int hashCode()
	{
		int hash = 1;
		hash = edad * 17 + nombre.length() * 3 - (int)peso * 5;
		return(hash);
	}
	
}
		
		
		
		
		
		
