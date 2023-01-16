package strategy;

public class Queen extends Character {
	public Queen(String name) {
		super(name);

		super.setWeaponBehavior(new WeaponKnife());
	}

	public String toString() {
		return super.name + " is a beautiful queen";
	}
}