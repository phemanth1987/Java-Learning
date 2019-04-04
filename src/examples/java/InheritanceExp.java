package examples.java;

class Calc {
	public int add(int i, int j) {
		return i+j;
	}	
}

//Inheritance Syntax
// class <child class-name> extends <parent class-name> {}
class CalcAdv extends Calc{

	public int subtract(int i, int j) {
		return i-j;
	}
}

class CalcVer2 extends CalcAdv{
	public int multiply(int i, int j) {
		return i*j;
	}
}
public class InheritanceExp {

	public static void main(String[] args) {
		CalcVer2 c = new CalcVer2();
		int sum = c.add(2, 3);
		System.out.println("Sum is : "+sum);
		int diff = c.subtract(6,  4);
		System.out.println("Difference is :"+ diff);
		int mul = c.multiply(5, 4);
		System.out.println("Multiplied value is :"+ mul);
		
		
	}

}
