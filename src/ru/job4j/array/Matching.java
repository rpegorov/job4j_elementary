package ru.job4j.array;

/**
 * сравнение двух массивов и вывод одинаковых значений
 */

public class Matching {
    public static void main(String[] args) {
        int[] left = new int[] {1, 2, 3, 5, 6};
        int[] right = new int[] {3, 1, 4, 7, 6};
        for (int tmp : left) {
            for (int i : right) {
                if (tmp == i) {
                    System.out.print(tmp);
                }
            }
        }
    }
}
