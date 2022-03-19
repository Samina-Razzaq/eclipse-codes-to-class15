package com.syntax.class15;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String name="How @you @guys @";
		System.out.println(name.indexOf("@"));
		System.out.println(name.indexOf("%"));
		System.out.println(name.indexOf("@",4+1));
		System.out.println(name.indexOf("@", name.indexOf("@")+1));
		
		
		
		
	//	System.out.println(name.lastIndexOf("Are"));
	//	System.out.println(name.indexOf("@"));
		//System.out.println(name.indexOf(name, 0));
	}

}
