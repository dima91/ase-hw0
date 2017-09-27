package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTestPrototype {
    CalculatorPrototype calculator= new CalculatorPrototype();

    @Test
    public void testSum0() {
        assertEquals(6, calculator.sum (3,3));
    }

    @Test
    public void testSum1() {
        assertEquals(0, calculator.sum(3,-3));
    }

    @Test
    public void testSub0() {
        assertEquals(0, calculator.subtract(3,3));
    }

    @Test
    public void testSub1() {
        assertEquals(6, calculator.subtract(3,-3));
    }

    @Test
    public void testSub2() {
        assertEquals(0, calculator.subtract(0,0));
    }

    @Test
    public void testMult0() {
        assertEquals(9, calculator.multiply(3,3));
    }

    @Test
    public void testMult1() {
        assertEquals(0, calculator.multiply(3,0));
    }

    @Test
    public void testMult2() {
        assertEquals(0, calculator.multiply(0,3));
    }

    @Test
    public void testDivisionEven() {
        assertEquals(2, calculator.divide(6,3));
    }

    @Test
    public void testDivisionOdd() {
        assertEquals(2, calculator.divide(7,3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        int sum = calculator.divide(3,0);
    }

    @Test
    public void testDiv0() {
        assertEquals(0, calculator.divide(0,3));
    }

    @Test
    public void testDiv1() {
        assertEquals(0, calculator.divide(3,7));
    }

    @Test
    public void testDiv2() {
        assertEquals(-2, calculator.divide(7,-3));
    }

    @Test
    public void testDiv3() {
        assertEquals(-2, calculator.divide(-7,3));
    }

}