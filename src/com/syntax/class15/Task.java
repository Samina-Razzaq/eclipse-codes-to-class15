package com.syntax.class15;

public class Task {

	public static void main(String[] args) {
		
		// Write a program that reads two people's first
		//names and if they expecting boy or girl? 
		
		String mom="Mary";
		String dad="Daniel";
		String momfirstHalf=mom.substring(0,mom.length()/2);
		String dadfirstHalf=dad.substring(0, dad.length()/2);
		String momSecondHalf=mom.substring(mom.length()/2);
		String dadSecondHalf=dad.substring(dad.length()/2);
		boolean babygirl=false;
		if(babygirl) {
			System.out.println(momfirstHalf+dadSecondHalf);
		}
		
		else {
			System.out.println(dadfirstHalf+momSecondHalf);
		}
	}

}
