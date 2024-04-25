package unit07.gvt;

public class GoatArena {
    public static void battle(Goat goat1, Goat goat2) {
        System.out.println(goat1 + " enters the arena...");
        System.out.println(goat2 + " enters the arena...");
        int round = 1;

        while(goat1.isConscious() && goat2.isConscious()) {
            System.out.println("ROUND " + round + "! FIGHT!");
            round++;

            Attack Attack1 = goat1.attack();
            goat2.takeDamage(Attack1);
            System.out.println(Attack1);

            Attack Attack2 = goat2.attack();
            goat1.takeDamage(Attack2);
            System.out.println(Attack2);

            System.out.println(goat1);
            System.out.println(goat2);
        }

        if(goat1.isConscious()) {
            System.out.println(goat1 + " is the winner!");
        } else if(goat2.isConscious()) {
            System.out.println(goat2 + " is the winner!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    public static void main(String[] args) {
        Mage goat1 = new Mage("Hairy Potter");
        Fighter goat2 = new Fighter("Goatnan");
        battle(goat1, goat2);

        goat1.heal(100);
        Mage goat3 = new Mage("Goatdalf");
        battle(goat1, goat3);

        goat2.heal(150);
        Fighter goat4 = new Fighter("Jackie Goat");
        battle(goat2, goat4);

        goat2.heal(150);
        Goat goat5 = new Thief("Goatku");
        battle(goat2, goat5); 
    }
}

//polymorphism: code written to use in a class can be used (inherited) by the children
    //what appears to be one method at compile time may be another method at run time
