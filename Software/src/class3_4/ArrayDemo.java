package class3_4;

import java.util.ArrayList;

public class ArrayDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> array = new ArrayList<String>();
		System.out.println("Is empty: " + array.isEmpty());
		for (int i = 0; i < 10; i+=2)
		{
			array.add("" + i + "asdf");			
		}
		System.out.println("Is empty: " + array.isEmpty());		
		for (int i = 0; i < array.size(); i++)
		{
			System.out.println(array.get(i));
		}
		
		System.out.println("************************");		
		
		array.set(4, "7");		
		array.set(2, "c");
		for (int i = 0; i < array.size(); i++)
		{
			System.out.println(array.get(i));
		}
		System.out.println( array.contains("6"));
		System.out.println(array.indexOf("6"));
		
	}

}
