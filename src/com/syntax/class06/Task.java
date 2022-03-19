package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
System.out.println("Enter your country name");

String country=input.next();

String language;

switch(country.toLowerCase()) {
case "usa":
     language ="English";
     break;
case"russia":
	language="russian";
	break;
case"germany":
	language="deutsch";
	break;
case "china":
	language="chineese";
	break;
default:
	language="unknown";
	break;}

System.out.println("People in "+country+" speaks "+language);


	}

}
