package atividade.personagens;

import atividade.weapons.WeaponBehavior;

public class King extends Character {

	public King(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}
	public String fight(WeaponBehavior weapon) {
		return weapon.useWeapon();
	}

}
