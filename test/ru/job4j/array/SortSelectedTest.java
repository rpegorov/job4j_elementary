package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void sort4() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]  {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void sort5() {
        int[] input = new int[] {3, 4, 1, 2, 5, 6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]  {1, 2, 3, 4, 5, 6};
        assertThat(result, is(expect));
    }
}