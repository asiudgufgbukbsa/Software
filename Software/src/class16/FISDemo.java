package class16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FISDemo
{

	public static void main(String[] args)
	{
		String file = "E:\\Git\\Paper.zip";
		//readFileByByte();
//		long start = System.currentTimeMillis();
//		//readFileByBuff(file);
//		readFileByByte(file);
//		long end = System.currentTimeMillis();
//		System.out.println((end-start) / 1000 );
		copyFileByByte("src/class16/FISDemo.java", "src/class16/FISDemo2.java");
		System.out.println("Completed");

	}
	
	static void readFileByBuff(String filePah)
	{
		File file =new File(filePah); //我是中文
		FileInputStream fis;
		try
		{
			fis = new FileInputStream(file);
			byte[] buff = new byte[(int) file.length()];
			fis.read(buff);
			//String content = new String(buff);
			//System.out.println(content);
			fis.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	static void copyFileByBuff(String filePah, String dest)
	{
		File file =new File(filePah); //我是中文
		FileInputStream fis;
		try
		{
			fis = new FileInputStream(file);
			byte[] buff = new byte[(int) file.length()];
			fis.read(buff);
			FileOutputStream fos = new FileOutputStream(dest);
			fos.write(buff);
			//String content = new String(buff);
			//System.out.println(content);
			fis.close();
			fos.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void readFileByByte(String filePah)
	{
		File file =new File(filePah); //我是中文
		FileInputStream fis;
		try
		{
			fis = new FileInputStream(file);
			for (int i = 0; i < file.length(); i++)
			{
				System.out.printf("%d/%d\n", i, file.length());
				char ch = (char)fis.read();
				//System.out.print(ch);
			}
			fis.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void copyFileByByte(String orig, String dest)
	{
		File file =new File(orig); //我是中文
		FileInputStream fis;
		try
		{
			fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(dest);
			for (int i = 0; i < file.length(); i++)
			{				
				fos.write(fis.read());
			}
			fis.close();
			fos.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
