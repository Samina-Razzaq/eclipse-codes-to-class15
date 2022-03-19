package com.syntax.class13;

public class Student {
	char getGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80 && score <=90) {
			return 'B';
		} else if (score >= 70 && score < 80) {
			return 'B';
		} else if (score >= 50 && score < 70) {
			return 'B';
		} else {
			return 'F';
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student task=new Student();
System.out.println(task.getGrade(75));
	}

}
