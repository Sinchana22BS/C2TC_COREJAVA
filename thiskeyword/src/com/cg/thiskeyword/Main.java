package com.cg.thiskeyword;
class hello
{
	hello()
	{
		this(5);
		System.out.println("hello s");
	}
	hello(int x)
	{
		System.out.println(x);
	}
}

public class Main {

	public static void main(String[] args) {
		hello h = new hello();

	}

}
