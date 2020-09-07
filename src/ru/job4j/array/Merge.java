package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (firstIndex >= left.length) {
                rsl[i] = right[secondIndex];
                secondIndex++;
            } else if (secondIndex >= right.length) {
                rsl[i] = left[firstIndex];
                firstIndex++;
            } else if (left[firstIndex] < right[secondIndex]) {
                rsl[i] = left[firstIndex];
                firstIndex++;
            } else {
                rsl[i] = right[secondIndex];
                secondIndex++;
            }
        }
        return rsl;
    }
}
//        int tmp = 0;
//        for (int i = 0; i < left.length; i++) {
//            rsl[i] = left[i];
//            tmp++;
//        }
//        for (int j = 0; j < right.length; j++) {
//            rsl[tmp++] = right[j];
//        }
//        return rsl;
//    }
//}

