package class6;

public class Teacher
{
	String name;
	private int age;
	
	void setAge(int m_age)
	{
		if(m_age < 22)
			m_age = 22;
		age = m_age;
	}
	
	int getAge()
	{
		return age;
	}
	
	void dispInfo()
	{
		System.out.println("ÐÕÃû£º" + name + "; ÄêÁä£º " + age);
	}
}
