package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String voice = "Неизвестное слово " + eng;
        return voice;
    }

    public static void main(String[] args) {
        DummyDic pipi = new DummyDic();
        String say = pipi.engToRus("kity");
        System.out.println(say);
    }
}
