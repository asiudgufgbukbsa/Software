package class13;

import java.util.ArrayList;
import java.util.List;

public class Game
{

	public static void main(String[] args)
	{

		List<Monster> monsters = new ArrayList<Monster>();
		monsters.add(new Cyclops("���۾������Ŀ�", 100, 1, 10, "������"));
		monsters.add(new Cyclops("���۾���������", 120, 5, 20, "����"));
		monsters.add(new Dryad("���ֳ¹���", 200, 2, 10, 18));
		monsters.add(new Hero("ʥ��ʿ����ʦ", 100000, 199, 10000, "ʥ��"));
		for (Monster monster : monsters)
		{
			monster.showInfo();
		}
		System.out.println("******************************************");
		int index = 0;
		while(monsters.size() >1)
		{
			Monster curMonster = monsters.get(index);
			Monster enemyMonster = monsters.get( (index + 1) % monsters.size() );
			curMonster.attack(enemyMonster);
			if(enemyMonster.isDead())
			{
				System.out.println(enemyMonster.name + "�������ˡ�����");
				monsters.remove(enemyMonster);
			}
			index = (index + 1) % monsters.size();
		}
		System.out.println("******************************************");
		System.out.println("ʤ������:");
		monsters.get(0).showInfo();

	}

}
