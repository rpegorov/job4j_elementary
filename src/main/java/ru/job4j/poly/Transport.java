package ru.job4j.poly;

public interface Transport {
    void run();

    void passenger(int passenger);

    int price (int refill);

}
