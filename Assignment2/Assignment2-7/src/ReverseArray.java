import java.util.Arrays;

//7. Create an array of integers. Reverse the array using stack
public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 22, 66, 44, 55, 77, 88, 99, 11, 33 };
		DescnedStack stack = new DescnedStack(9);
		for (int i = 0; i < 9; i++) {
			stack.push(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < 9; i++) {
			arr[i] = stack.pop();
		}
		System.out.println(Arrays.toString(arr));
	}
}
