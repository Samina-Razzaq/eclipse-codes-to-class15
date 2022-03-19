package com.syntax.class03;

public class primitiveCasting {
	
	public static void main(String[]args) {
		
		//main+ctrl+space
		//ctr+space autocomplete
		//Casting is process of converting value from one type to another
	
		//automatic/widening/implicit
		//smallest to big 
		//byte to short to int to long to float to double
		
		//manually/narrowing/explicit
		//big to small
		//double to float to long to int to short to byte
		//int i=10.99 errorr convert from double to int
		//can cast primitive or non primitive
		
int i=10;

double d=10;// widenning/or implicit store int into double

System.out.println(i);//10

System.out.println(d);//10.0

//int num=10.0;// type mismatched: cant convert from double to int
int num=(int)10.99;//narrowing or expicit manually // store double into int
System.out.println(num);
		
	float f=10.99f;// mismatch}
	byte b=(byte)1000;
	System.out.println(b);// gives error 
	
	long number=687687687687l;
	
	//operators
	//assignments
	//arithmatical
	
	
	
	}
	
	
	
}
