package com.cg.demo;

class Employee {
	int id;
	String name;
	float salary;
	Employee() {
		System.out.println("user defined no-arguement"+"constructor expected");
	}
	void display() {
		System.out.println(id + " " + name+ " " + salary);
	}

}
