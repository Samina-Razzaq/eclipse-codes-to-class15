package com.syntax.class07;

public class ForLoopsPractice {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
		}
		
		System.out.println("Multiplication table");
		
		
		int num=7;
		int result;
		for(int i=1;i<=10; i++) {
			result=num*i; System.out.println(num+"x "+i+"= "+result);
		}

		
		System.out.println("What is output");
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum+=i;
		}
		 
		
		System.out.println(sum);
		
		System.out.println("output");
		
		int sum1=0;
		for (int i=1; i<=5; i++) {
			sum1+=i;
		System.out.println(sum1);	
		}
		
		//I want to find out the sum of all even and all odd numbers from range 1 to 50
		int sumEven=0;
		int sumOdd=0;
		for(int i=1; i<=50; i++ ) {
			
			if(i%2==0)
			
			{	sumEven=sumEven+i;}
			else {
				sumOdd=sumOdd+i;
			}
			
		}System.out.println("The sum of all even numbers = "+sumEven+" and the sum of all odd numbers = "+sumOdd);
		
		
	}

}
