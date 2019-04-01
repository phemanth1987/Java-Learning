package examples.java;

public class StringDemo {

	public static void main(String[] args) {
		
		boolean val;
		
		//String literal and using new keyword
		String str = "Hello";  //"4th Class" " " R&^(*&@"
		String str1 = new String("Hello\n World!\n");
		
		str = str.concat(" World!");
		
		
		
//		val = str.contains("Earth");
		
		
		val = str.endsWith("d!");
		//str = "Hello";
		//str1 = "Hello";
		System.out.println();
		
		//String methods
		System.out.println(str.length());
		
		System.out.println(str1.compareTo(str));
		
		System.out.println(str);
		
		System.out.println(val);
		
		System.out.println(str.indexOf('z', 6));
		System.out.println(str1);
		System.out.println(str1.replace("\n", ""));
		
		
		String str2 = "First Name:Hemanth";
		
		
		
		String[] arrStr2 = str2.split(":");
		
		
		for(String s : arrStr2)
			System.out.println(s);
		
		System.out.println(arrStr2[1].equals("Hemanth"));
		String str3 = "unhappy";
		System.out.println(str3);
		str3 = str3.substring(2,5);
		System.out.println();
		System.out.println(str3);
		
		
		
		
		
		
		


	}

}
