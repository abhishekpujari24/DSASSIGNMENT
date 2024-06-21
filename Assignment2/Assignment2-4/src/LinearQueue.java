public class LinearQueue {
//4. Write program to implement linear queue in which front and rear starts at 0.
	private final int SIZE;
	private int arr[];
	private int rear;
	private int front;
	
	public LinearQueue(int size) {
		SIZE =size;
		arr = new int[SIZE];
		front = rear=0;
	}
	
	public boolean isFull(){
		return rear==SIZE;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	 public void push(int value) {
		 if(isFull()) {
			 System.out.println("Queue is full");
			 return;
		 }
		 arr[rear]=value;
		 rear++;
	 }
	 
	 public void pop() {
		 if(isEmpty()) {
			 System.out.println("queue is empty");
			 return;
		 }
		 front = front+1;
	 }
	 public int peak(){
		 if(isEmpty()) {
			 System.out.println("queue is empty");
			 return -1;
		 }
		 return arr[rear-1];
	 }
	 
	 public void display() {
		 for(int i=0;i<rear; i++) {
			 if(i>=front) {
				 System.out.println(arr[i]);
			 }
		 }
	 }
}
