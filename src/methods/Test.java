package methods;

public class Test {
	
/*                       Types of Method
 *     A.)-Regular Method  	        	B.)-Main Method
 * 				|
 * a.)-static    b.) Non Static
 *     method			method
 */

	
	/* Syntax for static Method:-
	 * Access MOdifier-(Public)
	 * Type of Method -(Static)
	 * Return Type of Method-(void)
	 * Name Of Method-(etc)
	 * Parentheses-() {
	 * }
	 */
	
	public static void m1()
	{
		System.out.println("static Method m1 is running");
	}
	
	// call of static method in main method
	// type 1---
	public static void main(String[] args) {
		
		// methodname();
		m1();
		
		
	// type 2---
		//Classname.methodname();
		Test.m1();
		// note:-By this type we can call static method of another class also 
	// lets create Class-->Test1 nad call in Test 1
		Test1.m2();
	}
}
