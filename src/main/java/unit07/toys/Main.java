package unit07.toys;

import unit07.products.*;

//each toyFactory (RobotFactory, ActionFigureFactory) return products, including Robots and Action Figures
//if we created a new type of product, it could still be loaded/unloaded on a truck because they are all treated as products (as long as it extends product)
//we can create different types of objects and use them in a non-complicated way because they are all types of products
public class Main {
    public static void main(String[] args) {
        Factory[] factories = new Factory[2];
        factories[0] = new RobotFactory();
        factories[1] = new ActionFigureFactory();
        Complex newComplex = new Complex(factories);

        Truck emptyTruck = new Truck(5);
        for(int i = 0; i < emptyTruck.getCapacity(); i++) {
            newComplex.loadTruck(emptyTruck);
            System.out.println("unloaded");
        }

        for(int i = 0; i < emptyTruck.getCapacity(); i++) {
            Product UnloadedProduct = emptyTruck.getLastProduct();
            if(UnloadedProduct != null) {
                System.out.println(UnloadedProduct);
            }
            emptyTruck.unload();
        }
    }
}
