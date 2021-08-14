package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		
		int[][] num = {{1,2,3}, {4,5,6}, {7,8,9}};
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i=0; i<num.length; i++) {
			
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j]%2==0) {
					sumEven+=num[i][j];
				}else {
					sumOdd+=num[i][j];
				}
				
			}
		}
		
		System.out.println("The sum of even numbers is " + sumEven);
		System.out.println("The sum of odd numbers is " + sumOdd);


	}

}
