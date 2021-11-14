package CoreJavaAssignment2;

public class Q3CurrentAccount extends Q3Bank {
		private String name = "Current Account";

		public void showTotal() {
			System.out.println("The Cash Credits of " + name + " is " + totalAmount);
		}
}
