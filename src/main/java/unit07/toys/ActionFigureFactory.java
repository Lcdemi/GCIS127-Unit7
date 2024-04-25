package unit07.toys;

import java.util.Random;
import unit07.products.*;

public class ActionFigureFactory implements Factory {

    @Override
    public Product manufacture() {
        Random RNG = new Random();
        String[] hairColor = {"Green", "Brown", "Blonde", "Red", "Black"};
        String[] eyeColor = {"Blue", "Black", "Brown", "Green", "Red"};
        String randomHairColor = hairColor[RNG.nextInt(hairColor.length)];
        String randomEyeColor = eyeColor[RNG.nextInt(eyeColor.length)];
        double randomMSRP = RNG.nextInt(5, 15) + 0.99;
        boolean randomKungFuGrip = RNG.nextBoolean();
        String[] sayings = {"Let's do this!", "Teamup Time!", "Destroy Evil!", "Let's Fight!", "I believe in us."};

        return new ActionFigure(randomMSRP, randomHairColor, randomEyeColor, sayings, randomKungFuGrip);
    }
    
}
