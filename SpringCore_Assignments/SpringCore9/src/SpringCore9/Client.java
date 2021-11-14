package SpringCore9;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {

	public static void main(String[] args)
		throws Exception
	{

		AbstractApplicationContext cap= new ClassPathXmlApplicationContext(	"abcd.xml");

		
		cap.registerShutdownHook();
	}
}