package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		//create secret number
		//we want user to guess our secret number the moment user enter secret number my program should stop
		//otherwise it should continue asking to guess number
		
		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		do {
			System.out.println("Please enter a number");
			 guessNumber=scan.nextInt();;
			}while (guessNumber==secretNumber);
		
		
		
		
		
		
		
		
		
		

	}

}
