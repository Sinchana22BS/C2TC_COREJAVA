package com.cg.thiskeyword;
class Student{
	int rollno;
	String name;
	float cgpa;
	
	Student(int rollno,String nane,float cgpa){
		this.rollno = rollno;
		this.name = name;
		this.cgpa = cgpa;
		
	}
	void display() {
		System.out.println(rollno+ " " + name + " "+ cgpa);
	}
}
public class Variables {

	public static void main(String[] args) {
		Student s1 = new Student(101,"Sinchana",8.9f);
		Student s2 = new Student(102,"Zara",8.9f);
		s1.display();
		s2.display();

	}

}
