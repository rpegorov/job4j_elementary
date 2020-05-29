package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void maxFirst() {
        MultiMax check = new MultiMax();
        int result = check.max(20, 10, 8);
        assertThat(result, is(20));
    }
    @Test
    public void maxSecond() {
        MultiMax check = new MultiMax();
        int result = check.max(9, 10, 8);
        assertThat(result, is(10));
    }
    @Test
    public void maxThird() {
        MultiMax check = new MultiMax();
        int result = check.max(9, 10, 15);
        assertThat(result, is(15));
    }
    @Test
    public void maxFirstSecond() {
        MultiMax check = new MultiMax();
        int result = check.max(20, 20, 8);
        assertThat(result, is(20));
    }
    @Test
    public void maxFirstThird() {
        MultiMax check = new MultiMax();
        int result = check.max(50, 10, 50);
        assertThat(result, is(50));
    }
    @Test
    public void maxSecondThird() {
        MultiMax check = new MultiMax();
        int result = check.max(9, 30, 30);
        assertThat(result, is(30));
    }
}