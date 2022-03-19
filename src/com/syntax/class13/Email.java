package com.syntax.class13;

public class Email {
	String createEmail(String name, String lastName, String messenger) {
		return name+lastName+"@"+ messenger+"com";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Email object=new Email();
System.out.println(object.createEmail("john", "smith", "gmail"));
	}

}
