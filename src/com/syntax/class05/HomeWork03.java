package com.syntax.class05;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter any number");
		
		int num=input.nextInt();
		
		if((num>=1)  && (num<=10) ) {
			
		System.out.println("It is a small number");	}
		
		else if((num>=11) &&(num<=100)) {
			
		System.out.println("It is a medium number");}
		
		else if ((num>=101) && (num<=1000)) {
			
		System.out.println("It is a large number");}
		
		
		
		
		
		
		
		
		

	}

}
