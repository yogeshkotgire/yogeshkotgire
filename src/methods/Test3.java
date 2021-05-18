 package methods;

public class Test3 {
	/*
	 * Categgories of Methods
	 * 		1.Method without Argument and without return type 
	 */
public static void c1()
{
	System.out.println("Method without Argument and without return type ");
}

    //    2.method  with argument and without return type
public void c2(int i, long l, char c, double d, String S, boolean b, short ss, byte bb)
{
	System.out.println("method  with argument and without return type");
	System.out.println("Value of i is  :"+i);
	System.out.println("Value of l is  :"+l);
	System.out.println("Value of c is  :"+c);
	System.out.println("Value of d is  :"+d);
	System.out.println("Value of S is  :"+S);
	System.out.println("Value of b is  :"+b);
	System.out.println("Value of ss is  :"+ss);
	System.out.println("Value of bb is  :"+bb);

}

	// 3.method with return type and without argument

public static int c3() 
{
	System.out.println("method with return type and without argument");
	return 41;
}

	//4. method with return with argument

public static int c4(int r, long k) 
{
	System.out.println(r+k);
	return 100;
}



public static void main(String[] args)
{
	short ss = 20;
	byte bb =15;
	Test3 referance2 = new Test3();
	referance2.c2(20, 458, 'a', 12.25, "yogaa", true, ss, bb);
	c4(159,45896);
	
	int yy =c3();
	System.out.println(yy);
	
}
	

}
