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
		
		System.out.println("�Cu�ntos cerrojos quieres introducir?");
		max = teclado.nextInt();
		Cerrojo pruebaArray[] = new Cerrojo[max];
		
		
		for(i=0; i < max; i++)
		{
			do
			{
				System.out.println("�Quieres un cerrojo default o meter combinaci�n? S o N");
				respuesta = Character.toUpperCase(teclado.next().charAt(0));
			}while(respuesta != 'S' && respuesta != 'N');
			
			if(respuesta == 'S')
				pruebaArray[i] = new Cerrojo();
			else
			{
				do
				{
					System.out.println("�Cu�l es el primer n�mero de la combinaci�n? 0-64, inclusive");
					n1 = teclado.nextInt();
				}while (n1 < 0 || n1 > 64);
				
				do
				{
					System.out.println("�Cu�l es el segundo n�mero de la combinaci�n? 0-64, inclusive");
					n2 = teclado.nextInt();
				}while (n2 < 0 || n2 > 64);
				
				do
				{
					System.out.println("�Cu�l es el tercer n�mero de la combinaci�n? 0-64, inclusive");
					n3 = teclado.nextInt();
				}while (n3 < 0 || n3 > 64);
				
				pruebaArray[i] = new Cerrojo(n1, n2, n3);
			}
		}
		
		System.out.println("\n\n");
		
		System.out.println("Aqu� tienes una lista de los cerrojos que has introducido:");
		
		for(i = 0; i < max; i++)
		{
			System.out.println("Cerrojo n� "+(i+1)+". Su combinaci�n es: "+pruebaArray[i].getN1()+", "+pruebaArray[i].getN2()+", "+pruebaArray[i].getN3());
		}
	}
}
				
				
				
				
				
				
				
				
				
	
