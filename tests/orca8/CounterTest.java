package orca8;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * exercise-junit
 */
@RunWith(Enclosed.class)
public class CounterTest {

    public static class 初期状態の場合 {
        Counter sut;

        @Before
        public void setUp() throws Exception {
            sut = new Counter();
        }

        @Test
        public void incrementで1が取得できる() throws Exception {
            assertThat(sut.increment(), is(1));
        }
    }

    public static class incrementが1回実行された場合 {
        Counter sut;

        @Before
        public void setUp() throws Exception {
            sut = new Counter();
            sut.increment();
        }

        @Test
        public void incrementで2が取得できる() throws Exception {
            assertThat(sut.increment(), is(2));
        }
    }

    public static class incrementが30回実行された場合 {
        Counter sut;

        @Before
        public void setUp() throws Exception {
            sut = new Counter();
            for (int i = 0; i < 30; i++) {
                sut.increment();
            }
        }

        @Test
        public void incrementで31が取得できる() throws Exception {
            assertThat(sut.increment(), is(31));
        }
    }
}
