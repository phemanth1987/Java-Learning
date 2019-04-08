package examples.java;

public class PrivateModifierExp {

	public static void main(String[] args) {
		NoAccess obj = new NoAccess();
		obj.access();

	}

}

class NoAccess{
	//Private variable
	private int data =40;
	
	//Private method
	private void print() { 
		System.out.println("Inside Private method");
	}
	
	void access() {
		System.out.println(data);
		print();
	}
}
