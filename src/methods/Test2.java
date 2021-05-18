package methods;

public class Test2 {
	
	/* Syntax for non static Method
	 * access modifier-(public)
	 * return type of method-(void)
	 * name of method-(etc)
	 * parantheses-()
	 * {
	 * 
	 * }
	 */
	public void m4()
	{	
		System.out.println("non static method m4 is running");
	}
	// call of  non static method inn another non static method
	
	//we can directly put the- method_name(); 
	       //to call non static method in non static method
	// example:-
	
	public void m5()
	{	
		m4();
		System.out.println("non static method m5 is running");
	}
	
	// call of non static method in main method & static method
	
	// to call non static method we have to create object
	// Class_Name referance_variable = new Class_Name();
	// referance_variable.methos_name();
	
	public static void m6()
	{
		Test2 referance1= new Test2();
		referance1.m5();
		System.out.println("sratic method m6 is running");
	}
	public static void main(String[] args) {
		
		Test2 referance= new Test2();
		referance.m4();
		m6();
		
	}
}