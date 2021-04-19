package ru.job4j.io;

import java.util.Scanner;

/**
 * Игра 11.
 * @author rpegorov
 * @since 06.10.2020
 */
public class Matches {
    /** метод определения победителя */
    private static String winner() {
        String winner = new String();
        for (int i = 0; i < 11; i++) {
            int j = i++;
            if (j % 2 == 0) {
                winner = "Выиграл Игрок 1.";
            } else
                winner = "Выиграл игрок 2.";
        }
        System.out.println(winner);
        return winner;
    }
    /** метод вывода приветствия */
    private void hello() {
        System.out.println("Игра 11. " +
                "Смысл игры в следующем. На столе лежат 11 спичек. " + "\n" +
                "Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, " + "\n" +
                "кто забрал последние спички.");
    }
    /** основная логика игры */
    public void game(Scanner input) {
        boolean run = true;
        hello();
        int matches = 11;
        System.out.println("Игра началась. Сделайте ход.");
        while (run) {
            int select = Integer.valueOf(input.nextLine());
            if (matches == 0) {
                System.out.println("Игра завершена.");
                winner();
                run = false;
            }
            if (select < 1 || select > 3) {
                System.out.println("Недопустимый ход. Укажите значение от 1 до 3... ");
            } else if (select <= 3) {
            matches = matches - select;
            System.out.println("Игрок убрал " + select +
                    " спички." + "На столе осталось: " + matches);
        }
    }
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        new Matches().game(input);
    }
}