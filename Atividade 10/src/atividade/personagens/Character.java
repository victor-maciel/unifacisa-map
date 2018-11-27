package atividade.personagens;

import atividade.weapons.WeaponBehavior;

public class Character {
	
	private Character character;
	private WeaponBehavior weapon;
	
	
	public Character(Character character) {
		this.character = character;
	}


	public WeaponBehavior getWeapon() {
		return weapon;
	}


	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	public String fight(WeaponBehavior weapon) {
		return null;
	}
	

}
