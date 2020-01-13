package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="cust")
public class Customer {
@Value("1245")

private int code;
@Value("Pranavi")
private String name;
@Autowired
private Salary salary;
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
public void setSalary(Salary salary) {
this.salary = salary;
}
public Salary getSalary() {
return salary;
}

}