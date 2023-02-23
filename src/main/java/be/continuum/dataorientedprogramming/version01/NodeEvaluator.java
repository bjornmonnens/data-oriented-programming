package be.continuum.dataorientedprogramming.version01;

public class NodeEvaluator {
    public double calculate(NodeOperations n) {
        return switch (n) {
            case Add(var left, var right) -> left.value() + right.value();
            case Multiply(var left, var right) -> left.value() * right.value();
            case Negate(var node) -> node.value() * -1;
            case Exponential(var node) -> Math.exp(node.value());
        };
    }

    public String print(NodeOperations n) {
        return switch (n) {
            case Add(var left, var right) -> left.value() + " + " + right.value();
            case Multiply(var left, var right) -> left.value() + " * " + right.value();
            case Negate(var node) -> node.value() + " * -1";
            case Exponential(var node) -> "Math.exp(" + node.value() + ")";
        };
    }
}
