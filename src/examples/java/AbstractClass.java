package examples.java;

public class AbstractClass {

	public static void main(String[] args) {
		//Shape s = new Shape();    Complie Time Error as Abstract cannot be instantiated
		
		Shape r = new Rectangle();		
		r.draw();
		r.display();
		
		Circle c = new Circle();
		c.draw();
		c.display();

	}

}

//Syntax for Abstract class: abstract <class-name>{}
abstract class Shape{
	
	//Syntax for Abstract method: abstract <return-type> <method-name>();
	abstract void draw();
	
	void display() {
		System.out.println("Non Abstract method");
	}
	
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
	
	//abstract void error();
	
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
	
}

