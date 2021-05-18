package methods;

public class Test1 {
	
// call of 1 static method in another static method & main method
	// lets call m2 in m3
	
public static void m2()
	{
		System.out.println("Static Method M2 Is Running");
	}
public static void m3()
	{
		m2();
		System.out.println("Static Method M3 Is Running");
	}
// calling if static inside non static 
// method();
// for example:-
public void mm1() 
	{
		m2();
		System.out.println("non static mm1 is running");
	}

public static void main(String[] args) {
	
	m3();
	// *Here we call m3 in main method to run program 
		// in m3 we call m2 and there after string of m3
			 //excution is also done by that sequence i.e-run m2 & then m3
}	
}
