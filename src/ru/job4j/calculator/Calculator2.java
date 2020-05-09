package ru.job4j.calculator;

public class Calculator2 {
    public static void plus(int first, int second) { // арифметический метод
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) { // метод "значения"
       Calculator2.plus(500, 100);
       Calculator2.plus(4, 2);
       Calculator2.plus(3,5);
    }
    // приемущества данного способа, что мы можем задать один метод для арифметический действий и второй метод для значений,
    // таким образом сможем спокойно менять числа при этом не копируя код.
    // выоносим общую логику в отдельный метод не копируя ее каждый раз - общая логика в данном случае метод сложения и вывод в консоль

}