package examples.java;

public class IfElseIfExample {
	int marks;

	public static void main(String[] args) {
		IfElseIfExample obj = new IfElseIfExample();
		obj.marks = 40;
		
		if(obj.marks<35) {
			System.out.println("Fail!!");
		}
		else if(obj.marks>=35 && obj.marks <60) {
			System.out.println("Second Class");
		}
		else if(obj.marks>=60 && obj.marks <75) {
			
			System.out.println("First Class");
		}
		else if(obj.marks>=75) {
			System.out.println("Distinction");
		}
		else {
			System.out.println("Invalid");
		}
		
		int age = 18;
		int weight = 50;
		
		if(age>= 18 ) {
			//Statement1
			//Stmnt2
			if(weight < 50) {
				System.out.println("Under weight");
			}
			else if(weight >=50 && weight <60) {
				System.out.println("Correct weight");
			}
			else {
				System.out.println("Over weight");
				
			}
		}
		

	}

}
