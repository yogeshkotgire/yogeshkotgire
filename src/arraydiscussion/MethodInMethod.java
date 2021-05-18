package arraydiscussion;

public class MethodInMethod {
	public static void m1(int []a )
	{
		a[1]=45;
		for(int g:a)
			System.out.println(g);
	}
	public static void main(String[] args) {
		int [] a= new int [3];
		a[0]=1;
		a[1]=15;
		a[2]=11;
		m1(a);
	}

}
