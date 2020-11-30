import java.util.ArrayList;
import java.util.List;

import class13.Cyclops;
import class13.Dryad;
import class13.Monster;

public class Game
{
	public static void main(String[] args)
	{
		List<Monster> monsters = new ArrayList<Monster>();
		monsters.add(new Dryad(" ˜π÷¡ıŒƒøµ", 100, 10, 5, 1.72));
		monsters.add(new Cyclops("∂¿—€æﬁ»À¡÷–¬√˜", 200, 8, 6, "¿«—¿∞Ù"));
		monsters.add(new Cyclops("∂¿—€æﬁ»À¬¨“Ê ¢", 150, 9, 10, "–°»≠»≠"));
		for (Monster monster : monsters)
		{
			monster.showInfo();
		}
		System.out.println("**********************************");
		int index = 0;
		while(monsters.size() > 1)
		{
			Monster current = monsters.get(index);
			Monster enemy = monsters.get((index +1) % monsters.size() );
			current.attack(enemy);
			if(enemy.isDead())
			{
				System.out.println(enemy + "±ª¥ÚÀ¿¡À°£°£°£∫√≤“∞°°£°£");
				monsters.remove(enemy);
			}
			index = (index + 1) % monsters.size();
		}
	}
}
