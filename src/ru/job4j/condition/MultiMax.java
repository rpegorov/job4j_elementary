package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        if (first > second) {  // сравниваем первое со вторым
            return first > third ? first : third;  // сравниваем первое с третьм, первое правда, третье лож
        } else {  // в других случаях
            return second > third ? second : third;

        }
        // второй вариант
     //  return first > second ? (first > third ? first : third) : (second > third ? second : third);

    }

}
