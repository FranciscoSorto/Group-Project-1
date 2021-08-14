package com.syntax.class11;

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		
		int largest = 0;
		int secondLargest = 0;
		
		int[] numbers = { 1, 2, 30, 4, 50 };
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];
			} else if (numbers[i] > secondLargest && numbers[i] != largest) {
				secondLargest = numbers[i];
			}
		}
		System.out.println("The second largest number is " + secondLargest);
	}

}
