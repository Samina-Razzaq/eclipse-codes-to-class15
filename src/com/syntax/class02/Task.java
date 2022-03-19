package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		
		/* 
		 * shortcut to format code
		 * ctrl+
		 */

		
		double a=12.76;
		double b=10.99;
		double sum= a+b;
		System.out.println(sum);
		
		double sub=a-b;
		System.out.println(sub);
		
		double div=a/b;
		System.out.println(div);
		
		double multi=a*b;
		System.out.println(multi);
		
		System.out.println("The "+"sum "+" of "+ "2 "+"numbers "+a +" and "+ b+" is "+" equal "+" to "+ sum );
		
		
		double square=3.9*3.9;
		System.out.println(square);
		
		System.out.println("The "+" square "+"of "+"3.9 "+" is "+square);
		
		
		
		//Write a program to print the area and perimeter of a rectangle with width = 5 and 
		//
		//height = 8. Your program should say. “The perimeter of a rectangle with width ___ and
				//height ____ is equal to _____ and the area is __”
		//
		
		
		
		int width=5;
		int height=8;
		
		int perimeter=2*(width+height);
		int area=width*height;
		
		System.out.println("The Perimeter of rectangle with width "+width+" and height "+ height +" is equal to "+ perimeter+" and thr area is "+area);
		
		
		
		
	}

}
