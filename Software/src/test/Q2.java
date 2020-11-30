package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student
{
	private String name;
	int age;
	
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
public class Q2
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int count = 5;
		List<Student> errors = new ArrayList<Student>();
		for (int i = 0; i < count; i++)
		{
			String name = scanner.next();
			int age = scanner.nextInt();
			if(age <= 0)
			{
				Student student = new Student(name, age);
				errors.add(student);
			}
			
		}
		switch (errors.size()	)
		{
		case 0:
			System.out.println("right");
			break;
		case 5:
			System.out.println("all wrong");
			break;

		default:
			System.out.println(errors.size());
			for (Student student : errors)
			{
				System.out.println(student.getName());
			}
		}
		
		
		
		
		

	}

}
