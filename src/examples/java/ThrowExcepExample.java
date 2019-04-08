package examples.java;

public class ThrowExcepExample {

	static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]){  
		   try {
			   validate(13);   
		   }catch(ArithmeticException e) {
			   System.out.println("Exception handled");
		   }
	        
	      System.out.println("rest of the code...");  
	  }  

}
