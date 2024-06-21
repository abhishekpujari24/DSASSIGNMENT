public class NonRepeating {
//7. find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3

	public static int firstNonRepeatingNumber(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = 1;
				}
			}
			if (flag == 0) {
				return arr[i];
			}
		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int result = firstNonRepeatingNumber(arr);
		System.out.println("Number is    "+result);
	}

}
