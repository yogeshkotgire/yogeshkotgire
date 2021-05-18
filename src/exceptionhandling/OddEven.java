package exceptionhandling;

public class OddEven {
	public static void main(String[] args) {
		
	int[] a= new int[5] ;
	
	a[0]=1;
	a[1]=3;
	a[2]=7;
	a[3]=11;
	a[4]=15;
	System.out.println(a[4]);
	
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i]);
	}
	
 	
	//iterating an array using enhanced for loop
	for(int g:a)
	{
		System.out.println(g);
	}
	
	
	
	//oddevenprogram
	
	int k=20;
	
	for(int j=1; j<=k;j++)
	{
		int b[]= new int [j];
		b[j-1]=j;
		if(b[j-1]%2==0)		//for odd if(b[j-1]%2==1)
		{
			System.out.println(b[j-1]);
		}
		
	}
	}

}
