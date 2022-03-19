package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//next() vs nextLine
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter temperature");
		int temp=scan.nextInt();//nextInt(0; nextDouble(); nextBoolean(); next().charAt(0); then nextLine can't be capture
		//nextline cannot be printed
		
		
		scan.nextLine();//will resolve skipping
		
		System.out.println("Please enter the city");
		String value=scan.nextLine();
		System.out.println("value");
		System.out.println("End of program");

	}

}
