package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		
		//Do while loop used in java when we don't know in advance how many times we want to repeat the code
		//example lottery
		System.out.println("while check condition before execution");
		int num=10;
		while(num<=3) {
			System.out.println("Hello");num++;
		}
		System.out.println("do while check condition after execution");
		int num1=10;
		do {
			System.out.println("Hello");num1++;}
		while(num1<=3);
		
		
		System.out.println("I want to print number from1 to 30 using do while loop");
		
		int num2=1;
		do {System.out.print(num2+" ");num2++;}
		while(num2<=30);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
