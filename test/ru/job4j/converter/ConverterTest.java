package ru.job4j.converter;

// в данном коде будем использовать код из файлов Assert & Test
import org.junit.Assert;
import org.junit.Test;

/**
 * Тестирование класса Converter
 * @author rpegorov
 * @since 16.05.2020
 */
public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;  // вводные данные (сколько рублей)
        int expected = 2;  // ожидаемый результат
        int out = Converter.rubleToEuro(in);  // рузультат работы программы

        // Assert.assertEquals - метод сранивает параметры expected и out
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert200RblThen3Dlr() {
        int in = 200;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}