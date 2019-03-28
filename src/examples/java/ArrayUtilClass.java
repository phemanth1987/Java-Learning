package examples.java;

import java.util.Arrays;

public class ArrayUtilClass {

	public static void main(String[] args) {
		int[] arr = { 2,6,8,4,1,3,5};
		System.out.println("Before Sort:");
		printArray(arr);
		
		Arrays.sort(arr);
		
		System.out.println("After Sort:");
		printArray(arr);
		
		int[] arr2 = new int[10];
		printArray(arr2);
		Arrays.fill(arr2, 20);
		printArray(arr2);
		
		Arrays.fill(arr2, 2, 5, 30);
		printArray(arr2);

	}
	
	//Method to print any array
		public static void printArray(int[] arr) {
			for(int str : arr) {
				System.out.print(str + " ");
			}
			System.out.println();
		}

}
