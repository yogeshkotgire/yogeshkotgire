package arraydiscussion;

public class AssendingDescending {
	public static void main(String[] args) 
	{
		int[] a= {12,4,75,45,89,26,73,9};
		int b;
		int temp=0;
		System.out.println("elements of sorted array");
		for(int i=0;i<a.length;i++)
		{
			b=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[b])
				{
					b=j;
				}
			}
			temp=a[i];
			a[i]=a[b];
			a[b]=temp;
			System.out.println(a[i]);

		}
			
		
		
	}

}
