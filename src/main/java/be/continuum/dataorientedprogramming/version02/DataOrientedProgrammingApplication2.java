package be.continuum.dataorientedprogramming.version02;

public class DataOrientedProgrammingApplication2 {

    public static void main(String[] args) {
        Add add = new Add(new Value(10), new Value(20));
        prettyPrint(add);

        Multiply multiple = new Multiply(new Value(10), new Value(20));
        prettyPrint(multiple);

        Negate negate = new Negate(new Value(10));
        prettyPrint(negate);

        Exponential exponential = new Exponential(new Value(10));
        prettyPrint(exponential);
    }

    public static void prettyPrint(Node n) {
        NodeEvaluator evaluator = new NodeEvaluator();
        System.out.println(evaluator.print(n) + " = " + evaluator.calculate(n));
    }

}
