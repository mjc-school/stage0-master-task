package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        System.out.println((int)Math.pow( numberToPrint, power));
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
