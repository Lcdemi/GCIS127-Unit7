package unit07.products;
import java.util.Random;

public class Complex {
    private Factory[] factoryList;

    public Complex(Factory[] factoryList) {
        this.factoryList = factoryList;
    }

    public void loadTruck(Truck trucks) {
        Random RNG = new Random();
        Factory randomFactory = factoryList[RNG.nextInt(factoryList.length)];
        trucks.load(randomFactory.manufacture());
    }

    public Factory[] getFactoryList() {
        return factoryList;
    }
}
