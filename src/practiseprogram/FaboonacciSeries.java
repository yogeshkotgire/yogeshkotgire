package practiseprogram;

public class FaboonacciSeries {
	public static void main(String[] args) {
		int i=0;
		int  j= 1;
		int k;
		System.out.println(i);
		System.out.println(j);
		for (int m=1;m<=10;m++)
		{
			k=i+j;
			System.out.println(k);
			i=j;
			j=k;
		}
		
		
	}

}
