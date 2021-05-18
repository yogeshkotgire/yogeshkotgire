package inheritance;

public class Father extends GrandFather {
	int i=40;
	int j=50;
	
	public void family() {
		System.out.println(super.j+i);
		System.out.println(super.i+j);
		
	}
	
	public static void main(String[] args) {
		
		Father ert=new Father();
		ert.home();
		ert.family();
		shop();
		
	}
}