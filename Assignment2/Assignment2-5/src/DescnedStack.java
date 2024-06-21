
public class DescnedStack {
	private final int SIZE;
	private int arr[];
	private int top;

	public DescnedStack(int size) {
		SIZE = size;
		arr = new int[size];
		top = SIZE - 1;
	}

	public boolean isEmpty() {
		return top == SIZE - 1;
	}

	public boolean isFull() {
		return top == -1;
	}

	public void push(int value) {
		if(isFull())
			return;
		arr[top--] = value;
	}

	public int pop() {
		if(isEmpty())
			return 1;
		return arr[++top];
		//top++;
	}

	public void peak() {
		if (isEmpty())
			return;
		System.out.println("the peak value-" + arr[top +1]);
	}
//	public void display() {
//		
//	}
}
