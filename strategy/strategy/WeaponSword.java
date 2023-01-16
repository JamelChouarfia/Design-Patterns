package strategy;

import java.util.Random;

public class WeaponSword implements WeaponBehavior {
    public String attack() {
        Random RNG = new Random();
        String Attack;
        int Result = RNG.nextInt(0, 2);

        if (Result == 0) {
            Attack = "Lunge and strike with sword";
        } else if (Result == 1) {
            Attack = "Fancy turn and slice with sword";
        } else {
            Attack = "Jam opponents blade with sword";
        }

        return Attack;
    }
}
