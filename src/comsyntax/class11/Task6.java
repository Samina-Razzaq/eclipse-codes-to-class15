package comsyntax.class11;

public class Task6 {

	public static void main(String[] args) {
		
		//fibonacci series
		
		int number=10;
		int previous=0;
		int current=1;
		int next=0;
		System.out.print(previous+" ");
		System.out.print(current+" ");
		for(int i=0; i<number-2; i++) {
			next=previous+current;
			System.out.print(next+" ");
			previous=current;
			current=next;
			
		}

	}

}
