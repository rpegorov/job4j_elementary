package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book("A", 10);
        books[1] = new Book("B", 20);
        books[2] = new Book("C", 30);
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book != null) {
                System.out.println(book.getName());
            }
        }
    }

    public static int indexOfNull(Book[] books) {
        int i = 0;
        for (int j = 0; j < books.length; j++) {
            Book book = books[j];
            if (book == null) {
                i = j++;
                break;
            }
        }
        return i;
    }
}