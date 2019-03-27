package examples.java;

public class ArrayExample {
	public static void main(String[] args) {
		
		//Syntax of Array
		//<data-type>[] <array-name> = new <data-type>[size];
		
				
		//Single Dimensional
		int[] arrInt; // Declaration
		arrInt = new int[5]; //Instantiation. Size is mandatory
		
		//Initialization 
		arrInt[0] = 1;
		arrInt[1] = 2;
		arrInt[2] = 3;
		//arrInt[3] = 4;
		//arrInt[4] = 5;
		
		//Length method to get size of array
		System.out.println("Size of array is: "+arrInt.length);
		
		//Traversing array (Read elements)
		int i;
		for(i=0; i < arrInt.length; i++) {
			System.out.print(arrInt[i] + " ");
		}
		
		//System.out.println(arrInt[6]);
		System.out.println();
		
		
		//Another way of Declaring and Initializing
		//Syntax <data-type>[] <array-name> = { ele1, ele2, ... };
		int[] arr2 = {10,20,30,40,50};
		
		//For Each
		//Syntax for(<data-type> <variable> : <array-variable>){}		
		for(int ele : arr2) {
			System.out.print(ele + " ");
			
		}
		
		//int ele = arr2[0];
		
		
		
		
		
		
		

		
		
	}
}

