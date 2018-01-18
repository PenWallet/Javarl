import java.io.*;

public class TestPersona
{
	
	public static void main (String[] args) 
	{
		//Por defecto
		Persona n1 = new Persona();
		System.out.println(n1.getNombre());
		System.out.println(n1.getEdad());
		System.out.println(n1.getDni());
		System.out.println(n1.getSexo());
		System.out.println(n1.getPeso());
		System.out.println(n1.getAltura());
		System.out.println(n1.calcularImc());
		System.out.println(n1.esMayorDeEdad());
		
		System.out.println("\n\n");
		
		try
		{
			Persona n2 = new Persona("Juan Pepe", -13, "97826345F", 'M', 17, 89.1);
			System.out.println(n2.getNombre());
			System.out.println(n2.getEdad());
			System.out.println(n2.getDni());
			System.out.println(n2.getSexo());
			System.out.println(n2.getPeso());
			System.out.println(n2.getAltura());
			System.out.println(n2.calcularImc());
			System.out.println(n2.esMayorDeEdad());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			Persona n2 = new Persona("Juan Pepe", 13, "97826345F", 'J', 17, 89.1);
			System.out.println(n2.getNombre());
			System.out.println(n2.getEdad());
			System.out.println(n2.getDni());
			System.out.println(n2.getSexo());
			System.out.println(n2.getPeso());
			System.out.println(n2.getAltura());
			System.out.println(n2.calcularImc());
			System.out.println(n2.esMayorDeEdad());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			Persona n2 = new Persona("Juan Pepe", 13, "97826345F", 'M', -5, 89.1);
			System.out.println(n2.getNombre());
			System.out.println(n2.getEdad());
			System.out.println(n2.getDni());
			System.out.println(n2.getSexo());
			System.out.println(n2.getPeso());
			System.out.println(n2.getAltura());
			System.out.println(n2.calcularImc());
			System.out.println(n2.esMayorDeEdad());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			Persona n2 = new Persona("Juan Pepe", 13, "97826345F", 'M', 17, -89.1);
			System.out.println(n2.getNombre());
			System.out.println(n2.getEdad());
			System.out.println(n2.getDni());
			System.out.println(n2.getSexo());
			System.out.println(n2.getPeso());
			System.out.println(n2.getAltura());
			System.out.println(n2.calcularImc());
			System.out.println(n2.esMayorDeEdad());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			Persona n2 = new Persona("Juan Pepe", 13, "97826345F", 'M', 17, 89.1);
			System.out.println(n2.getNombre());
			System.out.println(n2.getEdad());
			System.out.println(n2.getDni());
			System.out.println(n2.getSexo());
			System.out.println(n2.getPeso());
			System.out.println(n2.getAltura());
			System.out.println(n2.calcularImc());
			System.out.println(n2.esMayorDeEdad());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			Persona n3 = new Persona("Juan Pepe", 18, "97826345F", 'M', 29, 89.1);
			System.out.println(n3.getNombre());
			System.out.println(n3.getEdad());
			System.out.println(n3.getDni());
			System.out.println(n3.getSexo());
			System.out.println(n3.getPeso());
			System.out.println(n3.getAltura());
			System.out.println(n3.calcularImc());
			System.out.println(n3.esMayorDeEdad());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			Persona n4 = new Persona("Hana Song", 19, "61946548D", 'M', 67.5, 167.3);
			System.out.println(n4.getNombre());
			System.out.println(n4.getEdad());
			System.out.println(n4.getDni());
			System.out.println(n4.getSexo());
			System.out.println(n4.getPeso());
			System.out.println(n4.getAltura());
			System.out.println(n4.calcularImc());
			System.out.println(n4.esMayorDeEdad());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		Persona n5 = new Persona();
		try
		{
			n5.setNombre("Jamison Fawkes");
			n5.setEdad(25);
			n5.setDni("65451857J");
			n5.setSexo('M');
			n5.setPeso(76.1);
			n5.setAltura(179.6);
			System.out.println(n5.getNombre());
			System.out.println(n5.getEdad());
			System.out.println(n5.getDni());
			System.out.println(n5.getSexo());
			System.out.println(n5.getPeso());
			System.out.println(n5.getAltura());
			System.out.println(n5.calcularImc());
			System.out.println(n5.esMayorDeEdad());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		
	}
}
		
		
