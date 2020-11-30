package class15;

import java.io.File;

public class FileDemo
{

	public static void main(String[] args)
	{
		File file = new File("src/class15/FileDemo.java");
		System.out.println(file.getAbsolutePath());
		File file1 = new File("d:/");
		String[] subfiles = file1.list();
		for (String subfile : subfiles)
		{
			System.out.println(subfile);
		}
		File[] subFiles2 =  file1.listFiles();
		for (File file2 : subFiles2)
		{
			System.out.println(file2.getAbsolutePath());
		}

	}

}
