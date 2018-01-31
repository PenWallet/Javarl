import java.io.*;
import java.util.*;

public class PruebaArray
{
	public static void main (String[] Args)
	{
		char respuesta;
		
		int max;
		int i;
		int n1;
		int n2;
		int n3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuántos cerrojos quieres introducir?");
		max = teclado.nextInt();
		Cerrojo pruebaArray[] = new Cerrojo[max];
		
		
		for(i=0; i < max; i++)
		{
			do
			{
				System.out.println("¿Quieres un cerrojo default o meter combinación? S o N");
				respuesta = Character.toUpperCase(teclado.next().charAt(0));
			}while(respuesta != 'S' && respuesta != 'N');
			
			if(respuesta == 'S')
				pruebaArray[i] = new Cerrojo();
			else
			{
				do
				{
					System.out.println("¿Cuál es el primer número de la combinación? 0-64, inclusive");
					n1 = teclado.nextInt();
				}while (n1 < 0 || n1 > 64);
				
				do
				{
					System.out.println("¿Cuál es el segundo número de la combinación? 0-64, inclusive");
					n2 = teclado.nextInt();
				}while (n2 < 0 || n2 > 64);
				
				do
				{
					System.out.println("¿Cuál es el tercer número de la combinación? 0-64, inclusive");
					n3 = teclado.nextInt();
				}while (n3 < 0 || n3 > 64);
				
				pruebaArray[i] = new Cerrojo(n1, n2, n3);
			}
		}
		
		System.out.println("\n\n");
		
		System.out.println("Aquí tienes una lista de los cerrojos que has introducido:");
		
		for(i = 0; i < max; i++)
		{
			System.out.println("Cerrojo nº "+(i+1)+". Su combinación es: "+pruebaArray[i].getN1()+", "+pruebaArray[i].getN2()+", "+pruebaArray[i].getN3());
		}
	}
}
				
				
				
				
				
				
				
				
				
	
