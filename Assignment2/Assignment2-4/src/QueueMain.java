
public class QueueMain {

	public static void main(String[] args) {
		LinearQueue queue = new LinearQueue(5);
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		//System.out.println("ufhwbf");
		
		queue.push(50);
		queue.pop();
		queue.pop();
		queue.display();
		queue.push(60);
		
	}

}
