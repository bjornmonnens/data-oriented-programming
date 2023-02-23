package be.continuum.dataorientedprogramming.version01;

public sealed interface NodeOperations {
}

record Add(Node left, Node right) implements NodeOperations {
}

record Multiply(Node left, Node right) implements NodeOperations {
}

record Exponential(Node node) implements NodeOperations {
}

record Negate(Node node) implements NodeOperations {
}
