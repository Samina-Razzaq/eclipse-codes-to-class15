package com.syntax.class06;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your grade from the list A,B,C.D and F");
		
		char grade=input.next().charAt(0);
		
		String explanation=null;
		
		switch (grade) {
		
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
		default:
				explanation="Not Acceptable";
			}
		
		System.out.println(" Grade "+grade+ " means "+explanation+ " job ");
		
		
		
		
		
		
		

	}

}
