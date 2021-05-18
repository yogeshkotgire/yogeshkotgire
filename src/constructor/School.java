package constructor;

public class School {
	static String name= "velocity trainning centre";
	String names;
	int age;
	int height;
public School(String names ,int age,int height)
{
	this.names=names;
	this.age=age;
	this.height=height;
	
	System.out.println("student name: "+names+ " student age "+ age+ " student height is "+ height);
}
	
public static void main(String[] args) {
	School Std1= new School("ganesh", 23,150);
	System.out.println(name);
	System.out.println(Std1.names);
	School Std2= new School("shubham",28,180);
	System.out.println(Std2.names);

	
	
	
}
}
