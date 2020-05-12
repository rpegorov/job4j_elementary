package ru.job4j.condition;

/**
 * Растояние между точками в системе координат
 * @author rpegorov
 * @version 1
 * @since 11.05.2020
 */

public class Point {

    /**
     * x1, x2 и тд -  наши координаты в системе
     * Math.pow - возведение в степень (Math.pow(int x, 2) -возведение числа икс в степень 2
     * Math.sqrt - квадратыный корень из числа
     * return берет результат из double distance и достает из него квадратный корень
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double distance = Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2);
        return Math.sqrt(distance);

    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0); // наши значения int

        System.out.println("result (0, 0) to (2, 0) = " + result); // вывод в консоль
    }

}