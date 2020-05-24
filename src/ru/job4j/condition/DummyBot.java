package ru.job4j.condition;

/**
 * Программа "DummyBot"
 * @author rpegorov
 * @version 1
 * @since 23.05.2020
 */
public class DummyBot {
    public static String answer(String question) {

        // ответы бота
        String botHello = "Привет, умник.";
        String botBye = "До скорой встречи.";
        String botUnknown = "Это ставит меня в тупик. Задай другой вопрос.";

        // условия
        if ("Привет, Бот.".equals(question)) {  // если пришем "Привет, Бот.", то
            return botHello;  // получаем ответ из строки botHello
        } else if ("Пока.".equals(question)) {  // если пишем "Пока."
            return botBye;  // получаем ответ из строки botBye
        } else {  // если бот не знает данного вопроса
            return botUnknown;
        }
    }

    public static void main(String[] args) {
        String qst = DummyBot.answer("Привет, Бот."); // вопрос боту
        System.out.println(qst);
    }

}


