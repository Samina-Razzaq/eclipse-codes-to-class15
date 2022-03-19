package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for( int i=1;i<=7; i++) {
			
			if(i==3) {
				continue;//skip current iteration/cycle
			}
			System.out.println("Hello"+i);
			System.out.println("We are batch 12");
		}
		
		
		// I want to print all numbers from 1 to 10 except number 4 and if we want two numbers
		//we will have logical operator in if condition with or logical operator
		for(int a=1; a<=10; a++) {
			
			if(a==4) {
				continue;//break and continue
			}
			System.out.print(a+" ");
			
		}
		
		
		
		
		
		
		
		
	}

}
