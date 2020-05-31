package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void calcFactorialFIve() {
        int result = Factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void calcFactorialZero() {
        int result = Factorial.calc(0);
        assertThat(result, is(1));
    }

    @Test
    public void calcFactorialSeven() {
        int result = Factorial.calc(7);
        assertThat(result, is(5040));
    }
}