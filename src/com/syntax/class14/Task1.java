package com.syntax.class14;

import java.util.Scanner;

public class Task1 {
	String checkCredentials(String username, String password, String confirm) {
		
		
if(username.isEmpty()|| password.isEmpty()) {
	return "Username and password cannot be empty";
}else if(password.length()<8) {
	return "Password is too short";
}else if(password.contains(username)) {
	return "Password can not contain username";
}else if(!password.equals(confirm)) {
	return "Password do not match";
	
}return "Your username and password has been created";
	
	}
	



	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter username");
		String username=input.next();
		System.out.println("Enter password");
		String password=input.next();
		System.out.println("Confirm password");
		String confirm=input.next();
	
		Task1 object=new Task1();
		System.out.println(object.checkCredentials(username, password, confirm));
		
		
}
}