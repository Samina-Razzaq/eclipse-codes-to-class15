package com.syntax.class07;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<=5) {
			System.out.println(i);i++;
		}
		System.out.println("The value of i outside of while loop = "+i);
		System.out.println("The end");
		
		//print values from 2 to 20
		
		int a =2;
		while(a<=20) {System.out.println(a+" ");a++;}
		
		int b=1;
		while (b<=50) {
			System.out.print(b+" ");b++;
		}
		
		System.out.println("The End");
		
		int c=20;
		while(c>=1) {
			System.out.print(c+" ");c--;//if decrement operator condition become true forever n result infinite
		}
		
		//task only even numbers from 1 to 30
		
		int d=2;
		while( d<=30) {System.out.println(d+" ");d+=2;}
		
		int e=1;
		while(e<=30) {
			if(e%2==0) {
		System.out.print(e+" ");}	e++;// increment should be outside if block to prevent infinte result
		}
		
		
		
		
		
	}

}
