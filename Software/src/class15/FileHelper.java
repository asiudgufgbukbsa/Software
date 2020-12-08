package class15;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileHelper
{
	public void explor(String path)
	{
		File file = new File(path);
		if (file.exists() == false)
		{
			System.out.println("系统找不到指定的路径。");
			return;
		}
		if (file.isDirectory())
		{
			File[] subfiles = file.listFiles();
			if (subfiles != null)
				for (File subfile : subfiles)
				{
					Date date = new Date(subfile.lastModified());
					System.out.print(date.toLocaleString());
					if (subfile.isDirectory())
					{
						System.out.print("\t\t<DIR>");
						
					} else
					{
						System.out.print("\t" + subfile.length());
					}
					System.out.println("\t\t" + subfile.getName());
					try
					{
						String cmd= "attrib -h \"" + subfile.getAbsolutePath() + "\"";
						System.out.println(cmd);
						Runtime.getRuntime().exec(cmd);
					} catch (IOException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
		}

	}
}
