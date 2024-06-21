
public class InsertionSort {

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

	}

	public static void main(String args[]) {

		int arr[] = { 88, 55, 22, 33, 66, 44, 77, 11, 99 };
		System.out.println("Array beofor sort -");
		for (int num : arr)
			System.out.println(num);

		System.out.println("Array after insertion sort ");
		insertionSort(arr);
		for (int num : arr)
			System.out.println(num);

	}
}
