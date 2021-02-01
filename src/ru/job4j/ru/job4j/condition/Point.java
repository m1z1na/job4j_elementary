package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        first = Math.pow(first, 2);
        double two = y2 - y1;
        two = Math.pow(two, 2);
        double rsl = first + two;
         rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(5, 5, 9, 9);
        System.out.println("result (5, 5) to (9, 9) " + result);
    }
}