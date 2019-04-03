package examples.java;


public class MethodOverlaoding {

	public static void main(String[] args) {
		Adder obj = new Adder();
		int sum = obj.add(2, 3);
		System.out.println("Sum with two integer arguments is:"+sum);
		sum = obj.add(2, 3, 5);
		System.out.println("Sum with three integer arguments is:"+sum);
		double sum1 = obj.add(12.5, 2.5);
		System.out.println("Sum with two double arguments is:"+sum1); 
	}

}

class Adder{  
	public int add(int i, int j) {
		return i+j;
	}
	
	//Method Overloading using different parameters
	public int add(int i, int j, int k) {
		return i+j+k;
	}
	
	public double add(double i, double j) {
		return i+j;
	}  
}  
