package com.syntax.class06;

import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your score");
		int score=input.nextInt();
		

		
		
		char grade;
		
		if(score>=90) {
			grade ='A';
		}
		
		else if(score>=70 && score<90) {
			grade='B';
		}
		
		else if(score>=50 && score<70){
			grade='C';
		}
		
		else {
			grade='F';
		}
		
		System.out.println("Your grade is "+grade);
		
		if(grade=='A' || grade=='B') {System.out.println("You are great student");}
		
		
		
		

	}

}
