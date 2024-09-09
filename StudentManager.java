package week4;

import java.util.ArrayList;
import java.util.Scanner;

class StudentManager 
{
	ArrayList<String> std;

	StudentManager() 
	{
		std = new ArrayList<String>();
	}

	public void addStudent(String studentName)
	{
		std.add(studentName);
		System.out.println(studentName+" is added to the Student List");
	}

	public void removeStudent(String studentName)
	{
		if(std.remove(studentName))
			System.out.println(studentName+" is removed from the Student List");
		else
			System.out.println(studentName+" is not present in the Student List");
	}

	public void displayStudent() 
	{
		if(std.isEmpty())
			System.out.println("No students to display");
		else
		{
			System.out.println("List of Students: ");
			for(String str : std)
			{
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) 
	{
		StudentManager stm = new StudentManager();
		Scanner sc = new Scanner(System.in);
		int choice;

		do
		{
			System.out.println("1.Add Name\n2.Remove Name\n3.Display List\n4.Exit\nEnter your choice");
			choice = sc.nextInt();
			String name = sc.nextLine();

			switch(choice)
			{
			case 1: 
				System.out.println("Enter the name to be added.");
				name = sc.nextLine();
				stm.addStudent(name);
				break;

			case 2:
				System.out.println("Enter the name to be removed");
				name = sc.nextLine();
				stm.removeStudent(name);
				break;

			case 3:
				stm.displayStudent();
				break;

			case 4:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice, try again.");
			}
		}while(choice!=4);
		sc.close();
	}
}
