import java.io.*;
import java.util.Scanner;
public class numeronegativo
{
	public static void main (String[] Args)throws
	java.io.IOException
	{
		byte numero;
		Scanner teclado = new Scanner (System.in);
		System.out.print("¿Cual es el numero?: ");
		numero = teclado.nextByte();
		teclado.close();
		if (numero > 0)
		{
			System.out.print("El numero "+numero+" es positivo");
		}
		else
		{
			System.out.print("El numero "+numero+" es negativo");
		}
	}
}
