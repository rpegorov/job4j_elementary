package ru.job4j.ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Магический шар.
 * @author rpegorov
 * @since 06.10.2020
 */
public class MagicBall {
    /** метод генирации ответов шара */
    public static String answerBall() {
        String ball;
        int answer = new Random().nextInt(3);
        if (answer == 0) {
           ball = "ДА";
        } else if (answer == 1) {
            ball = "НЕТ";
        } else {
            ball = "МОЖЕТ БЫТЬ";
        }
        return ball;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я велики Оракул. Что ты хочешь узнать?");
        String question = input.nextLine();
        System.out.println(answerBall());
    }
}