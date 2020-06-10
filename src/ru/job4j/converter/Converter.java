package ru.job4j.converter;

/**
 * Class Converter для конвертации валюты
 * @author rpegorov
 * @since 10.06.2020
 * @version 1
 */
public class Converter {

    /**
     * Конвертация рубли в евро
     * @param value исходное кол-во валюты (рублей).
     * @return результат конвертации value по заданному курсу 70.
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Конвертация рубли в доллары
     * @param value исходное кол-во валюты (рублей).
     * @return результат конвертации value по заданному курсу 70.
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(200);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("200 rubles are " + dollar + " dollar.");

/*
Тестирование
 */
        int inRub1 = 140;  // вводные данные (сколько рублей)
        int expected1 = 2;  // ожидаемое значение (сколько получим евро)
        int out1 = rubleToEuro(inRub1);  // результат работы программы
        boolean passedEuro = expected1 == out1;  // результат сравнения переменных expected & out
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);

        int inRub2 = 200;
        int expected2 = 3;
        int out2 = rubleToDollar(inRub2);
        boolean passedDollar = expected2 == out2;
        System.out.println("200 rubles are 3 dollar. Test result : " + passedDollar);
    }
}
