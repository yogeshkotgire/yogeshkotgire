package exceptionhandling;

public class Exceptionag {
public static void main(String[] args) {
	
	
int i =10;
int j= 00;
try {
	System.out.println("the value of i is "+ i);
	System.out.println("the value of j is "+j);
	int k=i/j;
	
	System.out.println("the value of k is "+k);
	
}
	catch(ArithmeticException e) {
		System.out.println("catch is runninng");
	}

System.out.println("catch block");

	
}
}
