package class8;



public class PM extends Employee
{	

	double  exp, bonus;
	
	public double getExp()
	{
		return exp;
	}
	public void setExp(double exp)
	{
		weight = 10;
		this.exp = exp;
	}
	public double getBonus()
	{
		return bonus;
	}
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	@Override
	public void showInfo()
	{
		super.showInfo();
		System.out.println("; exp: " + exp + "; bonus: "+ bonus);
	
	}

	
}
