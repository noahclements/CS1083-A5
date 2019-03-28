public class Invoice implements Comparable<Invoice>{
	private String customerID;
	private String invoiceID;
	private double amount;

	public Invoice(String custIn, String invIn, double amtIn) {
		customerID = custIn;
		invoiceID = invIn;
		amount = amtIn;
	}

	public double getAmount() {
		return amount;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String invoiceID() {
		return invoiceID;
	}



	public int compareTo(Invoice other) {
		
	} 
	
}