package unit07.toys;

import java.util.Random;
import unit07.products.*;

public class RobotFactory implements Factory {
    
    @Override
    public Product manufacture() {
        Random RNG = new Random();
        String[] SoundList = {"WeeWoo", "Boop", "ZAP", "WOOOOOWWW", "Meesa Hungry", "*Exploding Sounds"};
        String randomSound = SoundList[RNG.nextInt(SoundList.length)];
        double randomMSRP = RNG.nextInt(30, 100) + 0.99;
        return new Robot(randomMSRP, randomSound);
    }
}
