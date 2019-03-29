import java.util.Scanner;
import java.io.*;
import java.util.Locale;
// this makes me not want to program in java ever again
public class Ass5Driver {
	public static void main(String[] args) throws FileNotFoundException{
		File invoiceData = new File(args[0]);
		Scanner sc = new Scanner(invoiceData);

		InvoiceLinkedList node = new InvoiceLinkedList();
		int numOfCustomers = sc.nextInt();

		sc.nextLine();
		sc.nextLine();
		while(sc.hasNext()) {	// list
			String lineInfo = sc.nextLine();
			Scanner scNew = new Scanner(lineInfo);
			scNew.useDelimiter(",|\n");

			String customerID = scNew.next();
			String invoiceNum = scNew.next();
			double invoiceAmount = scNew.nextDouble();

			Invoice inv = new Invoice(customerID, invoiceNum, invoiceAmount);
		
			node.add(inv);


		}

		node.print(); // unsorted linked list
		System.out.println("Sorted");
		Sorter sorted = new Sorter();

		sorted.InsertionSort(node);
		node.print(); // sorted linked list

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
			if(entryCode == 750) { // returns
				Invoice rmv = new Invoice(customerID, invoiceNum, invoiceAmount);
				node.remove(rmv);
			} else if(entryCode == 850) { // exchange
				Invoice ins = new Invoice(customerID, invoiceNum, invoiceAmount);
				node.insert(ins); // insert machine broke
			}

		}

			//node.print();



	}
}