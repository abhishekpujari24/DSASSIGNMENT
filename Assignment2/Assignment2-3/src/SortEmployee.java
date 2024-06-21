//3. Write a function to sort employees by their salary.
 class Employee{
	 int empId;
	 String name;
	 float salary;
	
	public Employee(int id , String name , float salary) {
		empId=id;
		this.name=name;
		this.salary=salary;	
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
}


public class SortEmployee {

	 public static void sortBySalary(Employee arr []) {
		 for(int i =0; i<arr.length; i++) {
			 for(int j=i+1; j < arr.length;j++) {
				if(arr[i].salary>arr[j].salary) {
					Employee tmpEmployee;
					tmpEmployee = arr[i];
					arr[i]=arr[j];
					arr[j]=tmpEmployee;
				}
			 }
		 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] empArrEmployees = {new Employee(1,"Saurabh", 10500),new Employee(2,"Gaurav", 30500),new Employee(3,"Ganesh", 25500),new Employee(4,"mahesh", 15000),};
		System.out.println("Employee list before sort");
		for(Employee employee : empArrEmployees) {
			System.out.println(employee.toString());
		}
		
		sortBySalary(empArrEmployees);
		System.out.println("Employee list after sort");
		for(Employee employee : empArrEmployees) {
			System.out.println(employee.toString());
		}
				
	}

}
