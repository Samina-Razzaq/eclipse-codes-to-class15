package com.syntax.class06;

public class SwitchStatement {

	public static void main(String[] args) {
		
	//switch is another conditional statement	
		//switch SYNTAX
		//switch (variable){case value1: codeA; break; case value2:codeB; break; default:codeC; break;}
		
		int day=3;
		// default value of non primitive data is null
		String dayName;
		
		    if(day==1) {dayName="Monday";}
		
			else if(day==2) {dayName="Tuesday";}
		
			else if (day==3) {dayName="Wednesday";}
		
			else if(day==4) {dayName="Thursday";}
		
			else {dayName ="Invalid";}
		
			System.out.println(dayName);
			
			System.out.println("------------------------------------------------------");
			
		
		switch (day) {
	
		case 1:
			dayName="Monday";
		    break;
		case 2:
			dayName="Tuesday";
		    break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
		    break;
		default:
			dayName="Invalid";
			}
		
		System.out.println(dayName);
		
		
		
		
		
		
		

	}

}
