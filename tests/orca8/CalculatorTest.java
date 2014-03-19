package orca8;

import org.junit.Test;

/**
 * exercise-junit
 */
public class CalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void divideの第2引数に0を指定すると例外が発生する() throws Exception {
        Calculator sut = new Calculator();
        sut.divide(3, 0);
    }

}
