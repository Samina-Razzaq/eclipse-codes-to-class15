package com.syntax.class14;

public class Practice {
	
	
	String carColor;

int carYear;

String carMake;
  
  void carDetails(  ){
  System.out.println("Car color is "+carColor+" and year is "+carYear+" and model is "+carMake);}


	public static void main(String[] args) {

Practice object1=new Practice();
  Practice object2=new Practice();
  
object1.carColor="Black";
  object1.carYear=2019;
 object1. carMake="BMW";

  
object1.carColor="White";
  object1.carYear=2018;
 object1. carMake="Toyota";

object1.carDetails();
  object2.carDetails();





	}

}
