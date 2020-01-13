package beans;

public class Student {

	private int regno;
	private String stdname;
	Address address;


	

	public Student() {
		super();
	}




	public int getRegno() {
		return regno;
	}




	public void setRegno(int regno) {
		this.regno = regno;
	}




	public String getStdname() {
		return stdname;
	}




	public void setStdname(String stdname) {
		this.stdname = stdname;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	public Student(int regno, String stdname, Address address) {
		super();
		this.regno = regno;
		this.stdname = stdname;
		this.address = address;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

