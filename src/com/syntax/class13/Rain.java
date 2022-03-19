package com.syntax.class13;

public class Rain {
	void checkRain(boolean isRain) {
		if(isRain) {
			System.out.println("You should take umbrella");
		}else {
			System.out.println("You can go for a walk");
		}
	}

	public static void main(String[] args) {
		
		Rain object=new Rain();
		object.checkRain(false);

	}

}
