package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery full = new Battery(100);
        Battery discharge = new Battery(10);
        System.out.println("Full battery : " + full.load + ", discharge - " + discharge.load);
        full.exchange(discharge);
        System.out.println("Full battery : " + full.load + ", discharge - " + discharge.load);
    }
}
