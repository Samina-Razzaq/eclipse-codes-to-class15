package com.syntax.class04;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		
		
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Please enter 3 different numbers?");
		
		int num1 = input.nextInt();	
		
		int num2 = input.nextInt();
		
		int num3 = input.nextInt();
		
		
		if(num1>num2) {
			
		if(num1>num3) {System.out.println(num1+" is the largest number.");}
		
		else {System.out.println(num3+" is the largest number.");	}
		
		} else 
		if(num2>num3){System.out.println(num2 +" is the largest ");}
		
		
		{System.out.println(num3+" is the largest number.");}
		
		
			
		
			
		
		
		
		
		
		
		
		
		

	}

}
