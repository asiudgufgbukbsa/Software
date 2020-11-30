package class14;

import java.util.Scanner;


class SpeedException extends Exception
{
	public SpeedException()
	{
		super("速度太快了。。");
	}
}

public class ExceptionDemo
{

	public static void main(String[] args) 
	{			
		try
		{
			handleSpeed();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}

	private static void handleSpeed() throws Exception
	{
		int speed;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the speed");
		speed = scanner.nextInt();
		if(speed > 1000)
		{			
			throw new SpeedException();
		}
		System.out.println("做一些其它的处理...");
	}

}
