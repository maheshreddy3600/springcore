package beans;

import java.util.List;

public class Employee1 {

	private int code;
	private String name;
	private List<String> skills;
	
	
	public void stop(){
		System.out.println("in stop method");
	}
	public void start(){
		System.out.println("in start method");
	}
	
	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<String> getSkills() {
		return skills;
	}



	public void setSkills(List<String> skills) {
		this.skills = skills;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
