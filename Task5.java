package com.syntax.class11;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number to check if its prime");
		
		int num = input.nextInt();
		boolean prime = false;
		
		
		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
				prime = true;
				break;
			}
		}
		if (!prime)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
