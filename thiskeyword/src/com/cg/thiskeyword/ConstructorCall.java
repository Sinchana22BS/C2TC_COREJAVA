package com.cg.thiskeyword;
class A4{
	int data=10;
	A4(){
		B4 b = new B4(this);
		
	}
	
}
class B4{
	B4(A4 x){
		
	}
	
}

public class ConstructorCall {

	public static void main(String[] args) {
		A4 a = new A4();

	}

}
