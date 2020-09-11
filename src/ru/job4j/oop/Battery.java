package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another) {
        this.load = another.load + this.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery full = new Battery(90);
        Battery charge = new Battery(10);
        System.out.println("Full battery : " + full.load + ", charge - " + charge.load);
        full.exchange(charge);
        System.out.println("Full battery : " + full.load + ", charge - " + charge.load);
    }
}
