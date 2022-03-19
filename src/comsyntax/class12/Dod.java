package comsyntax.class12;

public class Dod {
	//attributes, fields, properties
	String name;
	String color;
	String brred;
	char gender;
	int age;
	double weight;
	//behaviors, functions, methods
	void barks() {
		System.out.println("Dog is barking....");
	}
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}

	public static void main(String[] args) {
		//create an object scooby from class dod
		Dod scooby=new Dod();//Scanner input=new Scanner(System.in);
		//Dod is class
		//scooby is an object
		//new is keyword used to create the object of class
		//Dog() we are calling the constructor of the class
		scooby.barks();
		scooby.eat();
		scooby.sleep();

	}

}
