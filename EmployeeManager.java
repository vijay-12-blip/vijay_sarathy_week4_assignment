package week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class EmployeeManager 
{
	public static void main(String[] args) 
	{
		// Creating a HashMap to store Employee details
		Map<Integer, Employee> employeeMap = new HashMap<>();

		// Adding Employee details
		employeeMap.put(101, new Employee("Jason","Front End Developer"));
		employeeMap.put(102, new Employee("Smith","Back End Developer"));
		employeeMap.put(103, new Employee("Jaden","Data Analyst"));

		Scanner sc = new Scanner(System.in);

		//Searching Employee with ID
		System.out.println("Enter an Employee ID to search");
		int employeeId = sc.nextInt();

		//Retrieve Employee ID
		Employee emp = employeeMap.get(employeeId);

		if(emp != null)
		{
			System.out.println("Employee Details: \n"+emp);
		}
		else
		{
			System.out.println("Employee ID not found");
		}
	}
}
