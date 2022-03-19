package com.syntax.class03;

public class Ifstatement {

	public static void main(String[] args) {
		//results of relational and equality operators ALWAYS boolean value (T/F)
		//scenerio i need to compare two numbers and i have to find the bigger one
		//if statement
		//Sysntax of if statement
		//if (boolean conditio) {code{
		int num1=100;
		int num2=50;
		
		if (num1>num2) {//block of code two curly brackets
			System.out.println(num1+" is larger than "+num2);
		}
		if (num1<num2) {
			System.out.println(num1+" is larger than "+num2);
		}
//no answer program will not run bcz of if condition
		
		double money=5;
		double coffee=4.99;
		
		//if i have more money than price of coffee then buying coffee
		if(money>coffee) {
			
			System.out.println("I am buying the coffee");
		}
		//if(money=coffee) {errorr bcz if condition always must be boolean
			//we use double bcz of wrong operator
		}// we will put >= in if condition for same price of coffee and money
	//if money =5 and coffee=5 then if condition would be money>=coffee
	
	
		
		
		
		
		
	}


