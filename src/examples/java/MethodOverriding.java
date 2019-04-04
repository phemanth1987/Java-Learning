package examples.java;

public class MethodOverriding {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Parent class Bank ROI is: "+b.getRateOfInterest());
		
		SBI s = new SBI();
		System.out.println("Child class SBI ROI is: "+s.getRateOfInterest());
		
		HDFC h = new HDFC();
		System.out.println("Child class HDFC ROI is: "+h.getRateOfInterest());
		
		
		//Upcasting
		Bank obj = new SBI();
		System.out.println("Upcasting ROI is: "+obj.getRateOfInterest());
		

	}

}

class Bank{
	public int getRateOfInterest() {
		return 0;
	}
	
}

class SBI extends Bank{
	public int getRateOfInterest() {
		return 8;
	}
}

class HDFC extends Bank{
	public int getRateOfInterest() {
		return 9;
	}
}
