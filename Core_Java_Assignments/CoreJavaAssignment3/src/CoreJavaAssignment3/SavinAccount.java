package CoreJavaAssignment3;


public class SavinAccount {
    long id=7685043;
    static double balance=20000;
    public static void withdraw(double amount)
    {
    	if(balance<amount)
    	{
    		throw new InsufficientBalanceException("cannot withdraw");
    	}
    	else if(balance==0)
    	{
    		throw new InsufficientBalanceException("Insufficient balance");
    	}
    	else if(amount<0)
    	{
    		throw new IllegalBankTransactionException("cannot withraw");
    		
    	}
    	else
    	{
    		System.out.println("withrawn successfully");
    	}
    	
    }
	public static void main(String[] args) {
		
        withdraw(1000.0);
        withdraw(600000);
	}

}
