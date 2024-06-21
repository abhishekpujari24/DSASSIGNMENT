
public class InsertionSort {

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int temp = arr[i];
			while ( j >= 0 && arr[j] < temp ) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String args []) {
		int arr [] = {88,66,44,22,33,99,77,11};
		
		System.out.println("Array before sort");
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		insertionSort(arr);
		
		System.out.println("Array after sort");
		
		for(int num : arr) {
			System.out.println(num);
		}
		
	}

}
