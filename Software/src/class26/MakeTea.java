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
			
			System.out.println("��ʼ��ˮ");
			Thread.sleep(10 * 1000);
			System.out.println("�պ��ˡ���");
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
			System.out.println("��ʼϴ��" + (i+1) + "������");
			try
			{
				Thread.sleep( 1 * 1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��" + (i+1) + "������ϴ����");
		}
	}
}

