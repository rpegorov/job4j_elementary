package ru.job4j.loop;


public class BoardTest {
    public static void paintTest(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                System.out.print("X");  //печатаем X - width раз.
            }
            System.out.println();  //добавляем перевод на новую строку.
        }

    }

    public static void main(String[] args) {
        paintTest(3, 3);
        System.out.println();
        paintTest(4, 4);
    }
}
