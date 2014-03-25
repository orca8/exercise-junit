package orca8;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * exercise-junit
 */
public class FizzBuzzTest {

    @Test
    public void createFizzBuzzListで16まで取得できる() throws Exception {
        List<String> actual = FizzBuzz.createFizzBuzzList(16);
        assertThat(actual.size(), is(16));
    }
}
