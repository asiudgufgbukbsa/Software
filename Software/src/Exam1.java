import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student
{
	private String name;
	private int age;
	public Student(String name,  int age)
	{
		super();
		this.name = name;		
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
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
}

public class Exam1
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < 5; i++)
		{
			String name = scanner.next();
			int age = scanner.nextInt();
			if(age <= 0)
			{
				Student student = new Student(name, age);
				students.add(student);
			}			
		}
		switch (students.size())
		{
		case 0:
			System.out.println("right");
			break;
		case 5:
			System.out.println("all wrong");
			break;

		default:
			System.out.println(students.size());
			for (Student student : students)
			{
				System.out.println(student.getName());
			}
			break;
		}
		
		

	}

}
