package com.epam.loops;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        MultiplicationTable m = new MultiplicationTable();
        m.printTable(9);
    }
}

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter integer");

        int num = scanner.nextInt();

        for (int i = 0; i <= 9;i++) {
            System.out.println(i+ " * " + numberTableToPrint + " = " + numberTableToPrint * i);
        }
    }

}
