package comsyntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone nokia=new Phone();
		
		nokia. model="ab-121";
		nokia. color="Blue";
		nokia. series= 4;
		nokia. weight=0.45;
		
		
		nokia.printCompleteInfo();
		nokia.call();
		nokia.takePictures();
		
	}

}
