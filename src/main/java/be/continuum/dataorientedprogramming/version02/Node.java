package be.continuum.dataorientedprogramming.version02;

sealed interface Node {
}
sealed interface BinaryNode extends Node {
    Node left();
    Node right();
}

record Add(Node left, Node right) implements BinaryNode { }
record Multiply(Node left, Node right) implements BinaryNode { }
record Exponential(Node left) implements Node { }
record Negate(Node node) implements Node { }
record Value(double val) implements Node { }

