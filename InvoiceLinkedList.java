public class InvoiceLinkedList {
	private Node head, tail;
	private int size;

	public InvoiceLinkedList() {
		head = null;
		tail = null;
		size = 0;
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

	public void add(Invoice invoice) {
		Node addNode = new Node(invoice);
		if(head == null) {
			head = addNode;
			tail = addNode;
		} else {
			tail.next = addNode;
			addNode.prev = tail;
			tail = addNode;
		}
		size++;
	}

	public void insert(Invoice invoice) {
		Node addNode = new Node(invoice);
		if(head == null) {
			head = addNode;
		} else if(addNode.data < head.data) {
			addNode.next = head;
			head = addNode;
		} else {
			Node curr = head;
			Node prev = head;
		}
	}


	public void print() {
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}


	public class Node { // inner
		public int data;
		public Node prev,next;

		public Node(int dataIn) {
			data = dataIn;
			next = null;
			prev = null;
		}

		public Node(int data, Node next) { // overload
			this.data = data;
			this.next = next;
		}
	}





}