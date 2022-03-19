package comsyntax.class11;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//second largest
		int[] array= {10, 20, 90, 50, 70};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(array[array.length-1]);
		System.out.println(array[array.length-2]);
		
		
		
	}	
	

}
