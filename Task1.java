package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		
		int[][] num = {{10,20,30}, {1,2,3,}, {3,4,5}};
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			
			for(int j=0; j<num[i].length; j++) {
				sum+=num[i][j];
				
			}
		}

		System.out.println(sum);
		
	}

}
