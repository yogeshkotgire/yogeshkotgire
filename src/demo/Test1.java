package demo;

import interfacediscussion.Interface1;
import interfacediscussion.Interface2;


public class Test1 extends Test implements Interface2,Interface1 {
	
	// line no.6 has multiple inheratance by keyword extends--implements
	public static void main(String[] args) {
		Test1 y = new Test1();
		y.m1();
	}

}
