package ru.job4j.calculator;

/**
 * Калькулятор идеального веса
 * @author rpegorov
 * @version 1
 * @since 09.05.2020
 */

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;

    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;

    }

    public static void main(String[] args) {
        double man = Fit.manWeight(181);
        double woman = Fit.womanWeight(163);
        System.out.println("Идеальный вес для мужчины ростом 181 см составляет " + man + " кг");
        System.out.println("Идеальный вес для женщины ростом 163 см составляет " + woman + " кг");

    }

}
