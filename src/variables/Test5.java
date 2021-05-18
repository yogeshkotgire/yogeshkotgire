package variables;

public class Test5 {
	static String institute;
	String name;
	int rollno;	
	double marks;

public static void m1()
{
	institute = "Velocity";
	Test5 stu1= new Test5();
	stu1.name= "yogesh";
	stu1.rollno=1;
	stu1.marks=80.65;	
	System.out.println(institute);
	System.out.println("Student name is "+stu1.name);
	System.out.println("Student roll no. is "+stu1.rollno);
	System.out.println("Student marks are "+stu1.marks);
}
public static void m2()
{
	institute = "Velocity";
	Test5 stu1= new Test5();
	stu1.name= "pratiksa";
	stu1.rollno=2;
	stu1.marks=85;
	System.out.println(institute);
	System.out.println("Student name is "+stu1.name);
	System.out.println("Student roll no. is "+stu1.rollno);
	System.out.println("Student marks are "+stu1.marks);
}

public static void m3()
{
	institute = "Velocity ";
	Test5 stu1= new Test5();
	stu1.name= "shubham";
	stu1.rollno=3;
	stu1.marks=87;
	System.out.println(institute);
	System.out.println("Student name is "+stu1.name);
	System.out.println("Student roll no. is "+stu1.rollno);
	System.out.println("Student marks are "+stu1.marks);
}
public void m4()
{
	institute = "Velocity";
	Test5 stu1= new Test5();
	stu1.name= "pritesh";
	stu1.rollno=2;
	stu1.marks=88;
	System.out.println(institute);
	System.out.println("Student name is "+stu1.name);
	System.out.println("Student roll no. is "+stu1.rollno);
	System.out.println("Student marks are "+stu1.marks);
}

public static void main(String[] args) {
     m1();
     m2();
     m3();
     Test5 pj = new Test5();
     pj.m4();
     
}
}
