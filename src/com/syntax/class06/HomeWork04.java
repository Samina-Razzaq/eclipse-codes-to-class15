package com.syntax.class06;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);	
		
	System.out.println("Is it sale going on. Reply with yes or no");
		
		String ans=input.next();
		
	if(ans.equalsIgnoreCase("no")) {System.out.println("I am not going for shopping");
		
	}else {System.out.println("What is the price of the item?");	}
		
		double price=input.nextDouble();
		
		double discount;
		
		if(price<20) {
			
			discount=10;}
		
		else if (price>=20 && price<=100) {
			
			discount=20;}
		
		else if(price>=100 && price<=500) {
			
			discount=30;}
		
		else {
			discount=50;}
		
		double afterDiscount=price-(price*discount)/100;
		
		System.out.println("After discount "+discount+ "% discount the price of the item reduce from "+price+" to "+afterDiscount);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
