package unit07.gvt;

public class Mage extends Goat {
    public static final int max_HP = 100;

    public Mage(String name) {
        super(name, max_HP);
    }

    @Override
    public Attack attack() {
        return new Attack("Magic Missiles", DamageType.MAGICAL, new int[] {9, 9, 9, 9});
    }

    @Override
    public void takeDamage(Attack attack) {
        double modifier = 1.0;
        if(attack.getType() == DamageType.PHYSICAL) {
            modifier = 1.25;
        } else if(attack.getType() == DamageType.MAGICAL) {
            modifier = 0.75;
        }

        for(int hit : attack.getHits()) {
            int modified = (int)(hit * modifier);
            adjustCurrentHP(modified);
        }
    }

    @Override
    public String toString() {
        return "A mage named " + getName() + " with " + getCurrentHP() + "/" + getMaxHP() + " hit points.";
    }

    public static void main(String[] args) {
        Mage mage1 = new Mage("Hairy Potter");
        Mage mage2 = new Mage("Goatdalf");

        System.out.println(mage1);
        System.out.println(mage2);

        Attack attack1 = mage1.attack();
        mage2.takeDamage(attack1);
        Attack attack2 = mage2.attack();
        mage1.takeDamage(attack2);

        System.out.println(mage1);
        System.out.println(mage2);
    }

}
