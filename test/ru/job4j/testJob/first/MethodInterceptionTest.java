package ru.job4j.testJob.first;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MethodInterceptionTest {

    @Test
    public void annotationValue() {
        MainPage mainPage = MethodInterception.createPage(MainPage.class);
        assertNotNull(mainPage);
        assertEquals(".//*[@test-attr='button_search']", mainPage.buttonSearch());
        assertEquals(".//*[@test-attr='input_search']", mainPage.textInputSearch());
    }
}
