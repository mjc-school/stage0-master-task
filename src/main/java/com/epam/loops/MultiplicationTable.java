package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i < 11; i++) {
            System.out.println(String.format("%d x %d = %d", i, numberTableToPrint, i * numberTableToPrint));
        }
    }

}
