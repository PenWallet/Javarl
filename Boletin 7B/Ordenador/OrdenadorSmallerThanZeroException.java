import java.io.*;

public class OrdenadorSmallerThanZeroException extends Exception
{
	public OrdenadorSmallerThanZeroException(String error)
	{
		System.out.println(error);
	}
}
