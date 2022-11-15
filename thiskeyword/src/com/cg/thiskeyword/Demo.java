package com.cg.thiskeyword;

public class Demo {
	void m() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		System.out.println(d1);
		System.out.println(d2);
		d2.m();
		

	}

}
