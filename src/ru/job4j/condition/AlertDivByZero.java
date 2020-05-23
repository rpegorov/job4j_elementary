package ru.job4j.condition;

import javax.swing.*;

/**
 * Операции сравнения. Уведомление при делении на 0 или < 0.
 * @author rpegorov
 * @version 1
 * @since 21.05.2020
 */
public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(-1);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {  // если равно 0
            System.out.println("Could not div by 0.");  // ввывод данного сообщения

        } else if (number <= 0) {  // если меньше 0
            System.out.println("This is negative numbers.");  // вывод данного сообщения
        }
    }
}





