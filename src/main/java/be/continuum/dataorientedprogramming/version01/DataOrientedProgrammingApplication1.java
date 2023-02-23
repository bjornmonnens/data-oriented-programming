package be.continuum.dataorientedprogramming.version01;

public class DataOrientedProgrammingApplication1 {

    public static void main(String[] args) {
        Add add = new Add(new Node(10), new Node(20));
        prettyPrint(add);

        Multiply multiple = new Multiply(new Node(10), new Node(20));
        prettyPrint(multiple);

        Negate negate = new Negate(new Node(10));
        prettyPrint(negate);

        Exponential exponential = new Exponential(new Node(10));
        prettyPrint(exponential);
    }

    public static void prettyPrint(NodeOperations n) {
        NodeEvaluator evaluator = new NodeEvaluator();
        System.out.println(evaluator.print(n) + " = " + evaluator.calculate(n));
    }

}
