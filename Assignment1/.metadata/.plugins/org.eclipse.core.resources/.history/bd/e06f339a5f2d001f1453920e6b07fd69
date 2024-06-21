package com.sunbeam;

//6. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
//not found, return -1.
public class Searching {

	public static int linearSearchOcurrence(int arr[], int key) {
		int count=0;
		int flag =0;
		for(int i=0; i< arr.length; i++ ) {
			if(key==arr[i]) {
				count++;
				flag=1;
			}
		}
		if(flag != 0)
		{
			return count;
		}
		else {
			return -1;
	
		}	
	}

	public static void main(String args[]) {
		int arr[] = { 11, 11, 99, 88, 44, 55, 55, 44, 33, 22, 11, };
		
		System.out.println("No of occurence of 11 is"+linearSearchOcurrence(arr,11));

	}
}
