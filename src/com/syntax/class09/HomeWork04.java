package com.syntax.class09;

public class HomeWork04 {

	public static void main(String[] args) {
		
		
		
		int[]numbers= {15, 45, 100, 32};
		
		
		
int largest=numbers[0];
		
		for(int i=1; i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
		}
		
		System.out.println("The biggest number is "+largest);
		
		System.out.println("                                  ");
		
		
		largest=numbers[0];
		for(int num:numbers) {
			if(num>largest) {
				largest=num;
			}
		}
		
		System.out.println(largest);
		
		

	}

}
