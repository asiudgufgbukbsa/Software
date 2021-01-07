package class26;

public class MakeTea
{
	public static void main(String[] args)
	{
		Thread boilWater = new Thread( new BoilWater());
		Thread washCup  = new Thread( new WashCup());
		
		boilWater.start();
		washCup.start();
		
		System.out.println("Completed!");
	}
}


class BoilWater implements Runnable
{
	@Override
	public void run()
	{		
		try
		{
			
			System.out.println("开始烧水");
			Thread.sleep(10 * 1000);
			System.out.println("烧好了。。");
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class WashCup implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("开始洗第" + (i+1) + "个杯子");
			try
			{
				Thread.sleep( 1 * 1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("第" + (i+1) + "个杯子洗好了");
		}
	}
}

