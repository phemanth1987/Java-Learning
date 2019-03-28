package examples.java;

public class MutliDimensionalArray {

	public static void main(String[] args) {
		//Multi-Dimensional Array Syntax
		//<data-type>[][] <array-name> = new <data-type>[size][size]
		
		int[][] arrIntMul = new int[3][3];
		arrIntMul[0][0] = 1;
		arrIntMul[0][1] = 2;
		arrIntMul[0][2] = 3;
		arrIntMul[1][0] = 4;
		arrIntMul[1][1] = 5;
		arrIntMul[1][2] = 6;
		arrIntMul[2][0] = 7;
		arrIntMul[2][1] = 8;
		arrIntMul[2][2] = 9;
		
		//Traversing a multidimensional array
		for(int i=0; i<arrIntMul.length; i++) {
			for(int j=0; j<arrIntMul[i].length; j++) {
				System.out.print(arrIntMul[i][j] + " ");
			}
			System.out.println();
			
		}
		
		//Another way of Declaring and Initializing  a multidimensional array
		//Syntax <data-type>[][] <array-name> = { {ele1,ele2, ..}, {ele1,ele2,..}, ... };
		int[][] arr2 = { 
				{10, 20, 30},
				{40, 50, 60}
			};
		
		//Traversing using for each
		for(int[] arrEle : arr2) {
			for(int ele : arrEle) {
				System.out.print(ele);
			}
			System.out.println();
		}

	}

}
