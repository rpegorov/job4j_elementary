package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void run() {
        System.out.println("Run run run");

    }

    @Override
    public void passenger(int passenger) {
        System.out.println("Welcome, your: " + passenger + "passenger");

    }

    @Override
    public int price(int refill) {
        price(100);
        int profit = -1;
        return 0;
    }
}
