package ru.job4j.condition;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

/**
 * Растояние между точками в системе координат
 * @author rpegorov
 * @version 2
 * @since 11.09.2020
 */
public class Point {
   private int x;
   private int y;

   public Point(int first, int second) {
       this.x = first;
       this.y = second;
   }
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}