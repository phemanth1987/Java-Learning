/**
 * 
 */
package examples.java;

/**
 * @author rel
 *
 */
public class IfExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Simple If Example
		/* Syntax:
		 * if(condition){  
		 *		//code if condition is true  
		 *	}
		 */
		int age =20;
		
		//As the condition true statement inside If will be executed
		if(age>18) {
			System.out.println("Age is greater than 18!");
		}
		
		age = 16;
		
		//As the condition false statement inside If will NOT be executed
		if(age>18) {
			System.out.println("Age is greater than 18!");
		}
		
		//If Else Example
		/* Syntax:
		 * if(condition){  
		 *		//code if condition is true  
		 *	}else{  
		 *		//code if condition is false  
		 *	}  
		 */
		
		//defining a variable  
	    int number=13;  
	    //Check if the number is divisible by 2 or not  
	    if(number%2==0){  
	        System.out.println(number + " is even number");  
	    }
	    else{  
	        System.out.println(number + " is odd number");  
	    }  
	   
	    number = 10;
	   //Check if the number is divisible by 2 or not  
	    if(number%2==0){  
	        System.out.println(number + " is even number");  
	    }
	    else{  
	        System.out.println(number + " is odd number");  
	    }  

	}

}
