package com.syntax.class04;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		
		
		
		
		Scanner creditCard = new Scanner (System.in);
		
		
		System.out.println("Do you have a credit card?");
		
		String answer= creditCard.nextLine();
		
		if (answer.equalsIgnoreCase("yes")) {
		System.out.println("What is the balance on the card?");
		
		int balance= creditCard.nextInt();
		
		if(balance>1000) {System.out.println("Pay off your balance immediately.");}else {
			System.out.println("You can spend more");}
		}
		else {System.out.println("So would you like to have a credit card?");}
		
		 
		
		
		
		
		
		
		

	}

}
