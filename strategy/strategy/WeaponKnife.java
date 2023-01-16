package strategy;

import java.util.Random;

public class WeaponKnife implements WeaponBehavior {
    public String attack() {
        Random RNG = new Random();
        String Attack;
        int Result = RNG.nextInt(0, 2);

        if (Result == 0) {
            Attack = "Slice with a knife";
        } else if (Result == 1) {
            Attack = "Jab with a knife";
        } else {
            Attack = "Sneak up on opponent with knife";
        }

        return Attack;
    }
}
