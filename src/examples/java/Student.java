package examples.java;

public class Student {
	
	/**
	 * JAVA Documentation
	 * Description: Program to assign(pass) values using method
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
	int rollNo;
	String name;
		
	
	//Methods
	/*
	 * <access-modifier> <return-type> <method-name>([parameters list]){
	 * 		statement1;
	 * 		statement2;
	 * 		[return statement];
	 * }
	 */
	
	public void insertRecord(int r, String n) {
		rollNo = r;
		name = n;		
	}
	
	public void displayRecord() {
		System.out.println("Roll number is: " + rollNo);
		System.out.println("Student name is: " + name);
	}
			
	public static void main(String[] args) {
		//Object Syntax 
		// <class-name> <object-name> = new <class-name>();
		Student s1 = new Student();
		System.out.println(s1.rollNo + " " + s1.name);
		
		//Initializing(assigning) values by method
		s1.insertRecord(1 ,"Ram");
		
		s1.displayRecord();
		System.out.println(s1.rollNo + " " + s1.name);
		
		//Another object s2
		Student s2 = new Student();
		System.out.println(s2.rollNo + " " + s2.name);
		
		//Initializing(assigning) values by method
		s2.insertRecord(2 ,"Sita");
		
		s2.displayRecord();
		System.out.println(s2.rollNo + " " + s2.name);
		
		//Updating s1 vales with new data
		s1.insertRecord(3, "Laxman");
		s1.displayRecord();
		
		System.out.println(s1.rollNo + " " + s1.name);
		
		
		

	}

}
