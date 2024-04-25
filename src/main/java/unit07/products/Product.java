package unit07.products;

public class Product {
    private int productCode;
    private String name;
    private double msrp;
    private static int newProductCode = 1000000;

    public Product(String name, double msrp) {
        this.name = name;
        this.msrp = msrp;
        this.productCode = newProductCode++;
    }

    public int getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public double getMsrp() {
        return msrp;
    }

    @Override
    public String toString() {
        return "A product with the product code " + getProductCode() + ", the name " + getName() 
        + ", and a price of $" + getMsrp() + ".";
    }
}
