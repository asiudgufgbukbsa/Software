package class26;

public class ThreadDemo
{

	public static void main(String[] args) throws Exception
	{
		Thread thread = Thread.currentThread();
		for (int i = 0; i < 10; i++)
		{
			thread.sleep(1 * 1000);
			System.out.println(i);
		}

	}

}
