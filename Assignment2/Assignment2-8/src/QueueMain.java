public class QueueMain {
// Implement circular queue using counter method	
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.peek();
		queue.push(10);
		queue.push(20);
		queue.push(30);
		System.out.println(queue.peek());
		queue.push(40);
		queue.push(50);
		queue.push(60);
		System.out.println(queue.peek());
		
	}

}
