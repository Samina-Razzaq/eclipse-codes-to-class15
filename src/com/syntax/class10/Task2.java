package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		
		String[] countries= {"USA","Canada","Pakistan"};
		String capital=null;
		
		switch(capital) {
		case"USA":
		capital="Washington DC";
			break;
		}
		
		
		for(String country:countries) {
			if(country.equals("USA")) {
				capital="Washington";
			}else if(country.equals("Canada")){
					 capital="Ottawa";
		}else if(country.equals("Pakistan")) {
			capital="Islamabad";
		}
		
		System.out.println("The capital of " +country+" is "+capital);
		
		
		}
		

	}

}
