package com.syntax.class05;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter your height in inches");
		
		double height= input.nextDouble();
		
		if (height<60){System.out.println("Height is considered to be short");}
		
		else if ((height>60) || (height<72)) {System.out.println("Height is considered to be medium");}
		
		else if (height>72) {System.out.println("Height is considered to be tall");
			
		}
		
		
		
		
		
		
		

	}

}
