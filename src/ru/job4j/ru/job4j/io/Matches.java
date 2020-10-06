package ru.job4j.ru.job4j.io;

import java.util.Scanner;

/**
 * Игра 11.
 * @author rpegorov
 * @since 06.10.2020
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11. " +
                "Смысл игры в следующем. На столе лежат 11 спичек. " + "\n" +
                "Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, " + "\n" +
                "кто забрал последние спички.");
        System.out.println();
        System.out.println();
        boolean run = true;
        int matches = 11;
        int gamer = 0;
        while (run) {
            System.out.println("Игрок делает ход.");
            int select = Integer.valueOf(input.nextLine());
            if (matches == 0) {
                System.out.println("Игра завершена.");
                run = false;
                if (gamer % 2 == 0) {
                    System.out.println("Выиграл Игрок 1.");
                } else
                    System.out.println("Выиграл игрок 2.");

            } else if (select == 1) {
                matches = matches - select;
                System.out.println("Игрок убрал " + select +
                        " спички." + "На столе осталось: " + matches);
                System.out.println("Ход переходит к следуюшему игроку." + "\n" +
                        "Какое количество спичек желаете убрать - ");
            } else if (select == 2) {
                matches = matches - select;
                System.out.println("Игрок убрал " + select +
                        " спички." + "На столе осталось: " + matches + " спичек.");
                System.out.println("Ход переходит к следуюшему игроку." + "\n" +
                        "Какое количество спичек желаете убрать - ");
            } else if (select == 3) {
                matches = matches - select;
                System.out.println("Игрок убрал " + select +
                        " спички." + "На столе осталось: " + matches + " спичек.");
                System.out.println("Ход переходит к следуюшему игроку." + "\n" +
                        "Какое количество спичек желаете убрать - ");
            } else if (select == 0) {
                System.out.println("Недопустимый ход, укажите значение от 1 до 3." + "\n" +
                        "Какое количество спичек желаете убрать - ");
            } else if (select > 3) {
                System.out.println("Недопустимый ход, укажите значение от 1 до 3." + "\n" +
                        "Какое количество спичек желаете убрать - ");
            }
            gamer++;
        }
    }
}
