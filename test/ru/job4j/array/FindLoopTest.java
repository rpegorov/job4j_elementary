package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void indexOf() {
        int value = 5;
        int[] input = {1, 11, 3, 5, 14};
        int result = FindLoop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
}