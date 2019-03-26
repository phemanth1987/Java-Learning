package examples.java;

public class Employee {
	
	/**
	 * JAVA Documentation
	 * Description:
	 * Author:
	 * Created Date:
	 * Modified Date:
	 */
	
	/*
	 * Multiple
	 * Line
	 * Comments
	 * 
	 */

	//Fields (Variables)  
	//Syntax: <access-modifier> <data-type> <variable-name> = value;
	int age;
	String name;
		
	
	//Methods
	/*
	 * <access-modifier> <return-type> <method-name>([parameters list]){
	 * 		statement1;
	 * 		statement2;
	 * 		[return statement];
	 * }
	 */
	
	public void greet() {
		System.out.println("Good Morning!! I am " + name);
	}
			
	public static void main(String[] args) {
		//Object Syntax 
		// <class-name> <object-name> = new <class-name>();
		Employee mike = new Employee();
		
		//Printing dummy default values
		System.out.println(mike.age + " " + mike.name);
		//Calling greet() method before value assignment
		mike.greet();
		
		//Assigning values to variables 
		mike.age = 35;
		mike.name = "Mike";
		
		//Printing assigned values
		System.out.println(mike.age + " " + mike.name);
		//Calling greet() method after value assignment
		mike.greet();
		
		//Creating second object
		Employee john = new Employee();
		
		//Assigning values to variables 
		john.age = 30;
		john.name = "John";
		//Printing assigned values
		System.out.println(john.age + " " + john.name);
		//Calling greet() method after value assignment
		john.greet();

	}

}
