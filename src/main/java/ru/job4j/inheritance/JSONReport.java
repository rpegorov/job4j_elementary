package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return  "{" + System.lineSeparator() +
                "Name: " + name + "," +
                System.lineSeparator() +
                "Body: " + body + System.lineSeparator() +
                "}"
                ;
    }
}
