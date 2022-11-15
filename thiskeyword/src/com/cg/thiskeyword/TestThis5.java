package com.cg.thiskeyword;
class Demo5
{
	Demo5()
	{
		System.out.println("hello s");
	}
	Demo5(int x)
	{
		this();
		System.out.println(x);
	}
}
 class TestThis5 {

	public static void main(String[] args) {
		Demo5 d = new Demo5(10);

	}

}
