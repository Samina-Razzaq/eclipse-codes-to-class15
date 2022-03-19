package com.syntax.class07;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		
		
		double price=3;
		System.out.println("Please pay for the coffee");
		
		Scanner input=new Scanner(System.in);
		
		double pay;
		do {
			pay=input.nextDouble();
			
			if(pay>price) {
				System.out.println("Please give less");
				
			}else if(pay<price) {
				System.out.println("Please give more");
			}
		 } while(pay!=price);
System.out.println("Please enjoy your coffee");
	}

}
