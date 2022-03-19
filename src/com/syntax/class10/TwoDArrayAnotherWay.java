package com.syntax.class10;

public class TwoDArrayAnotherWay {

	public static void main(String[] args) {
		
		int[][] numbers= {
				{10, 20, 30, 40},
				{100, 200, 300, 400},
				{1000, 2000, 3000, 4000}
		};
		
		System.out.println(numbers[2][1]);//2000
		
		int sizeof1Array=numbers.length;
		System.out.println("Size of first array is "+sizeof1Array);
		
		
		
		
		//retrieving all element from 2D
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[0].length; j++) {
				
				System.out.println(numbers[i][j]);
			}
		}
		
		
		

	}

}
