package class3_4;

import java.util.Random;
import java.util.Scanner;

public class GuessNum
{

	public static void main(String[] args)
	{
		int level;
		System.out.println("Levels: 1(Easy), 2(Normal), 3(Hard)");
		Scanner scanner = new Scanner(System.in);
		level = scanner.nextInt();
		int count = 0;
		switch (level)
		{
		case 1:
			count = 12;
			break;
		case 2:
			count = 9;
			break;
		default:
			count = 7;
			break;
		}

		int num_count = 4;
		Random random = new Random();
		int[] answers = new int[num_count];

		boolean[] flags = new boolean[10];
		for (int i = 0; i < answers.length; i++)
		{
			while (true)
			{
				int condidate = random.nextInt(10);
				if (flags[condidate] == false)
				{
					flags[condidate] = true;
					answers[i] = condidate;
					break;
				}
			}
		}
		for (int b : answers)
		{
			System.out.println(b);
		}
		System.out.println("����׼���걸��high����");
		int cnt = 0;
		while (true)
		{
			System.out.println("������4������(0-9):");
			int[] inputs = new int[num_count];
			for (int i = 0; i < inputs.length; i++)
			{
				inputs[i] = scanner.nextInt();
			}
			int a = 0, b = 0;
			for (int i = 0; i < inputs.length; i++)
			{
				for (int j = 0; j < answers.length; j++)
				{
					if (inputs[i] == answers[j])
						b++;
				}
			}
			for (int i = 0; i < inputs.length; i++)
			{
				if (inputs[i] == answers[i])
					a++;
			}
			b = b - a;
			if (a == num_count)
			{
				System.out.println("��զ��ô������");
				break;
			}

			cnt++;
			System.out.println("" + cnt + ". " + a + "A" + b + "B");
			if (cnt > count)
			{
				System.out.println("��Ϸʧ�ܣ�����������");
				break;
			}

		}

	}

}
