package examples.java;

public class ReturnArrayfromMethod {

	public static void main(String[] args) {
		//String array
		String[] arr1 = {"Preethi", "Bhavani", "Mounika" };
		
		printArray(arr1);
		
		String[] arr2 = new String[3];
		System.out.println("Copied array values before calling copy method");
		printArray(arr2);
		
		
		arr2= copyArray(arr1);
		System.out.println("Copied array values before calling copy method");
		printArray(arr2);
		
		

	}
	
	//Method to copy array
	public static String[] copyArray(String[] arr) {
		String[] tempArr = new String[arr.length];
		
		//Logic to copy one array to another
		for(int i=0; i <arr.length; i++) {
			tempArr[i] = arr[i];
		}
		
		return tempArr;
			
	}
	
	
	//Method to print any array
	public static void printArray(String[] arr) {
		for(String str : arr) {
			System.out.println(str);
		}
	}

}
