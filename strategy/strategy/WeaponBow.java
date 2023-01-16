package strategy;

import java.util.Random;

public class WeaponBow implements WeaponBehavior {
    public String attack() {
        Random RNG = new Random();
        String Attack;

        if (RNG.nextInt(0, 1) == 0) {
            Attack = "Draw and loose an arrow";
        } else {
            Attack = "Shoot arrow high in the sky";
        }

        return Attack;
    }
}
