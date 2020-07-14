package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = post.length; i >= 1; i--) {
            if (post[post.length - i] != word[word.length - i]) {
                return false;

            }
        }
        return result;
    }
}
