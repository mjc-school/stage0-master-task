package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int number = numberToPrint;
        for (int i = 1; i < power; i++) {
            numberToPrint *= number;
        }
        System.out.println(numberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
