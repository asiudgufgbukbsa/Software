package class13;

public class Cyclops extends Monster
{
	String weapon;

	public Cyclops(String name, int hp, int atk, int def, String weapon)
	{
		super(name, hp, atk, def);
		this.weapon = weapon;
	}
	
	@Override
	public void showInfo()
	{
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(" ������" + weapon);
	}

	@Override
	public void attack(Monster enemy)
	{
		int harm = this.atk - enemy.def;
		if(harm < 1)
			harm = 1;
		System.out.println(name  + "ʹ��" + weapon + "������ ��" + enemy.name + "��� "  + harm + "���˺���");
		enemy.hp -=  harm;
		
	}
	
	
}
