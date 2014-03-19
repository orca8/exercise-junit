package orca8;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * exercise-junit
 */
public class CalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void divideの第2引数に0を指定すると例外が発生する() throws Exception {
        Calculator sut = new Calculator();
        sut.divide(3, 0);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void 例外の発生とメッセージを検証する() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("y is 0");
        Calculator sut = new Calculator();
        sut.divide(1, 0);
    }
}
