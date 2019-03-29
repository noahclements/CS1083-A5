import java.util.Scanner;
import java.io.*;
import java.util.Locale;
public class Ass5Driver {
	public static void main(String[] args) throws FileNotFoundException{
		File invoiceData = new File(args[0]);
		Scanner sc = new Scanner(invoiceData);

		InvoiceLinkedList node = new InvoiceLinkedList();
		int numOfCustomers = sc.nextInt();
		/*
		for(int i = 0; i < numOfCustomers; i++) { // customer IDs
			String j = sc.next();
			System.out.println(j);
		}
		*/
		sc.nextLine();
		sc.nextLine();
		//System.out.println("Start of loop");
		while(sc.hasNext()) {	// list
			String lineInfo = sc.nextLine();
			Scanner scNew = new Scanner(lineInfo);
			scNew.useDelimiter(",|\n");

			String customerID = scNew.next();
			//System.out.print(customerID + "\t");
			String invoiceNum = scNew.next();
			//System.out.print(invoiceNum + "\t");
			double invoiceAmount = scNew.nextDouble();
			//System.out.print(invoiceAmount +"\n");

			Invoice inv = new Invoice(customerID, invoiceNum, invoiceAmount);
		
			node.add(inv);


		}
		//node.print();
		//node.swapValues(0,6);
		//node.print();
		System.out.println("Sorted");
		Sorter sorted = new Sorter();

		sorted.InsertionSort(node);
		node.print();

		System.out.println("input the name of the returns file");
		Scanner scRe = new Scanner(System.in);
		String fileName = scRe.next();

		File returnFile = new File(fileName);

		scRe = new Scanner(returnFile);

		while(scRe.hasNext()) {
			String line = scRe.nextLine();
			Scanner scReNew = new Scanner(line);
			scReNew.useDelimiter(",|\n");

			int entryCode = scReNew.nextInt();
			String customerID = scReNew.next();
			String invoiceNum = scReNew.next();
			double invoiceAmount = scReNew.nextDouble();
			if(entryCode == 750) {
				Invoice rmv = new Invoice(customerID, invoiceNum, invoiceAmount);
				node.remove(rmv);
			} else if(entryCode == 850) {
				Invoice ins = new Invoice(customerID, invoiceNum, invoiceAmount);
				node.insert(ins); // insert machine broke
			}
		}





	}
}