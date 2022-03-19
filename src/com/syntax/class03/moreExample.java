package com.syntax.class03;

public class moreExample {

	public static void main(String[] args) {
		
		
		//we need to declare a boolean variable hungry yes or no
		// if am hungary i am going to eat
		//otherwise i am going to drink a tea
		
		boolean hungary=false;
		if(hungary==true) {System.out.println(" I am going to eat ");} else {
			System.out.println(" I am going to drink a tea ");}
		
	//	boolean hungary=true; ans will be i am going to eat
		
		boolean traffic=true;
		if(traffic) {
			System.out.println("I am coming home late ");
		}else {
			System.out.println("No traffic, I am on time ");
		}
		
		//define a variable to store a browser
		//if browser is chrome we are executing test on chrome
		//otherwise I am not executing any  testcases
		
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("we are executing tests on chrome");}
			else {
				System.out.println("We are not executing any test cases");
			//if (browser){} type mismatch cant convert from string to boolean
				//you can use == but best is to write equals to compare strings would work but not preferreable
				
				
				
				
				
		}
		

	}

}
