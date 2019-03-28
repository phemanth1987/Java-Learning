package examples.java;

public class PassingArraytoMethod {

	public static void main(String[] args) {
		int[] arrInt = { 10, 45, 23, 95, 32}; 
		int[] arr2 = {1323, 242, 2354};
		
		//Passing array to method
		findMax(arrInt);
		
		findMax(arr2);
		

	}
	
	public static void findMax(int[] arr) {
		int max = arr[0];
		
		for(int i =1; i< arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum value is: "+ max);
		
	}

}
