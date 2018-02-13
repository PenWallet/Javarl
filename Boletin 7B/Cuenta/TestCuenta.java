import java.io.*;

public class TestCuenta
{
	
	public static void main (String[] args) 
	{
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta("Oscar Funes", 50, "3019");
		Cuenta c3 = new Cuenta(c2);
		Cuenta c4 = c3.clone();
		Cuenta c5 = new Cuenta();
		Cuenta c6 = new Cuenta();
		Cuenta c7 = new Cuenta();
		Cuenta c8 = new Cuenta();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		System.out.println(c6.toString());
		System.out.println(c7.toString());
		System.out.println(c8.toString());
		
		//Getters
		System.out.println("Nombre: "+c2.getNombre("3019"));
	}
}
		
		
