package be.continuum.dataorientedprogramming.version02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NodeEvaluatorTest {

    NodeEvaluator evaluator = new NodeEvaluator();
    @Test
    public void testAdd(){
        Add add = new Add(new Value(1), new Value(2));
        double addResult = evaluator.calculate(add);

        assertThat(addResult).isEqualTo(3);
    }

    @Test
    public void testMultiply(){
        Multiply multiply = new Multiply(new Value(1), new Value(2));
        double multiplyResult = evaluator.calculate(multiply);

        assertThat(multiplyResult).isEqualTo(2);
    }

    @Test
    public void testExponential(){
        Exponential exponential = new Exponential(new Value(10));
        double exponentialResult = evaluator.calculate(exponential);

        assertThat(exponentialResult).isEqualTo(22026.465794806718);
    }

    @Test
    public void testNegate(){
        Negate negate = new Negate(new Value(10));
        double negateResult = evaluator.calculate(negate);

        assertThat(negateResult).isEqualTo(-10);
    }
}