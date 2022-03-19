package com.syntax.class13;

public class MethodDemo1 {
	
	void checkEvenOdd(int number) {
		if(number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}}
		void checkPerson (String name){
			if("Tefur".equals(name)) {
				System.out.println("Memer");
			}else if("Maha".equals(name)) {
				System.out.println("I am a doctor");
			}else {
				System.out.println("I don't know");
			}
			
		}
	

	public static void main(String[] args) {
		MethodDemo1 object1=new MethodDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(17);
		
		object1.checkPerson("Tefur");
		object1.checkPerson("Maha");
		
		

	}

}
