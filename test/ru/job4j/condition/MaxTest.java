package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMaxLeft() {
        int result = Max.max(15, 5);
        assertThat(result, is(15));
    }

    @Test
    public void whenMaxRight() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxEqually() {
        int result = Max.max(10, 10);
        assertThat(result, is(10));
    }
}