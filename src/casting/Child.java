package casting;

public class Child extends castinggggg {
	public void m3()
	{
		System.out.println("m3 from child");
	}
	public void m1()
	{
		System.out.println("m1 from child");
	}
	public static void main(String[] args) 
	{
		castinggggg ccc= new Child();
		ccc.m1();
		Child ch = (Child)ccc;
		ch.m1();
		castinggggg ab= new castinggggg();
		//Child abc = (Child)ab;
		//abc.m1();// ClassCastException
		castinggggg abd=(castinggggg)ab;
		abd.m1();		
	}
}
