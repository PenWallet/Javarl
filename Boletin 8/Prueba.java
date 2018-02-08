import java.util.Scanner;
import java.io.*;

public class Prueba
{
	public static void main (String[] args) 
	{
		//Cargar Array
		int i;
		
		int[] Array1 = new int[9];
		FuncionesArray.CargarArrayAlea(Array1);
		for(i = 0; i < Array1.length; i++)
		{
			System.out.println("Numero "+i+": "+Array1[i]);
		}
	}
}
		
		
		
		
		
		
		
		
		
