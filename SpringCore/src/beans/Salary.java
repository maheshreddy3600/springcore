package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
     @Value("5000")
	private int basic;
     @Value("3000")
	private int hra;
	
	
	public int getBasic() {
		return basic;
	}


	public void setBasic(int basic) {
		this.basic = basic;
	}


	public int getHra() {
		return hra;
	}


	public void setHra(int hra) {
		this.hra = hra;
	}


	}


