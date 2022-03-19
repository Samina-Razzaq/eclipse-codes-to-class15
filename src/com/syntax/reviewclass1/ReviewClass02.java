package com.syntax.reviewclass1;

public class ReviewClass02 {

	public static void main(String[] args) {
		//+,-,*,/,%
		
		int number1=10;
		int number2=10;
		System.out.println(number1+number2);

		String name1="Sam";
		String name2="Khan";
		System.out.println(name1+name2);
		
		char letter1='A';//65
		char letter2='B';//
		System.out.println(letter1+letter2);
		
		//********************************//
		
		System.out.println(number1-number2);
		//System.out.println(name1-name2); not defined
		System.out.println(letter1-letter2);
		//System.out.println(number1-name1);operation is not defined
		
		//********************************************//
		
		System.out.println(number1*number2);
		
		System.out.println((int) 'A');//finding the value of char
		
		System.out.println(number1/number2);
		
		double number3=5;
		double number4=10;
		
		System.out.println(number3/number4);
		double f=5.3f;
		if(f==5.3) {
			System.out.println("Magic");
		}else {
			System.out.println("simple math");
		}
		//always use int data type for whole numbers
		//always use double data type for decimal number
		
		int num1=10;
		int num2=10;
		System.out.println(num1%num2);
		// modulus not defined for strings
		// defined for char
		
		
		
	//	string Concatenation
		
		String name="10";
		int n1=10;
		char letter='A';
		System.out.println(letter+n1+name);
		System.out.println(letter+name+n1);
		System.out.println(10+10+"10");
		System.out.println(10+"10"+10+10);
		System.out.println(10+10+"10"+10+10);
		System.out.println(3+10+"2"+10+10);
		System.out.println(3+10+"2"+(5+10));
		
		
		
	}

}
