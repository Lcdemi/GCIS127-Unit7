package unit07.Parser;

public class Constant implements Expression {
    private final double constantValue;

    public Constant(double constantValue) {
        this.constantValue = constantValue;
    }

    @Override
    public double evaluate() {
        return constantValue;
    }

    @Override
    public String toString() {
        return Double.toString(constantValue);
    }

    public static void main(String[] args) {
        Constant constant = new Constant(10.0);
        System.out.println(constant.evaluate());
    }
}
