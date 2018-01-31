import java.io.*;

public class MemoriaSmallerThanZeroException extends Exception
{
	public MemoriaSmallerThanZeroException(String error)
	{
		System.out.println(error);
	}
}
