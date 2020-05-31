package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void sumByEven() {
        int rst = Counter.sumByEven(0, 10);
        int expected = 30;
        assertThat(rst, is(expected));
    }

    @Test
    public void sumByEven2() {
        int rst = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rst, is(expected));
    }

    @Test
    public void sumByEven3() {
        int rst = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rst, is(expected));
    }
}