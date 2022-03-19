package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		

		Scanner city = new Scanner(System.in);
		System.out.println("What is your city");
		
	    String name = city.nextLine();//if 
	    
	    System.out.println("Whats the teperature?");
	    
	    int temp= city.nextInt();
		
		double conv=(temp*1.8)+32;
		System.out.println("The temperature in the city "+name+" is "+conv+" F. ");
		
		
		
		
		
		
	}

}
