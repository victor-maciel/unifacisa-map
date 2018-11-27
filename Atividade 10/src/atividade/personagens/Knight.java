package atividade.personagens;

import atividade.weapons.WeaponBehavior;

public class Knight extends Character{

	public Knight(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}
	public String fight(WeaponBehavior weapon) {
		return weapon.useWeapon();
	}

}
