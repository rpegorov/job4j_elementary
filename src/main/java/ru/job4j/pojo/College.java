package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rostislav Egorov");
        student.setGroup("Trainee");
        student.setDate("06.05.2020");

        System.out.println(
                "Student name: " + student.getName() + System.lineSeparator() +
                "Group: " + student.getGroup() + System.lineSeparator() +
                "Receipt date: " + student.getDate());

    }
}
