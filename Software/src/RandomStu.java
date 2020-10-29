import java.util.ArrayList;
import java.util.Collections;

public class RandomStu
{
	ArrayList<String> students = new ArrayList<String>();
	
	public void initial()
	{
		String[] miss = {"0105", "0220"};
		for (int i = 1; i <= 25; i++)
		{
			students.add("01" + String.format("%02d", i) );
		}
		for (int i = 0; i <= 24; i++)
		{
			students.add("02" + String.format("%02d", i) );
		}
		for (String stu : miss)
		{
			students.remove(stu);
		}		
	}

	public void pickGuys(int count)
	{		
		Collections.shuffle(students);
		for (int i = 0; i < count; i++)
		{
			System.out.print(students.get(i) + ", ");
		}
	}

	
}
