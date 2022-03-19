package comsyntax.class12;

public class Greeting {
	
	void sayHello(String name) {
		System.out.println("Hello"+ name);
		
	}
	void sayHelloManyTimes(String name1) {
		for(int i=0; i<5; i++) {
			System.out.println("Hello" + name1);
		}
		
	}

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Greeting greeter=new Greeting();
		greeter.sayHello("Tarik");

		
		Greeting greeter1=new Greeting();
		greeter1.sayHelloManyTimes("Samina");
		}
		
	}


