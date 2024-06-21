package sunbeam.com;

import java.util.Scanner;

public class Main {
	
	public static void searchById(Employee arr[], int id) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i].getEmpId()==id) {
				System.out.println(arr[i].toString());
				break;
			}
		}
//		System.out.println("Employee not found");
		
	}
	
	public static void main(String args[]) {
		Employee[] arr = { new Employee(1,"saurabh",2000), new Employee(2,"raj",25000), new Employee(3,"ganesh",30000) };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee id to find employee");
		int id = sc.nextInt();
		searchById(arr,id);
		
	}
}
