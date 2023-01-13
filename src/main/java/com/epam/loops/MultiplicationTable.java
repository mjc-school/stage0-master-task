package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            int product = i * numberTableToPrint;
            System.out.println(i +
                    " x " +
                    numberTableToPrint +
                    " = " +
                    product);
        }
    }

}
