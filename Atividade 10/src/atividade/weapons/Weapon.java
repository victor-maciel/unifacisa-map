package atividade.weapons;

public enum Weapon implements WeaponBehavior {
	
	KnifeBehavior {
		@Override
		public String useWeapon() {
			// TODO Auto-generated method stub
			return "usa faca";
		}
	},
	BowAndArrowBehavior {
		@Override
		public String useWeapon() {
			// TODO Auto-generated method stub
			return "usa arco";
		}
	},
	AxeBehavior {
		@Override
		public String useWeapon() {
			// TODO Auto-generated method stub
			return "usa marchado";
		}

	},
	SwordBehavior {
		@Override
		public String useWeapon() {
			// TODO Auto-generated method stub
			return "usa espada";
		}

	};

}
