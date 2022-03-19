package com.syntax.class04;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		

		Scanner age=new Scanner (System.in);
		System.out.println("What is your age?");
		
		int number=age.nextInt();
		
		if (number>=18) {System.out.println("You will be issued a driver license");}
		else {System.out.println("You should get a learners permit.");}
		
	}

}
