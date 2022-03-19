package com.syntax.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String username="LILLY";
		String password="Lilly123";
		
		if("Lilly".equals(username)&& "Lilly123".equals(password)) {
			System.out.println("Welcome back");
		}else {
			System.out.println("Username or password is not correct");
		}

		
		
		if("Lilly".equalsIgnoreCase(username)&& "Lilly123".equals(password)) {
			System.out.println("Welcome back");
		}else {
			System.out.println("Username or password is not correct");
		}

		
		
		
		
		
		
		
	}

}
