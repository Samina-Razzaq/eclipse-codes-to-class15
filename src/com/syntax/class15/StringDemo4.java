package com.syntax.class15;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String name="111-222-1234";
		System.out.println(name.substring(3));
		System.out.println(name.substring(8));
		//System.out.println(name.substring(15));// gives error because no such number present
		System.out.println(name.substring(4,7));
	}

}
