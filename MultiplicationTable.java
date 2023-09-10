package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for(int i = 1; i < 11; i++) {
            int c = numberTableToPrint * i;
            System.out.println(i + " x " + numberTableToPrint + " = " + c);
        }
    }

}
