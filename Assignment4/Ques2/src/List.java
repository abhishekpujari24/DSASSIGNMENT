
public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	public List() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void insertFront(int value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			// add newnode into head and tail
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into prev of first node
			head.prev = newnode;
			//c. move head on newnode
			head = newnode;
		}
	}
	
	public void insertRear(int value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if empty
		if(isEmpty())
			// add newnode into head and tail
			head = tail = newnode;
		//3. if not empty
		else {
			//a. add last node into prev of newnode
			newnode.prev = tail;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
		}
	}
	
	public void deleteFront() {
		//1. if empty
		if(isEmpty())
			return;
		//2. if single node
		else if(head == tail)
			head = tail = null;
		//3. if multiple nodes
		else {
			//a. move head on second node
			head = head.next;
			//b. make prev of second node null
			head.prev = null;
		}

	}
	
	public void deleteRear() {
		//1. if empty
		if(isEmpty())
			return;
		//2. if single node
		else if(head == tail)
			head = tail = null;
		//3. if multiple nodes
		else {
			//a. move tail on second last node
			tail = tail.prev;
			//b. make next of second last node null
			tail.next = null;
		}
	}

	public void forwardDisplay() {
		// forward traversal
		//1. create trav and start at head
		Node trav = head;
		System.out.print("Forward List : ");
		while(trav != null) {
			//2. visit/print data of current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void reverseDisplay() {
		// reverse traversal
		//1. create trav and start at tail
		Node trav = tail;
		System.out.print("Reverse List : ");
		while(trav != null) {
			//2. visit/print data of current node
			System.out.print(" " + trav.data);
			//3. go on prev node
			trav = trav.prev;
		}//4. repeat step 2 and 3 till first node
		System.out.println("");
	}
	
	public void deleteAll() {
		head = tail = null;
		
	}
	  int getFront() {
			Node trav = head;
		    if (isEmpty()) {
		      System.out.println(" Underflow");
		      return -1;
		    }
		    return trav.data;
		  }

		  int getRear() {
			  Node trav = tail;
		    if (isEmpty() || trav.data < 0) {
		      System.out.println(" Underflow\n");
		      return -1;
		    }
		    return trav.data;
		  }
}





















