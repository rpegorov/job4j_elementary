package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void answer() {
        assertThat(
                DummyBot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
        assertThat(
                DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );
        assertThat(
                DummyBot.answer("qwewq"),
                is("Это ставит меня в тупик. Задай другой вопрос.")
        );
    }
}

