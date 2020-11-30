package test;

import java.util.Arrays;
import java.util.Scanner;

public class Q1
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int count  = scanner.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);		
		int max = arr[arr.length - 1];
		for(int i=arr.length-1; i>=0; i--)
		{
			if(arr[i] < max)
			{
				System.out.println(arr[i]);
				break;
			}
		}

	}

}
