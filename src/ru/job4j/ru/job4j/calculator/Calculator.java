package ru.job4j.calculator;

public class Calculator {

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        one = 6;
        int sixDivTwo = one / two;
        System.out.println(sixDivTwo);

        one = 5;
        int fiveMinusTwo = one - two;
        System.out.println(fiveMinusTwo);

        one = 4;
        int fourTimeTwo = one * two;
        System.out.println(fourTimeTwo);
    }
}