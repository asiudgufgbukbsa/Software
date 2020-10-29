package class8;

public class Dog
{
	public static int count = 0;
	public String name;
	public Dog()
	{
		count ++;
	}
	public void test1()
	{
		count = 1;
		name = "zhang san";
		test2();
		test3();
		test4();
		this.name = "adfasdf";
		
	}
	
	public void test2()
	{
		
	}
	
	static void test3()
	{
		count = 10;
		test3();
		test4();
		
	}
	
	static void test4()
	{
		
	}
	
	
}
