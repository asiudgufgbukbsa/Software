package class8;



public class Employee
{
	String id, name, gender;
	double salary;
	int weight;
	
	
	
	public void showInfo()
	{
		System.out.println("\n name: " + name + "; id: " + id + "salary: " + salary);
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	
	
}

