package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

/**
 * Тестирование класса Fit
 * @author rpegorov
 * @since 20.05.2020
 */
public class FitTest {

    @Test
    public void manWeight() {
        double in = 181;
        double expected = 93.14;
        double out = Fit.manWeight(in);

        // Для сравнения результатов с типом double необходимо использовать метод с тремя параметрами.
        // Число 0.01 используется для проверки того,
        // что результат теста будет в диапазоне [expected - 0.01, expected + 0.01].
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void womanWeight() {
        double in = 163;
        double expected = 60.94;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}