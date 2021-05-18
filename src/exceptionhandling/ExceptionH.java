package exceptionhandling;

public class ExceptionH {
public static void main(String[] args) {
		
		
		int i =10;
		int j= 02;
		try {
			System.out.println("the value of i is "+ i);
			System.out.println("the value of j is "+j);
			int k=i/j;
			char [] c=new char[5];
			c[6]='1';
					
			System.out.println("the value of k is "+k);
			
		}
			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("array exception");
			}
			catch(NullPointerException e) {
				System.out.println("null");
			}
			catch(ArithmeticException e) {
				System.out.println("catch is runninng");
			}
		
//			System.out.println("before");
//			try {
//				Thread.sleep(6000);
//			}
			catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("after catch block");
//
//			}
		



		}

}

