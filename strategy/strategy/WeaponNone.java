package strategy;

import java.util.Random;

public class WeaponNone implements WeaponBehavior {
    public String attack() {
        Random RNG = new Random();
        String Attack;

        if (RNG.nextInt(0, 1) == 0) {
            Attack = "Oh No! I lost my weapon";
        } else {
            Attack = "No one let's me have a weapon";
        }

        return Attack;
    }
}
