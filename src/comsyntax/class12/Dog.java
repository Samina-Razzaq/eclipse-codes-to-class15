package comsyntax.class12;

public class Dog {

	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;

	void printCompleteInfo() {

		System.out.println("name="+name);
		System.out.println("breed="+breed);
		System.out.println("age="+age);
		System.out.println("weight="+weight);
	}
	
	
	public static void main(String[] args) {

		
		Dog object1=new Dog();
		object1.name="Husky";
		object1.breed="no idea";
		object1.age=3;
		object1.weight=100;
		
		
		Dog object2=new Dog();
		object2.name="Bulldog";
		object2.breed="no idea";
		object2.age=4;
		object2.weight=107;
		
		Dog object3=new Dog();
		object3.name="Labrador";
		object3.breed="no idea";
		object3.age=5;
		object3.weight=150;
		
		
		object1.printCompleteInfo();
		System.out.println("         ");
		object2.printCompleteInfo();
		System.out.println("          ");
		object3.printCompleteInfo();
	}
		

	}


