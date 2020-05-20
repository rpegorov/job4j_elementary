package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

/**
 * Тестирование класса SqArea
 * @author rpegorov
 * @since 20.05.2020
 */
public class SqAreaTest {

    @Test
    public void square() {
        int p = 6;
        int k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);

    }
}