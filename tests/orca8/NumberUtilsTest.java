package orca8;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * exercise-junit
 */
public class NumberUtilsTest {
    @Test
    public void isEvenは10でtrueを返す() throws Exception {
        assertThat(NumberUtils.isEven(10), is(true));
    }

    @Test
    public void isEvenは7でfalseを返す() throws Exception {
        assertThat(NumberUtils.isEven(7), is(false));
    }
}
