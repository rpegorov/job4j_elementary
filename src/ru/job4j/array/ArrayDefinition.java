package ru.job4j.array;

/*
Массивы

 */
public class ArrayDefinition {
    public static void main(String[] args) {
        // тип_данных[] имя_переменной = new тип_данных[количество_ячеек]

//        String[] names = new String[4];  // объявили и создали массив, выделили в памяти 4 ячейки
              String[] names = {"Sergey", "Rostislav", "Nikolay", "Viktor"}; // еще вариант написания

        // заполняем массив данными
//        names[0] = "Sergey";
//        names[1] = "Rostislav";
//        names[2] = "Nikolay";
//        names[3] = "Viktor";

        // вывод массива через цикл for
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);

        }
//        System.out.println(names[0]);  // первый вариант



    }
}
