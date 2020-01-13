package beans;

public class Employee {

	private int EmpCode;
	private String EName;
	private int Salary;
	
	
	public Employee(int empCode, String eName, int salary) {
		super();
		EmpCode = empCode;
		EName = eName;
		Salary = salary;
	}


	public int getEmpCode() {
		return EmpCode;
	}


	public void setEmpCode(int empCode) {
		EmpCode = empCode;
	}


	public String getEName() {
		return EName;
	}


	public void setEName(String eName) {
		EName = eName;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	public Employee() {
		super();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
