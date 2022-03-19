package com.syntax.review.class03;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int price=10;
		boolean sale=true;
		char gender='F';
		double discount=0.15;
		double finalPrice=0;
		
		
		if(sale) {
			System.out.println();
			if(gender=='F') {
				if(price>5) {
					finalPrice=price-price*discount;
					System.out.println("line 1");
				}
			}
			
		}else {System.out.println("line 2");
			finalPrice=price;
		}
		
		if(sale && gender=='F' && price>5) {
			System.out.println("line 1");
		}else {
			System.out.println("line 2");
		}
		

	}

}
