package interfacediscussion;

public interface Interface1 {
	int i=10;
	public int j=10;
	public static int k=10;
	public static final int l=10;
	
	
void m1();
void m2();
void m3();
void t1();
int t2();//public abstract int t2()
 static void m7()
{
	System.out.println("m7");
}
static void main(String[] args) {
	m7();
	Interface1.m7();
}
}
