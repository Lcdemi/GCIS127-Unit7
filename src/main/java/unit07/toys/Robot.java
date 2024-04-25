package unit07.toys;

public class Robot extends Toy {
    private final String sound;
    private int charge;

    public Robot(double msrp, String sound) {
        super("Robot", msrp);
        this.sound = sound;
        this.charge = 0;
    }

    public void charge() {
        this.charge = 100;
    }

    @Override
    public void play() {
        if(charge > 0) {
            System.out.println("The Robot walks and circles and plays a " + getSound() + " sound.");
            charge -= 20;
        } else {
            System.out.println("The Robot's charge is depleted, please recharge.");
        }
    }

    @Override
    public String toString() {
        return "A Robot with the product code " + getProductCode() + ", the name " + getName() 
        + ", and a price of $" + getMsrp() + " has " + getCharge() + "% charge left and makes a " 
        + getSound() + " sound.";
    }

    public String getSound() {
        return sound;
    }

    public int getCharge() {
        return charge;
    }
}
