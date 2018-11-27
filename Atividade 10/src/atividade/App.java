package atividade;

import atividade.personagens.Troll;
import atividade.weapons.Weapon;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atividade.personagens.Character character = null;
		Troll troll = new Troll(character);
		System.out.println(troll.fight(Weapon.AxeBehavior));
		

	}

}
