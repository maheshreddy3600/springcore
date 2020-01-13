package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/Employee1.xml");
		Employee1 emp1 = (Employee1) ctx.getBean("emp");
		Employee1 emp2 = (Employee1) ctx.getBean("emp");
		
		emp1.setCode(123);
		emp1.setName("Mahesh");
		emp2.setCode(111);
		
		System.out.println(emp1.getCode()+" "+emp1.getName()+" "+emp1.getSkills());
		System.out.println(emp2.getCode()+" "+emp2.getName()+" "+emp2.getSkills());
	}

}
