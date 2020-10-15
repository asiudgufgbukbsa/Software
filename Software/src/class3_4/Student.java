package class3_4;

import java.util.ArrayList;

public class Student
{
	String name, number;
	int age;
	ArrayList<String> courses = new ArrayList<String>();
	

	
	void dispInfo()
	{
		System.out.println("************************************************");
		System.out.println("姓名: "  + name + "; 学号： " + number + "; 年龄： " + age + "; 所选课题：");
		for (String  object : courses)
		{
			System.out.print(object + "\t");
			
		}	
	
		
		System.out.println("\n************************************************");

	}
	
	void addCourse(String course)
	{
		courses.add(course);
		
		
	}
	
	void removeCourse(String course)
	{
		courses.remove(course);
	}
}

