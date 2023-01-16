package strategy;

public class Troll extends Character {
	public Troll(String name) {
		super(name);

		super.setWeaponBehavior(new WeaponAxe());
	}

	public String toString() {
		return super.name + " is a funny troll";
	}
}