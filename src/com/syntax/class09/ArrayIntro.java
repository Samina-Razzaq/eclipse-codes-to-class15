package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		
		int num=1;
		//create an array that holds 4 elements/values
		int[] numbers=new int[4];
		//storing values/elements inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		// print 99
		System.out.println(numbers[3]);	
		System.out.println(numbers[3]+numbers[0]);
		
		
		// I want to create an array of countries
		
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		System.out.println(countries[3]+countries[4]);
		
		
		String[] names=new String[5];// if we didn't add values then null value will be saved
		
		names[1]="Orsan";
		names[2]="Guldan";
		names[3]="Zakirullah";
		System.out.println(names[1]);//orsan
		System.out.println("Value in index 4 is="+names[4]);
		
		names[1]="Daniyar";
		System.out.println(names[1]);
		
		
		
		
		
		
		
		

	}

}
