package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book orwell = new Book("George Orwell", 319);
        Book golding = new Book("William Gerald Golding", 317);
        Book huxley = new Book("Aldous Huxley", 351);
        Book salinger = new Book("J.D. Salinger", 270);
        Book clean =  new Book("Clean code", 100500);
        Book[] books = new Book[5];
        books[0] = orwell;
        books[1] = golding;
        books[2] = huxley;
        books[3] = salinger;
        books[4] = clean;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println("\n" +
                "Replace i[0] to i[3]" + "\n");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPage());
        }


        System.out.println("\n" +
                "Sort by name" + "\n");
        for (Book bk : books)
            if (bk.getName().equals(clean.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPage());
            }
    }
}
