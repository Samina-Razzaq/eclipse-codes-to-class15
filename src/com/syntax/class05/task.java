package com.syntax.class05;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		
	Scanner input=new Scanner(System.in);
	
	System.out.println("What is the day today?");
	 String day=input.nextLine();
	
	if(day.equals("Monday") || day.equals("Friday")){
		
System.out.println("there is no class");
	}
	else if(day.equals("Tuesday") || day.equals("Wednesday"))		{
		
		System.out.println("manual");
	}
		
	else if(day.equals("Thursday"))	{
		System.out.println("Review class");
	}
		
		
		
		
		

	}

}
