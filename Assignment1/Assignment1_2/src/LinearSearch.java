import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr [],int key) {
		int index=-1;
		for(int i=0; i<arr.length;i++) {
			if (key== arr[i])
				index=i;
		}
		
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {11,33,22,55,44,55,66};
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number to search in array");
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		if(index!=-1)
		System.out.println("The number on index:"+index);
		else
			System.out.println("Number not found");
	}

}
