package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        // int index - задает начало отчет. index <= - конечное значение
        // при его превышении программа выдает значение false и цикл прерывается

        // index++ - отвечает за изменение переменной index (в данном случае) увеличивает
        // переменну на еденицу.

        // После прерывания цикла программа выполняет операторы после блока цикла.
        for (int index = 5; index <= 10; index++) {
            System.out.println(index);
        }
    }
}
