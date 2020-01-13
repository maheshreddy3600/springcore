package beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication2 {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/SpringWiring.xml");
		Student s = (Student) ctx.getBean("std");
//     	s.setRegno(123);
//		s.setStdname("deloitte");
     	System.out.println(s.getRegno()+" "+s.getStdname()+" "+s.getAddress().getStreet());
	}

}
