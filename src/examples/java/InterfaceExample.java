package examples.java;

public class InterfaceExample {

	public static void main(String[] args) {
		Bike b = new Honda();
		b.run();

	}

}

interface Bike{
	
	void run();
	
//	void display() {
//		System.out.println("Ërror");
//	}
	
}

interface Brakes{
	void brake();
}

class Honda implements Bike,Brakes{
	public void run() {
		System.out.println("Honda bike is running safely..");
	}
	
	public void brake() {
		System.out.println("Brakes are working..");
	}
	
}

class Hero implements Bike{
	public void run() {
		System.out.println("Hero bike is running safely..");
	}
}
