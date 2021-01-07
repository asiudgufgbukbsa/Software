
public class ThreadPriority
{

	public static void main(String[] args)
	{
		Thread tmin = new PrintThread();
		Thread tnormal = new PrintThread();
		Thread tmax = new PrintThread();
		tmax.setName("T_Max");
		tmin.setName("T_Min");
		tnormal.setName("T_Normal");
		
		
		tmin.setPriority(Thread.MIN_PRIORITY);
		tmax.setPriority(Thread.MAX_PRIORITY);
		
		tmin.start();
		tnormal.start();
		tmax.start();
		

	}

}

class PrintThread extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.printf("Thread: %s, count: %d\n", Thread.currentThread().getName(), i);
		}
	}
}

