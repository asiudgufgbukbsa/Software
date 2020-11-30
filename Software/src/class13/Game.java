package class13;

import java.util.ArrayList;
import java.util.List;

public class Game
{

	public static void main(String[] args)
	{

		List<Monster> monsters = new ArrayList<Monster>();
		monsters.add(new Cyclops("独眼巨人刘文康", 100, 1, 10, "狼牙棒"));
		monsters.add(new Cyclops("独眼巨人林新明", 120, 5, 20, "钉锤"));
		monsters.add(new Dryad("树怪陈冠羽", 200, 2, 10, 18));
		monsters.add(new Hero("圣骑士王老师", 100000, 199, 10000, "圣光"));
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
				System.out.println(enemyMonster.name + "被打死了。。。");
				monsters.remove(enemyMonster);
			}
			index = (index + 1) % monsters.size();
		}
		System.out.println("******************************************");
		System.out.println("胜利者是:");
		monsters.get(0).showInfo();

	}

}
