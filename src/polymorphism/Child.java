package polymorphism;

public class Child extends Parents {
	int i=12;
	static int j=26;
	
	public void marry()
	{
		System.out.println("marry from child.");
		
	}
	
public static void main(String[] args) {
	Child c= new Child();//first condition
	System.out.println(c.i);
	System.out.println(j);
//	c.marry();
//	c.property();
//	c.home();
//	c.bike();
	
	Parents pp= new Parents();//
	System.out.println(pp.i);
	System.out.println(Parents.j);
//	pp.marry();
	Parents p =new Child();//third condition
	System.out.println(p.i);
//	p.marry(); //based on the run time object
	// Child cc=new Parents();---condition is not valid
	
}
}
