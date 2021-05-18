package variables;

public class Test4 {
/* static variables
 * non static variables
 * Local Variaable
 */
	
	// Static variables
	static int abc =12;
	
public void m1()
{
	System.out.println("The value for abc before addition is : "+abc);
	abc = abc+2;
	System.out.println("The value for abc after addition is : "+abc);

}
public static void m2()
{
	Test4 referanve123 = new Test4();
	referanve123.m1();
	
}
public static void main(String[] args) {
	Test4 referanve123 = new Test4();
			referanve123.m1();
	m2();
	
// for method m2 -it takes latest value of variable (abc).	
	int y= Test4.abc;
	System.out.println(y);
	

	
}
}
