package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        if (post.length > word.length) {
            return false;
        }
        for (int i = 1; post.length - i >= 0; i++) {
            if (post[post.length - i] != word[word.length - i]) {
                return false;

            }
        }
        return true;
    }

}
