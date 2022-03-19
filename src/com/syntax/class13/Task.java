package com.syntax.class13;

public class Task {
	
	
	// Create a method that will take 2 parameters as a numbers and prints which number is larger.

	void larger(int number1, int number2) {
		if(number1>number2) {
			System.out.println("number1 is greater");;
		}else if(number2>number1) {
			System.out.println("number2 is greater");;
		}else {
			System.out.println("numbers are same");
		}
	}
	
	//Create a method that will take a number and prints whether the number is even or odd.
	
	void EvenOdd(int num) {
		if(num%2==0) {
			System.out.println("number is even");
		
	}else  {
		System.out.println("number is odd");}
	}
	
	public static void main(String[] args) {
		
		Task object=new Task();
		object.larger(30, 20);
		object.larger(10, 20);
		object.larger(20, 20);
		
	object.EvenOdd(7);

	}

}
