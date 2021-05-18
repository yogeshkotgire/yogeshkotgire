package arraydiscussion;

public class FindArrayIndex {
	public static void main(String[] args) {
		
	int a[]= {15,45,35,78,98,85,36};
	
	for(int i=0;i<a.length;i++)
	{
		if (a[i]==35 || a[i]==78)
		{
			System.out.println("a[" +i+ "]");
		}
	}
	
	}
}
