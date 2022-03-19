package com.syntax.class13;

public class Hello {
	
	void greeting(String language) {
		if("Urdu".equalsIgnoreCase(language)) {
			System.out.println("Assalam o Alaikum in " +language);
		}else if("Spanish".equalsIgnoreCase(language)) {
			System.out.println("Hola in "+ language);
		}else if("French".equalsIgnoreCase(language)) {
			System.out.println("Borjoun in "+ language);
		}else if("English".equalsIgnoreCase(language)) {
			System.out.println("Hello in "+language);}
	}

	public static void main(String[] args) {
		
Hello object=new Hello();
object.greeting("urdu");
object.greeting("spanish");
object.greeting("french");
object.greeting("english");


	}

}
