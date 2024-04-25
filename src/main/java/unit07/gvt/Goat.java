package unit07.gvt;

public abstract class Goat {
    private final String name;
    private int currentHP;
    private int maxHP;

    public Goat(String name, int maxHP) {
        this.name = name;
        this.currentHP = maxHP;
        this.maxHP = maxHP;
    }

    public boolean isConscious() {
        return this.currentHP > 0;
    }

    public void heal(int amount) {
        this.currentHP += amount;
        if(this.currentHP > this.maxHP) {
            this.currentHP = this.maxHP;
        }
        //this.currentHP = (currentHP > maxHP) ? maxHP : currentHP; same as if statement
    }

    public abstract Attack attack();

    public abstract void takeDamage(Attack attack);

    public String getName() {
        return name;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    protected void adjustCurrentHP(int amount) { //accessible to all child classes, in the package or not
        currentHP -= amount;
        currentHP = currentHP < 0 ? 0 : currentHP;
    }
}
