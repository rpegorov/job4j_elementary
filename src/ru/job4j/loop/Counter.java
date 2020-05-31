package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int j = start; j <= finish; j++) {
            if (j % 2 == 0) {  // проверка на уловие, что j делится на 2 без остатка
                sum = sum + j;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(15, 155));
        System.out.println(sumByEven(1, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}

