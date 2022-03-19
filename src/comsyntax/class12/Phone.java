package comsyntax.class12;

public class Phone {

	String model;
	String color;
	int series;
	double weight;

	void printCompleteInfo() {

		System.out.println("model="+model);
		System.out.println("color="+color);
		System.out.println("series="+series);
		System.out.println("weight="+weight);}
	void call() {
		System.out.println("making a call");
	}
	void takePictures() {
		System.out.println("Taking pictures");
	}

	public static void main(String[] args) {
		
		Phone iPhone=new Phone();
		
	iPhone. model="X";
	iPhone. color="White";
	iPhone. series= 3;
	iPhone. weight=1.45;
	
	Phone pixel =new Phone();
	
	pixel. model="cd-1231";
	pixel. color="Black";
	pixel. series= 8;
	pixel. weight=0.45;
	
	Phone nokia=new Phone();
	
	nokia. model="ab-121";
	nokia. color="Blue";
	nokia. series= 4;
	nokia. weight=0.45;
	
	
	iPhone.printCompleteInfo();
	iPhone.call();
	iPhone.takePictures();
	
	
	

	}

}
