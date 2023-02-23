package be.continuum.dataorientedprogramming.version02;

public class NodeEvaluator {
    public double calculate(Node n) {
        return switch (n) {
            case Add(var left, var right) -> calculate(left) + calculate(right);
            case Multiply(var left, var right) -> calculate(left) * calculate(right);
            case Negate(var node) -> calculate(node) * -1;
            case Exponential(var node) -> Math.exp(calculate(node));
            case Value(double val) -> val;
        };
    }

    public String print(Node n) {
        return switch (n) {
            case Add(var left, var right) -> calculate(left) + " + " + calculate(right);
            case Multiply(var left, var right) -> calculate(left) + " * " + calculate(right);
            case Negate(var node) -> calculate(node) + " * -1";
            case Exponential(var node) -> "Math.exp(" + calculate(node) + ")";
            case Value(double val) -> "" + val;
        };
    }
}
