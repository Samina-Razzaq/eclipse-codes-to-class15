package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
			
		System.out.println("Please enter your name");
			
		String name= input.next();
		
		System.out.println("Please enter your age");
		
		int age=input.nextInt();
		
		System.out.println("Pleasr enter a boolean value");
		
		boolean booleanValue=input.nextBoolean();
		
		System.out.println("Please enter a decimal value");
		
		 double d= input.nextDouble();
		   
	 System.out.println("Please enter char value");
	 
		 char character=  input.next().charAt(0);
		
		

	}

}
