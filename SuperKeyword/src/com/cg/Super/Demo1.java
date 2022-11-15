package com.cg.Super;
class Animal1
{
	String colors = "white";
}
class Dog1 extends Animal1
{
	String colors = "black";
	void printColor() {
		System.out.println(colors);
		System.out.println(super.colors);
	}
}
class Demo1 {

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.printColor();

	}

}
