package class13;
abstract class T1
{
	
}
public abstract class Monster
{
	String name;
	int hp, atk, def;
	public Monster(String name, int hp, int atk, int def)
	{
		super();
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	} 
	
	public void showInfo()
	{
		System.out.printf("�������ƣ� " + name + " Ѫ���� " + hp + " �������� " + atk + " �������� " + def );
	}
	
	public boolean isDead()
	{
		return hp <= 0;		
	}
	
	public abstract void attack(Monster enemy);
}
