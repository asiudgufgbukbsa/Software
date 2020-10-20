package class7;

public class Teacher
{
	private int age;
	private String name, degree, position;
	
	public Teacher(int age, String name, String degree, String position)
	{
		super();
		this.age = age;
		this.name = name;
		this.degree = degree;
		this.position = position;
	}
	
	public Teacher(String name)
	{
		super();
		this.name = name;
	}
	
	
	public Teacher(int age, String name, String degree)
	{
		super();
		this.age = age;
		this.name = name;
		this.degree = degree;
	}
	
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDegree()
	{
		return degree;
	}
	public void setDegree(String degree)
	{
		this.degree = degree;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}	
	
	void showInfo()
	{
		System.out.println("Name: " + name + "; age: " + age + "; degree: " + degree + "; position: " + position);
	}
	
}
