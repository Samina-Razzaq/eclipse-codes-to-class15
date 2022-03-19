package com.syntax.class04;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		
		
	Scanner work=new Scanner(System.in);	
	
	System.out.println("How many years you have worked?");
	
	int years= work.nextInt();
	
	if(years>=5) {System.out.println("You are eligible.");
	
	System.out.println("How much is your salary");
	
	int salary=work.nextInt();
		
		if(salary>50000) {System.out.println("Your bonus is equal to 5000.");}else {
			
			System.out.println("Your bonus is equal to 3000");
		}	
		
		
	}else {System.out.println("You are not eligible.");}
		
		
		
		
		

	}

}
