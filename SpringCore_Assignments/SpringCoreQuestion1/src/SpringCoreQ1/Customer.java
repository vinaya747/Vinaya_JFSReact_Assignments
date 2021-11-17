package SpringCoreQ1;

public class Customer {
	private int customerId;
	private String customerName;
	private Long customerContact;
	private Address customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(Long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	
	public void display() {
		// TODO Auto-generated method stub
		{
			System.out.println("customer id"+customerId+"customer name"+customerName+"contact"+customerContact+"address"+customerAddress.getCity());
		}
	}

}
