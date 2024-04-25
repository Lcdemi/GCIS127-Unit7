package unit07.gvt;

import java.util.Random;

public class Thief extends Goat {
    private static final int max_HP = 120;
    private static final Random RNG = new Random();
    private boolean stealthed;

    public Thief(String name) {
        super(name, max_HP);
        stealthed = false;
    }

    @Override
    public Attack attack() {
        stealthed = false;

        int number = RNG.nextInt(1, 4);
        int[] hits = new int[number];
        for(int i = 0; i < number; i++) {
            int amount = RNG.nextInt(10, 20);
            if(RNG.nextDouble() < 0.25) {
                amount *= 2;
            }
            hits[i] = amount;
        }

        return new Attack("Stabbity-Stab", DamageType.PHYSICAL, hits);
    }

    @Override
    public void takeDamage(Attack attack) {
        if(!stealthed) {
            double modifier = 1.0;
            if(attack.getType() == DamageType.POISON) {
                modifier = 0.75;
            }

            for(int hit : attack.getHits()) {
                int modified = (int)(hit * modifier);
                adjustCurrentHP(modified);
            }
        }
    }

    @Override
    public String toString() {
        return stealthed ? "A barely perceptible shadow" : "A rogue named " + getName() + " with " 
        + getCurrentHP() + "/" + getMaxHP() + " hit points.";
    }
}
