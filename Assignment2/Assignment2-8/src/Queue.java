//8. Implement circular queue using counter method
public class Queue {
	private int arr[];
	private int rear;
	private int front;
	private final int SIZE;
	private static int counter;

	public Queue(int size) {
		// TODO Auto-generated constructor stub
		SIZE = size;
		arr = new int[size];
		rear = front = -1;
		counter = 0;
	}

	public boolean isFull() {
		return counter==SIZE;
	}

	public boolean isEmpty() {
		return counter==0;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		rear=(rear+1)%SIZE;
		arr[rear] = value;
		counter++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int num = arr[front];
		front=(front+1)%SIZE;
		//front++;
		counter--;
		
		if (front == rear)
			front = rear = -1;
		return num;
	}
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[rear];
		
	}

}
