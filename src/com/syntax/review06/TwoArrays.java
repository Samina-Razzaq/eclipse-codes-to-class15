package com.syntax.review06;

public class TwoArrays {

	public static void main(String[] args) {
		
		int [][] array=new int[2][3];
		//row 1
		array[0][0]=10;
		array[0][1]=20;
		array[0][2]=30;
		
		//2 row
		array[1][0]=1;
		array[1][1]=2;
		array[1][2]=3;
		
		//array.length gives no of rows
System.out.println(array.length);// size 2 --> 2 1Darrays

int [][] numbers= {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};


System.out.println(numbers.length);
for(int r=0; r<numbers.length; r++) {
	for(int c=0; c<numbers.length; c++) {
		System.out.print(numbers[r][c]+" ");
	}
	System.out.println();
}

	}

}
