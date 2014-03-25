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
        assertThat(actual.get(0), is("1"));
        assertThat(actual.get(2), is("Fizz"));
        assertThat(actual.get(5), is("Fizz"));
        assertThat(actual.get(8), is("Fizz"));
        assertThat(actual.get(11), is("Fizz"));
    }
}
