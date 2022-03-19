package com.syntax.class06;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		System.out.println("Enter the operator you want to apply on the numbers you entered");
		
		char operator=input.next().charAt(0);
		
		int result=0;
		
		switch (operator) {
		
		case '+':
			result=(num1+num2);
		    break;
		
		case'-':
			result=(num1-num2);
			break;
			
		case'*':
			result=(num1*num2);
			break;
		
		case '/':
			result=(num1/num2);
			break;
			
		default:
			break;
			}
		
		System.out.println("The result of two numbers entered is "+ result);
		
		
		
		
		
		
		
		
		
		

	}

}
