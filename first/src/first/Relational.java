package first;

import java.util.Random;

public class Relational {

	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt(50);
		int j = rand.nextInt(100);
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println(i>=j);
		System.out.println(i<=j);

	}

}
