package ru.job4j.condition;

/**
 * Программа "DummyBot"
 * @author rpegorov
 * @version 1
 * @since 23.05.2020
 */
public class DummyBot {
    public static String answer(String question) {
        String botHello = "Привет, умник.";
        String botBye = "До скорой встречи.";
        String botUnknown = "Это ставит меня в тупик. Задай другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            return botHello;
        } else if ("Пока.".equals(question)) {
            return botBye;
        } else {
            return botUnknown;
        }
    }

    public static void main(String[] args) {
        String qst = DummyBot.answer("Привет, Бот.");
        System.out.println(qst);
    }

}


