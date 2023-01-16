package strategy;

public abstract class Character implements WeaponBehavior{
	protected String name;
	protected WeaponBehavior weaponBehavior;

	public Character (String name) {
		this.name = name;
	}

	public String attack() {
		return weaponBehavior.attack();
	}

	public void setWeaponBehavior(WeaponBehavior wb) {
		this.weaponBehavior = wb;
	}

	public abstract String toString();
}