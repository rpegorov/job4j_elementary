package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenTrue() {
        boolean[] input = new boolean[] {false, false, true};
        boolean rsl = Check.mono(input);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenFalse() {
        boolean[] input = new boolean[] {true, true, true};
        boolean rsl = Check.mono(input);
        assertThat(rsl, is(true));
    }
}