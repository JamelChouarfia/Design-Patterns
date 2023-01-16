package strategy;

public class Knight extends Character {
	public Knight(String name) {
		super(name);

		super.setWeaponBehavior(new WeaponBow());
	}

	public String toString() {
		return super.name + " is a valiant knight";
	}
}