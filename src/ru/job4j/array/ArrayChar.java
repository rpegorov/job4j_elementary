package ru.job4j.array;

public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref) {
        for (int i = 0; i < word.length - 1; i++) {
//            for (int j = 0; j < pref.length - 1; j++) {
            if (word[i] == pref[pref.length - 1]) {
                return true;
            }
        }
        return false;
    }

}

