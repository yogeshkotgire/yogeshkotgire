package controlstatement;

public class Loop1 {
	public static void main(String[] args) {
		
		for(int j=1;j<=5;j++)		
		{
			for(int i=1; i<=5; i++)
			{
				if (j<=i)
				System.out.print("& ");
				else
					System.out.print("");
			}
			System.out.println();
		}
	}

}
