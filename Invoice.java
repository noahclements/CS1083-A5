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
		double TOLERANCE = 1E-14;
		if((Math.abs(this.getAmount() - other.getAmount()) < TOLERANCE)) {
			return 0;
		} else if((this.getAmount() - other.getAmount()) < TOLERANCE) {
			return -1;
		} else {
			return 1;
		}
	} 
	
}