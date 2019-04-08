package examples.java;

public class ExceptionHandling {

	public static void main(String[] args) {
		int i, j, result;
		
		i = 50;
		j=10;
		result =0;
		String str= null;
		try {
//			result = str.length();
			result = i/j;
			
			
			//System.out.println(result);
		}
//		catch(NullPointerException e) {
//			System.out.println("Null point exception!!");
//		}
		catch(ArithmeticException e) {
			System.out.println(e.getStackTrace());
			result = i/(j+2);
			//System.out.println(result);
			System.out.println("An Arithemetic exception has occured.It has been handled in catch");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(result);
		}
		
		
		
		

	}

}
