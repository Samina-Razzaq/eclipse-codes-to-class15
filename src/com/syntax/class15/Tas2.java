package com.syntax.class15;

public class Tas2 {

	public static void main(String[] args) {
		
		
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters,
		//print the character in the middle of the String

		String numbers= "135791@$%";
		System.out.println(numbers.substring(0,3)+numbers.substring(6)+numbers.substring(3,6));
		
		System.out.println();
		String str="Hello";
		if(str.length()/2!=0 && str.length()>=3) {
			System.out.println(str.charAt(str.length()/2));
		}
		
		
		//Create a String and print it in reverse order (Sunday → yadnuS).
		//important interview question reverse string using charAt()
		
		String day="Sunday";
		String reverseStr="";
		for(int i=day.length()-1;i>=0; i--) {
			reverseStr=reverseStr+day.charAt(i);
		}
		System.out.println(reverseStr);
		
		
		
		
	}

}
