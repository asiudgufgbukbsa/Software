package class18;

public class Test
{

	public static void main(String[] args)
	{
		String expr = "1*2";
		String[] strs = expr.split("[/+-/*//]");
		int num1 = Integer.parseInt(strs[0]);
		int num2 = Integer.parseInt(strs[1]);
		System.out.printf("%d,%d\n", num1,num2);
		System.out.println(num1 + num2);
		
		
		if(expr.contains("+"))
		{
			int index = expr.indexOf('+');
			String left = expr.substring(0, index);
			String right = expr.substring(index+1);
			int num3 = Integer.parseInt(left);
			int num4 = Integer.parseInt(right);
			System.out.println(left);
			System.out.println(right);
			System.out.println(num1 + num2);
					
		}
		else if(expr.contains("-"))
		{
			
		}
		else if(expr.contains("*"))
		{
			
		}
		else if(expr.contains("/"))
		{
			
		}

	}

}
