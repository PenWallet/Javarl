import java.io.*;

public class TestArticulo
{
	
	public static void main (String[] args) 
	{
		//Por defecto
		Articulo n1 = new Articulo();
		System.out.println(n1.getNombre());
		System.out.println(n1.getPrecioSinIva());
		System.out.println(n1.getTipo());
		System.out.println(n1.getIva());
		System.out.println(n1.getPrecioCosto());
		System.out.println(n1.getPrecio());
		
		System.out.println("\n\n");
		
		//Sobrecargado
		Articulo n2 = new Articulo("Lacasitos", 1.23, "Alimentacion", 10, 0.75);
		System.out.println(n2.getNombre());
		System.out.println(n2.getPrecioSinIva());
		System.out.println(n2.getTipo());
		System.out.println(n2.getIva());
		System.out.println(n2.getPrecioCosto());
		System.out.println(n2.getPrecio());
		
		System.out.println("\n\n");
		
		//De copia
		Articulo n3 = new Articulo(n2);
		System.out.println(n2.getNombre());
		System.out.println(n2.getPrecioSinIva());
		System.out.println(n2.getTipo());
		System.out.println(n2.getIva());
		System.out.println(n2.getPrecioCosto());
		System.out.println(n2.getPrecio());
		
		System.out.println("\n\n");
		
		n1.setNombre("Prueba");
		n1.setPrecioSinIva(19.99);
		n1.setTipo("Prueba2");
		n1.setIva(21);
		n1.setPrecioCosto(10.46);
		System.out.println(n1.getNombre());
		System.out.println(n1.getPrecioSinIva());
		System.out.println(n1.getTipo());
		System.out.println(n1.getIva());
		System.out.println(n1.getPrecioCosto());
		System.out.println(n1.getPrecio());
		
		
		
	}
}
		
		
