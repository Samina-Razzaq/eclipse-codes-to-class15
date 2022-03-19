package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean likeJava=true;
		boolean understandJava=true;
		
		//if we have to test two conditions we put logical and
		//logical operators when we have to check multiple situations in one if
		if(likeJava) {
			System.out.println("Awesome");
		}
		
		if(likeJava && understandJava) {System.out.println("This is the best combination");}
		//true true==>true
		//false true==>false
		//true false==>false
		//false false==>false
		
		
		//we want to campare 3 numbers
		//num1>num2 && num1>num3==num1 is largest
		//what if num2>num1 &&    num2>num3 ===> num22 is the largest
		//what if num3>num1 && num3>num2 ====>num3 is largest
		
		int num1=10;
		int num2=20;
        int num3=30;
		
		if (num1>num2&&num1>num3) {System.out.println(num1+" is the largest");}
		
		else if (num2>num1&&num2>num3) {System.out.println(num2+" is the largest");}
		
		else if (num3>num1 && num3>num2) {System.out.println(num3+" is the largest");}
		
		
		

	}

}
