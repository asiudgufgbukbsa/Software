package class10;

public class DotnetTeacher extends Teacher
{

	public DotnetTeacher(String name, int age)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void teach()
	{
		System.out.println("Teaching dotnet");
	}

}
