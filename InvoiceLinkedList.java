public class InvoiceLinkedList {
	private Node head, tail;
	private int size;

	public InvoiceLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}


	public int size() {
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
			tail = addNode;
		} else if(addNode.data < head.data) {
			addNode.next = head;
			head.prev = addNode;
			head = addNode;
		} else {
			Node curr = head;
			Node prev = head;
			while(curr != null && curr.data < addNode.data) {
				prev = curr;
				curr = curr.next;
			}
			curr.next.prev = addNode;
			prev.next = addNode;
			addNode.prev = prev;
			addNode.next = curr;
		}
		size++;
	}

	public Invoice get(int index) {
		Node curr = head;
		int count = 1;
		while(count < index) {
			curr = curr.next;
			count++;
		}
		return curr.data;
	}

	public boolean remove(Invoice invoice) {
		Node removeNode = new Node(invoice);
		Node curr = head;
		if(removeNode == head) {
			head = head.next;
			head.prev = null;
			size--;
			return true;
		} else if(removeNode == tail) {
			tail.prev.next = null;
			tail.prev = tail;
			size--;
			return true;
		} else {
			while(curr.next != null || curr.next != removeNode) {
				curr = curr.next;
			}
			if(curr == removeNode) {
				curr.prev.next = curr.next;
				curr.next.prev = curr.prev;
				size--;
				return true;
			} else {
				return false;
			}
		}
	}

	public void swapValues(int index1, int index2) {

	}



	public void print() {
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	public void printBackwards() {
		Node curr = tail;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.prev;
		}
	}

	public Node getCustomerSublist(String customerID) {

	}




	public class Node { // inner
		public Invoice data;
		public Node prev,next;

		public Node(Invoice dataIn) {
			data = dataIn;
			next = null;
			prev = null;
		}

		public Node(Invoice dataIn, Node nextIn) { // overload
			data = dataIn;
			next = nextIn;

		}
	}





}