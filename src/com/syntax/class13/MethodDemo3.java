package com.syntax.class13;

public class MethodDemo3 {
	// int we specify the datatypes that method willreturn
	//sqyareTheNumber name of the method
	//(int number) parameters of the method
	//return tell java what to return from this method
	
	int squareTheNumber(int number) {
		return number*number;
	}

	String checkPerson(String name, String animalName) {
		if("Tefur".equalsIgnoreCase(name) && "Horse".equalsIgnoreCase(animalName)) {
			return "Camel";}else {
				return "Not valid";
			}
	}
	public static void main(String[] args) {
		MethodDemo3 obj=new MethodDemo3();
           int result= obj.squareTheNumber(5);
           System.out.println(result);
	

	String result1= obj.checkPerson("Tefur", "horse");
	System.out.println(result1);
}
}