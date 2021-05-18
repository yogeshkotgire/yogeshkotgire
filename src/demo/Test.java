package demo;

import interfacediscussion.Interface1;
import interfacediscussion.Interface2;

public class Test implements Interface2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 from interface");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		Interface1.m7();
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m6();
	}

	@Override
	public void t1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int t2() {
		// TODO Auto-generated method stub
		return 0;
	}

	
		
	}


