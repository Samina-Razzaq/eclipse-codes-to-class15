package com.syntax.class04;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		
	Scanner loan =	new Scanner(System.in);
	System.out.println("What is the amount of loan needed?");
	
	int amount= loan.nextInt();
		
if (amount<=200000) {System.out.println("I would lend the money");
	
}else {System.out.println("I would reject the client.");
	
}
	}

}
