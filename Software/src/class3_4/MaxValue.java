package class3_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxValue
{

	public static void main(String[] args)
	{
		int num = 100;
		double[] scores = new double[num];
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = random.nextDouble() * 100;
		}		
		Arrays.sort(scores);
		for (double i : scores)
		{
			System.out.println(i);
		}
		
		System.out.println(scores[num-1]);
		System.out.println(scores[0]);

	}

}
