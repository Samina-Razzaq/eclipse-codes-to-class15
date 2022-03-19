package com.syntax.class09;

public class HomeWork03 {

	public static void main(String[] args) {

		
		//Create an array on integers and calculate the sum of all elements in an array
		
		int[] numbers= {15, 18, 20, 250,30, 38, 50, };
		
		int sum=(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]+numbers[5]+numbers[6]);
		
		for(int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
		}
		
		System.out.println("The sum of all the elements is equal to "+sum);
		
		
		System.out.println("                  ");
		
		//From an array of integer elements find the largest number
		
		int largest=numbers[0];
		
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
		}
		
		System.out.println("The biggest number is "+largest);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
