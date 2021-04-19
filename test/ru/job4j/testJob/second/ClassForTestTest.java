package ru.job4j.testJob.second;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import static org.junit.Assert.assertEquals;

@Listeners({Listener.class})
public class ClassForTestTest {

    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        assertEquals(1, 1);
    }
}

