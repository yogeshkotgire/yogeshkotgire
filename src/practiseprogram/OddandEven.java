package practiseprogram;

public class OddandEven {
	public static void main(String[] args) {
	int i=10;
	int j=i;
		for (j=1;j<=i;j++)
		{
			if(j%2==0)
				System.out.println(j);
		}
		for (j=0;j<=i;j++)
		{
			if(j%2==1)
				System.out.println(j);
		}
	}

}
