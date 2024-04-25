package unit07.toys;

import java.util.Arrays;
import java.util.Random;

public class ActionFigure extends Toy {
    private final String hairColor;
    private final String eyeColor;
    private final String[] sayings;
    private int timesUsed;
    private boolean kungFuGrip;

    public ActionFigure(double msrp, String hairColor, String eyeColor, String[] sayings, boolean kungFuGrip) {
        super("Action Figure", msrp);
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.sayings = sayings;
        this.kungFuGrip = kungFuGrip;
        this.timesUsed = 0;
    }

    @Override
    public void play() {
        if(getTimesUsed() < 10) {
            Random RNG = new Random();
            int randomNum = RNG.nextInt(0, sayings.length);
            System.out.println(sayings[randomNum]);
            this.timesUsed++;
            if(isKungFuGrip()) {
                System.out.println("Action Figure brandishes a sword.");
            }
        } else {
            System.out.println("The Action Figure has broke.");
        }
    }

    @Override
    public String toString() {
        String kungFuString = "";
        if(isKungFuGrip()) {
            kungFuString = "has Kung-Fu Grip";
        } else {
            kungFuString = "does not have Kung-Fu Grip";
        }
        return "An Action Figure with the product code " + getProductCode() + ", the name " + getName() 
        + ", and a price of $" + getMsrp() + " has " + getHairColor() + " hair, " + getEyeColor()
        + " eyes, " + kungFuString + ", and a list of sayings: " + getSayings();
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

    public boolean isKungFuGrip() {
        return kungFuGrip;
    }
}
