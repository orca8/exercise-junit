package orca8;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * exercise-junit
 */
public class StringUtilsTest {

    @Test
    public void toSnakeCaseはスネークケースを返す_aaaの場合() {
        assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
    }

    @Test
    public void toSnakeCaseはスネークケースを返す_HelloWorldの場合() {
        assertThat(StringUtils.toSnakeCase("HelloWorld"), is("hello_world"));
    }

    @Test
    public void toSnakeCaseはスネークケースを返す_practiceJunitの場合() {
        assertThat(StringUtils.toSnakeCase("practiceJunit"), is("practice_junit"));
    }

}
