package SpringCore8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

 public static void main(String[] args) {

  
  AbstractApplicationContext context = new ClassPathXmlApplicationContext(("em.xml"));



 Employee employee = (Employee)context.getBean("employee");

  System.out.println("The name of our Employee is : " + employee.getName());
  System.out.println("The age of our Employee is : " + employee.getAge());
  
 

  
  Example example = (Example) context.getBean("example");
 
 System.out.println("Output for the Example class"+example);
 
 
 
 context.registerShutdownHook();
 
 }

}