import java.io.*;

public class MemoriaTypeNotAllowedException extends Exception
{
	public MemoriaTypeNotAllowedException(String error)
	{
		System.out.println(error);
	}
}
