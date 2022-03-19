package com.syntax.class05;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
	
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your current time in 24 hour format");
		
		int hour=input.nextInt();
		
		if((hour>=1) && (hour<=11)) {
		
			System.out.println("Good Morning!");}
		
		if((hour>=12) && (hour<=15)) {
			
			System.out.println("Good Afternoon ");}
		
		if((hour>=16) && (hour<=20)) {
			
			System.out.println("Good Evening");}
		
		if((hour>=21) && (hour<=24)) {
			
			System.out.println("Good Night");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
