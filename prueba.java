
import java.util.*;
import java.io.*;

public class prueba
{
	
	public static void main (String[] args) 
	{
		long puk;
		int c;
		Random random = new Random();
		
		for(c = 0; c < 10; c++)
		{
			puk = random.nextLong();
			puk = puk < 0 ? puk*-1 : puk;
			System.out.println(puk);
		}
		
	}
}
		
		
		
		
		
