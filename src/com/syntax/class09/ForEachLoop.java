package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		
		int[] numbers= {10, 20, 30, 40};
		for(int num:numbers) {
			System.out.println(num);
		}
		
		
		System.out.println("-------");
		
		
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		
		for(char grade:grades) {System.out.print(grade+" ");
			
		}
		System.out.println("--------------------");
		
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		for(String country:countries) {
			System.out.print(country+" ");
		}
		
		
		
		
		
		
	}

}
