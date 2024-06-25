
public class List {
	static class Node{
		private char data;
		private Node next;
		public Node(char value) {
			data = value;
			next = null;
		}
	}
	
	//private Node head;
	private Node tail;
	private int count;
	public List() {
	 tail = null;
		count = 0;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public void addFirst(char value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if empty
		if(isEmpty()) {
			//a. add newnode into head and tail
			tail = newnode;
			//b. make list circular
			newnode.next = newnode;
			count++;
		}
		//3. if not empty
		else {
			//a. add first node into next of newnode
			newnode.next = tail.next;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move head on newnode
			tail.next = newnode;
			count++;
		}

	}
	
	public void addLast(char value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if empty
		if(isEmpty()) {
			//a. add newnode into head and tail
			 tail = newnode;
			//b. make list circular
			newnode.next = newnode;
			count++;
		}
		//3. if not empty
		else {
			//a. add first node into next of newnode
			newnode.next = tail.next;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
			count++;
		}

	}
	
	public void display() {
		// if list is empty
		if(isEmpty())
			return;
		//1. create trav and start at head
		Node trav = tail.next;
		System.out.print("List :  ");
		do {	
			//2. visit/print data of current node (trav.data)
			System.out.print(" " + trav.data);
			//3. go on next node (trav.next)
			trav = trav.next;
		}while(trav != tail.next);//4. repeat step 2 and 3 till last node of list
		System.out.println("");
		System.out.println("Node count : " + count);
	}
	
	public void deleteFirst() {
		//1. if empty
		if(isEmpty())
			return;
		//2. if single node
		else if(tail.next == tail)
			// add null into head and tail
			tail.next = tail = null;
		//3. if multiple nodes
		else {
			//a. add second node into next of last node
			tail.next = tail.next.next;
			//b. move head on second node
			tail.next = tail.next.next;
		}
		count--;
	}
	
	public void deleteLast() {
		//1. if empty
		if(isEmpty())
			return;
		//2. if single node
		else if(tail.next == tail)
			// make head and tail equal to null
			tail.next = tail = null;
		//3. if multiple nodes
		else {
			//a. traverse till second last node
			Node trav = tail.next;
			//while(trav.next.next != head)
			while(trav.next != tail)
				trav = trav.next;
			//b. add first node into next of second last node
			trav.next = tail.next;
			//c. move tail on second last node
			tail = trav;
		}
		count--;
	}
	
	public void addPosition(char value, int pos) {
		// valid pos ::  1 => pos <= count + 1
		// invalid pos :: 1 < pos > count + 1
		if(pos < 1 || pos > count + 1) {
			System.out.println("Invalid position");
			return;
		}
		//1. create newnode with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(tail.next == null)
			// add newnode into head and tail itself
			tail.next = tail = newnode;
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		//3. if list is not empty
		else {
			//a. traverse till pos -1 node
			Node trav = tail.next;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add newnode into next of pos -1 node 
			trav.next = newnode;
			// if pos is count + 1, need to move tail on newnode
			if(trav == tail)
				tail = newnode;
		}
		count++;
	}

	public void deletePosition(int pos) {
		// valid pos ::  1 => pos <= count 
		// invalid pos :: 1 < pos > count
		if(pos < 1 || pos > count) {
			System.out.println("Invalid position");
			return;
		}
		//1. if list is empty
		if(isEmpty())
			return;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		//2. if list has single node
		else if(tail.next == tail)
			tail.next = tail = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till pos -1 node
			Node trav = tail.next;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//b. add pos+1 node into next of pos-1 node
			trav.next = trav.next.next;
			// if pos is count + 1, need to move tail on newnode
			if(trav.next == tail)
				tail = trav;
			
		}
		count--;
	}
	
	
	public void deleteAll() {
		tail.next = tail = null;
	}

}








