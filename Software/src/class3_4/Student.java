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
		System.out.println("����: "  + name + "; ѧ�ţ� " + number + "; ���䣺 " + age + "; ��ѡ���⣺");
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

