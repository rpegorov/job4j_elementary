package ru.job4j.condition;

/**
 * Программа "DummyBot"
 * @author rpegorov
 * @version 1
 * @since 23.05.2020
 */
public class DummyBot {
    public static void answer(String question) {

        // ответы бота
        String botHello = "Привет, умник.";
        String botBye = "До скорой встречи.";
        String botUnknown = "Это ставит меня в тупик. Задай другой вопрос.";

        // условия
        if ("Привет, Бот.".equals(question)) {  // если пришем "Привет, Бот.", то
            System.out.println(botHello);  // получаем ответ из строки botHello
        } else if ("Пока.".equals(question)) {  // если пишем "Пока."
            System.out.println(botBye);  // получаем ответ из строки botBye
        } else {  // если бот не знает данного вопроса
            System.out.println(botUnknown);
        }
    }

    public static void main(String[] args) {
        DummyBot.answer("Привет, Бот.");  // вопрос боту
    }

}


