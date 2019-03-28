import java.util.Scanner;
import java.io.*;
import java.util.Locale;
public class Ass5Driver {
	public static void main(String[] args) throws FileNotFoundException{
		File invoiceData = new File(args[0]);
		Scanner sc = new Scanner(invoiceData);


		int numOfCustomers = sc.nextInt();
		System.out.println(numOfCustomers);
		/*
		for(int i = 0; i < numOfCustomers; i++) { // customer IDs
			String j = sc.next();
			System.out.println(j);
		}
		*/
		sc.nextLine();
		sc.nextLine();
		System.out.println("Start of loop");
		while(sc.hasNext()) {	// list
			String lineInfo = sc.nextLine();
			Scanner scNew = new Scanner(lineInfo);
			scNew.useDelimiter(",|\n");

			String customerID = scNew.next();
			System.out.print(customerID + "\t");
			String invoiceNum = scNew.next();
			System.out.print(invoiceNum + "\t");
			double invoiceAmount = scNew.nextDouble();
			System.out.print(invoiceAmount +"\n");

			Invoice inv = new Invoice(customerID, invoiceNum, invoiceAmount);
			InvoiceLinkedList node = new InvoiceLinkedList();
			//node.add(inv);

		}





	}
}