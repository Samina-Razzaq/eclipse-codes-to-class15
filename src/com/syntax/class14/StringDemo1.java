package com.syntax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String str=new String("samina");
		String name="samina";//preffered
		System.out.println(str);
System.out.println(name);

System.out.println(name.length());

System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());

System.out.println(name+str);//preffeerd
System.out.println(name.concat(str));


System.out.println(name.isEmpty());

	}

}
