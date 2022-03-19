package com.syntax.class10;

import java.util.Scanner;

public class HW06 {

	public static void main(String[] args) {
		
		//Write a java program to check whether a given number is prime or not?
		
		Scanner input=new Scanner (System.in);
		System.out.println("Enter any number to check whether it is prime or not");
		 int number=input.nextInt();
		
		int factors=0;
		for(int i=1; i<=number; i++) {
			
			if(number%i==0) {
				factors++;
			}
		}
		if(factors==2) {
			
		System.out.println("Entered number is a Prime number");}
		
		else {System.out.println("Entered number is not a Prime number");}
	
	
		
		
		
		
		
		
		
		
		
		

	}

}
