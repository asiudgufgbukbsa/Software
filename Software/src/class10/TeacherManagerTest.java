package class10;

public class TeacherManagerTest
{

	public static void main(String[] args)
	{
		TeacherManager teacherManager = new TeacherManager();
		Teacher javaTeacher = new JavaTeacher("����", 18);
		Teacher dotnetTeacher = new DotnetTeacher("����", 19);
		Teacher dbTeacher = new DBTeacher("����", 20);
		teacherManager.judge(javaTeacher);
		teacherManager.judge(dotnetTeacher);
		teacherManager.judge(dbTeacher);

	}

}
