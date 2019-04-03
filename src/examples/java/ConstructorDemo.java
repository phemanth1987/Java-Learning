package examples.java;

public class ConstructorDemo {
	
	//Fields
	int num;
	String str;
	
	//Syntax of Default Constructor
	// public <class-name>() {}	
	public ConstructorDemo() {
		System.out.println("Inside default Constructor");
	}
	
	//Syntax of Parameterized Constructor
	// public <class-name>([parameters]) {}
	public ConstructorDemo(int i, String s) {
		num = i;
		str = s;
		//System.out.println(num + " " +str);
	}
	

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj2 = new ConstructorDemo(1, "Hello");
		System.out.println(obj.num +" " + obj.str);
		System.out.println(obj2.num +" " + obj2.str);

	}

}
