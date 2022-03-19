package com.syntax.class13;

public class MethodDemo2 {
	
	void TefurAndHorse(String name, String animalName){
		if("Tefur".equalsIgnoreCase(name) && "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is camel");}
			else {
				System.out.println("This is horse");
			}
		}
		
	

	public static void main(String[] args) {
		
MethodDemo2 obj=new MethodDemo2();
obj.TefurAndHorse("Tefur", "Horse");
obj.TefurAndHorse("Tarik", "Horse");
	}

}
