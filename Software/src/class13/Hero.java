package class13;

public class Hero extends Monster
{
	String skill;

	public Hero(String name, int hp, int atk, int def, String skill)
	{
		super(name, hp, atk, def);
		this.skill = skill;
	}

	@Override
	public void attack(Monster enemy)
	{
		int harm = this.atk - enemy.def;
		if(harm < 1)
			harm = 1;
		System.out.println(name  + "使用圣光， 对" + enemy.name + "造成 "  + harm + "点伤害！");
		enemy.hp -=  harm;
		
	}
	
}
