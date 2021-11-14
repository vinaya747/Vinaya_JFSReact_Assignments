package SpringCore3;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	 
	public class MainClass {
		private static ApplicationContext context;
		public static void main(String[] args) {
			 
			context = new ClassPathXmlApplicationContext("bank.xml");
			BankAccount account = (BankAccount)context.getBean("Account");
			System.out.println(account.accountBalance);
			BankAccountController a = (BankAccountController)context.getBean("controller");
			System.out.println(a.getBalance(10));
		}

	}


