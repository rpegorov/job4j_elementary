package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(
                        new int[] {0, 5, 10}
                      ),
                is(0)
        );
    }

    @Test
    public void whenSecondMin() {
        assertThat(
                Min.findMin(
                        new int[] {11, 5, 10}
                ),
                is(5)
        );
    }
}