package com.yr.t1;

public class Test2 {
	private Test1 t1;
	
	public Test2() {
		t1 = new Test1();
	}
	
	public void t2() {
		int num=t1.sum(1, 2);
		System.out.println(num);
	}
}
