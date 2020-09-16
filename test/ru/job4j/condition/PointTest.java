package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import java.nio.channels.Pipe;

/**
 * Тестирование класса Point
 * @author rpegorov
 * @since 20.05.2020
 */
public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(out, expected, 0.01);
    }
    @Test
    public void distane3d() {
        Point a = new Point(0, 0);
        Point z = new Point(2, 6, 8);
        double expected = 6.32;
        double out = a.distance(z);
        Assert.assertEquals(out, expected, 0.01);
    }
}