package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int res = numberToPrint;
        for (int i = 1;i <= power;i++) {
            res *= numberToPrint;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
