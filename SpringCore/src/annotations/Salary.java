package annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Salary {
@Value("1234")
private int base;
@Value("45")
private int hra;
public int getBase() {
return base;
}
public void setBase(int base) {
this.base = base;
}
public int getHra() {
return hra;
}
public void setHra(int hra) {
this.hra = hra;
}

}