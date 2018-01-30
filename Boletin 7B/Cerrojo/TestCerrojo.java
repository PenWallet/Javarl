import java.io.*;

public class TestCerrojo
{
	
	public static void main (String[] args) 
	{
		//Crear un cerrojo vacío
		Cerrojo c1 = new Cerrojo();
		System.out.println(c1.toString());
		
		//******************************************************************************
		System.out.println("\n\n");
		//******************************************************************************
		
		//Crear un cerrojo nuevo
		Cerrojo c2 = null;
		c2 = new Cerrojo(13, 45, 11);
		System.out.println(c2.toString());
		
		//Intentar cambiar combinación con el cerrojo cerrado
		try
		{
			c2.setN1(43);
			c2.setN2(0);
			c2.setN3(4);
		}catch (CerrojoException error){};
		System.out.println(c2.toString());
		
		//******************************************************************************
		System.out.println("\n\n");
		//******************************************************************************
		
		//Intentar abrir el cerrojo con combinación incorrecta
		try
		{
			System.out.println(c2.abrirCerrojo(13, 45, 12));
			System.out.println(c2.abrirCerrojo(0, 45, 11));
		}catch (CerrojoException error){};
		
		//******************************************************************************
		System.out.println("\n\n");
		//******************************************************************************
		
		//Intentar abrir el cerrojo con combinación correcta
		try
		{
			System.out.println(c2.abrirCerrojo(13, 45, 11));
			
		}catch (CerrojoException error){};
		
		//******************************************************************************
		System.out.println("\n\n");
		//******************************************************************************
		
		//Intentar cambiar combinación con el cerrojo abierto
		try
		{
			c2.setN1(43);
			c2.setN2(0);
			c2.setN3(4);
		}catch (CerrojoException error){};
		System.out.println(c2.toString());
		
		//******************************************************************************
		System.out.println("\n\n");
		//******************************************************************************
		
		//Bloquear la cerradura
		c2.cerrarCerrojo();
		System.out.println(c2.toString());
		
		try
		{
			System.out.println(c2.abrirCerrojo(19, 0, 4));
			System.out.println(c2.toString());
			System.out.println(c2.abrirCerrojo(43, 64, 4));
			System.out.println(c2.toString());
			System.out.println(c2.abrirCerrojo(43, 0, 10));
			System.out.println(c2.toString());
		}catch (CerrojoException error){};
		
		
		//******************************************************************************
		System.out.println("\n\n");
		//******************************************************************************
		
		//Intentar abrir la cerradura con tres intentos
		try
		{
			System.out.println(c2.abrirCerrojo(43, 0, 4));
			System.out.println(c2.toString());
		}catch (CerrojoException error){};
		
		//******************************************************************************
		System.out.println("\n\n");
		//******************************************************************************
		
		//Es c1 equal a c2
		System.out.println(c1.equals(c2));
		
		//******************************************************************************
		System.out.println("\n\n");
		//******************************************************************************
		
		//Crear una copia de c2
		Cerrojo c3 = null;
		c3 = c2.clone();
		
		//Probar el equals
		System.out.println(c3.equals(c2));
		
	}
}
		
		
