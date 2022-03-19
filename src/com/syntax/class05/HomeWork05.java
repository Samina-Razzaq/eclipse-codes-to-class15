package com.syntax.class05;

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your birth month and you will get to know which season baby you are");
		
		String month=input.next();
		
		if((month.equalsIgnoreCase("March")) ||  (month.equalsIgnoreCase("April"))  || (month.equalsIgnoreCase("May"))  ) {
			
		System.out.println("You are a spring season baby");	}
		
		else if  ((month.equalsIgnoreCase("June")) || (month.equalsIgnoreCase("July")) || (month.equalsIgnoreCase("August"))) {
			
		System.out.println("You are a summer baby");}
		
		else if((month.equalsIgnoreCase("December")) || (month.equalsIgnoreCase("January")) || (month.equalsIgnoreCase("February"))) {
			
		System.out.println("You are winter baby");}
		
		else if((month.equalsIgnoreCase("September")) || (month.equalsIgnoreCase("October")) || (month.equalsIgnoreCase("November"))) {
			
		System.out.println("You are a fall baby");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
