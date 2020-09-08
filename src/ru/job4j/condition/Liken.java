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
        boolean result1 = first > second;
        boolean result2 = first < second;
        boolean result3 = first == second;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
