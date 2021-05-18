package constructor;

public class Con12 {
	int l;
	String j;
	boolean g;
	
	public Con12(int a,boolean b)
	{
		this(15,"velocity",'d');
		
		System.out.println("constructor is running");
		System.out.println("a value is "+a+", value of b is "+b);
	}
	public Con12(int c,String s,char d)
	{
		this(42.215);
		System.out.println("second constructor is running");
		System.out.println("c is "+" " +c+" " +s+" "+ d);
	}
	public Con12(double f)
	{	
		
		System.out.println("third constructor is running");
	}
	public Con12()
	{
		this(12, true);
		System.out.println("forth constructor is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Con12 rty =new Con12();

	}

}
