package accessmodifier;

public final class Test2 {
	public void m2()
	{
		System.out.println(" m2 is running");
	}
	 public static void main(String[] args) {
		Test1 am= new Test1();
		am.m1();
		
		// Public class- can be access throughout project in any package
		// <default> class - can be access within package only.
		//public final class-can be access throughout project in any package
							//but can not able to make child for this class
		//<default> final-can be access within package only.
						//but can not able to make child for this class
		
	 
	 // public method- method can call thruoghout the project
	 // private mathod-method can call eithin the class
	 //	

	 }

}
