package unit07.Parser;

public class Subtraction implements Expression {
    private final Expression operand1;
    private final Expression operand2;

    public Subtraction(Expression operand1, Expression operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public double evaluate() {
        return operand1.evaluate() - operand2.evaluate();
    }

    @Override
    public String toString() {
        return "- " + operand1 + " " + operand2;
    }

    public static void main(String[] args) {
        Expression exp = new Subtraction(new Increment(new Constant(10.0)), new Constant(6.3));
        System.out.println(exp);
        System.out.println(exp.evaluate());

    }
}
