package unit07.Parser;

public class Increment implements Expression {
    private final Expression operand;

    public Increment(Expression operand) {
        this.operand = operand;
    }

    @Override
    public double evaluate() {
        return operand.evaluate() + 1.0d;
    }

    @Override
    public String toString() {
        return "++ " + operand;
    }

    public static void main(String[] args) {
        Expression exp = new Increment(new Increment(new Constant(5.5)));
        System.out.println(exp);
        System.out.println(exp.evaluate());
    }
}
