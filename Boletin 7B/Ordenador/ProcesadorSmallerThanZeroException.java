import java.io.*;

public class ProcesadorSmallerThanZeroException extends Exception
{
	public ProcesadorSmallerThanZeroException(String error)
	{
		System.out.println(error);
	}
}
