package ru.job4j.array;

public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
//            for (int j = 0; j < pref.length - 1; j++) {
            if (word[i] != pref[i]) {
                result =  false;
                break;
            }
        }
        return result;
    }

}

