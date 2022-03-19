package com.syntax.class13;

public class MethodDeo4 {
	
	
	double checkDiscount(boolean isSaleOn, double originalPrice, double discount) {
		if(isSaleOn) {
			return originalPrice-originalPrice*discount;
		}else {
			return originalPrice ;
		}
	}

	public static void main(String[] args) {
		
MethodDeo4 obj=new MethodDeo4();
System.out.println(obj.checkDiscount(false,  100, .15));
System.out.println(obj.checkDiscount(true,  100, .15));
	}

}

