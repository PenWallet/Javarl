import java.io.*;

public class TestPersona
{
	
	public static void main (String[] args) 
	{
		Persona n1 = new Persona();
		System.out.println(n1.toString());
		
		System.out.println("\n\n");
		
		Persona n2 = null;
		try
		{
			n2 = new Persona("Juan Pepe", -13, "97826345F", 'M', 17, 89.1);
			System.out.println(n2.toString());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			n2 = new Persona("Juan Pepe", 13, "97826345F", 'J', 17, 89.1);
			System.out.println(n2.toString());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			n2 = new Persona("Juan Pepe", 13, "97826345F", 'M', -5, 89.1);
			System.out.println(n2.toString());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			n2 = new Persona("Juan Pepe", 13, "97826345F", 'M', 17, -89.1);
			System.out.println(n2.toString());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		try
		{
			n2 = new Persona("Juan Pepe", 13, "97826345F", 'M', 17, 89.1);
			System.out.println(n2.toString());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		Persona n3 = null;
		try
		{
			n3 = new Persona("Juan Pepe", 18, "97826345F", 'H', 29, 89.1);
			System.out.println(n3.toString());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		
		Persona n4 = null;
		try
		{
			n4 = new Persona("Hana Song", 19, "61946548D", 'M', 67.5, 167.3);
			System.out.println(n4.toString());
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
			System.out.println(n5.toString());
		}catch(PersonaException error){System.out.println("¡No se pudo crear el objeto!");}
		
		System.out.println("\n\n");
		
		Persona n6 = new Persona();
		
		n6 = n5.clone();
		
		System.out.println(n6.toString());
		
		System.out.println("\n\n");
		
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		System.out.println(n3.hashCode());
		System.out.println(n4.hashCode());
		System.out.println(n5.hashCode());
		System.out.println(n6.hashCode());
	}
}
		
		
