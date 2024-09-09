package week4;

class Employee 
{
	String name;
	String department;
	
	Employee(String name, String department)
	{
		this.name = name;
		this.department = department;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	@Override
	public String toString()
	{
		return "Name: "+name+" Department: "+department;
	}
}
