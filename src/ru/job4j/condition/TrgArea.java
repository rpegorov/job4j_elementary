package ru.job4j.condition;

/**
 * Нахождение площади треугольника
 * @author rpegorov
 * @version 1
 * @since 12.05.2020
 *
 */

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        // return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
