package com.cg.Super;
class Animal
{
	public char[] color;

	void eat()
	{
		System.out.println("eating..");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("eating bread..");
	}
	void bark() {
		System.out.println("barking..");
	}
	void work() {
		super.eat();
		bark();
	}
}
public class Demo {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.work();

	}

}
