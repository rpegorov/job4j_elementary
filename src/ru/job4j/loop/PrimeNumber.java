package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {  // обращаемтся к методоку проверки на простое число
                count = count + 1;  // суммируем колличество простых чисел (верных тестов)
            }
        }
        return count;
    }
}
