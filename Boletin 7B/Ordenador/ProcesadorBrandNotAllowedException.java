import java.io.*;

public class ProcesadorBrandNotAllowedException extends Exception
{
	public ProcesadorBrandNotAllowedException(String error)
	{
		System.out.println(error);
	}
}
