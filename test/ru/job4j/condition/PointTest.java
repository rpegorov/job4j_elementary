package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

/**
 * Тестирование класса Point
 * @author rpegorov
 * @since 20.05.2020
 */
public class PointTest {

    @Test
    public void distance() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, x2, y1, y2);

        Assert.assertEquals(out, expected, 0.01);

    }
}