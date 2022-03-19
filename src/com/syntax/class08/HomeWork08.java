package com.syntax.class08;

public class HomeWork08 {

	public static void main(String[] args) {
		// 12 hours time clock
		for(int Hour=0; Hour<=12; Hour++) {
			for(int min=0; min<=59; min++) {
				for(int sec=0; sec<=59; sec++) {
					System.out.println(Hour+":"+min+":"+sec);
				}
			}	
			
		}

	}

}
