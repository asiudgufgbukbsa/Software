package class7;

public class TeacherTest
{
	public static void main(String[] strings )
	{
		Teacher teacher = new  Teacher(16, "wang", "doctor", "associate professor");
		Teacher teacher2 = new Teacher("asdf");
		
		teacher.showInfo();
		teacher2.showInfo();
	}
}
