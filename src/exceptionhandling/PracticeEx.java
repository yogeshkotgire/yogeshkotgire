package exceptionhandling;

public class PracticeEx {
	public static void main(String[] args) {
	
	int i=10;
	int j=0;
	
	try {
		int k=i/j;
		System.out.println(k);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("array");
	}
	catch(ArithmeticException e) {
		System.out.println("atithmatic");
	}
	catch(NullPointerException e) {
		System.out.println("null");
	}
	
	catch(Exception e) {
		System.out.println("exception");
	}
	
	
	
	
	
	}

}
