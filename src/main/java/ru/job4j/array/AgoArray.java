package ru.job4j.array;

/**
 * Метод сортировки масива по возрастанию (Selection sort)
 * @author rpegorov
 * @since 06.07.2020
 */
public class AgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        for (int i = 0; i < array.length; i++) {
            /** предполагаем, что первый элемент является минимальным */
            int min = array[i];
            int minI = i;
            /** ищем элемент, который меньше предположенного минимума */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minI = j;
                }
            }
            /** если нашелся меньший элемент, меняем их местами */
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
