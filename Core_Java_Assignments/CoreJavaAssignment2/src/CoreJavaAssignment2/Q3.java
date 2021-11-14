package CoreJavaAssignment2;




public class Q3{

	public static void main(String[] args) {
		Q3Bank newBank = new Q3Bank();
		newBank.showTotal();
		
		Q3Bank savingAc = new Q3SavingAccount();
		
		Q3Bank current = new Q3CurrentAccount();
		
		savingAc.addAmt(1000);
		current.addAmt(20000);
		
		newBank.addToTotalBankCash(current);
		newBank.addToTotalBankCash(savingAc);
		
		current.showTotal();
		savingAc.showTotal();
		
		newBank.showTotal();	
	}

	}
