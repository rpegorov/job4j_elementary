package ru.job4j.condition;

/**
 * Операции сравнения
 * @author rpegorov
 * @version 1
 * @since 20.05.2020
 */
public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        boolean result1 = first > second;  // first больше second?
        boolean result2 = first < second;  // first меньше second?
        boolean result3 = first == second;  // first равно second?

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

//        result = // first меньше second?
//                System.out.println(result);
//
//        result = // first равна second?
//                System.out.println(result);
    }
}
