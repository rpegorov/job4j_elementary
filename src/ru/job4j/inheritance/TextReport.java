package ru.job4j.inheritance;

public class TextReport {
    @Override
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
