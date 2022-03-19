package comsyntax.class12;

public class Horse {
	String name;
	String breed;
	int age;
	double weight;
	void run() {
		System.out.println(name + " is running");
	}
void eat() {
	System.out.println(name +" is eating");
}
void printCompleteInfo() {

	System.out.println("name="+name);
	System.out.println("breed="+breed);
	System.out.println("age="+age);
	System.out.println("weight="+weight);
}

	public static void main(String[] args) {
		
		
		Horse besh=new Horse();
		//accessing the property name on object besh and setting its value
		besh.name="spirit";
		besh.breed="stallion";
		besh.age=20;
		besh.weight=400;
		besh.run();
		
		System.out.println("               ");
	
		besh.printCompleteInfo();
		Horse mrAhorse=new Horse();
		mrAhorse.name="Tuzik";
		mrAhorse.breed="Mustang";
		mrAhorse.age=15;
		mrAhorse.weight=350;
		
		System.out.println("           ");
		mrAhorse.run();
		mrAhorse.eat();
		mrAhorse.printCompleteInfo();
	}

}
