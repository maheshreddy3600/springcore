package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/SpringEmp.xml");
		Employee s = (Employee) ctx.getBean("std");
		s.setEmpCode(123);
		s.setEName("Mahesh");
		s.setSalary(500000);
		System.out.println(s.getEmpCode()+" "+s.getEName()+" "+s.getSalary());
	}

}
