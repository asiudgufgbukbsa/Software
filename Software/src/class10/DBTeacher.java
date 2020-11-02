package class10;

public class DBTeacher extends Teacher
{

	public DBTeacher(String name, int age)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void teach()
	{
		System.out.println("Teaching DB");
	}

}
