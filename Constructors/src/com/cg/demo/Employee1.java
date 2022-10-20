package com.cg.demo;

class Employee1{
	int id;
	String name;
	float salary;
	

 Employee1(int id , String name,float salary ) {
	System.out.println("user defined no-argument"+"constructor executed");

}
void display() {
	System.out.println(id+" "+name+" "+salary);
}
}