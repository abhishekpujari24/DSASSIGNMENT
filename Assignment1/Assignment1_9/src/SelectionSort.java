
public class SelectionSort {
//9. Write a selection sort function to sort array and returns no of comparisions
	
	public static void selectionSort(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++ ) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {99,55,44,33,22,11,77,88,66};
		System.out.println("Array before Sort");
		for(int num: arr) {
			System.out.print(" "+num);
		}
		
		System.out.println("Array After sort");
		selectionSort(arr);
		for(int num: arr) {
			System.out.print(" "+num);
		}
	
	}

}
