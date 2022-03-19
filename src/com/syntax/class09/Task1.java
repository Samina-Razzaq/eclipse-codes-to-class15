package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
	
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).

		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		//how many elements inside array?
		int size=grades.length;//6
		System.out.println("Numbers of elements is= "+ size);
		
		System.out.println(grades[1]);
		for(int i=0; i<grades.length; i++)// size is always less than index not equal
			System.out.print(grades[i]+" ");
		
		System.out.println("            ");
		char[] grades2;
		grades2=new char[6];
		
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
	

	}
	
	
	
	
	

}
