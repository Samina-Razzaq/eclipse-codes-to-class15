package com.syntax.class04;

import java.util.Scanner;// we need to import Scanner into our class
//to import Scanner shortcut =>ctrl+shift+o

public class userInput {

	public static void main(String[] args) {

	Scanner input=new Scanner(System.in);//1.creating a scanner and assign to a variable
	                                      //2. specify instructions
	System.out.println("Please enter your name");
		
		//3.if you want to capture single String==>use next();
	String name=input.next();// type string and hit enter
	System.out.println("My name is "+name);
	
	//if you want to capture int value==> use next Int();
	
	System.out.println(name+" please enter your age");
	
	int age=input.nextInt();
	System.out.println("Your name is "+name+" and your age is "+age);

	//if you are from france==>you speak french	
	//if you are from usa  you speak english
	
		
		
		
		
		
		
		
		
		

	}

}
