package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
	
		//logical not is used to revert the condition
		boolean value=!false;//revert by putting=!
		System.out.println("value");
		System.out.println("------------------------------------------");
		
		boolean traffic=true;
		if (!traffic) {System.out.println("I will come on time to work");}
		


String day="Saturday";
if(!day.equals("Saturday")) {
	System.out.println("Today is Saturday");
}
System.out.println("-------------------------------------------");


boolean checkboxChecked=false;
if(!checkboxChecked) {
	System.out.println("I will click on that checkbox");
}
System.out.println("------------------------------------------------");
String java="easy";
if(!java.equals("hard")){System.out.println("You are genius");}
		

	}

}
