package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {

		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).


		
		String[] names= {"Zayaan","Azlan", "Hassan", "Samina"};
		
		System.out.println(names[3]);
		
		
		String[] names1;
		names1=new String[4];
		names1[0]="Zayaan";
		names1[1]="Azlan";
		names1[2]="Hassan";
		names1[3]="Samina";
		System.out.println(names1[3]);
		
	}

}
