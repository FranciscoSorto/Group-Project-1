package com.syntax.class11;

public class Task6 {

	public static void main(String[] args) {

		int a = 0, b = 1, c;

		for (int i = 0; i < 10; i++) {
			System.out.println(a + b);
			c = a + b;
			a = b;
			b = c;
		}

	}

}
