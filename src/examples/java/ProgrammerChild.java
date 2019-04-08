package examples.java;

public class ProgrammerChild extends EmployeeParent {
	
	String[] progLanguages;
	
	public ProgrammerChild(int i, String n, String p, String[] l) {
		super(i,n,p);
		progLanguages = l;		
		
	}

	public static void main(String[] args) {
		String[] langs = {"Java", "C#"};
		ProgrammerChild obj = new ProgrammerChild(1, "Mike", "Phone1", langs);
		System.out.println(obj.id+ " "+ obj.name+" "+ obj.phno+" "+obj.progLanguages.toString());
		
		
		Employee emp = new Employee();
		emp.work();
		
	

	}

}

