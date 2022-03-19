package com.syntax.class13;

public class Prime {
	
	void checkPrime(int number) {
		int count=0;
		for(int i=2; i<number; i++) {
			if (number%i==0) {
			count++;}
			}
			if(count>0) {
				System.out.println( number+ " is not Prime number");
			}else {
				System.out.println( number+" is a Prime number");
			}
		
	}
	
	public static void main(String[]args) {
	
	
	Prime object=new Prime();
	object.checkPrime(13);
}
}