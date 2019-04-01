package examples.java;

public class SwitchExample {

	public static void main(String[] args) {
		String color = "BlUe";
		
		switch (color.toLowerCase()) {
		case "blue":
			System.out.println("Color is Blue");			
			break;
		case "red":
			System.out.println("Color is Red");			
			break;
		case "green":
			System.out.println("Color is Green");			
			break;

		default:
			System.out.println("Color not known");
			break;
		}

	}

}
