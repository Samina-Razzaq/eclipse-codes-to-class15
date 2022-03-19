package com.syntax.review06;

public class PatternNum {

	public static void main(String[] args) {
		
		
		
		for(int a=1; a<=4; a++) {
			for(int b=1; b<=5; b++) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
System.out.println("               ");

		for(int a=5; a>=1; a--) {
			for(int b=1; b<=5; b++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		System.out.println("            ");
		
		
		for(int r=1; r<=4; r++) {
			for(int c=1; c<=5; c++) {
				if(r==1||r==4 || c==1||c==5) {
				
				System.out.print("*");
				
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		
		
		}
		
		
		
	}

}
