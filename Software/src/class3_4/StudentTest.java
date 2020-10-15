package class3_4;

public class StudentTest
{

	public static void main(String[] args)
	{
		Student zhangsan = new Student();
		zhangsan.name = "уехЩ";
		zhangsan.age = 18;
		zhangsan.number = "N000001";
		zhangsan.dispInfo();
		
		zhangsan.addCourse("Python");
		zhangsan.addCourse("Java");
		zhangsan.dispInfo();
		
		zhangsan.removeCourse("Java");
		zhangsan.dispInfo();
		
	}

}
