public class PriorityQueueMinHeap {

    private int[] heap; // Array to store heap elements
    private int size;   // Current size of the heap
    private int capacity; // Maximum capacity of the heap

    public PriorityQueueMinHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    // Function to insert a new element into the priority queue
    public void insert(int item) {
        if (size == capacity) {
            // Resize the heap if needed (implementation left as an exercise)
            throw new IllegalStateException("Heap is full"); 
        }

        int i = size++;
        heap[i] = item;

        // Fix the min heap property if it's violated
        while (i > 0 && heap[i] < heap[parent(i)]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Function to remove and return the minimum element from the priority queue
    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int min = heap[0];
        heap[0] = heap[--size]; // Replace root with last element
        heapify(0); // Restore min heap property
        return min;
    }
    
    // Function to get the minimum element from the priority queue without removing it
    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    //Helper function to heapify a subtree rooted with node i
    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest); // Recursively heapify
        }
    }
    
   // Function to get parent index
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Function to get left child index
    private int leftChild(int i) {
        return (2 * i + 1);
    }

    // Function to get right child index
    private int rightChild(int i) {
        return (2 * i + 2);
    }

    // Function to swap two nodes of min heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
