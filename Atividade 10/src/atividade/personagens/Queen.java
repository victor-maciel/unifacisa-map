package atividade.personagens;

import atividade.weapons.WeaponBehavior;

public class Queen extends Character{

	public Queen(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}
	public String fight(WeaponBehavior weapon) {
		return weapon.useWeapon();
	}

}
