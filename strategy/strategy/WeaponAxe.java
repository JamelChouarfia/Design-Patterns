package strategy;

import java.util.Random;

public class WeaponAxe implements WeaponBehavior {
    public String attack() {
        Random RNG = new Random();
        String Attack;

        if (RNG.nextInt(0, 1) == 0) {
            Attack = "Swing an axe";
        } else {
            Attack = "Twirl with an axe";
        }

        return Attack;
    }
}
