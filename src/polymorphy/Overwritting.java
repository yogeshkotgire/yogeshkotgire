package polymorphy;

public class Overwritting extends Polymorphysm {
	public void m1(int i, boolean b)
	{
		System.out.println(" Polymorphysm m1 is running");
	}
	public void m1(int i,int t, int b)
	{
		System.out.println(" overwritting m1 is running");
	}
	public static void main(String[] args) {
		Overwritting o= new Overwritting();
		o.m1(10, 50, 30);
		
		Polymorphysm p=new Polymorphysm();
		p.m1(45, true);
		
				
	}
}
