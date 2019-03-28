public class Invoice implements Comparable<Invoice>{
	private int customerID;
	private int invoiceID;
	private double amount;

	public Invoice(int custIn, int invIn, double amtIn) {
		customerID = custIn;
		invoiceID = invIn;
		amount = amtIn;
	}

	public int compareTo(Invoice other) {
		
	} 
	
}