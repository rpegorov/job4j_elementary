package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student pety = new Student();
        pety.music();
        pety.music();
        pety.music();
        System.out.println();
        pety.song();
        pety.song();
        pety.song();
    }
}
