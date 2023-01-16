package strategy;

public class King extends Character {
	public King(String name) {
		super(name);

		super.setWeaponBehavior(new WeaponSword());
	}

	public String toString() {
		return super.name + " is a Noble King";
	}
}