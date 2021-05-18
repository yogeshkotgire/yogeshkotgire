package exceptionhandling;

public class CustomiseException {

	public static void main(String[] args)  {
		int i=10;
			
		if (i<11)
		{
			throw new SelfException("customise exception");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
