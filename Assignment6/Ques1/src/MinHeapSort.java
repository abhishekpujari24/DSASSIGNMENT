import java.util.Arrays;

public class MinHeapSort {

    // Heapify a subtree rooted with node i.
    private static void heapify(int[] arr, int n, int i) {
        int smallest = i ; // Initialize smallest as root
        int left = 2 * i + 1 ; // left = 2*i + 1
        int right = 2 * i + 2 ; // right = 2*i + 2

        // If left child is smaller than root
        if (left < n && arr[left] < arr[smallest])
            smallest = left;

        // If right child is smaller than smallest so far
        if (right < n && arr[right] < arr[smallest])
            smallest = right;

        // If smallest is not root
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, smallest);
        }
    }

    // Main function to perform heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0]= arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
   
     public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 4, 5, 10]
    }

   
}
