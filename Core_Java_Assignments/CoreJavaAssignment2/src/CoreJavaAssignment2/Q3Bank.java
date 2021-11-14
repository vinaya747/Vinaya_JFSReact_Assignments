package CoreJavaAssignment2;
public class Q3Bank {
	private String name = "Bank"; 
	int totalAmount;
	
	public void addToTotalBankCash(Q3Bank obj) {
		totalAmount += obj.totalAmount;
	}
	
	public void showTotal() {
		System.out.println("The total cash in " + name + " is " + totalAmount);
	}
	
	public void addAmt(int amt) {
		totalAmount +=  amt ;
	}
}

