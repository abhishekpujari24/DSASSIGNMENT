public class Main {
    public static void main(String[] args) {
        // Create a priority queue with initial capacity of 10
        PriorityQueueMinHeap priorityQueue = new PriorityQueueMinHeap(10);

        // Insert elements
        priorityQueue.insert(3);
        priorityQueue.insert(6);
        priorityQueue.insert(5); 
        priorityQueue.insert(1); 
        priorityQueue.insert(9);
        priorityQueue.insert(8);

        // Extract and print elements in sorted order (ascending)
        System.out.println("Elements extracted in sorted order:");
        while (true) { // Keep extracting until the queue is empty
            try {
                System.out.print(priorityQueue.extractMin() + " ");
            } catch (IllegalStateException e) {
                System.out.println("\nPriority queue is empty."); // Catch when queue is empty
                break; 
            }
        }
        

        
        // Peek at the top element (without removal)
        System.out.println("\nInserting 2 and peeking:");
        priorityQueue.insert(2);
        System.out.println("Top element: " + priorityQueue.peek());
    }
}
