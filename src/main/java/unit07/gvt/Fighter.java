package unit07.gvt;

public class Fighter extends Goat {
    public static final int max_HP = 150;

    public Fighter(String name) {
        super(name, max_HP);
    }

    @Override
    public Attack attack() {
        return new Attack("Cleave", DamageType.PHYSICAL, new int[] {25});
    }

    @Override
    public void takeDamage(Attack attack) {
        double modifier = 1.0;
        if(attack.getType() == DamageType.PHYSICAL) {
            modifier = 0.75;
        } else if(attack.getType() == DamageType.MAGICAL) {
            modifier = 1.25;
        }

        for(int hit : attack.getHits()) {
            int modified = (int)(hit * modifier);
            adjustCurrentHP(modified);
        }
    }

    @Override
    public String toString() {
        return "A fighter named " + getName() + " with " + getCurrentHP() + "/" + getMaxHP() + " hit points.";
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Goatnan");
        Fighter fighter2 = new Fighter("Mr. Fighter");

        System.out.println(fighter1);
        System.out.println(fighter2);

        Attack attack1 = fighter1.attack();
        fighter2.takeDamage(attack1);
        Attack attack2 = fighter2.attack();
        fighter1.takeDamage(attack2);

        System.out.println(fighter1);
        System.out.println(fighter2);
    }
}
