package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int tmp = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            tmp++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[tmp++] = right[j];
        }
        return rsl;
    }
}

