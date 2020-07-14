package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMind(
                        new int[] {-1, 0, 5, 10},
                        1, 3
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMind(
                        new int[] {-1, 11, 5, 2},
                        1, 3
                ),
                is(2)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMind(
                        new int[] {14, 2, 5, 4},
                        1, 2
                ),
                is(2)
        );
    }
}