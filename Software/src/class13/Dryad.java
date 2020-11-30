package class13;

public class Dryad extends Monster
{
	public Dryad(String name, int hp, int atk, int def, double height)
	{
		
		super(name, hp, atk, def);
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	double height;
	
	@Override
	public void showInfo()
	{
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(" �߶ȣ�" + height);
	}

	@Override
	public void attack(Monster enemy)
	{
		int harm = this.atk - enemy.def;
		if(harm < 1)
			harm = 1;
		System.out.println(name  + "ʹ����֦���ƣ� ��" + enemy.name + "��� "  + harm + "���˺���");
		enemy.hp -=  harm;
		
	}
	
	
}
