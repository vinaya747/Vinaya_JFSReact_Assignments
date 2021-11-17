package SpringCoreQ1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("customer1.xml");
		Customer c1 = (Customer)context.getBean("cust");
		c1.display();

	}

}
