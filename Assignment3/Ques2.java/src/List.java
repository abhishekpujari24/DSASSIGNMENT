import java.util.Scanner;

public class List {
	public int count = 0;

	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public List() {
		head = null;
	}

	public int search(int data) {
		Node trav = head;
		int tempCount = 1; // positions start from 1

		while (trav != null) {
			if (trav.data == data) {
				System.out.println("Position of passed data :: " + tempCount);
				return tempCount;
			}
			trav = trav.next;
			tempCount++;
		}
		System.out.println("");
		return -1;
	}

	public void insertAtSameData(int data) {
		Scanner sc = new Scanner(System.in);
		int insPos = search(data);
		if (insPos != -1) {
			System.out.println("Enter the value to store in the node after the given node ");
			int value = sc.nextInt();
			addPosition(value, insPos + 1);
		} else {
			System.out.println("Data not found in the list");
		}
	}
	public void insertBeforeData(int data) {
		Scanner sc = new Scanner(System.in);
		int insPos = search(data);
		if (insPos != -1) {
			System.out.println("Enter the value to store in the node before the given node ");
			int value = sc.nextInt();
			addPosition(value, insPos);
		} else {
			System.out.println("Data not found in the list");
		}
	}
	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
		count++;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
		} else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
		count++;
	}

	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if (head == null) {
			head = newnode;
		} else if (pos <= 1) {
			addFirst(value);
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
		count++;
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		else {
			head = head.next;
			count--;
		}
	}

	public void deleteLast() {
		if (head == null)
			return;
		else if (head.next == null) {
			head = null;
			count--;
		} else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			trav.next = null;
			count--;
		}
	}

	public void deletePosition(int pos) {
		if (head == null)
			return;
		else if (pos <= 1)
			deleteFirst();
		else if (head.next == null) {
			head = null;
			count--;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next.next != null; i++)
				trav = trav.next;
			trav.next = trav.next.next;
			count--;
		}
	}

	public void display() {
		Node trav = head;
		System.out.print("List :: ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public void deleteAll() {
		head = null;
		count = 0;
	}


}
