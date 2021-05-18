package casting;

public class castinggggg {
	
	public void m1()
	{
		System.out.println("m1 from parent");
	}
	public void m2()
	{
		System.out.println("m2 from parent");
	}
	
	public static void main(String[] args) {
		
	
	byte b= 12;
	
		int bb =(int)b;// another method--int bb=b
		//if we converting lower to higher it is implicit casting
		//also call as winding
	
	int a= 1000;
		byte bbd= (byte)a;
		System.out.println(bbd);
		//explicit= narrowing data--
		//data loss occur if number is greater than available limit

	// primitive to non primitive date conversion
		
		int x=20;
		String str = String.valueOf(x);
		
		System.out.println(str+1);
	
	// non primitive to primitive date conversion
		String s= "40";
		
		int intvalue= Integer.parseInt(s);
		System.out.println(intvalue+2);

		
		
	}
}

