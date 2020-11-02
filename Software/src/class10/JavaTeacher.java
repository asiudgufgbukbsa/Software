package class10;

public class JavaTeacher extends Teacher
{

	public JavaTeacher(String name, int age)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void teach()
	{
		System.out.println("Teaching Java");
	}

}
