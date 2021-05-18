package encapsulationdiscussion;

public class DataHiding {
	
	static private int balance=125400;
	
	public static void  getbalance(int pin)
	{
		if (pin == 1000)
		System.out.println("Your Balance is "+balance);
		else
		System.out.println("invalid pin");
	}

}
