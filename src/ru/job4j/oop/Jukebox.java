package ru.job4j.oop;

<<<<<<< HEAD
=======

>>>>>>> origin/master
public class Jukebox {
    public void music(int position) {
        String song;
        if (position == 1) {
            song = "Пусть бегут неуклюже...";
        }
        else if (position == 2) {
            song = "Спокойной ночи...";
        }
        else{
            song = "Песня не найдена!";
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox artist = new Jukebox();
        artist.music(3);
    }
}
