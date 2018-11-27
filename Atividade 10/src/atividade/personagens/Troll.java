package atividade.personagens;

import atividade.weapons.WeaponBehavior;

public class Troll extends Character {

	public Troll(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}
	public String fight(WeaponBehavior weapon) {
		return weapon.useWeapon();
	}
	

}
