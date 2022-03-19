package com.syntax.class10;

public class HW04 {

	public static void main(String[] args) {
		
		
		//Create a 2D array of integers.
		//Develop a program which will calculate the sum of  even and odd numbers for that array.
		
		
		int [][]numbers= { {2, 3, 6, 9, 10, },
				         
				           {1, 2, 5, 8, 9}
		};
		
		int sumEven=0;
		int sumOdd=0;
			
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[0].length; j++)  {
				
			if(numbers[i][j]%2==0) {
				
				sumEven+=numbers[i][j];	}
			}
		}
		
		System.out.println("Sum of all even numbers is "+sumEven);
		
for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[0].length; j++)  {
				
			if(numbers[i][j]%2!=0) {
				
				sumOdd+=numbers[i][j];	}
			
			}
		}
		
		System.out.println("Sum of all odd numbers is "+sumOdd);
		
		
		
		

	}

}
