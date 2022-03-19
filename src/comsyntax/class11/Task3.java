package comsyntax.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create 2d array and store even and odd
		
		int[][] array2D= {{2, 3, 4,}, {5, 6}, {12, 6, 8}};
		
		
		
		for(int i=0; i<array2D.length; i++) {
			for(int j=0; j<array2D[i].length; j++) {
				int element=array2D[i][j];
				if(element%2==0) {
					System.out.println(element);
				}
			}
		}
		
		
	}

}
