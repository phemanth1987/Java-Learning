package examples.java;

public class SwitchExample {

	public static void main(String[] args) {
		String color = "Blue";
		
		switch (color) {
		case "Blue":
			System.out.println("Color is Blue");			
			break;
		case "Red":
			System.out.println("Color is Red");			
			break;
		case "Green":
			System.out.println("Color is Green");			
			break;

		default:
			System.out.println("Color not known");
			break;
		}

	}

}
