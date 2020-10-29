package class8;

public class SE extends Employee
{
	
	int hot;
	
	int att;
	
	
	
	public int getAtt()
	{
		return att;
	}
	public void setAtt(int att)
	{
		this.att = att;
	}
	public int getHot()
	{
		return hot;
	}
	public void setHot(int hot)
	{
		this.hot = hot;
	}	
	
	@Override
	public void showInfo()
	{	
		super.showInfo();
		System.out.println("; hot: " + hot );
	}
	
}
