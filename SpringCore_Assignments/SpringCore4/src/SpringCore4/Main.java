package SpringCore4;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class Main {
 
   
    public static void main(String[] args) {
 
        ApplicationContext a = new ClassPathXmlApplicationContext("emp.xml");
 
        Employee emp = a.getBean("employee", Employee.class);
        System.out.println(emp.toString());
    }
}