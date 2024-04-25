package unit07.toys;
import java.util.Arrays;
import java.util.Random;

public class Doll extends Toy {
    private final String hairColor;
    private final String eyeColor;
    private final String[] sayings;
    private int timesUsed;

    public Doll(double msrp, String hairColor, String eyeColor, String[] sayings) {
        super("Doll", msrp);
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.sayings = sayings;
        this.timesUsed = 0;
    }

    @Override
    public void play() {
        if(getTimesUsed() < 10) {
            Random RNG = new Random();
            int randomNum = RNG.nextInt(0, sayings.length);
            System.out.println(sayings[randomNum]);
            this.timesUsed++;
        } else {
            System.out.println("The Doll has broke.");
        }
    }

    @Override
    public String toString() {
        return "A Doll with the product code " + getProductCode() + ", the name " + getName() 
        + ", and a price of $" + getMsrp() + " has " + getHairColor() + " hair, " + getEyeColor()
        + " eyes, and a list of sayings: " + getSayings();
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getSayings() {
        return Arrays.toString(sayings);
    }

    public int getTimesUsed() {
        return timesUsed;
    }
}
