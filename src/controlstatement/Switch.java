package controlstatement;

public class Switch {
	public static void main(String[] args) {
		
	String a ="addition";
	int i = 10;
	int j = 10;	

	switch(a) 
	{
	case "addition" :
		System.out.println(i+j);
		break;	
	
	case "substraction" :
		System.out.println(i-j);
		break;
	case "division":
		System.out.println(i/j);
		break;
	case "multiplication":
		System.out.println(i*j);
	default :
		System.out.println("default is running");

	}
}
}