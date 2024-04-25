package unit07.gvt;

import java.util.Arrays;

/**
 * An attack in a game of Goats vs. Trolls.
 * 
 * @author Luke
 */

public class Attack {
    private final String name;
    private final DamageType type;
    private final int[] hits;

    public Attack(String name, DamageType type, int[] hits) {
        this.name = name;
        this.hits = hits;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int[] getHits() {
        return hits;
    }

    public DamageType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " hits for " + Arrays.toString(hits) + " of " + type + " damage.";
    }
}
