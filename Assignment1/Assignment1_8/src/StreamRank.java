import java.util.ArrayList;

//8. to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total

//no. of ele's less than or equal to x (including x).
//Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 

import java.util.Collections;

public class StreamRank {

	public static int getRankOfNumber(int arr[], int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num >= arr[i]) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		StreamRank sr = new StreamRank();
		int[] input = { 10, 20, 15, 3, 4, 4, 1 };

		int rank = getRankOfNumber(input, 4);
		System.out.println("Rank of 4 is: " + rank); // Output: Rank of 4 is: 4
	}
}
