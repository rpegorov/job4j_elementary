package ru.job4j.array;

/**
 * Метод сортировки масива по возрастанию (Selection sort)
 * @author rpegorov
 * @since 05.07.2020
 */

public class AgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
//        int temp = array[0];  // переменная для временного хранения значение ячейки с индексом 0
//        array[0] = array[3];  // записываем в ячейку с индексом 0 значение ячейки с индексом 3
//        array[3] = temp;  // записываем в ячейку с индексом 3 значение временной переменной
        for (int i = 0; i < array.length; i++) {
            /* предполагаем, что первый элемент является минимальным */
            int min = array[i];
            int minI = i;
            /* ищем элемент, который меньше предположенного минимума */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minI = j;
                }
            }
            /* если нашелся меньший элемент, меняем их местами */
            if (i != minI) {
                int temp = array[i];
                array[i] = array[minI];
                array[minI] = temp;
            }
        }

        for (int value : array) {
            System.out.println(value);
        }
    }
}
