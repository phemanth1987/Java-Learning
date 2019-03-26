package examples.java;

public class WhileExample {
	
//	public static String getColor() {
//		String clr = null;
//		//click on icon;
//		//clr= get backgorund color;
//		
//		return clr;
//	}

	public static void main(String[] args) {
//		String color = getColor();
//		
//		while(!(color.equals("Red"))) {
//			color = getColor();
		
//		}
		int i=1;
		
		while(i<10) {
			System.out.println("Value of i is: " + i);
			if(i==4) {
	        	break;
	        }
			i++;
		}
		System.out.println("Out of while loop");


	}

}
