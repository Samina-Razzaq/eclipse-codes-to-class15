package com.syntax.class04;

public class nestedIf {

	public static void main(String[] args) {

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//declare a variable for allergy
		//if you have allergy
		//if you have pollen
		//if you have peanut
		//if you have gluten
		//if no allergy ==>you are lucky
		
		
		boolean allergy=true;
		
		if (allergy) {//outer if
			System.out.println("Lets check what allergies you have");
			
			String allergyType="pollen";
			//nested if==> always has a dependancy on outer if
			//outer if must be true in order for nested if to be checked
	 if (allergyType.equals("pollen")) {System.out.println("Please stay at home when trees are blooming. Take medicine a");}
	 if(allergyType.equals("peanut")) {System.out.println("You should avoid food with nuts.Take medicine b.");}
	 if(allergyType.equals("gluten")) {System.out.println("You should not eat wheatand take medicine c.");}
	 }
	 
		
			
		 else {System.out.println("You are lucky");}
			
		
		
	 }
		
		
		
		
		}	
		

	


