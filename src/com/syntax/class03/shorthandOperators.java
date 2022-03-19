package com.syntax.class03;

public class shorthandOperators {

	public static void main(String[] args) {
		
		//+,-,*,/,%
		int num=100;
		num=num+100;
		System.out.println(num);
		num+=100;//exact means num=num+100 shorter way
		num-=20;
		System.out.println(num);//280
		num/=10;
		System.out.println(num);//28
		
		num%=2;
		System.out.println(num);// short hand assignment operator

	}

}
