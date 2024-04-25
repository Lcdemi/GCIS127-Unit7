package unit07.products;

public class Truck {
    private int capacity;
    private Product[] products;
    private int numProducts;

    public Truck(int capacity) {
        this.capacity = capacity;
        this.products = new Product[capacity];
        numProducts = 0;
    }

    public void load(Product products) {
        if(numProducts < capacity) {
            this.products[numProducts] = products;
            numProducts++;
        } else {
            System.out.println("The truck is full");
        }
    }

    public void unload() {
        if(numProducts > 0) {
            numProducts--;
            this.products[numProducts] = null;
        } else {
            System.out.println("The truck is empty");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getNumProducts() {
        return numProducts;
    }

    public Product getLastProduct() { //returns last product unloaded from truck
        if(numProducts > 0 && numProducts <= capacity) {
            return products[numProducts-1];
        } else {
            return null;
        }
    }
}
