package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (char c : word) {
            if (c == post[post.length - 1]) {
                return true;
            }
        }
        return false;
    }

}
