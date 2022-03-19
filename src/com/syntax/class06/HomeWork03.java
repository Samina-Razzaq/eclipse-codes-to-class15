package com.syntax.class06;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		
		
Scanner input=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		System.out.println("Enter the operator you want to apply on the numbers you entered");
		
		char operator=input.next().charAt(0);	
		
		int result=0;
		
		if(operator== '+' ) {result=(num1+num2);}
		
   else if(operator== '-') {result=(num1-num2);}
		
   else if(operator== '*')  {result=(num1*num2);}
		
   else if(operator== '/') {result=(num1/num2);}
		
   else {  System.out.println( "Invalid operator");}
		
		
		System.out.println("Result is "+result);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
