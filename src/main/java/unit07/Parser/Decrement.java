package unit07.Parser;

public class Decrement implements Expression {
    private final Expression operand;

    public Decrement(Expression operand) {
        this.operand = operand;
    }

    @Override
    public double evaluate() {
        return operand.evaluate() - 1.0d;
    }

    @Override
    public String toString() {
        return "-- " + operand;
    }

    public static void main(String[] args) {
        Expression exp = new Decrement(new Decrement(new Constant(5.5)));
        System.out.println(exp);
        System.out.println(exp.evaluate());
    }
}
