package ru.job4j.condition;

/**
 * Нахождение площади прямоугольника
 * @author rpegorov
 * @version 1
 * @since 12.05.2020
 */
public class SqArea {
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        int s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
