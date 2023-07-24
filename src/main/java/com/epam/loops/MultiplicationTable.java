package com.epam.loops;



public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        for (int i = 0; i <= 9;i++) {
            System.out.println(i+ " * " + numberTableToPrint + " = " + numberTableToPrint * i);
        }
    }

}
