package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void max() {
        MultiMax check = new MultiMax();
        int result = check.max(9, 10, 8);
        assertThat(result, is(10));
    }
}