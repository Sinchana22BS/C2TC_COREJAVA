package com.cg.thiskeyword;
class A{
	void m(A x) {
		System.out.println("Method m is invoked");
		
	}
	void p() {
		m(this);
		System.out.println("Method p is invoked");
	}
}
class B{
	void n(B ex) {
		System.out.println("Method n is invoked");
	}
		
	
	void q() {
		n(this);
		System.out.println("Method q is invoked");
	}
}

public class MethodCall {

	public static void main(String[] args) {
		A obj = new A();
		B obj1 = new B();
		
		obj.p();

	}

}
