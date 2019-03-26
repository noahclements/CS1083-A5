public class InvoiceLinkedList {
	private Node head;
	private Node tail;

	public InvoiceLinkedList() {
		head = null;
	}


	public int getSize() {
		int counter = 0;
		Node curr = head;
		while(curr != head) {
			counter++;
			curr = curr.next;
		}
		return counter;
	}








	public class Node { // inner
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

		public Node(int data, Node next) { // overload
			this.data = data;
			this.next = next;
		}
	}





}