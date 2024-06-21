public class StackMain {

	public static void main(String[] args) {
		DescnedStack stack = new DescnedStack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.peak();
		stack.push(40);
		stack.push(50);
		
		stack.pop();
		stack.push(60);
		stack.peak();
	}
}
