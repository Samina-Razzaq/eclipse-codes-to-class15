package comsyntax.class11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class task1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("print size of array");
		
		int size=scanner.nextInt();
		System.out.println("size of array"+size);
		
		
int[] array=new int[size];
System.out.println("please enter the "+size+" elements");
for(int i=0; i<size; i++) {
	System.out.println("enter the elements for index "+i);
	array[i]=scanner.nextInt();
	System.out.println(Arrays.toString(array));
	
	int sum=0;
	for(int x=0; x<size; x++) {
		sum=sum+array[x];
	}System.out.println("sum of Array elements is "+sum);
}
	}

}
