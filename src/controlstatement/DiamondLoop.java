package controlstatement;

public class DiamondLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1;i<=4;i++)
		{
	
		for (int j=1;j<=7;j++)
		{
			if ((j>=5-i) &&(j<=i+3))
			{
				System.out.print( "*");
			}
		
			else 
			{
					System.out.print(" ");
			}
		}
		System.out.println();

	}
		

}
}