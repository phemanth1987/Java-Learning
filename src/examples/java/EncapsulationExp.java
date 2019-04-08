package examples.java;

public class EncapsulationExp {
	
	private String Fname;
	private String LName;
	private int Phno;
	private String email;
	private int age;
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		if(fname.length()>=4)
			Fname = fname;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public int getPhno() {
		return Phno;
	}
	public void setPhno(int phno) {
		Phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
