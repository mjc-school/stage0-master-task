package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int res = 1;

        for (int i = 0;i < power;i++) {
            res *= numberToPrint;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
