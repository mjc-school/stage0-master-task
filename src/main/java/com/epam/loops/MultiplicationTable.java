package com.epam.loops;

class Main {
    public static void main(String[] args) {
        MultiplicationTable m = new MultiplicationTable();
        m.printTable(4);
    }
}

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        for (int i = 1; i <= 10;i++) {
            System.out.println(i+ " x " + numberTableToPrint + " = " + numberTableToPrint * i);
        }
    }

}
