package com.syntax.class09;

public class HomeWork01 {

	public static void main(String[] args) {
		
		
		//Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.
		
		
		String[] cars= {"Toyota", "BMW", "Audi", "Bentley", "Acura", "Ferrari"};
		
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
		System.out.println("                          ");
		System.out.println("                          ");
		
		
			for(String car:cars) {
			
			System.out.print(car+" ");
		}
		
		
		
		
		
		

	}

}
