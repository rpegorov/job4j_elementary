package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        /* создаем объект класса freshmen */
        Freshman vasya = new Freshman();
        /* делаем приведение к типу родителя Student */
        Student fm = vasya;  // повышение по иерархии
        /* приведение к типу родителя Objet */
        Object obj = vasya;
        /* приведение типа при создании объекта */
        Object petya = new Freshman();
        Student fmFromObject = (Freshman) petya;  // приведение за счет понижения иерархии

        System.out.println(new Student());
        System.out.println(new Object());
        System.out.println(new Freshman());
    }
}
