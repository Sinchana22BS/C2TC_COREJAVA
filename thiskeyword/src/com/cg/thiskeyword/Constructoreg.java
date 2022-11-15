package com.cg.thiskeyword;
class Test{
	Test(){
		System.out.println("Inside uder defined no argument constructor");
		
	}
	Test(int x){
		this(5,15);
		System.out.println(x);
		
	}
	Test(int x,int y){
		this();
		System.out.println(x+ " "+y);
	}
	
}

public class Constructoreg {

	public static void main(String[] args) {
		Test t1 = new Test(10);
		

	}

}
