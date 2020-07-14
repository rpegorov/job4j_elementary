package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void indexOf() {
        int value = 14;
        int[] input = {1, 11, 3, 5, 14};
        int result = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void indexOfErr() {
        int value = 22;
        int[] input = {1, 11, 3, 5, 14};
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind2() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 1;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindError() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 11;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}