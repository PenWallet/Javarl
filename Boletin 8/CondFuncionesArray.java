import java.util.Scanner;
import java.io.*;

public class CondFuncionesArray
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
		
		System.out.println("\n\n");
		
		//Cargar Array 20 random
		int[] Array2 = new int[20];
		Array2 = FuncionesArray.CargarArrayAleaDos();
		for(i = 0; i < Array2.length; i++)
		{
			System.out.println("Numero "+i+": "+Array2[i]);
		}
		
	}
}
		
		
		
		
		
		
		
		
		
